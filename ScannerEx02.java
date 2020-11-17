import java.util.Scanner;

public class ScannerEx02{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);    //system을이용해 scanner 생성
        
        System.out.print("입력  :");
        //String msg1 = sc.nextLine();  // 한 줄 입력 , 공백포함, 엔터키 입력까지
        int msg = sc.nextInt();         // data 자료에 맞춰 입력받을수 있음, 자료형이 안맞으면 InputMismatchException
        System.out.println("입력된 메세지 :" + msg);

        sc.close();
    }
}