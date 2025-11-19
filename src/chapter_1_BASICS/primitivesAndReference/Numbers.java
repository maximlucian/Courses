//8
package chapter_1_BASICS.primitivesAndReference;

public class Numbers {
    long max = 3123456789L;   //this will give out an error if we do not add the L!!!!!!
                              //btw try to ad a capital L, not an "l", because it might get confused with a "1"

    int million = 1_000_000;  //note that we can add "_" to the mix so we can read the numbers easier
    static double billion = 1_0_0_000___00_0.0_0; //can't add to the FRONT, or BACK (includes right before or after the ".")

    public static void main(String[] args) {
        System.out.println(billion);
    }
}
/* You should also note that Java allows you to specify digits in several other formats:

->Octal (digits 0–7), which uses the number 0 as a prefix—for example, 017.
->Hexadecimal (digits 0–9 and letters A–F/a–f), which uses 0x or 0X as a prefix—for example, 0xFF, 0xff, 0XFf.
->Hexadecimal is case insensitive, so all of these examples mean the same value.
->Binary (digits 0–1), which uses the number 0 followed by b or B as a prefix—for example, 0b10, 0B10.

 */

//Up next: ReferenceExplained.java