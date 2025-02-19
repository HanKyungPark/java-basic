package Poly.ex2;

public class AnimalSoundMain3 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();

        Animal[] arr = {new Dog(), new Cat(), new Caw(), new Duck(),new Pig()};

        for (Animal animal : arr) {
            soundAnimal(animal);
        }
    }

    //변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }


}
