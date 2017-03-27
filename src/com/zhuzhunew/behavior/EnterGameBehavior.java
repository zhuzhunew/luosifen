package com.zhuzhunew.behavior;

import com.zhuzhunew.action.ActionFactory;

/**
 * Created by yifazhu on 3/23/17.
 */
public class EnterGameBehavior extends BaseBehavior {

    public EnterGameBehavior(BehaviorContext behaviorContext) {
        super(behaviorContext);
    }

    @Override
    public void execute() {
        behaviorContext.getActionFactory().getEnterGameAction().act();
    }
}
