//18
package chapter_1_BASICS;

public class VarReplacer {

    public void whatTypeAmI() {
        var name = "Hello";
        var size = 7;       // as "var" is called "LOCAL VARIABLE TYPE INFERENCE", it will only work for LOCAL VARIABLES
//      var size = "seven"; this will not work, as the compiler already chose the int type for size in the line above
//
//        the type o var is specifically defined at compile time only, it will not update in the runtime

//        oh, btw you can do this
        var not
                = 0; //and it will work (doesn't matter if you change the line, you did not use a , or ; to end it

//        var question;  YOU HAVE TO INITIALIZE THE VAR THE SAME TIME YOU DECLARE IT
          var question = "How are you?";
    }

//    public int addition(var a, var b) {  This will not work!!! var a and var b are method parameters
//        return a + b;                     not local variables
//    }

//    var tricky = "Hello";   THIS WILL NOT WORK AS IT IS NOT A local variable (this is an instance variable, not in any method)
}

// Next up: garbage\Scope.java
