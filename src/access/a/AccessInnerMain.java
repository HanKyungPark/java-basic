package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출가능
        data.publicField =1;
        data.publicMethot();

        //같은 패키이 default호출
        data.defaultField = 2;
        data.defaultMethod();

        //private
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();
    }


}
