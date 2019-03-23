package com.company.Model;

import javax.swing.*;
import java.awt.*;

public class Speedometer {
    public Image speedometer = new ImageIcon("D:/game/DB/speed.png").getImage();
    public Image arrow = new ImageIcon("D:/game/DB/line.png").getImage();
    public int xSpeedometer = 1150;
    public int ySpeedometer = 590;
    public int xCentre = 1238;
    public int yCentre = 678;
    public int f;
    public int xArrow = 1220;
    public int yArrow = 596;
    public void function(int v){
        f = 6 * v - 135;
    }
}
