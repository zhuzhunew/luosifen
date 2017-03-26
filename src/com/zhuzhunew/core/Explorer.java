package com.zhuzhunew.core;

import com.zhuzhunew.util.ColorMaster;

import java.awt.*;
import java.awt.image.BufferedImage;

import static com.zhuzhunew.core.Configuration.CLOSET_AVAILABLE_CHECK;
import static com.zhuzhunew.core.Configuration.SCREEN_WIDTH;
import static com.zhuzhunew.core.Configuration.SCREEN_HIGHT;

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

    public boolean isClosetAvailable () {
        return isEmptySlot(robot.createScreenCapture(new Rectangle(0, 0, SCREEN_WIDTH, SCREEN_HIGHT)),
                CLOSET_AVAILABLE_CHECK[0], CLOSET_AVAILABLE_CHECK[1]);
    }

    public boolean isEmptySlot(BufferedImage image, int x, int y) {
        return ColorMaster.isEmptySlotCenterColor(image.getRGB(x, y));
    }
}
