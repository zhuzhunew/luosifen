package com.zhuzhunew.core;

/**
 * Created by 一帆 on 2017/3/22.
 */
public final class Configuration {
    private Configuration() {}

    public static final int MAIN_LOOP = 2;

    public static final int SCREEN_WIDTH = 1920;
    public static final int SCREEN_HIGHT = 1080;
    public static final int EXPLORER_X = 0;
    public static final int EXPLORER_Y = 0;
    public static final int EXPLORER_WIDTH = 800;
    public static final int EXPLORER_HEIGHT = 500;

    public static final int[] LEGEND_RGB = {238, 119, 0};
    public static final int[] SET_RGB = {0, 250, 0};
    public static final int[] EMPTY_SLOT_CENTER_RGB = {21, 12, 8};

    public static final int CONTROLLER_GAP = 2;

    public static final int SCENE_GAP = 10000;
    public static final int ENTER_GAME_DELAY = 20000;
    public static final int LEAVE_GAME_DELAY = 10000;

    public static final int[] ENTER_GAME_BUTTON = {233, 515};
    public static final int[] LEAVE_GAME_BUTTON = {238, 480};

    public static final int[] CENTER_POINT = {0, 0};

    public static final int[] DESTROY_TAG_BUTTON = {622, 329};
    public static final int[] DESTROY_WHITE_BUTTON = {311, 212};
    public static final int[] DESTROY_BLUE_BUTTON = {396, 212};
    public static final int[] DESTROY_GOLDEN_BUTTON = {477, 212};
    public static final int[] REPAIR_TAG_BUTTON = {639, 405};
    public static final int[] REPAIR_BUTTON = {331, 398};

    public static final int[] ZOOM_IN_MAP_BUTTON = {777, 110};
    public static final int[] ACT1_MAP_LOCATION = {580, 410};
    public static final int[] ACT2_MAP_LOCATION = {1018, 350};
    public static final int[] ACT3_MAP_LOCATION = {548, 270};
    public static final int[] AZ_ROAD_MAP_LOCATION = {1080, 517};
    public static final int[] KULLE_ROAD_MAP_LOCATION = {758, 202};
    public static final int[] BASE_MAP_LOCATION = {933, 329};

    // The center of the ast second slot in the last column.
    public static final int[] CLOSET_AVAILABLE_CHECK = {435, 707};
    public static final int[][] CLOSET_TAGS = {};
    // The Slot in package except top left one (medicine).
    public static final int[][] PACKAGE_SLOTS = {};

    public static final int[][] FROM_INITIAL_TO_BLACKSMITH
            = {{0, 0}};
    public static final int[][] FROM_STATION_TO_BLACKSMITH
            = {{1368, 152}};
    public static final int[][] FROM_TELEPORT_TO_BLACKSMITH
            = {{0, 0}};
    public static final int[][] FROM_BLACKSMITH_TO_CLOSET
            = {{194, 330}};

    public static final int[][] AZ_ROAD_STEPS
            = {};
    public static final int[][] AZ_ROOM_STEPS
            = {};
    public static final int[][] KULLE_ROAD_STEPS
            = {};
    public static final int[][] KULLE_ROOM_STEPS
            = {};

    public static final int MAX_LEGEND_PICKUP_ON_SCREEN = 10;

    public static final int[] FROM_AZ_ROAD_TO_BOSSROOM = {0, 0};
    public static final int[] FROM_KULLE_ROAD_TO_BOSSROOM = {0, 0};
}
