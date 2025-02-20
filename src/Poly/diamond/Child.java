package Poly.diamond;

public class Child implements InterFaceA, InterFaceB {
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    @Override
    public void MethodCommon() {
        System.out.println("Child.MethodCommon");
    }
}
