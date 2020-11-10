/*
    학생
        학번
        이름
        나이
        키

*/

//클래스의 선언
class Student{
    String hakbun;
    String name;
    int age;
    double height;
}

public class StudentEx01{
    public static void main(String[] args){
        // 객체의 생성
        //s1 : 인스턴스

        Student s1;         //객체 선언
        s1 = new Student(); //객체 생성
        
        //선언과 동시에 생성
        //new 메모리 생성 연산자
        Student s2 = new Student();
        
    

        System.out.println(s1);     // Student@15db9742 => 자료형@참조값
        s1.hakbun = "10";
        s1.name = "홍길동";
        s1.age = 10;
        s1.height = 170.6;
        
        
        System.out.println(s1.hakbun);
        System.out.println(s1.name);

        //값 복사 x -> 주소(참조) 복사
        Student s3 = s1;
        System.out.println(s1.name);
        System.out.println(s3.name);

        s3.name = "박문수";
        System.out.println(s1.name);
        System.out.println(s3.name);
    }
}