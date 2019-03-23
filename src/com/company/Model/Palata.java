package com.company.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Random;


public class Palata {

    public Image palata = new ImageIcon("D:/game/DB/hospital.jpg").getImage();

    public Image krovat = new ImageIcon("D:/game/DB/krovat.png").getImage();

    public Image tumba = new ImageIcon("D:/game/DB/tumba.png").getImage();

    public Image boygirl = new ImageIcon("D:/game/DB/boygirl.png").getImage();

    public Image boyl = new ImageIcon("D:/game/DB/boyl.png").getImage();

    public Image girll = new ImageIcon("D:/game/DB/girll.png").getImage();

    public Image doc_l = new ImageIcon("D:/game/DB/docleft.png").getImage();

    public Image doc_r = new ImageIcon("D:/game/DB/docright.png").getImage();

    public Image termom = new ImageIcon("D:/game/DB/1.png").getImage();
    public Image aspirin = new ImageIcon("D:/game/DB/2.png").getImage();
    public Image slabit = new ImageIcon("D:/game/DB/3.png").getImage();
    public Image bint = new ImageIcon("D:/game/DB/4.png").getImage();
    public Image chelyust = new ImageIcon("D:/game/DB/5.png").getImage();
    public Image privivka = new ImageIcon("D:/game/DB/6.png").getImage();

    public Image doc = doc_l;

    public Image human = boyl;

    public Font font1 = new Font("Arial", Font.BOLD, 30);
    public Font font2 = new Font("Arial", 0, 20);
    public Color colorB = Color.green;
    public Color colorG = Color.red;
    public Color colorText = Color.black;
    public int xText = 215;
    public int yText = 415;

    public int x = 0;
    public int y = 0;

    public int xDoc = 0;
    public int yDoc = 0;
    public int dx = 0;

    public int xG = 1219;
    public int yG = 190;
    public int xB = 1302;
    public int yB = 174;

    public int xTermom = 1205;
    public int yTermom = 230;
    public int xAspirin = 1285;
    public int yAspirin = 240;
    public int xSlabit = 1200;
    public int ySlabit = 335;
    public int xBint = 1280;
    public int yBint = 335;
    public int xChelyust = 1200;
    public int yChelyust = 445;
    public int xPrivivka = 1285;
    public int yPrivivka = 445;

    public boolean check = true;
    int rand;

    public boolean checkBoy = true;

    public void move(int dx, boolean checkBoy){
        xDoc += dx;
        if(dx == 1) doc = doc_r;
        if(dx == -1) doc = doc_l;
        if(xDoc <= -120) xDoc = -120;
        if(xDoc >= 56) xDoc = 56;

        if(checkBoy){
            human = boyl;
            colorB = Color.green;
            colorG = Color.red;
        }
        else{
            human = girll;
            colorG = Color.green;
            colorB = Color.red;
        }
    }

    public String generator(){
        if(check) {
            Random randNumber = new Random();
            rand = randNumber.nextInt(6) + 1;
            check = false;
        }
        switch (rand) {
            case 1:
                return "У меня температура";
            case 2:
                return "Голова побаливает";
            case 3:
                return "В животе колит";
            case 4:
                return "Я порезал руку";
            case 5:
                return "Болят зубы";
            case 6:
                return "Укусила собака";
        }
        return null;
    }

    public void check(int xTermom, int yTermom,
                      int xAspirin, int yAspirin,
                      int xSlabit, int ySlabit,
                      int xBint, int yBint,
                      int xChelyust, int yChelyust,
                      int xPrivivka, int yPrivivka){
        this.xTermom = xTermom;
        this.yTermom = yTermom;
        this.xAspirin = xAspirin;
        this.yAspirin = yAspirin;
        this.xSlabit = xSlabit;
        this.ySlabit = ySlabit;
        this.xBint = xBint;
        this.yBint = yBint;
        this.xChelyust = xChelyust;
        this.yChelyust = yChelyust;
        this.xPrivivka = xPrivivka;
        this.yPrivivka = yPrivivka;

        if (this.xTermom > 250 && this.xTermom < 360 && this.yTermom > 440 && this.yTermom < 540 &&
                rand == 1) {
            win();
        }
        if (this.xTermom > 250 && this.xTermom < 360 && this.yTermom > 440 && this.yTermom < 540 &&
                rand != 1) {
            lose();
        }
        if (this.xAspirin > 250 && this.xAspirin < 360 && this.yAspirin > 440 && this.yAspirin < 540 &&
                rand == 2) {
            win();
        }
        if (this.xAspirin > 250 && this.xAspirin < 360 && this.yAspirin > 440 && this.yAspirin < 540 &&
                rand != 2) {
            lose();
        }
        if (this.xSlabit > 250 && this.xSlabit < 360 && this.ySlabit > 440 && this.ySlabit < 540 &&
                rand == 3) {
            win();
        }
        if (this.xSlabit > 250 && this.xSlabit < 360 && this.ySlabit > 440 && this.ySlabit < 540 &&
                rand != 3) {
            lose();
        }
        if (this.xBint > 250 && this.xBint < 360 && this.yBint > 440 && this.yBint < 540 &&
                rand == 4) {
            win();
        }
        if (this.xBint > 250 && this.xBint < 360 && this.yBint > 440 && this.yBint < 540 &&
                rand != 4) {
            lose();
        }
        if (this.xChelyust > 250 && this.xChelyust < 360 && this.yChelyust > 440 && this.yChelyust < 540 &&
                rand == 5) {
            win();
        }
        if (this.xChelyust > 250 && this.xChelyust < 360 && this.yChelyust > 440 && this.yChelyust < 540 &&
                rand != 5) {
            lose();
        }
        if (this.xPrivivka > 250 && this.xPrivivka < 360 && this.yPrivivka > 440 && this.yPrivivka < 540 &&
                rand == 6) {
            win();
        }
        if (this.xPrivivka > 250 && this.xPrivivka < 360 && this.yPrivivka > 440 && this.yPrivivka < 540 &&
                rand != 6) {
            lose();
        }
    }

    void win(){
        JOptionPane.showMessageDialog(null, "Поздравляю, вы выиграли!");
        System.exit(1);
    }

    void lose(){
        JOptionPane.showMessageDialog(null, "Вы проиграли((((((");
        System.exit(1);
    }
}
