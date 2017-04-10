package com.zhuzhunew.action;

import com.zhuzhunew.behavior.MapRunningBehavior;
import com.zhuzhunew.core.Controller;
import com.zhuzhunew.core.Explorer;

import java.util.Date;

import static com.zhuzhunew.core.Configuration.*;

/**
 * Created by 一帆 on 2017/4/2.
 */
public class DeathAction extends BaseAction {
    MapRunningBehavior.StopFlag stopFlag;

    public DeathAction(ActionContext actionContext, MapRunningBehavior.StopFlag deathFlag) {
        super(actionContext);
        this.stopFlag = deathFlag;
    }

    @Override
    public void act() {
        Explorer explorer = actionContext.getExplorer();
        Controller controller = actionContext.getController();
        if (explorer.isDead()) {
            System.out.println("Dead on " + new Date());
            controller.waiting(6000);
            controller.goTo(REVIVE_IN_CITY_BUTTON);
            controller.waiting(SCENE_GAP);
            stopFlag.stop = true;
        }
    }
}
