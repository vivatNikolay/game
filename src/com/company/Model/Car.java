package com.company.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

import com.company.Controller.Controller;

public class Car {

    public Image car1 = new ImageIcon("D:/game/DB/car1.png").getImage();
    public Image car2 = new ImageIcon("D:/game/DB/car2.png").getImage();
    public Image car3 = new ImageIcon("D:/game/DB/car3.png").getImage();

    public Image genCar(int numberCar){
        switch (numberCar){
            case 1:
                return car1;
            case 2:
                return car2;
            case 3:
                return car3;
    }
        return car1;
    }

    public int v = 5;
    public int dv = 0;
    public int s = 0;

    public int layer1 = 0;
    public int layer2 = 1870;

    public int x = 30;
    public int y = 480;
    public int dy = 0;

    public void move(int xMenu, int dv, int dy){
        s += v/5;
        v += dv;
        if(xMenu == 480) {
            v = 0;
            y -= dy;
        }
        else {
            if(v <= 5) v = 5;
        }
        if(v >= 35) v = 35;

        y += dy;
        if(y <= 50) y = 50;
        if(y >= 560) y = 560;

        if(layer2 - v <= 0) {
            layer1 = 0;
            layer2 = 1870;
        } else {
            layer1 -= v;
            layer2 -= v;
        }
    }

    public boolean checkDistance(){
        boolean check = false;
        if(s >= 10500){
            check = true;
        }
        return check;
    }



}
