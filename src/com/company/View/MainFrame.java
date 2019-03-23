package com.company.View;

import javax.swing.*;

import com.company.Controller.Controller;
import com.company.Model.Car;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame{

    private final JFrame frame = new JFrame("game");

    public MainFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.add(new Display());
        frame.setVisible(true);
    }
}
