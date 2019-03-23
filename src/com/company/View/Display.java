package com.company.View;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

import com.company.Controller.Controller;
import com.company.Model.Car;
import com.company.Model.Patient;
import com.company.Model.Speedometer;
import com.company.Model.TopPanel;
import com.company.Model.Menu;
import com.company.Model.Data;
import com.company.Model.Palata;

import javax.swing.*;

public class Display extends JPanel implements ActionListener, MouseListener, MouseMotionListener{

            Image road = new ImageIcon("D:/game/DB/road.jpg").getImage();

            Timer mainTimer = new Timer(20, this);

            private Car c = new Car();

            private Patient p = new Patient();

            private Menu m = new Menu();

            private Speedometer s = new Speedometer();

            private TopPanel t = new TopPanel();

            private Data d = new Data();

            private Palata plt = new Palata();

            private Controller controller = new Controller();

            public Display(){
                mainTimer.start();
                addKeyListener(new MyKeyAdapter());
                addMouseMotionListener(this);
                addMouseListener(this);
            }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        controller.mousePressed(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        controller.mouseReleased(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        controller.mouseDragged(e);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    private class MyKeyAdapter extends KeyAdapter{
                public void keyPressed(KeyEvent e){
                    if(!c.checkDistance()) {
                        controller.keyPressedCar(e);
                        controller.keyPressedMenu(e);
                    }else {
                       controller.keyPressedHealing(e);
                    }
                }
                public void keyReleased(KeyEvent e) {
                    if (!c.checkDistance()) {
                        controller.keyReleasedCar(e);
                    } else {
                        controller.keyReleasedHealing(e);
                    }
                }
            }

            public void paint(Graphics g){
                if(!c.checkDistance()){
                g.drawImage(road, c.layer1, 0, null);
                g.drawImage(road, c.layer2, 0, null);
                g.drawImage(p.genImg(), p.x, p.y, null);
                g.drawImage(c.genCar(controller.m.numberCar), c.x, c.y, null);

                g.drawImage(m.buttonMenu, 15, 14, null);
                g.drawImage(m.menu, m.xMenu, m.yMenu, null);
                g.drawImage(m.garage, m.xGarage, m.yGarage, null);

                g.setColor(Color.ORANGE);
                g.setFont(d.font);
                g.drawString(d.time/1000 + " sec", d.xTime, d.yTime);

                g.setColor(Color.GREEN);
                g.fillRect(t.xRect, t.yRect, c.s/20, t.hRect);
                g.drawImage(t.miniCar, c.s/20 + t.xmc, t.ymc, null);
                g.drawImage(t.start, t.xStart, t.yStart, null);
                g.drawImage(t.miniHospital, t.xmh, t.ymh, null);

                g.drawImage(p.live, p.xlive1, p.ylive, null);
                g.drawImage(p.live, p.xlive2, p.ylive, null);
                g.drawImage(p.live, p.xlive3, p.ylive, null);

                g.drawImage(s.speedometer, s.xSpeedometer, s.ySpeedometer, null);
                ((Graphics2D) g).rotate(Math.toRadians(s.f), s.xCentre, s.yCentre);//повернет все последующие
                g.drawImage(s.arrow, s.xArrow, s.yArrow, null);
            }
            else{
                    g.drawImage(plt.palata, plt.x, plt.y, null);
                    g.drawImage(plt.doc, plt.xDoc, plt.yDoc, null);
                    g.drawImage(plt.krovat, plt.x, plt.y, null);
                    g.drawImage(plt.tumba, plt.x, plt.y, null);
                    g.drawImage(plt.human, plt.x, plt.y, null);
                    g.drawImage(plt.boygirl, plt.x, plt.y, null);

                    g.setFont(plt.font1);
                    g.setColor(plt.colorG);
                    g.drawString("G", plt.xG, plt.yG);
                    g.setColor(plt.colorB);
                    g.drawString("B", plt.xB, plt.yB);

                    g.drawImage(plt.termom, plt.xTermom, plt.yTermom, null);
                    g.drawImage(plt.aspirin, plt.xAspirin, plt.yAspirin, null);
                    g.drawImage(plt.slabit, plt.xSlabit, plt.ySlabit, null);
                    g.drawImage(plt.bint, plt.xBint, plt.yBint, null);
                    g.drawImage(plt.chelyust, plt.xChelyust, plt.yChelyust, null);
                    g.drawImage(plt.privivka, plt.xPrivivka, plt.yPrivivka, null);

                    g.setFont(plt.font2);
                    g.setColor(plt.colorText);
                    g.drawString(plt.generator(), plt.xText, plt.yText);
                }
            }

            public void actionPerformed(ActionEvent e){
                if(!c.checkDistance()) {
                    c.move(m.xMenu, controller.c.dv, controller.c.dy);
                    p.move(c.v);
                    p.takePatient(c.x, c.y);
                    s.function(c.v);
                    m.actionMenu(controller.m.xMenu, controller.m.yMenu, controller.m.xGarage);
                    p.checkLive();
                    d.timer();
                } else{
                    plt.move(controller.plt.dx, controller.plt.checkBoy);

                    plt.check(controller.plt.xTermom, controller.plt.yTermom,
                            controller.plt.xAspirin, controller.plt.yAspirin,
                            controller.plt.xSlabit, controller.plt.ySlabit,
                            controller.plt.xBint, controller.plt.yBint,
                            controller.plt.xChelyust, controller.plt.yChelyust,
                            controller.plt.xPrivivka, controller.plt.yPrivivka);
                }
                repaint();
                setFocusable(true);
            }
}
