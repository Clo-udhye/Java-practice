class Car {
    private String name;
    private int numberOfWheels;
    private String color;

    Car (String name, int numberOfWheels, String color){
        this.name = name;
        this.numberOfWheels = numberOfWheels;
        this.color = color;
    }

    //override
    public String toString(){
        return name + " : " + numberOfWheels + " : " + color;
    }

    void clocktion(){
        System.out.println("빵빵");
    }
}

public class PolyEx03{
    public static void main(String[] args){
        Car[] cars = new Car[3];    //Car 객체가 저장될 배열 만들기
        
        //Car 객체 만들기
        Car car1 = new Car("test1", 3, "Green");
        Car car2 = new Car("test2", 4, "Yellow");
        Car car3 = new Car("test3", 8, "Blue");
        
        //배열에 객체저장
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;

        //향상된 for문을 이용해서 데이터 가져오기
        for(Car car : cars){
            System.out.println(car.toString());
            //System.out.println(car);    // 위와 같음 , (ObjectEx01.java 참고)
        }

        Object[] objs = new Car[3];
        objs[0] = car1;
        objs[1] = car2;
        objs[2] = car3;

        for(Object obj : objs){
            Car car = (Car)obj;
            System.out.println(car.toString());
            car.clocktion();
            //System.out.println(car);
        }
    }
}