package com.zhuzhunew.behavior;

import com.zhuzhunew.type.MapLocation;
import com.zhuzhunew.type.Position;

/**
 * Created by 一帆 on 2017/3/22.
 */
public class BehaviorFactory {
    BehaviorContext behaviorContext;
    AzmodanRoomBehavior azmodanRoomBehavior;
    BlackSmithBehavior blackSmithBehavior;
    ClosetBehavior closetBehavior;
    EnterBossRoomBehavior enterBossRoomBehavior;
    EnterGameBehavior enterGameBehavior;
    KulleRoomBehavior kulleRoomBehavior;
    MapRunningBehavior mapRunningBehavior;
    MapTeleportBehavior mapTeleportBehavior;
    LeaveGameBehavior leaveGameBehavior;

    public BehaviorFactory(BehaviorContext behaviorContext) {
        this.behaviorContext = behaviorContext;
    }

    public AzmodanRoomBehavior getAzmodanRoomBehavior() {
        return new AzmodanRoomBehavior(behaviorContext);
    }

    public BlackSmithBehavior getBlackSmithBehavior(Position from) {
        return new BlackSmithBehavior(behaviorContext, from);
    }

    public ClosetBehavior getClosetBehavior() {
        return new ClosetBehavior(behaviorContext);
    }

    public EnterBossRoomBehavior getEnterBossRoomBehavior(MapLocation location) {
        return new EnterBossRoomBehavior(behaviorContext, location);
    }

    public EnterGameBehavior getEnterGameBehavior() {
        return new EnterGameBehavior(behaviorContext);
    }

    public KulleRoomBehavior getKulleRoomBehavior() {
        return new KulleRoomBehavior(behaviorContext);
    }

    public MapRunningBehavior getMapRunningBehavior(int[][] steps, boolean stopWhenLegendFound, boolean isBossRoom) {
        return new MapRunningBehavior(behaviorContext, steps, stopWhenLegendFound, isBossRoom);
    }

    public MapTeleportBehavior getMapTeleportBehavior(MapLocation location) {
        return new MapTeleportBehavior(behaviorContext, location);
    }

    public LeaveGameBehavior getLeaveGameBehavior() {
        return new LeaveGameBehavior(behaviorContext);
    }
}
