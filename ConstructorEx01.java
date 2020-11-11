class Constructor {
    // 없으면 컴파일러가 자동생성 - 기본생성자
    //public Constructior(){} : 기본(default)생성자
    // 생성자를 하나라도 만들면 기본생성자 생성x
    Constructor(){  
        System.out.println("생성자 호출");
    }
}

class Car {
    String name = "소나타";
    Car(String name){
        this.name = name;
    }
}
public class ConstructorEx01{
    public static void main(String[] args){
        //Constructor() : 생성자
        Constructor c = new Constructor();
        //직접호출 불가능
        //c.Constructor();

        //Car myCar = new Car();
        Car myCar = new Car("그랜저");
        System.out.println( myCar.name );
    }
}