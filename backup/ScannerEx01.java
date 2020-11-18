import java.util.Scanner;

public class ScannerEx01{
    public static void main(String[] agrs){
        // System.in - 외부입력 
        Scanner sc = new Scanner(System.in);    //system을이용해 scanner 생성
        System.out.print("입력  : ");
        String msg1 = sc.next();    // 실제 입력 - 엔터키가 입력될때까지 대기 , (""안의 공백도)space에서 끊김
        String msg2 = sc.next();    // space이후의 입력값
        
        System.out.println("입력된 메세지 : " + msg1);
        System.out.println("입력된 메세지 : " + msg2);

        sc.close();
    }
}