package com.zhuzhunew.core;

import com.zhuzhunew.util.ColorMaster;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by 一帆 on 2017/3/21.
 */
public class Explorer {
    private final Robot robot;
    private final int left;
    private final int right;
    private final int top;
    private final int bot;
    private final Rectangle rect;

    public Explorer(Robot robot, int x, int y, int width, int height)
    {
        this.robot = robot;
        this.left = x;
        this.right = x + width;
        this.top = y;
        this.bot = y + height;
        this.rect = new Rectangle(x, y, width, height);
    }

    // Find both Legendary and Set.
    public Point findLegendItemOnGround() {
        BufferedImage image = robot.createScreenCapture(rect);
        return null;

    }
}
