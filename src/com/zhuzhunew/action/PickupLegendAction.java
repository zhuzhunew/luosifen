package com.zhuzhunew.action;

import com.sun.xml.internal.ws.addressing.EndpointReferenceUtil;
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

    public PickupLegendAction(ActionContext actionContext, Rectangle rectangle) {
        super(actionContext);
        this.rectangle = rectangle;
    }

    @Override
    public void act() {
        Explorer explorer = actionContext.getExplorer();
        Controller controller = actionContext.getController();
        for (int i = 0; i < MAX_LEGEND_PICKUP_ON_SCREEN; i++) {
            Point imagePoint = explorer.findFisrtLegendItemOnGroundArea(rectangle);
            if (imagePoint == null) {
                break;
            }
            Point screenPoint = new Point(imagePoint.x + rectangle.x, imagePoint.y + rectangle.y);
            Point returnPoint = MathUtil.calculateReturnPoint(screenPoint);
            controller.goTo(screenPoint);
            controller.waiting(1500);
            controller.goTo(returnPoint);
            controller.waiting(1500);
        }
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
}
