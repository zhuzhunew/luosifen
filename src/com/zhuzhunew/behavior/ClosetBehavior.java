package com.zhuzhunew.behavior;

/**
 * Created by yifazhu on 3/23/17.
 */
public class ClosetBehavior extends BaseBehavior {

    public ClosetBehavior(BehaviorContext behaviorContext) {
        super(behaviorContext);
    }

    @Override
    public void execute() {
        behaviorContext.getActionFactory().getGoToClosetAction().act();
        behaviorContext.getActionFactory().getDropToClosetAction().act();
        behaviorContext.getActionFactory().getClearWindowsAction().act();
    }
}
