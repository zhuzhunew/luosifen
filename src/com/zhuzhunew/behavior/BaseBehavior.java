package com.zhuzhunew.behavior;

/**
 * Created by yifazhu on 3/25/17.
 */
public abstract class BaseBehavior implements Behavior {
    BehaviorContext behaviorContext;

    public BaseBehavior(BehaviorContext behaviorContext) {
        this.behaviorContext = behaviorContext;
    }
}
