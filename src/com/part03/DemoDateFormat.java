package com.part03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DemoDateFormat {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your birthday, format is yyyy-MM-dd");
        String str1 = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str1);
        long liveTime = date.getTime();
        long todayTime = new Date().getTime();
        long time = todayTime - liveTime;
        System.out.println(time/1000/60/60/24);
    }
}
