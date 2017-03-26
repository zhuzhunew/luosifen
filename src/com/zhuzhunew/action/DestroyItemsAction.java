package com.zhuzhunew.action;

import com.zhuzhunew.core.Controller;

import static com.zhuzhunew.core.Configuration.DESTROY_BLUE_BUTTON;
import static com.zhuzhunew.core.Configuration.DESTROY_GOLDEN_BUTTON;
import static com.zhuzhunew.core.Configuration.DESTROY_WHITE_BUTTON;

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
        controller.goTo(DESTROY_WHITE_BUTTON);
        controller.waiting(500);
        controller.confirm();
        controller.goTo(DESTROY_BLUE_BUTTON);
        controller.waiting(500);
        controller.confirm();
        controller.goTo(DESTROY_GOLDEN_BUTTON);
        controller.waiting(500);
        controller.confirm();
    }
}
