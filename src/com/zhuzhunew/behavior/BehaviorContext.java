package com.zhuzhunew.behavior;

import com.zhuzhunew.action.ActionFactory;

/**
 * Created by yifazhu on 3/26/17.
 */
public class BehaviorContext {
    private ActionFactory actionFactory;

    public ActionFactory getActionFactory() {
        return actionFactory;
    }

    public void setActionFactory(ActionFactory actionFactory) {
        this.actionFactory = actionFactory;
    }
}
