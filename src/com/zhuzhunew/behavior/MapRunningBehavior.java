package com.zhuzhunew.behavior;

import java.awt.*;

import static com.zhuzhunew.core.Configuration.*;
import static com.zhuzhunew.type.MapLocation.BASE;
import static com.zhuzhunew.type.MapLocation.KULLE_ROAD;

/**
 * Created by 一帆 on 2017/3/22.
 */
public class MapRunningBehavior extends BaseBehavior {
    private int[][] steps;
    private boolean stopWhenLegendFound;
    private boolean isBoosRoom;
    private StopFlag stopFlag = new StopFlag();
    private Rectangle rectangle = new Rectangle(GROUND_EXPLORER_X, GROUND_EXPLORER_Y, GROUND_EXPLORER_WIDTH, GROUND_FEXPLORER_HEIGHT);

    public MapRunningBehavior(BehaviorContext behaviorContext, int[][] steps, boolean stopWhenLegendFound, boolean isBoosRoom) {
        super(behaviorContext);
        this.steps = steps;
        this.stopWhenLegendFound = stopWhenLegendFound;
        this.isBoosRoom = isBoosRoom;
    }

    @Override
    public void execute() {
        stopFlag.stop = false;
        if (isBoosRoom) {
            behaviorContext.getActionFactory().getCheckBossRoomAction(stopFlag).act();
            if (stopFlag.stop) {
                return;
            }
        }
        behaviorContext.getActionFactory().getInitFightAction().act();
        for (int[] step : steps) {
            behaviorContext.getActionFactory().getStepFightAction(step).act();
            behaviorContext.getActionFactory().getPickupLegendAction(rectangle, stopWhenLegendFound ? stopFlag : null).act();
            behaviorContext.getActionFactory().getDeathAction(stopFlag).act();
            if (stopFlag.stop) {
                behaviorContext.getActionFactory().getMapTeleportAction(KULLE_ROAD).act();
                behaviorContext.getActionFactory().getMapTeleportAction(BASE).act();
                break;
            }
        }
    }

    public class StopFlag {
        public boolean stop;
    }
}
