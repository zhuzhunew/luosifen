package com.zhuzhunew;

import com.zhuzhunew.core.Explorer;
import com.zhuzhunew.util.ColorMaster;

import java.awt.*;
import java.awt.image.BufferedImage;


/**
 * Created by 一帆 on 2017/3/22.
 */
public class Test {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        Rectangle rect = new Rectangle(0, 0, 1920 - 35, 1080 - 35);

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

                BufferedImage image = robot.createScreenCapture(rect);

//        Explorer explorer = new Explorer(robot);
//        System.out.println(explorer.isDead());




//        int a = image.getRGB(849, 467);
//        int r = (a >> 16) & 0xff;
//        int g = (a >> 8) & 0xff;
//        int b = a & 0xff;
//        System.out.println(a);
//        System.out.println(r);
//        System.out.println(g);
//        System.out.println(b);
//        robot.mouseMove(849, 467);


        Explorer explorer = new Explorer(robot);

        Point p = explorer.findFirsrtLegendItemOnGroundArea(rect);

        if (p != null) {
            robot.mouseMove(p.x, p.y);
            System.out.println(p.x);
            System.out.println(p.y);
        }
//
//        boolean color2Found = false;
//        for (int i = 1; i <= 30; i++) {
//            if (!color2Found) {
//                       if (ColorMaster.isLegendNameTagFrontColor2(image.getRGB(p.x + i, p.y))) {
//                           System.out.println("Second");
//                           int a = image.getRGB(p.x + i, p.y);
//                           int r = (a >> 16) & 0xff;
//                           int g = (a >> 8) & 0xff;
//                           int b = a & 0xff;
//                           System.out.println(p.x + i);
//                           System.out.println(p.y);
//                           System.out.println(a);
//                           System.out.println(r);
//                           System.out.println(g);
//                           System.out.println(b);
//                           color2Found = true;
//                       }
//
//            } else if (ColorMaster.isLegendNameTagFrontColor3(image.getRGB(p.x + i, p.y))){
//                System.out.println("Third");
//                int a = image.getRGB(p.x + i, p.y);
//                int r = (a >> 16) & 0xff;
//                int g = (a >> 8) & 0xff;
//                int b = a & 0xff;
//                System.out.println(p.x + i);
//                System.out.println(p.y);
//                System.out.println(a);
//                System.out.println(r);
//                System.out.println(g);
//                System.out.println(b);
//                break;
//            }
//        }






//        List<Point> list = new ArrayList<>();
//
//        boolean stop = false;
//        for (int i = 851; i < 871; i++) {
//            if (stop) {
//                break;
//            }
//            for (int j = 310; j < 330; j++) {
//                int a = image.getRGB(i, j);
//                int r = (a >> 16) & 0xff;
//                int g = (a >> 8) & 0xff;
//                int b = a & 0xff;
//                if (r == 255 && g == 128 && b == 0) {
//                    System.out.println("Found one");
//                    robot.mouseMove(i, j);
//                    stop = true;
//                    break;
//                }

//                System.out.println("r:" + r + " g:" + g + " b:" + b);
//            }
//        }

//        for (int i = 0; i < rect.width; i++) {
//            for (int j = 0; j < rect.height; j++) {
//                if (ColorMaster.isLegendNameTagFrontColor(image.getRGB(i, j))
//                        || ColorMaster.isSetNameTagFrontColor(image.getRGB(i, j))) {
//                    list.add(new Point(i + rect.x, j + rect.y));
//                }
//            }
//        }
//
//        for (Point p : list) {
//            System.out.println("x: " + p.x + "  y: " + p.y);
//            robot.mouseMove(p.x, p.y);
//            robot.delay(1000);
//        }
//        System.out.println(list.size());



//        int x = 32;
//        int y = 125;
//
//        robot.mouseMove(0, 0);
//        int a = image.getRGB(x, y);
//        int r = (a >> 16) & 0xff;
//        int g = (a >> 8) & 0xff;
//        int b = a & 0xff;
//        System.out.println(a);
//        System.out.println(r);
//        System.out.println(g);
//        System.out.println(b);

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
