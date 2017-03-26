package com.zhuzhunew.action;

import com.zhuzhunew.core.Controller;

/**
 * Created by yifazhu on 3/25/17.
 */
public abstract class BaseAction implements Action {
    protected ActionContext actionContext;

    public BaseAction(ActionContext actionContext) {
        this.actionContext = actionContext;
    }
}
