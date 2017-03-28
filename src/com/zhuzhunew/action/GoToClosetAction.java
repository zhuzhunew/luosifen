package com.zhuzhunew.action;

import com.zhuzhunew.core.Controller;

import static com.zhuzhunew.core.Configuration.FROM_BLACKSMITH_TO_CLOSET;

/**
 * Created by yifazhu on 3/25/17.
 *
 * Default from blacksmith to closet.
 */
public class GoToClosetAction extends BaseAction {

    public GoToClosetAction(ActionContext actionContext) {
        super(actionContext);
    }

    @Override
    public void act() {
        Controller controller = actionContext.getController();
        for (int[] coord : FROM_BLACKSMITH_TO_CLOSET) {
            controller.goTo(coord);
            controller.waiting(3000);
        }

    }
}
