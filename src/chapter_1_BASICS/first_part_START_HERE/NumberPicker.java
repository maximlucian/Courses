//4
package chapter_1_BASICS.first_part_START_HERE;

import java.util.Random; // if we use import java.util.*, that * is called a "wildcard"
//every java.lang is automatically imported

public class NumberPicker {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}

//Up next: packagea and packageb