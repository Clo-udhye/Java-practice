class Member{   //ex13~14
    String name;
    String id;
    String password;
    int age;

    Member(String name, String id){
        this.name = name;
        this.password = password;
    }
} 

class MemberService{    //ex15
    boolean login(String id, String password){
        if(id=="hong" && password=="12345"){
            return true;
        }

        return false;
    }

    void logout(String id){
        if(id == "hong"){
            System.out.println("로그아웃 되었습니다.");
        }
    }
}
public class Chapter6_ex13{
    public static void main(String[] args){
            MemberService ms = new MemberService();
            boolean result = ms.login("hong", "12345");

            if(result){
                System.out.println("로그인되었습니다.");
                ms.logout("hong");
            } else {
                System.out.println("id또는 password가 올바르지 않습니다.");
            }
    }
}