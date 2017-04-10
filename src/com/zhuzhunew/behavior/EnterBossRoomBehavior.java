package com.zhuzhunew.behavior;

import com.zhuzhunew.action.ActionFactory;
import com.zhuzhunew.type.MapLocation;

/**
 * Created by yifazhu on 3/23/17.
 */
public class EnterBossRoomBehavior extends BaseBehavior {
    MapLocation location;

    public EnterBossRoomBehavior(BehaviorContext behaviorContext, MapLocation location) {
        super(behaviorContext);
        this.location = location;
    }

    @Override
    public void execute() {
        behaviorContext.getActionFactory().getEnterBossRoomAction(location).act();
    }
}
