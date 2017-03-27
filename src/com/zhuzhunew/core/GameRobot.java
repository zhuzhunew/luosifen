package com.zhuzhunew.core;


import com.zhuzhunew.action.ActionContext;
import com.zhuzhunew.action.ActionFactory;
import com.zhuzhunew.behavior.Behavior;
import com.zhuzhunew.behavior.BehaviorContext;
import com.zhuzhunew.behavior.BehaviorFactory;

import java.awt.*;

import static com.zhuzhunew.core.Configuration.MAIN_LOOP;

/**
 * Created by 一帆 on 2017/3/21.
 */
public class GameRobot {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        Controller controller = new Controller(robot);
        Explorer explorer = new Explorer(robot);
        ActionContext actionContext = new ActionContext();
        actionContext.setController(controller);
        actionContext.setExplorer(explorer);
        BehaviorContext behaviorContext = new BehaviorContext();
        behaviorContext.setActionFactory(new ActionFactory(actionContext));
        BehaviorFactory behaviorFactory = new BehaviorFactory(behaviorContext);

        Behavior[] behaviors = {}; //TODO

        for (int i = 0; i < MAIN_LOOP; i++) {
            for (Behavior behavior : behaviors) {
                behavior.execute();
            }
        }
    }
}
