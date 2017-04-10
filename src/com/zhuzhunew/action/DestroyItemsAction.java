package com.zhuzhunew.action;

import com.zhuzhunew.core.Controller;
import com.zhuzhunew.core.Explorer;

import static com.zhuzhunew.core.Configuration.*;

/**
 * Created by yifazhu on 3/25/17.
 */
public class DestroyItemsAction extends BaseAction {

    public DestroyItemsAction(ActionContext actionContext) {
        super(actionContext);
    }

    @Override
    public void act() {
        Controller controller = actionContext.getController();
        controller.goTo(DESTROY_TAG_BUTTON);
        controller.waiting(500);
        controller.goTo(DESTROY_WHITE_BUTTON);
        controller.waiting(500);
        controller.confirm();
        controller.waiting(500);
        closeChat();
        controller.goTo(DESTROY_BLUE_BUTTON);
        controller.waiting(500);
        controller.confirm();
        controller.waiting(500);
        closeChat();
        controller.goTo(DESTROY_GOLDEN_BUTTON);
        controller.waiting(500);
        controller.confirm();
        controller.waiting(500);
        closeChat();
    }

    private void closeChat() {
        Explorer explorer = actionContext.getExplorer();
        Controller controller = actionContext.getController();
        if (explorer.isChatting()) {
            controller.confirm();
        }
    }
}
