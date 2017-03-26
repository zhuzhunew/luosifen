package com.zhuzhunew.action;

import com.zhuzhunew.core.Controller;

import static com.zhuzhunew.core.Configuration.ENTER_GAME_BUTTON;
import static com.zhuzhunew.core.Configuration.ENTER_GAME_DELAY;

/**
 * Created by yifazhu on 3/25/17.
 */
public class EnterGameAction extends BaseAction {

    public EnterGameAction(ActionContext actionContext) {
        super(actionContext);
    }

    @Override
    public void act() {
        Controller controller = actionContext.getController();
        controller.goTo(ENTER_GAME_BUTTON);
        controller.waiting(ENTER_GAME_DELAY);
    }
}
