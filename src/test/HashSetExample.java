package test;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Java"); // 중복 요소 추가 (무시됨)

        //출력
        System.out.println("Set 요소 : " + set);

        //요소 제거
        set.remove("Java");
        System.out.println("변경 후 Set : " + set);
    }
}
