package com.zhuzhunew.util;

import com.zhuzhunew.core.Configuration;

/**
 * Created by 一帆 on 3/22/17.
 */
public final class ColorMaster {
    private ColorMaster() {}

    public static boolean isLegendNameTagFrontColor(int rgb) {
        return Configuration.LEGEND_RGB[0] == getRed(rgb)
                && Configuration.LEGEND_RGB[1] == getGreen(rgb)
                && Configuration.LEGEND_RGB[2] == getBlue(rgb);
    }

    public static boolean isSetNameTagFrontColor(int rgb) {
        return Configuration.SET_RGB[0] == getRed(rgb)
                && Configuration.SET_RGB[1] == getGreen(rgb)
                && Configuration.SET_RGB[2] == getBlue(rgb);
    }

    private static int getAlpha(int rgb) {
        return (rgb >> 24) & 0xff;
    }

    private static int getRed(int rgb) {
        return (rgb >> 16) & 0xff;
    }

    private static int getGreen(int rgb) {
        return (rgb >> 8) & 0xff;
    }

    private static int getBlue(int rgb) {
        return rgb & 0xff;
    }
}
