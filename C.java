package package_ex.package2;

import  package_ex.package1.*;

public class C{
    A a;    //error 접근 불가 -> A class가 default접근 제한으로 다른 패키지에서 접근 불가 
    B b;    //접근 가능
    
    C(){
        System.out.println("C의 생성자");
    }
}