package test;

public class ThredExample {
    public static void main(String[] args) {
        NumberPrinter t1 = new NumberPrinter(1);
        NumberPrinter t2 = new NumberPrinter(6);


        t1.start();
        t2.start();
    }
}
