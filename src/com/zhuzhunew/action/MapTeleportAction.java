package com.zhuzhunew.action;

import com.zhuzhunew.core.Controller;
import com.zhuzhunew.core.Explorer;
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
        closeChat();
        Controller controller = actionContext.getController();
        controller.openCloseMap();
        controller.waiting(500);
        controller.goTo(ZOOM_IN_MAP_BUTTON);
        controller.waiting(500);

        switch(location) {
            case AZ_ROAD:
                controller.goTo(ACT3_MAP_LOCATION);
                controller.waiting(500);
                controller.goTo(AZ_ROAD_MAP_LOCATION);
                break;
            case KULLE_ROAD:
                controller.goTo(ACT2_MAP_LOCATION);
                controller.waiting(500);
                controller.goTo(KULLE_ROAD_MAP_LOCATION);
                break;
            case BASE:
                controller.goTo(ACT1_MAP_LOCATION);
                controller.waiting(500);
                controller.goTo(BASE_MAP_LOCATION);
                break;
            case A1_1:
                controller.goTo(ACT1_MAP_LOCATION);
                controller.waiting(500);
                controller.goTo(A1_1_LOCATION);
                break;
            case A1_2:
                controller.goTo(ACT1_MAP_LOCATION);
                controller.waiting(500);
                controller.goTo(A1_2_LOCATION);
                break;
            case A2_1:
                controller.goTo(ACT2_MAP_LOCATION);
                controller.waiting(500);
                controller.goTo(A2_1_LOCATION);
                break;
            default:
                break;
        }
        controller.waiting(SCENE_GAP);
    }

    private void closeChat() {
        Explorer explorer = actionContext.getExplorer();
        Controller controller = actionContext.getController();
        if (explorer.isChatting()) {
            controller.confirm();
        }
    }
}
