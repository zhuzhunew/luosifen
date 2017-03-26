package com.zhuzhunew.util;

import com.zhuzhunew.core.Configuration;

import java.awt.*;

/**
 * Created by yifazhu on 3/26/17.
 */
public class MathUtil {
    public static Point calculateReturnPoint(Point goToPoint) {
        int[] center = Configuration.CENTER_POINT;
        int a = goToPoint.x - center[0];
        int b = goToPoint.y - center[1];

        return new Point(center[0] - (goToPoint.x - center[0]), center[1] - (goToPoint.y - center[1]));
    }
}
