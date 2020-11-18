interface Vehicle {

}
class Bus implements Vehicle{

}
class Taxi{
}

public class PolyEx05{
    public static void main(String[] args){
        Vehicle vehicle = new Bus();
        Taxi taxi = new Taxi();

        //instanceof - class, abstract class, interface 전부 가능
        System.out.println(vehicle instanceof Bus);
        System.out.println(vehicle instanceof Vehicle);
        System.out.println(vehicle instanceof Object);

        System.out.println(taxi instanceof Vehicle);
    }
}