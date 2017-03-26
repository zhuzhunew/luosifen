package com.zhuzhunew.action;

import com.zhuzhunew.core.Controller;

/**
 * Created by yifazhu on 3/25/17.
 */
public class ClearWindowsAction extends BaseAction {

    public ClearWindowsAction(ActionContext actionContext) {
        super(actionContext);
    }

    @Override
    public void act() {
        actionContext.getController().clearWindows();
    }
}
