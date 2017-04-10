package com.zhuzhunew.core;

import com.zhuzhunew.util.ColorMaster;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import static com.zhuzhunew.core.Configuration.*;

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
    public Point findFirsrtLegendItemOnGroundArea(Rectangle rect) {
        Map<Point, Integer> colorMap = new HashMap<>();
        BufferedImage image = robot.createScreenCapture(rect);
        for (int i = 0; i < rect.width - LEGEND_TAG_WIDTH; i++) {
            for (int j = 0; j < rect.height; j++) {
                if (inNoExplorerArea(i, j)) {
                    continue;
                }
                if (isLegendItemIconColor(image, i, j) || isSetItemIconColor(image, i, j) || isBreathIconColor(image, i, j)) {
                    Point point = new Point(i + rect.x, j + rect.y);
                    colorMap.put(point, image.getRGB(point.x, point.y));
                }
            }
        }

        robot.delay(600);
        image = robot.createScreenCapture(rect);
        for (Point p : colorMap.keySet()) {
            if (image.getRGB(p.x, p.y) == colorMap.get(p)) {
                return p;
            }
        }
        return null;
    }

    private boolean isLegendItemIconColor(BufferedImage image, int x, int y) {
        if (!ColorMaster.isLegendNameTagFrontColor1(image.getRGB(x, y))) {
            return false;
        }

        boolean color2Found = false;
        for (int i = 1; i <= LEGEND_TAG_WIDTH; i++) {
            if (!color2Found) {
                if (ColorMaster.isLegendNameTagFrontColor2(image.getRGB(x + i, y))) {
                    color2Found = true;
                }
            } else if (ColorMaster.isLegendNameTagFrontColor3(image.getRGB(x + i, y))){
                return true;
            }
        }
        return false;
    }

    private boolean isSetItemIconColor(BufferedImage image, int x, int y) {
        if (!ColorMaster.isSetNameTagFrontColor1(image.getRGB(x, y))) {
            return false;
        }

        boolean color2Found = false;
        for (int i = 1; i <= LEGEND_TAG_WIDTH; i++) {
            if (!color2Found) {
                if (ColorMaster.isSetNameTagFrontColor2(image.getRGB(x + i, y))) {
                    color2Found = true;
                }
            } else if (ColorMaster.isSetNameTagFrontColor3(image.getRGB(x + i, y))){
                return true;
            }
        }
        return false;
    }

    private boolean isBreathIconColor(BufferedImage image, int x, int y) {
        if (!ColorMaster.isBreathNameTagFrontColor1(image.getRGB(x, y))) {
            return false;
        }

        boolean color2Found = false;
        for (int i = 1; i <= LEGEND_TAG_WIDTH; i++) {
            if (!color2Found) {
                if (ColorMaster.isBreathNameTagFrontColor2(image.getRGB(x + i, y))) {
                    color2Found = true;
                }
            } else if (ColorMaster.isBreathNameTagFrontColor3(image.getRGB(x + i, y))){
                return true;
            }
        }
        return false;
    }

    private boolean inNoExplorerArea(int x, int y) {
        for (int[][] area : NO_EXPLORER_AREA) {
            if (x >= area[0][0] && x <= area[1][0] && y >= area[0][1] && y <= area[1][1]) {
                return true;
            }
        }
        return false;
    }

    public boolean isClosetAvailable () {
        return isEmptySlot(robot.createScreenCapture(new Rectangle(0, 0, SCREEN_WIDTH, SCREEN_HIGHT)),
                CLOSET_AVAILABLE_CHECK[0], CLOSET_AVAILABLE_CHECK[1]);
    }

    public boolean isEmptySlot(BufferedImage image, int x, int y) {
        return ColorMaster.isEmptySlotCenterColor(image.getRGB(x, y));
    }

    public boolean isDead() {
        BufferedImage image = robot.createScreenCapture(new Rectangle(0, 0, SCREEN_WIDTH, SCREEN_HIGHT));
        return ColorMaster.isDeathPointColor(image.getRGB(DEATH_CHECK_POINT[0], DEATH_CHECK_POINT[1]));
    }

    public boolean isChatting() {
        BufferedImage image = robot.createScreenCapture(new Rectangle(0, 0, SCREEN_WIDTH, SCREEN_HIGHT));
        return ColorMaster.isChattingColor(image.getRGB(CHATTING_CHECK_POINT[0], CHATTING_CHECK_POINT[1]));
    }

    public boolean isBossRoom () {
        BufferedImage image = robot.createScreenCapture(new Rectangle(0, 0, SCREEN_WIDTH, SCREEN_HIGHT));
        return ColorMaster.isBossRoomCheckPointColor(image.getRGB(BOSS_ROOM_CHECK_POINT[0], BOSS_ROOM_CHECK_POINT[1]));
    }
}
