package com.zhuzhunew.action;

import com.zhuzhunew.behavior.MapRunningBehavior;
import com.zhuzhunew.core.Controller;
import com.zhuzhunew.core.Explorer;

/**
 * Created by 一帆 on 2017/4/10.
 */
public class CheckBossRoomAction extends BaseAction {
    MapRunningBehavior.StopFlag stopFlag;

    public CheckBossRoomAction(ActionContext actionContext, MapRunningBehavior.StopFlag stopFlag) {
        super(actionContext);
        this.stopFlag = stopFlag;
    }

    @Override
    public void act() {
        Controller controller = actionContext.getController();
        Explorer explorer = actionContext.getExplorer();
        controller.teleport();
        if (!explorer.isBossRoom()) {
            stopFlag.stop = true;
        }
    }
}
