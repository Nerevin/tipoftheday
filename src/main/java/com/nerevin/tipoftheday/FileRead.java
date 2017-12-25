package com.nerevin.tipoftheday;

import java.io.*;
import java.util.*;

public class FileRead {
    public static void tipReader(){
        ArrayList<String> tipList = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/Tip.txt"));
            String tipText;
            while ((tipText = reader.readLine()) != null){
                tipList.add(tipText);
            }
            reader.close();
        }
        catch(Exception ex){
            Grafon.a = "Файл с мудростями пропал";
        }
        Grafon.a = tipList.get((int)(Math.random()*tipList.size()));
    }
    public static void kamaReader(){
        ArrayList<String> kamaList = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/Kama.txt"));
            String kamaText;
            while ((kamaText = reader.readLine()) !=null){
                kamaList.add(kamaText);
            }
            reader.close();
        }
        catch(Exception ex){
            Grafon.a = "Нет файла, ежжи";
        }
        Grafon.a = kamaList.get((int)(Math.random()*kamaList.size()));
    }
}
