package test;

public class Counter {
    private int count = 0;

    //동기화된 메서드
    public synchronized void increment() {
        count++;
    }
    public int getCount() {
        return count;
    }
}
