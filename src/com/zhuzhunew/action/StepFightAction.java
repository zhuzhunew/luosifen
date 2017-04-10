package com.zhuzhunew.action;

import com.zhuzhunew.core.Controller;

import static com.zhuzhunew.core.Configuration.CENTER_POINT;
import static com.zhuzhunew.core.Configuration.SKILL_DEFAULT_REPEAT;

/**
 * Created by yifazhu on 3/26/17.
 */
public class StepFightAction extends BaseAction {

    int[] step;
    int repeat; // If repeat is 0, only move.

    public StepFightAction(ActionContext actionContext, int[] step) {
        super(actionContext);
        this.step = step;
        this.repeat = step.length > 2 ? step[2] : SKILL_DEFAULT_REPEAT;
    }

    @Override
    public void act() {
        Controller controller = actionContext.getController();
        if (step[0] < 0) {
            controller.waiting(3000);
        }

        controller.moveMouseTo(step);
        controller.waiting(100);

        if (repeat == 0) {
            controller.launchSkill1();
            controller.waiting(800);
            controller.moveMouseTo(CENTER_POINT);
            controller.launchSkill1();
            controller.waiting(800);
            controller.launchSkill1();
            controller.waiting(1000);
            controller.rightClick();
            controller.waiting(3500);
        } else {
            for (int i = 0; i < repeat; i++) {
                controller.launchSkill3();
                controller.launchSkill2();
                controller.waiting(100);
                for (int j = 0; j < 3; j++) {
                    controller.launchSkill1();
                    controller.waiting(800);
                    if (i == 0) {
                        controller.moveMouseTo(CENTER_POINT);
                    }
                    controller.launchSkill1();
                    controller.waiting(800);
                    controller.launchSkill1();
                    controller.waiting(1000);
                    controller.rightClick();
                    controller.waiting(3500);
                }
            }
        }
    }

    public void setStep(int[] step) {
        this.step = step;
        repeat = step.length > 2 ? step[2] : SKILL_DEFAULT_REPEAT;
    }
}
