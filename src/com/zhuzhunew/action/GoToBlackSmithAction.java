package com.zhuzhunew.action;

import com.zhuzhunew.core.Controller;
import com.zhuzhunew.type.Position;

import static com.zhuzhunew.core.Configuration.*;

/**
 * Created by yifazhu on 3/25/17.
 */
public class GoToBlackSmithAction extends BaseAction {
    private Position from;

    public GoToBlackSmithAction(ActionContext actionContext, Position from) {
        super(actionContext);
        this.from = from;
    }

    @Override
    public void act() {
        Controller controller = actionContext.getController();
        switch (from) {
            case INITIAL:
                for (int[] coord : FROM_INITIAL_TO_BLACKSMITH) {
                    controller.goTo(coord);
                    controller.waiting(3000);
                }
                break;
            case STATION:
                for (int[] coord : FROM_STATION_TO_BLACKSMITH) {
                    controller.goTo(coord);
                    controller.waiting(3000);
                }
                break;
            case TELEPORT:
                for (int[] coord : FROM_TELEPORT_TO_BLACKSMITH) {
                    controller.goTo(coord);
                    controller.waiting(3000);
                }
                break;
            default:
                break;
        }
    }
}
