package Poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterFaceA a = new Child();
        a.methodA();
        a.MethodCommon();

        InterFaceB b = new Child();
        b.methodB();
        b.MethodCommon();

        Child child = new Child();
        child.MethodCommon();
    }
}
