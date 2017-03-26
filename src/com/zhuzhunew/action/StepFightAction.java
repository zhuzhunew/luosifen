package com.zhuzhunew.action;

import com.zhuzhunew.core.Controller;

/**
 * Created by yifazhu on 3/26/17.
 */
public class StepFightAction extends BaseAction {

    int[] step;

    public StepFightAction(ActionContext actionContext, int[] step) {
        super(actionContext);
        this.step = step;
    }

    @Override
    public void act() {
        Controller controller = actionContext.getController();
        controller.goTo(step);
        controller.waiting(1500);
        //TODO
    }
}
