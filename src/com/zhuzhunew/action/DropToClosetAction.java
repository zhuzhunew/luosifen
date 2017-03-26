package com.zhuzhunew.action;

import com.zhuzhunew.core.Controller;
import com.zhuzhunew.core.Explorer;

import static com.zhuzhunew.core.Configuration.CLOSET_TAGS;
import static com.zhuzhunew.core.Configuration.PACKAGE_SLOTS;

/**
 * Created by yifazhu on 3/25/17.
 */
public class DropToClosetAction extends BaseAction {

    public DropToClosetAction(ActionContext actionContext) {
        super(actionContext);
    }

    @Override
    public void act() {
        Explorer explorer = actionContext.getExplorer();
        Controller controller = actionContext.getController();
        int tagNum = 0;

        for (int i = 0; i < CLOSET_TAGS.length; i++) {
            int[] tag = CLOSET_TAGS[i];
            controller.goTo(tag);
            if (explorer.isClosetAvailable()) {
                tagNum = i;
                break;
            }
        }

        for (int[] slot : PACKAGE_SLOTS) {
            controller.moveMouseTo(slot);
            controller.rightClick();
            if (!explorer.isClosetAvailable()) {
                controller.goTo(CLOSET_TAGS[++tagNum]);
            }
        }
    }
}
