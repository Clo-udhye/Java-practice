final class Parent{
  
}

class Child extends Parent{ //error final클래스는 상속받지못함 !
    
}

public class InheritanceEx05{
    public static void main(String[] args){
        Child c1 = new Child();
    }
}