package test;

public class GenericExample {
    public static void main(String[] args) {
        //String 타입을 다루는 Box 객체
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello Generics!");
        System.out.println("String Value : " + stringBox.getValue());

        //Integer 타입을 다루는 BOx 객체
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(123);
        System.out.println("Integer Value : " + integerBox.getValue());
    }
}
