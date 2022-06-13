package com.example.demo.ultil;

import java.util.Arrays;
import java.util.List;

public class Ultils {
    //lay extension cua file (png/jpg)
    public static  String getExtensionFile(String fileName){
        int lastIndexOf = fileName.lastIndexOf(".");
        if(lastIndexOf == -1){
            return "";
        }

        return fileName.substring(lastIndexOf + 1);
    }

    //ktra extension file co trong ds dc upload khong
    public static boolean checkFileExtension(String fileExtension){
        List<String> fileExtensios = Arrays.asList("png","jpg","jpeg");
        return fileExtensios.contains(fileExtension);
    }
}
