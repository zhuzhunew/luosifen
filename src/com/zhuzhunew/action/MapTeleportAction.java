package com.zhuzhunew.action;

import com.zhuzhunew.core.Controller;
import com.zhuzhunew.type.MapLocation;

import static com.zhuzhunew.core.Configuration.*;

/**
 * Created by yifazhu on 3/25/17.
 */
public class MapTeleportAction extends BaseAction {

    MapLocation location;

    public MapTeleportAction(ActionContext actionContext, MapLocation location) {
        super(actionContext);
        this.location = location;
    }

    @Override
    public void act() {
        Controller controller = actionContext.getController();
        controller.openCloseMap();
        controller.goTo(ZOOM_IN_MAP_BUTTON);

        switch(location) {
            case AZ_ROAD:
                controller.goTo(ACT3_MAP_LOCATION);
                controller.goTo(AZ_ROAD_MAP_LOCATION);
                break;
            case KULLE_ROAD:
                controller.goTo(ACT2_MAP_LOCATION);
                controller.goTo(KULLE_ROAD_MAP_LOCATION);
                break;
            case BASE:
                controller.goTo(ACT1_MAP_LOCATION);
                controller.goTo(BASE_MAP_LOCATION);
                break;
            default:
                break;
        }
    }
}
