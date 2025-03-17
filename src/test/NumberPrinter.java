package test;

public class NumberPrinter extends Thread{
    private int start;

    public NumberPrinter(int start) {
        this.start = start;
    }

    @Override
    public void run() {
        for (int i = start; i < start + 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
