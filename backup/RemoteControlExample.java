interface RemoteControl {
    //상수
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상메서드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    //디폴트 메서드 : 인터페이스에 구현되지만 실은 객체가 가지고 있는 메서드
    //public 생략
    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    //정적메소드 : 객체없이 인터페이스만으로 호출 가능 
    //public 생략
    static void changeBattery(){
        System.out.println("건전지를 교체합니다.");
    }
}

/*
interface InterA{
    void methodA();
}

*/

class Television implements RemoteControl{  // , InterA{
    //필드
    private int volume;

    //turnOn() 추상메서드의 실제 메서드
    public void turnOn(){
        System.out.println("TV를 켭니다.");
    }
    //turnOff() 추상메서드의 실제 메서드
    public void turnOff(){
        System.out.println("TV를 끕니다.");
    }
    /*
    public void methodA(){
        System.out.println("A함수 호출");
    }
    */

    //setVolume() 추상메서드의 실제 메서드
    public void setVolume(int volume){
        if( volume > RemoteControl.MAX_VOLUME ){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if( volume < RemoteControl.MIN_VOLUME ){
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV의 볼륨 : " + this.volume);
    }
}
/*
class Audio{

}
*/
public class RemoteControlExample{
    public static void main(String[] args){
        RemoteControl rc;
        rc = new Television();  //Television class가 RemoteControl interface의 구현이기 때문에 가능 
        //rc = new Audio(); //error - Audio 는 RemoteControl의 구현이 아니기 때문에 불가능 
        
        //InterA 다중구현 시 
        //rc.methodA    //error - RemoteControl 에는 methodA 함수가 없기때문에 불가능
        //InterA a; a = new Television(); // Televison이 InterA를 구현하기때문에 가능
        //a.turnOn      //error - InterA 에는 turnOn 함수가 없기때문에 불가능
        
        rc.turnOn();        
        rc.setVolume(5);
        rc.setVolume(-5);
        rc.setVolume(50);
        rc.setMute(true);
        rc.setMute(false);
        RemoteControl.changeBattery();
        rc.turnOff();

    }
}