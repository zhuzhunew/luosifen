package com.zhuzhunew.action;

import com.zhuzhunew.core.Controller;

import static com.zhuzhunew.core.Configuration.REPAIR_BUTTON;
import static com.zhuzhunew.core.Configuration.REPAIR_TAG_BUTTON;

/**
 * Created by yifazhu on 3/25/17.
 */
public class RepairAction extends BaseAction {

    public RepairAction(ActionContext actionContext) {
        super(actionContext);
    }

    @Override
    public void act() {
        Controller controller = actionContext.getController();
        controller.goTo(REPAIR_TAG_BUTTON);
        controller.goTo(REPAIR_BUTTON);
    }
}
