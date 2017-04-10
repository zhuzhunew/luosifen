package com.zhuzhunew.action;

import com.zhuzhunew.behavior.MapRunningBehavior;
import com.zhuzhunew.core.Controller;
import com.zhuzhunew.core.Explorer;
import com.zhuzhunew.util.MathUtil;

import java.awt.*;

import static com.zhuzhunew.core.Configuration.MAX_LEGEND_PICKUP_ON_SCREEN;

/**
 * Created by yifazhu on 3/26/17.
 */
public class PickupLegendAction extends BaseAction {

    Rectangle rectangle;
    MapRunningBehavior.StopFlag stopFlag;

    public PickupLegendAction(ActionContext actionContext, Rectangle rectangle, MapRunningBehavior.StopFlag stopFlag) {
        super(actionContext);
        this.rectangle = rectangle;
        this.stopFlag = stopFlag;
    }

    @Override
    public void act() {
        Explorer explorer = actionContext.getExplorer();
        Controller controller = actionContext.getController();
        for (int i = 0; i < MAX_LEGEND_PICKUP_ON_SCREEN; i++) {
            Point imagePoint = explorer.findFirsrtLegendItemOnGroundArea(rectangle);
            if (imagePoint == null) {
                break;
            }
            if (stopFlag != null) {
                stopFlag.stop = true;
            }
            Point screenPoint = new Point(imagePoint.x + rectangle.x, imagePoint.y + rectangle.y);
            Point returnPoint = MathUtil.calculateReturnPoint(screenPoint);
            controller.goTo(screenPoint);
            controller.waiting(3000);
            controller.goTo(returnPoint);
            controller.waiting(3000);
        }
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
}
