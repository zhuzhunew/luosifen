package com.zhuzhunew.core;

import com.zhuzhunew.util.ColorMaster;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by 一帆 on 2017/3/21.
 */
public class Explorer {
    private final Robot robot;

    public Explorer(Robot robot)
    {
        this.robot = robot;
    }

    // Find both Legendary and Set.
    public Point findFisrtLegendItemOnGroundArea(Rectangle rect) {
        BufferedImage image = robot.createScreenCapture(rect);
        for (int i = 0; i < rect.width; i++) {
            for (int j = 0; j < rect.height; j++) {
                if (ColorMaster.isLegendNameTagFrontColor(image.getRGB(i, j))
                        || ColorMaster.isSetNameTagFrontColor(image.getRGB(i, j))) {
                    return new Point(i + rect.x, j + rect.y);
                }
            }
        }
        return null;
    }
}
