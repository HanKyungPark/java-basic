package test;

public class BoundedGenericExample {
    public static void main(String[] args) {

        //Double 타입을 다루는 NumberBox 객체
        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.setValue(10.5);
        System.out.println("Double value : " + doubleBox.getValue());

        //Integer 타입을 다루는 NumberBox 객체
        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.setValue(10);
        System.out.println("Integer value : " + intBox.getValue());

        //String 은 Number를 상속하지 않기 때문에 컴파일 오류 발생
        // NumberBox<String> stringbox = new NumberBox<>(); //오류 발생
    }
}
