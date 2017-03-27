package com.zhuzhunew.action;

import com.zhuzhunew.core.Controller;

import static com.zhuzhunew.core.Configuration.LEAVE_GAME_BUTTON;
import static com.zhuzhunew.core.Configuration.LEAVE_GAME_DELAY;

/**
 * Created by 一帆 on 2017/3/26.
 */
public class LeaveGameAction extends BaseAction {

    public LeaveGameAction(ActionContext actionContext) {
        super(actionContext);
    }

    @Override
    public void act() {
        Controller controller = actionContext.getController();
        controller.openCloseManu();
        controller.goTo(LEAVE_GAME_BUTTON);
        controller.waiting(LEAVE_GAME_DELAY);
    }
}
