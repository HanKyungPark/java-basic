package test;

public class GenericMethodExample {

    //제네릭 메서드 정의
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        //Integer 배열
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);

        String[] stringArray = {"Apple", "Banana", "Cherry"};
        printArray(stringArray);
    }
}
