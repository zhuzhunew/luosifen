package com.zhuzhunew.action;

import com.zhuzhunew.core.Controller;
import com.zhuzhunew.core.Explorer;

import static com.zhuzhunew.core.Configuration.CLOSET_TAGS;
import static com.zhuzhunew.core.Configuration.FIRST_PACKAGE_SLOT;
import static com.zhuzhunew.core.Configuration.PACKAGE_SIZE;

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
            controller.waiting(1000);
            if (explorer.isClosetAvailable()) {
                tagNum = i;
                break;
            }
        }

        controller.waiting(500);

        int x, y;
        for (int i = 0; i < 10; i++) {
            x = FIRST_PACKAGE_SLOT[0] + i * PACKAGE_SIZE;
            for (int j = 0; j < 6; j++) {
                y = FIRST_PACKAGE_SLOT[1] + j * PACKAGE_SIZE;
                controller.moveMouseTo(x, y);
                controller.rightClick();
                if (!explorer.isClosetAvailable()) {
                    controller.goTo(CLOSET_TAGS[++tagNum]);
                    controller.waiting(1000);
                }
                controller.waiting(200);
            }
        }
    }
}
