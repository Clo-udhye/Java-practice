import java.util.Scanner;
    /*
        java Gugudan

        단수 입력: 2
        2*1=2
        ...
        2*9=18

        단수 입력: 3
        3*1=3
        ...
        ...

        단수 입력: q
        프로그램 종료
    */
public class ScannerEx03_gugudan{
    public static void main(String[] agrs){
        
        /*  // ver.1
        Scanner sc = new Scanner(System.in);    //system을이용해 scanner 생성
        
        while(true){
            System.out.print("\n단수 입력  :");
            String danStr = sc.next();
            
            if( danStr.equals("q") || danStr.equals("Q")){
                System.out.println("프로그램 종료");
                sc.close();
                System.exit(0);
            }

            for(int i=1; i<=9; i++){
                System.out.println(danStr + "x" + i + " = "+ (Integer.parseInt(danStr)*i));
            }
        }
        */

        //ver.2
        Scanner scan = new Scanner(System.in);
        String msg="";
        do{
            System.out.print("단수 입력 : ");
            msg = scan.nextLine();
            //System.out.println("입력 단수 : " + msg);
            
            if(msg.equals("q")){
                break;
            }

            for(int i=1; i<=9; i++){
                System.out.println(msg + "x" + i + " = "+ (Integer.parseInt(msg)*i));
            }
            
        } while(!msg.equals("q"));

        System.out.println("프로그램 종료");
        scan.close();
    }
}