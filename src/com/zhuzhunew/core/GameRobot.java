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

import static com.zhuzhunew.core.Configuration.AZ_ROAD_STEPS;
import static com.zhuzhunew.core.Configuration.MAIN_LOOP;

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
//        behaviorChain.add(behaviorFactory.getEnterGameBehavior());
//        behaviorChain.add(behaviorFactory.getMapTeleportBehavior(MapLocation.KULLE_ROAD));
//        behaviorChain.add(behaviorFactory.getMapTeleportBehavior(MapLocation.BASE));
//        behaviorChain.add(behaviorFactory.getBlackSmithBehavior(Position.STATION));
        behaviorChain.add(behaviorFactory.getMapTeleportBehavior(MapLocation.AZ_ROAD));
        behaviorChain.add(behaviorFactory.getMapRunningBehavior(AZ_ROAD_STEPS));
//        behaviorChain.add(behaviorFactory.getEnterBossRoomBehavior());
//        behaviorChain.add(behaviorFactory.getAzmodanRoomBehavior());
//        behaviorChain.add(behaviorFactory.getMapTeleportBehavior(MapLocation.KULLE_ROAD));
//        behaviorChain.add(behaviorFactory.getMapRunningBehavior());
//        behaviorChain.add(behaviorFactory.getEnterBossRoomBehavior());
//        behaviorChain.add(behaviorFactory.getKulleRoomBehavior());
//        behaviorChain.add(behaviorFactory.getMapTeleportBehavior(MapLocation.BASE));
//        behaviorChain.add(behaviorFactory.getBlackSmithBehavior(Position.STATION));
//        behaviorChain.add(behaviorFactory.getClosetBehavior());
//        behaviorChain.add(behaviorFactory.getLeaveGameBehavior());

        Thread.sleep(5000);
        for (int i = 0; i < MAIN_LOOP; i++) {
            for (Behavior behavior : behaviorChain) {
                behavior.execute();
            }
        }
    }
}
