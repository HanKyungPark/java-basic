package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("User1",15 , 90);
        MemberConstruct member2 = new MemberConstruct("User2",16 , 80);

        MemberConstruct[] members = {member1,member2};

        for (MemberConstruct s : members) {
            System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 점수 : " + s.grade);
        }
    }
}
