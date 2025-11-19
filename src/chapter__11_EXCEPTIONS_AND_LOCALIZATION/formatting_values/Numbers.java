package chapter__11_EXCEPTIONS_AND_LOCALIZATION.formatting_values;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Numbers {
//    public final String format(double number)
//                                          the abstract number formatting classes look like this
//    public final String format(long number)

//    public DecimalFormat(String pattern)

    public static void main(String[] args) {
        double d = 1234.567;
        NumberFormat f1 = new DecimalFormat("###,###,###.0");
        System.out.println(f1.format(d));  // 1,234.6

        NumberFormat f2 = new DecimalFormat("000,000,000.00000");
        System.out.println(f2.format(d));  // 000,001,234.56700

        NumberFormat f3 = new DecimalFormat("Your Balance $#,###,###.##");
        System.out.println(f3.format(d));  // Your Balance $1,234.57

        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;

        var us = NumberFormat.getInstance(Locale.US);   //we are going into US formatting of numbers here
        System.out.println(us.format(attendeesPerMonth));  // 266,666
    }
}
