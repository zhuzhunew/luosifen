package com.zhuzhunew.util;

import com.zhuzhunew.core.Configuration;

import static com.zhuzhunew.core.Configuration.EMPTY_SLOT_CENTER_RGB;
import static com.zhuzhunew.core.Configuration.LEGEND_RGB;
import static com.zhuzhunew.core.Configuration.SET_RGB;

/**
 * Created by 一帆 on 3/22/17.
 */
public final class ColorMaster {
    private ColorMaster() {}

    public static boolean isLegendNameTagFrontColor(int rgb) {
        return LEGEND_RGB[0] == getRed(rgb)
                && LEGEND_RGB[1] == getGreen(rgb)
                && LEGEND_RGB[2] == getBlue(rgb);
    }

    public static boolean isSetNameTagFrontColor(int rgb) {
        return SET_RGB[0] == getRed(rgb)
                && SET_RGB[1] == getGreen(rgb)
                && SET_RGB[2] == getBlue(rgb);
    }

    public static boolean isEmptySlotCenterColor(int rgb) {
        return EMPTY_SLOT_CENTER_RGB[0] == getRed(rgb)
                && EMPTY_SLOT_CENTER_RGB[1] == getGreen(rgb)
                && EMPTY_SLOT_CENTER_RGB[2] == getBlue(rgb);
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
