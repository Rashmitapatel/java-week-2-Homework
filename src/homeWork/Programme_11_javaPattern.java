package homeWork;
/*Write a Java program to display the following pattern.
      *  Sample Pattern :
       *  J a v v a  1
       * J a a v v a a
      *  J J aaaaa V V aaaaa */

public class Programme_11_javaPattern {
    public static void main(String[] args) {
        Programme_11_javaPattern t = new Programme_11_javaPattern();
        System.out.println("---------------------------------------------");
        t.javaPattern();
    }

    // Printing the Java Pattern
    public void javaPattern() {
        System.out.println("J  a  v   v a");
        System.out.println("J a a  v v a a");
        System.out.println("J J aaaaa  V V aaaaa");
        System.out.println("J J a   a  V a  a");
    }
}


