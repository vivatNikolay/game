package com.company.Model;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Menu {

    public Image menu = new ImageIcon("D:/game/DB/menu.png").getImage();
    public Image buttonMenu = new ImageIcon("D:/game/DB/buttonMenu.png").getImage();
    public Image garage = new ImageIcon("D:/game/DB/garage.png").getImage();

    public int xMenu = 2000;
    public int yMenu = 2000;
    public int xGarage = 2000;
    public int yGarage = 250;
    public boolean checkEscape = false;
    public int numberMenu = 0;
    public int numberCar = 0;



    public void actionMenu(int xMenu, int yMenu, int xGarage){
        this.xMenu = xMenu;
        this.yMenu = yMenu;
        this.xGarage = xGarage;
    }

}
