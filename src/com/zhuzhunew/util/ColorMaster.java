package com.zhuzhunew.util;

import static com.zhuzhunew.core.Configuration.*;
import static com.zhuzhunew.core.Configuration.BREATH_RGB2;
import static com.zhuzhunew.core.Configuration.BREATH_RGB3;

/**
 * Created by 一帆 on 3/22/17.
 */
public final class ColorMaster {
    private ColorMaster() {}

    public static boolean isLegendNameTagFrontColor1(int rgb) {
        return similarTo(LEGEND_RGB1[0], getRed(rgb), LEGEND_RGB1_TOLERANCE)
                && similarTo(LEGEND_RGB1[1], getGreen(rgb), LEGEND_RGB1_TOLERANCE)
                && similarTo(LEGEND_RGB1[2], getBlue(rgb), LEGEND_RGB1_TOLERANCE);
    }

    public static boolean isLegendNameTagFrontColor2(int rgb) {
        return similarTo(LEGEND_RGB2[0], getRed(rgb), LEGEND_RGB2_TOLERANCE)
                && similarTo(LEGEND_RGB2[1], getGreen(rgb), LEGEND_RGB2_TOLERANCE)
                && similarTo(LEGEND_RGB2[2], getBlue(rgb), LEGEND_RGB2_TOLERANCE);
    }

    public static boolean isLegendNameTagFrontColor3(int rgb) {
        return similarTo(LEGEND_RGB3[0], getRed(rgb), LEGEND_RGB3_TOLERANCE)
                && similarTo(LEGEND_RGB3[1], getGreen(rgb), LEGEND_RGB3_TOLERANCE)
                && similarTo(LEGEND_RGB3[2], getBlue(rgb), LEGEND_RGB3_TOLERANCE);
    }


    public static boolean isSetNameTagFrontColor1(int rgb) {
        return similarTo(SET_RGB1[0], getRed(rgb), SET_RGB1_TOLERANCE)
                && similarTo(SET_RGB1[1], getGreen(rgb), SET_RGB1_TOLERANCE)
                &&  similarTo(SET_RGB1[2], getBlue(rgb), SET_RGB1_TOLERANCE);
    }

    public static boolean isSetNameTagFrontColor2(int rgb) {
        return similarTo(SET_RGB2[0], getRed(rgb), SET_RGB2_TOLERANCE)
                && similarTo(SET_RGB2[1], getGreen(rgb), SET_RGB2_TOLERANCE)
                &&  similarTo(SET_RGB2[2], getBlue(rgb), SET_RGB2_TOLERANCE);
    }

    public static boolean isSetNameTagFrontColor3(int rgb) {
        return similarTo(SET_RGB3[0], getRed(rgb), SET_RGB3_TOLERANCE)
                && similarTo(SET_RGB3[1], getGreen(rgb), SET_RGB3_TOLERANCE)
                &&  similarTo(SET_RGB3[2], getBlue(rgb), SET_RGB3_TOLERANCE);
    }

    public static boolean isBreathNameTagFrontColor1(int rgb) {
        return similarTo(BREATH_RGB1[0], getRed(rgb), BREATH_RGB1_TOLERANCE)
                && similarTo(BREATH_RGB1[1], getGreen(rgb), BREATH_RGB1_TOLERANCE)
                &&  similarTo(BREATH_RGB1[2], getBlue(rgb), BREATH_RGB1_TOLERANCE);
    }

    public static boolean isBreathNameTagFrontColor2(int rgb) {
        return similarTo(BREATH_RGB2[0], getRed(rgb), BREATH_RGB2_TOLERANCE)
                && similarTo(BREATH_RGB2[1], getGreen(rgb), BREATH_RGB2_TOLERANCE)
                &&  similarTo(BREATH_RGB2[2], getBlue(rgb), BREATH_RGB2_TOLERANCE);
    }

    public static boolean isBreathNameTagFrontColor3(int rgb) {
        return similarTo(BREATH_RGB3[0], getRed(rgb), BREATH_RGB3_TOLERANCE)
                && similarTo(BREATH_RGB3[1], getGreen(rgb), BREATH_RGB3_TOLERANCE)
                &&  similarTo(BREATH_RGB3[2], getBlue(rgb), BREATH_RGB3_TOLERANCE);
    }

    public static boolean isEmptySlotCenterColor(int rgb) {
        return similarTo(EMPTY_SLOT_CENTER_RGB[0], getRed(rgb))
                && similarTo(EMPTY_SLOT_CENTER_RGB[1], getGreen(rgb))
                && similarTo(EMPTY_SLOT_CENTER_RGB[2], getBlue(rgb));
    }

    public static boolean isDeathPointColor(int rgb) {
        return DEATH_CHECK_POINT_RGB[0] == getRed(rgb)
                && DEATH_CHECK_POINT_RGB[1] == getGreen(rgb)
                && DEATH_CHECK_POINT_RGB[2] == getBlue(rgb);
    }

    public static boolean isChattingColor(int rgb) {
        return CHATTING_RGB[0] == getRed(rgb)
                && CHATTING_RGB[1] == getGreen(rgb)
                && CHATTING_RGB[2] == getBlue(rgb);
    }

    public static boolean isBossRoomCheckPointColor(int rgb) {
        return BOSS_ROOM_CHECK_POINT_RGB[0] == getRed(rgb)
                && BOSS_ROOM_CHECK_POINT_RGB[1] == getGreen(rgb)
                && BOSS_ROOM_CHECK_POINT_RGB[2] == getBlue(rgb);
    }

    private static boolean similarTo(int c1, int c2) {
        return c2 < c1 + COLOR_TOLERANCE && c2 > c1 - COLOR_TOLERANCE;
    }

    private static boolean similarTo(int c1, int c2, int tolerance) {
        return c2 < c1 + tolerance && c2 > c1 - tolerance;
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
