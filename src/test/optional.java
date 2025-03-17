package test;

import java.util.Optional;

public class optional {

    public static void main(String[] args) {
        String name = "한경";

        //optional로 감싸서 null 체크
        Optional<String> optionalName = Optional.ofNullable(name);

        //값이 존재하는지 체크하고 출력
        optionalName.ifPresent(n -> System.out.println("Name is: " +n));

        //값이 없을때 기본값을 반환
        String defaultName = optionalName.orElse("Unknown");
        System.out.println("Name or default : " + defaultName);
    }
}
