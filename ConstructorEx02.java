class Car {
    String name = "소나타";
    // 생성자 오버로딩
    Car(){
    }
    Car(String name){
        this.name = name;
    }
}

public class ConstructorEx02{
    public static void main(String[] args){
        Car car1 = new Car();
        System.out.println( car1.name );
        
        Car car2 = new Car("그랜저");
        System.out.println( car2.name );
    }
}