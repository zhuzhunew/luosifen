package com.zhuzhunew.action;

import com.zhuzhunew.core.Controller;

import static com.zhuzhunew.core.Configuration.CENTER_POINT;

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
        controller.launchSkill3();
        controller.launchSkill2();
        controller.waiting(100);
        controller.moveMouseTo(step);
        controller.waiting(100);
        controller.launchSkill1();
        controller.waiting(500);
        controller.moveMouseTo(CENTER_POINT);
        controller.launchSkill1();
        controller.waiting(500);
        controller.launchSkill1();
        controller.waiting(1000);

        for (int i = 0; i < 2; i++) {
            controller.launchSkill1();
            controller.waiting(500);
            controller.launchSkill1();
            controller.waiting(500);
            controller.launchSkill1();
            controller.waiting(1000);
        }

        controller.waiting(7000);
    }
}
