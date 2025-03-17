package test;

public class SyschronizationExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        //두개의 스레드가 동시에 카운트를 증가시킨다.
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        //두 스레드가 끝날 떄까지 대기
        t1.join();
        t2.join();

        System.out.println("Final count : " + counter.getCount());

    }
}
