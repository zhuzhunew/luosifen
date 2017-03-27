package com.zhuzhunew.behavior;

import com.zhuzhunew.action.ActionFactory;
import com.zhuzhunew.type.MapLocation;

/**
 * Created by yifazhu on 3/23/17.
 */
public class MapTeleportBehavior extends BaseBehavior {
    MapLocation location;

    public MapTeleportBehavior(BehaviorContext behaviorContext, MapLocation location) {
        super(behaviorContext);
        this.location = location;
    }

    @Override
    public void execute() {
        behaviorContext.getActionFactory().getMapTeleportAction(location).act();
    }
}
