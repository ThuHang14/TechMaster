package com.example.demo.Corlor;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Random;

public class color {
    @Test
    public String randomHexColor() {
        String[] baseString = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        Random r = new Random();
        String colors = "#";
        for (int i = 0; i <6 ; i++) {
            colors += baseString[r.nextInt(16)];
        }
        System.out.println(colors);
        return colors;
    }
    @Test
    public String randomRgbColor() {
        Random random = new Random();
        int r = random.nextInt(256);
        int b = random.nextInt(256);
        int g = random.nextInt(256);
        String rbg = "rbg("+r+","+"b"+","+"g)";
        System.out.println(rbg);
        return rbg;

    }
}
