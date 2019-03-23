package com.company.Controller;

import com.company.Model.Car;
import com.company.Model.Palata;
import com.company.Model.Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Controller {

    public Palata plt = new Palata();
    public Car c = new Car();
    public Menu m = new Menu();

    public void keyPressedHealing(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_RIGHT) {
            plt.dx = 1;
        }
        if(key == KeyEvent.VK_LEFT) {
            plt.dx = -1;
        }
        if(key == KeyEvent.VK_B){
            plt.checkBoy = true;
        }
        if(key == KeyEvent.VK_G){
            plt.checkBoy = false;
        }
    }

    public void keyReleasedHealing(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_RIGHT) {
            plt.dx = 0;
        }
        if(key == KeyEvent.VK_LEFT) {
            plt.dx = 0;
        }
    }

    public void keyPressedCar(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_RIGHT) {
            c.dv = 1;
        }
        if(key == KeyEvent.VK_LEFT) {
            c.dv = -1;
        }
        if(key == KeyEvent.VK_UP){
            c.dy = -10;
        }
        if(key == KeyEvent.VK_DOWN){
            c.dy = 10;
        }
    }

    public void keyReleasedCar(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_RIGHT) {
            c.dv = 0;
        }
        if(key == KeyEvent.VK_LEFT) {
            c.dv = 0;
        }
        if(key == KeyEvent.VK_UP){
            c.dy = 0;
        }
        if(key == KeyEvent.VK_DOWN){
            c.dy = 0;
        }
    }

    public void keyPressedMenu(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_ESCAPE && m.xGarage == 2000) {
            m.checkEscape = true;
            m.xMenu = 480;
            m.yMenu = 160;
        }

        if(key == KeyEvent.VK_1 && m.yMenu == 160) {
            m.numberMenu = 1;
            m.xMenu = 2000;
            m.yMenu = 2000;
        }
        if(key == KeyEvent.VK_3 && m.yMenu == 160) {
            m.numberMenu = 3;
            JOptionPane.showMessageDialog(null,"BYE!");
            System.exit(1);
        }
        if(key == KeyEvent.VK_2 && m.yMenu == 160) {
            m.numberMenu = 2;
            m.yMenu = 2000;
            m.xGarage = 300;
        }else{
            if(key == KeyEvent.VK_1 && m.xGarage == 300){
                m.numberCar = 1;
                m.xGarage = 2000;
                m.yMenu = 160;
            }
            if(key == KeyEvent.VK_2 && m.xGarage == 300){
                m.numberCar = 2;
                m.xGarage = 2000;
                m.yMenu = 160;
            }
            if(key == KeyEvent.VK_3 && m.xGarage == 300){
                m.numberCar = 3;
                m.xGarage = 2000;
                m.yMenu = 160;
            }
        }
    }


    public int imageX(MouseEvent e){
        if(e.getX() > plt.xTermom && e.getX() < plt.xTermom + 50 &&
                e.getY() > plt.yTermom && e.getY() < plt.yTermom + 50){
            return plt.xTermom;
        }
        if(e.getX() > plt.xAspirin && e.getX() < plt.xAspirin + 50 &&
                e.getY() > plt.yAspirin && e.getY() < plt.yAspirin + 50){
            return plt.xAspirin;
        }
        if(e.getX() > plt.xSlabit && e.getX() < plt.xSlabit + 50 &&
                e.getY() > plt.ySlabit && e.getY() < plt.ySlabit + 50){
            return plt.xSlabit;
        }
        if(e.getX() > plt.xBint && e.getX() < plt.xBint + 50 &&
                e.getY() > plt.yBint && e.getY() < plt.yBint + 50){
            return plt.xBint;
        }
        if(e.getX() > plt.xChelyust && e.getX() < plt.xChelyust + 50 &&
                e.getY() > plt.yChelyust && e.getY() < plt.yChelyust + 50){
            return plt.xChelyust;
        }
        if(e.getX() > plt.xPrivivka && e.getX() < plt.xPrivivka + 50 &&
                e.getY() > plt.yPrivivka && e.getY() < plt.yPrivivka + 50){
            return plt.xPrivivka;
        }
        return 0;
    }

    public int imageY(MouseEvent e){
        if(e.getX() > plt.xTermom && e.getX() < plt.xTermom + 50 &&
                e.getY() > plt.yTermom && e.getY() < plt.yTermom + 50) {
            return plt.yTermom;
        }
        if(e.getX() > plt.xAspirin && e.getX() < plt.xAspirin + 50 &&
                e.getY() > plt.yAspirin && e.getY() < plt.yAspirin + 50){
            return plt.yAspirin;
        }
        if(e.getX() > plt.xSlabit && e.getX() < plt.xSlabit + 50 &&
                e.getY() > plt.ySlabit && e.getY() < plt.ySlabit + 50){
            return plt.ySlabit;
        }
        if(e.getX() > plt.xBint && e.getX() < plt.xBint + 50 &&
                e.getY() > plt.yBint && e.getY() < plt.yBint + 50){
            return plt.yBint;
        }
        if(e.getX() > plt.xChelyust && e.getX() < plt.xChelyust + 50 &&
                e.getY() > plt.yChelyust && e.getY() < plt.yChelyust + 50){
            return plt.yChelyust;
        }
        if(e.getX() > plt.xPrivivka && e.getX() < plt.xPrivivka + 50 &&
                e.getY() > plt.yPrivivka && e.getY() < plt.yPrivivka + 50) {
            return plt.yPrivivka;
        }
        return 0;
    }

    int prevX = 0;
    int prevY = 0;

    public void mousePressed(MouseEvent e) {
        if(e.getX() > imageX(e) && e.getX() < imageX(e) + 50 &&
                e.getY() > imageY(e) && e.getY() < imageY(e) + 50) {
            prevX = imageX(e) - e.getX();
            prevY = imageY(e) - e.getY();
        }
        Component c = e.getComponent();
        if(c instanceof JLabel){
            updateLocation(e);
        }
    }

    public void mouseReleased(MouseEvent e) {
        Component c = e.getComponent();
        if (c instanceof JLabel) {
            updateLocation(e);
        }
    }

    public void mouseDragged(MouseEvent e) {
        if(e.getX() > imageX(e) && e.getX() < imageX(e) + 50 &&
                e.getY() > imageY(e) && e.getY() < imageY(e) + 50) {
            updateLocation(e);
        }
    }

    public void updateLocation(MouseEvent e) {
        if(imageX(e) == plt.xTermom && imageY(e) == plt.yTermom) {
            plt.xTermom = prevX + e.getX();
            plt.yTermom = prevY + e.getY();
        }
        if(imageX(e) == plt.xAspirin && imageY(e) == plt.yAspirin) {
            plt.xAspirin = prevX + e.getX();
            plt.yAspirin = prevY + e.getY();
        }
        if(imageX(e) == plt.xSlabit && imageY(e) == plt.ySlabit) {
            plt.xSlabit = prevX + e.getX();
            plt.ySlabit = prevY + e.getY();
        }
        if(imageX(e) == plt.xBint && imageY(e) == plt.yBint) {
            plt.xBint = prevX + e.getX();
            plt.yBint = prevY + e.getY();
        }
        if(imageX(e) == plt.xChelyust && imageY(e) == plt.yChelyust) {
            plt.xChelyust = prevX + e.getX();
            plt.yChelyust = prevY + e.getY();
        }
        if(imageX(e) == plt.xPrivivka && imageY(e) == plt.yPrivivka) {
            plt.xPrivivka = prevX + e.getX();
            plt.yPrivivka = prevY + e.getY();
        }
    }

}