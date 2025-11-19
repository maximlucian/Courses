//3
package chapter_1_BASICS.first_part_START_HERE;
//if we use these 2 imports together, the "java.sql.*" import will cause the Date declaration to now compile
//this is because both java.sql and java.util contain a Date class, thus, the compiler does not know which one to pick
//causing an ambiguous reference error

//SOLUTION TO THE PROBLEM

//if we declare the util import as "import java.util.Date"
//the compiler knows that we want to use the .util Date class. This is due to the fact that:

//SPECIFIC IMPORTING IS PRIORITIZED OVER USING WILDCARDS

import java.util.Date;

public class Conflicts {
    Date date;  //solution: "import java.util.Date"    OR

    java.util.Date utilDate;
    java.sql.Date sqlDate; //these types of declarations cause te compiler to know where you want to eat
}

//Up next: NumberPicker.java