package com.zhuzhunew.behavior;

import com.zhuzhunew.type.Position;

/**
 * Created by yifazhu on 3/23/17.
 */
public class BlackSmithBehavior extends BaseBehavior {
    private Position from;

    public BlackSmithBehavior(BehaviorContext behaviorContext, Position from) {
            super(behaviorContext);
            this.from = from;
    }

    @Override
    public void execute() {
        behaviorContext.getActionFactory().getGoToBlackSmithAction(from).act();
        behaviorContext.getActionFactory().getDestroyItemsAction().act();
        behaviorContext.getActionFactory().getRepairAction().act();
        behaviorContext.getActionFactory().getClearWindowsAction().act();
    }
}
