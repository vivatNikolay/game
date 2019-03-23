package com.company.Model;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.company.Model.Car;
public class Patient{


    Image img1 = new ImageIcon("D:/game/DB/girl.png").getImage();
    Image img2 = new ImageIcon("D:/game/DB/boy.png").getImage();
    public Image live = new ImageIcon("D:/game/DB/live.png").getImage();

    Random rand = new Random();

    public int lives = 3;
    public int xlive1 = 1100;
    public int xlive2 = 1190;
    public int xlive3 = 1280;
    public int ylive = 25;
    boolean count;
    int num;

    public Image genImg(){
        if(count){
            num = rand.nextInt(2);
        }
        if (num == 1){
            return img1;
        } else {
            return img2;}
    }

    public int x = 1400;
    public int y = rand.nextInt(535) + 40;

    public void move(int v){
        if(x <= -80){
            x = rand.nextInt(1000) + 2000;
            y = rand.nextInt(535) + 40;
            count = true;
            lives--;
        } else {
            x -= v;
            count = false;
        }
    }

    public void takePatient(int a, int b){
        if((a < x + 35) && (x + 35 < a + 170) && (b < y + 50) && (y + 50 < b + 151)){
            x = -100;
        }
    }

    public void checkLive(){
        if(x == -100){
            lives++;
        }
        if(lives == 2){xlive3 = -80;}
        if(lives == 1){xlive2 = -80;}
        if(lives == 0){xlive1 = -80;}
        if(lives == 0){
            JOptionPane.showMessageDialog(null,"GAME OVER");
            System.exit(1);
        }
    }
}
