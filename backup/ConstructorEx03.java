class Car {
    String serial;
    String name;

    // this - 참조주소 , this() - 생성자
    Car(){
        //this.serial = "0000";
        //this.name = "소나타";
        //System.out.println("생성자 호출"); //불가능
        this("0000", "소나타"); //-> 다른 생성자를 부를때 : this() - 생성자안에서 가장 윗줄에 있어야한다. 
        //System.out.println("생성자1 호출"); //가능
    }
    Car(String name){
        //this.serial = "0001";
        //this.name = name;
        this("0001", name);
        //System.out.println("생성자2 호출");
    }
    Car(String serial, String name){
        //System.out.println("생성자3 호출 ");
        this.serial = serial;
        this.name = name;
    }
}

public class ConstructorEx03{
    public static void main(String[] args){
        Car car1 = new Car();
        System.out.println( car1.name + " " + car1.serial);
        
        Car car2 = new Car("그랜저");
        System.out.println( car2.name + " " + car2.serial);

        Car car3 = new Car("0002","아반떼");
        System.out.println( car3.name + " " + car3.serial);
    }
}