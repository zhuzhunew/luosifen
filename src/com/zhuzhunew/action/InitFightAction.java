package com.zhuzhunew.action;

import com.zhuzhunew.core.Controller;

/**
 * Created by yifazhu on 3/26/17.
 */
public class InitFightAction extends BaseAction {

    public InitFightAction(ActionContext actionContext) {
        super(actionContext);
    }

    @Override
    public void act() {
        Controller controller = actionContext.getController();
        controller.launchSkill4();
    }
}
