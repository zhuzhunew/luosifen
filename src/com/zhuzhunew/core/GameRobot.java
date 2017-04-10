package com.zhuzhunew.core;

import com.zhuzhunew.action.ActionContext;
import com.zhuzhunew.action.ActionFactory;
import com.zhuzhunew.behavior.Behavior;
import com.zhuzhunew.behavior.BehaviorContext;
import com.zhuzhunew.behavior.BehaviorFactory;
import com.zhuzhunew.type.MapLocation;
import com.zhuzhunew.type.Position;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static com.zhuzhunew.core.Configuration.*;

/**
 * Created by 一帆 on 2017/3/21.
 */
public class GameRobot {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        Controller controller = new Controller(robot);
        Explorer explorer = new Explorer(robot);
        ActionContext actionContext = new ActionContext();
        actionContext.setController(controller);
        actionContext.setExplorer(explorer);
        BehaviorContext behaviorContext = new BehaviorContext();
        behaviorContext.setActionFactory(new ActionFactory(actionContext));
        BehaviorFactory behaviorFactory = new BehaviorFactory(behaviorContext);

        List<Behavior> behaviorChain = new ArrayList<>();
        behaviorChain.add(behaviorFactory.getEnterGameBehavior());
//        behaviorChain.add(behaviorFactory.getMapTeleportBehavior(MapLocation.KULLE_ROAD));
//        behaviorChain.add(behaviorFactory.getMapTeleportBehavior(MapLocation.BASE));
//        behaviorChain.add(behaviorFactory.getBlackSmithBehavior(Position.STATION));
//        behaviorChain.add(behaviorFactory.getMapTeleportBehavior(MapLocation.A1_1));
//        behaviorChain.add(behaviorFactory.getMapRunningBehavior(A1_1_STEPS));
//        behaviorChain.add(behaviorFactory.getMapTeleportBehavior(MapLocation.BASE));
//        behaviorChain.add(behaviorFactory.getBlackSmithBehavior(Position.STATION));
        behaviorChain.add(behaviorFactory.getMapTeleportBehavior(MapLocation.A1_2));
        behaviorChain.add(behaviorFactory.getMapRunningBehavior(A1_2_STEPS, true, false));
//        behaviorChain.add(behaviorFactory.getMapTeleportBehavior(MapLocation.BASE));
//        behaviorChain.add(behaviorFactory.getBlackSmithBehavior(Position.STATION));
        behaviorChain.add(behaviorFactory.getMapTeleportBehavior(MapLocation.A2_1));
        behaviorChain.add(behaviorFactory.getMapRunningBehavior(A2_1_STEPS, false, false));
//        behaviorChain.add(behaviorFactory.getMapTeleportBehavior(MapLocation.BASE));
//        behaviorChain.add(behaviorFactory.getBlackSmithBehavior(Position.STATION));
        behaviorChain.add(behaviorFactory.getMapTeleportBehavior(MapLocation.AZ_ROAD));
        behaviorChain.add(behaviorFactory.getMapRunningBehavior(AZ_ROAD_STEPS, false, false));
//        behaviorChain.add(behaviorFactory.getMapTeleportBehavior(MapLocation.BASE));
//        behaviorChain.add(behaviorFactory.getBlackSmithBehavior(Position.STATION));
        behaviorChain.add(behaviorFactory.getEnterBossRoomBehavior(MapLocation.AZ_ROAD));
        behaviorChain.add(behaviorFactory.getMapRunningBehavior(AZ_ROOM_STEPS, false, true));
        behaviorChain.add(behaviorFactory.getMapTeleportBehavior(MapLocation.BASE));
        behaviorChain.add(behaviorFactory.getBlackSmithBehavior(Position.STATION));
        behaviorChain.add(behaviorFactory.getClosetBehavior());
        behaviorChain.add(behaviorFactory.getLeaveGameBehavior());

        Thread.sleep(3000);
        for (int i = 0; i < MAIN_LOOP; i++) {
            for (Behavior behavior : behaviorChain) {
                behavior.execute();
            }
        }
    }
}
