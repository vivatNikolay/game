package com.company.Model;

import javax.swing.*;
import java.awt.*;

public class Data {

    public int time = 0;
    public int xTime = 220;
    public int yTime = 62;

    public Font font = new Font("Arial", Font.BOLD, 40);

    public void timer(){
        time += 30;
    }
}
