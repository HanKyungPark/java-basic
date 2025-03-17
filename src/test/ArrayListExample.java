package test;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //요소 추가
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        //요소 출력
        System.out.println("리스트 요소 : " + list);

        //특정 요소 제거
        list.remove("Banana");

        //리스트 반복문
        for (String item : list) {
            System.out.println(item);
        }

        //크기 확인
        System.out.println("리스트 크기 : " + list.size());

    }

}
