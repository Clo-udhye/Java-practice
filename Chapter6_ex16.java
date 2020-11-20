class Printer{
    static void println(int arg){
        System.out.println(arg);
    }
    
    static void println(boolean arg){
        System.out.println(arg);
    }
    
    static void println(double arg){
        System.out.println(arg);
    }
    
    static void println(String arg){
        System.out.println(arg);
    }
}

public class Chapter6_ex16 {
	public static void main(String[] args) {
        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");
    }
}