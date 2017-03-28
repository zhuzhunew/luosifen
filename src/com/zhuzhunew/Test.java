package com.zhuzhunew;

import com.zhuzhunew.core.Configuration;
import com.zhuzhunew.util.ColorMaster;

import java.awt.*;

import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by 一帆 on 2017/3/22.
 */
public class Test {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        Rectangle rect = new Rectangle(0, 0, 1920, 1080);
        BufferedImage image = robot.createScreenCapture(rect);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int x = 1428;
        int y = 584;

        for (int i = 1428; i < 10; i++) {
            x += i * 50;
            for (int j = 584; j < 6; j++) {
                 y += j * 50;
                robot.mouseMove(x, y);
                int a = image.getRGB(x, y);
                int r = (a >> 16) & 0xff;
                int g = (a >> 8) & 0xff;
                int b = a & 0xff;
                System.out.println(a);
                System.out.println(r);
                System.out.println(g);
                System.out.println(b);
                robot.delay(800);
            }
        }


//        System.out.println(Configuration.LEGEND_RGB[0]);
//        System.out.println(Configuration.LEGEND_RGB[1]);
//        System.out.println(Configuration.LEGEND_RGB[2]);
//
//        List<Point> list = new LinkedList<>();
//        for (int i = 0; i < 900; i++) {
//            for (int j = 0; j < 600; j++) {
//                if (ColorMaster.isSetNameTagFrontColor(image.getRGB(i, j))) {
//                    list.add(new Point(i, j));
//                }
//            }
//        }
//
//        System.out.println(list);
//
//        Point p = list.get(0);
//        robot.mouseMove(p.x, p.y);
//        robot.delay(2);
//        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//        robot.delay(2);
//        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }


}
