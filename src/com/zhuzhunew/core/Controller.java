package com.zhuzhunew.core;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import static com.zhuzhunew.core.Configuration.CONTROLLER_GAP;

/**
 * Created by 一帆 on 2017/3/21.
 */
public class Controller {
    Robot robot;

    public Controller(Robot robot) {
        this.robot = robot;
    }

    public void moveMouseTo(int x, int y) {
        waiting(CONTROLLER_GAP);
        robot.mouseMove(x, y);
    }

    public void moveMouseTo(Point point) {
        moveMouseTo(point.x, point.y);
    }

    public void moveMouseTo(int[] coordinate) {
        robot.mouseMove(coordinate[0], coordinate[1]);
    }

    public void waiting(int ms) {
        robot.delay(ms);
    }

    public void clickKey (int keyCode) {
        waiting(CONTROLLER_GAP);
        robot.keyPress(keyCode);
        waiting(CONTROLLER_GAP);
        robot.keyRelease(keyCode);
    }

    public void leftClick() {
        waiting(CONTROLLER_GAP);
        robot.keyPress(InputEvent.BUTTON1_DOWN_MASK);
        waiting(CONTROLLER_GAP);
        robot.keyRelease(InputEvent.BUTTON1_DOWN_MASK);

    }

    public void rightClick() {
        waiting(CONTROLLER_GAP);
        robot.keyPress(InputEvent.BUTTON3_DOWN_MASK);
        waiting(CONTROLLER_GAP);
        robot.keyRelease(InputEvent.BUTTON3_DOWN_MASK);
    }

    public void goTo(int x, int y) {
        moveMouseTo(x, y);
        leftClick();
    }

    public void goTo(Point point) {
        goTo(point.x, point.y);
    }

    public void goTo(int[] coordinate) {
        goTo(coordinate[0], coordinate[1]);
    }

    public void launchSkill1() {
        clickKey(KeyEvent.VK_1);
    }

    public void launchSkill2() {
        clickKey(KeyEvent.VK_2);
    }

    public void launchSkill3() {
        clickKey(KeyEvent.VK_3);
    }

    public void launchSkill4() {
        clickKey(KeyEvent.VK_4);
    }

    public void drinkMedicine() {
        clickKey(KeyEvent.VK_Q);
    }

    public void openClosePackage() {
        clickKey(KeyEvent.VK_I);
    }

    public void openCloseMap() {
        clickKey(KeyEvent.VK_M);
    }

    public void openCloseManu() {
        clickKey(KeyEvent.VK_ESCAPE);
    }

    public void clearWindows() {
        clickKey(KeyEvent.VK_SPACE);
    }

    public void confirm() {
        clickKey(KeyEvent.VK_ENTER);
    }
}
