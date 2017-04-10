package com.zhuzhunew.core;

/**
 * Created by 一帆 on 2017/3/22.
 */
public final class Configuration {
    private Configuration() {}

    public static final int MAIN_LOOP = 100;

    public static final int SCREEN_WIDTH = 1920;
    public static final int SCREEN_HIGHT = 1080;

    public static final int GROUND_EXPLORER_X = 0;
    public static final int GROUND_EXPLORER_Y = 0;
    public static final int GROUND_EXPLORER_WIDTH = 1900;
    public static final int GROUND_FEXPLORER_HEIGHT = 1050;

    public static final int LEGEND_TAG_WIDTH = 30;
    public static final int[] LEGEND_RGB1 = {235, 128, 0};
    public static final int LEGEND_RGB1_TOLERANCE = 30;
    public static final int[] LEGEND_RGB2= {0, 0, 0};
    public static final int LEGEND_RGB2_TOLERANCE = 15;
    public static final int[] LEGEND_RGB3= {216, 174, 92};
    public static final int LEGEND_RGB3_TOLERANCE = 30;

    public static final int[] SET_RGB1 = {0, 255, 0};
    public static final int SET_RGB1_TOLERANCE = 30;
    public static final int[] SET_RGB2= {0, 0, 0};
    public static final int SET_RGB2_TOLERANCE = 15;
    public static final int[] SET_RGB3= {216, 174, 92};
    public static final int SET_RGB3_TOLERANCE = 30;

    public static final int[] BREATH_RGB1 = {96, 189, 165};
    public static final int BREATH_RGB1_TOLERANCE = 30;
    public static final int[] BREATH_RGB2= {0, 0, 0};
    public static final int BREATH_RGB2_TOLERANCE = 15;
    public static final int[] BREATH_RGB3= {216, 174, 92};
    public static final int BREATH_RGB3_TOLERANCE = 30;

    public static final int[] CHATTING_CHECK_POINT = {534, 1037};
    public static final int[] CHATTING_RGB = {0, 0, 0};

    public static final int[] BOSS_ROOM_CHECK_POINT = {956, 146};
    public static final int[] BOSS_ROOM_CHECK_POINT_RGB = {255, 0, 0};

    public static final int[] EMPTY_SLOT_CENTER_RGB = {19, 12, 8};

    public static final int COLOR_TOLERANCE = 20;
    public static final int[][][] NO_EXPLORER_AREA = {{{0, 0}, {289, 98}}, {{1579, 0}, {1919, 368}}, {{383, 925}, {1513, 1079}}};

    public static final int CONTROLLER_GAP = 2;

    public static final int SCENE_GAP = 10000;
    public static final int ENTER_GAME_DELAY = 20000;
    public static final int LEAVE_GAME_DELAY = 12000;

    public static final int[] ENTER_GAME_BUTTON = {233, 515};
    public static final int[] LEAVE_GAME_BUTTON = {238, 480};

    public static final int[] CENTER_POINT = {960, 503};

    public static final int[] DESTROY_TAG_BUTTON = {508, 484};
    public static final int[] DESTROY_WHITE_BUTTON = {254, 290};
    public static final int[] DESTROY_BLUE_BUTTON = {319, 290};
    public static final int[] DESTROY_GOLDEN_BUTTON = {385, 290};
    public static final int[] REPAIR_TAG_BUTTON = {509, 605};
    public static final int[] REPAIR_BUTTON = {261, 591};

    public static final int[] ZOOM_IN_MAP_BUTTON = {896, 128};
    public static final int[] ACT1_MAP_LOCATION = {737, 618};
    public static final int[] ACT2_MAP_LOCATION = {1086, 520};
    public static final int[] ACT3_MAP_LOCATION = {706, 391};
    public static final int[] KULLE_ROAD_MAP_LOCATION = {878, 278};
    public static final int[] BASE_MAP_LOCATION = {1016, 486};

    public static final int[] REVIVE_IN_CITY_BUTTON = {960,845};
    public static final int[] DEATH_CHECK_POINT = {32, 125};
    public static final int[] DEATH_CHECK_POINT_RGB = {0, 0, 0};

    // The center of the ast second slot in the last column.
    public static final int[] CLOSET_AVAILABLE_CHECK = {435, 707};
    public static final int[][] CLOSET_TAGS =
            {{510, 267}, {510, 398}, {510, 523}, {510, 655}, {510, 786}};
    // The top left slot in package.
    public static final int[] FIRST_PACKAGE_SLOT = {1428, 584};
    // Every slot is a square, this is the length of the side.
    public static final int PACKAGE_SIZE = 50;

    public static final int[][] FROM_INITIAL_TO_BLACKSMITH =
            {{0, 0}};
    public static final int[][] FROM_STATION_TO_BLACKSMITH =
            {{1368, 152}};
    public static final int[][] FROM_TELEPORT_TO_BLACKSMITH =
            {{0, 0}};
    public static final int[][] FROM_BLACKSMITH_TO_CLOSET =
            {{194, 330}};

    public static final int[][] KULLE_ROAD_STEPS =
            {};
    public static final int[][] KULLE_ROOM_STEPS =
            {};

    public static final int MAX_LEGEND_PICKUP_ON_SCREEN = 5;

    public static final int[] FROM_AZ_ROAD_TO_BOSSROOM = {1670, 101};
    public static final int[] FROM_KULLE_ROAD_TO_BOSSROOM = {0, 0};

    public static final int[] AZ_ROAD_MAP_LOCATION = {1140, 784};
    public static final int[][] AZ_ROAD_STEPS =
            {{1600, 446, 0}, {1554, 190, 0}, {1589, 182, 0}, {1600, 125}, {1586, 101}, {1288, 100},
             {1117, 1}, {1187, 1}, {718, 0}, {800, 0}, {1304, 0}, {1708, 412}, {1527, 43},
             {1786, 280}, {1800, 808}, {1715, 920}, {1285, 948}, {1806, 589}, {1552, 42},
             {1709, 100}, {1585, 16}, {1624, 123}, {1604, 388, 2}};

    public static final int[] A1_1_LOCATION = {690, 484};
    public static final int[][] A1_1_STEPS =
            {{824, 44}, {222, 75}, {1465, 2}, {1690, 24}, {520, 53}, {520, 53},
             {368, 67}, {1284, 20}, {1014, 3}, {330, 63}};

    public static final int[] A1_2_LOCATION = {1181, 824};
    public static final int[][] A1_2_STEPS =
            {{451, 826, 0}, {415, 620}, {765, 1955}, {331, 928, 2}, {715, 1980}};

    public static final int[] A2_1_LOCATION = {856, 668};
    public static final int[][] A2_1_STEPS =
            {{243, 346, 0}, {243, 346}, {960, 0}, {666, 0, 0}, {361, 0}, {441, 87}, {314, 186}, {275, 312},
                    {275, 312}, {1255, 56}, {1600, 743}, {942, 838, 0}, {1578, 66, 0}, {1578, 66}, {1578, 66},
                    {1616, 89, 0}, {1616, 89}, {1616, 89, 2}};

    public static final int[][] AZ_ROOM_STEPS =
            {{960, 0, 0}, {960, 0, 0}, {960, 0, 0}, {960, 0, 0}, {960, 0, 0}, {960, 0, 0}, {960, 0, 0}, {-1, -1}, {960, 294, 5}};

    public static final int SKILL_DEFAULT_REPEAT = 1;
}
