class Car{
    //필드 
    private int speed;
    private boolean stop;

    //생성자

    //메서드
    public int getSpeed(){
        return this.speed;
    }

    public void setSpeed( int speed ){
        if(speed < 0){
            this.speed = 0;
            return;
        } else {
            this.speed = speed;
        }
    }

    public boolean isStop(){
        return this.stop;
    }

    public void setStop(boolean stop){
        this.stop = stop;
        this.speed = 0;
    }
}

public class CarEx01{
    public static void main(String[] args){
        Car myCar = new Car();

        //잘못된 속도 변경
        myCar.setSpeed(-50);
        System.out.println("현재속도 : "+myCar.getSpeed());

        //올바른 속도변경
        myCar.setSpeed(60);
        System.out.println("현재속도 : "+myCar.getSpeed());
        
        //멈춤
        if(!myCar.isStop()){
            myCar.setStop(true);
        }
        System.out.println("현재속도 : "+myCar.getSpeed());

    }
}