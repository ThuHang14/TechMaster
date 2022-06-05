package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ColorService {

    public String randomColor(int type) {
        return switch (type) {
            case 1 -> randomColorName();
            case 2 -> randomHexColor();
            case 3 -> randomRgbColor();
            default -> randomColorName();
        };
    }

    public String randomColorName() {
        Random random = new Random();
        String[] color = {"red", "blue", "yellow", "black", "white"};
        return color[random.nextInt(color.length)];
    }

    public String randomHexColor() {
        String[] baseString = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        Random r = new Random();
        String colors = "#";
        for (int i = 0; i < 6; i++) {
            colors += baseString[r.nextInt(16)];
        }
        return colors;
    }

    public String randomRgbColor() {
        Random random = new Random();
        int r = random.nextInt(256);
        int b = random.nextInt(256);
        int g = random.nextInt(256);
        String rbg = "rbg(" + r + "," + b + "," + g+")";
        return rbg;

    }
}
