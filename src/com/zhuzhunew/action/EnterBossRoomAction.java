package com.zhuzhunew.action;

import com.zhuzhunew.core.Controller;
import com.zhuzhunew.type.MapLocation;

import static com.zhuzhunew.core.Configuration.*;

/**
 * Created by yifazhu on 3/26/17.
 */
public class EnterBossRoomAction extends BaseAction {

    MapLocation location;

    public EnterBossRoomAction(ActionContext actionContext, MapLocation location) {
        super(actionContext);
        this.location = location;
    }

    @Override
    public void act() {
        Controller controller = actionContext.getController();

        switch(location) {
            case AZ_ROAD:
                controller.goTo(FROM_AZ_ROAD_TO_BOSSROOM);
                break;
            case KULLE_ROAD:
                controller.goTo(FROM_KULLE_ROAD_TO_BOSSROOM);
                break;
            default:
                break;
        }
    }
}
