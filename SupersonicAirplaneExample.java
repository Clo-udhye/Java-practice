class Airplane{
    public void land(){
        System.out.println("착륙합니다.");
    }
    public void fly(){
        System.out.println("일반비행합니다.");
    }
    public void takeOff(){
        System.out.println("이륙합니다.");
    }
}

class SupersonicAirplane extends Airplane {
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly(){
        if(flyMode==SUPERSONIC){
            System.out.println("초음속비행합니다.");
        } else {
            //Airplane 객체의 fly()메소드 호출
            super.fly();
        }
    }
}


public class SupersonicAirplaneExample {
    public static void main(String[] args){
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
        
    }
}