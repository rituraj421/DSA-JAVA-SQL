package com.company;

import java.util.Locale;

public class Ch3_PracticeSetV15 {
    public static void main(String[] args) {
        //problem 1
        String name = " RITURAJ CHOUDHARY ";
        name = name.toLowerCase();
        System.out.println((name));

        System.out.println(name.replace(' ','_'));

        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "rituraj");
        System.out.println(letter);

        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));

        String badri = "dear harry \n this java course is nice \n thanks";
        System.out.println(badri);

    }
}
