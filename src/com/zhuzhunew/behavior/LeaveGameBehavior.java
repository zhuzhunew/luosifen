package com.zhuzhunew.behavior;

import com.zhuzhunew.action.ActionFactory;

/**
 * Created by yifazhu on 3/23/17.
 *
 * Leave game then enter again to refresh the world
 */
public class LeaveGameBehavior extends BaseBehavior {

    public LeaveGameBehavior(BehaviorContext behaviorContext) {
        super(behaviorContext);
    }

    @Override
    public void execute() {
        behaviorContext.getActionFactory().getLeaveGameAction().act();
    }
}
