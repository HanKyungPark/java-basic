package test;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        //요소 추가
        numbers.add(10);
        numbers.add(20);
        numbers.addFirst(5); //첫번째 추가
        numbers.addLast(30);

        //요소 출력
        System.out.println("LinkedList : " + numbers);

        //첫번째 요소 가져오기
        System.out.println("첫번쨰 요소 : " + numbers.getFirst());

        //요소 제거
        numbers.removeFirst();
        numbers.removeLast();

        System.out.println("변경 후 LinkedList : " + numbers);
    }
}
