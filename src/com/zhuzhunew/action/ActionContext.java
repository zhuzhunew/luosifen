package com.zhuzhunew.action;

import com.zhuzhunew.core.Controller;
import com.zhuzhunew.core.Explorer;

/**
 * Created by yifazhu on 3/26/17.
 */
public class ActionContext {
    private Explorer explorer;
    private Controller controller;

    public Explorer getExplorer() {
        return explorer;
    }

    public void setExplorer(Explorer explorer) {
        this.explorer = explorer;
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
