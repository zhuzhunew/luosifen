package com.zhuzhunew.behavior;

import com.zhuzhunew.action.ActionFactory;

/**
 * Created by 一帆 on 2017/3/22.
 */
public class MapRunningBehavior extends BaseBehavior {

    int[][] steps;

    public MapRunningBehavior(BehaviorContext behaviorContext, int[][] steps) {
        super(behaviorContext);
        this.steps = steps;
    }

    @Override
    public void execute() {
        behaviorContext.getActionFactory().getInitFightAction().act();
        for (int[] step : steps) {
            behaviorContext.getActionFactory().getStepFightAction(step).act();
        }
        //behaviorContext.getActionFactory().getPickupLegendAction();
    }
}
