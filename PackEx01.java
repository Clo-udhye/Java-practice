import com.PackB;   //com 패키지의 PackB 클래스를 사용 
import com.exam.PackC;

public class PackEx01{
    public static void main(String[] args){
        PackA a = new PackA();
        PackB b = new PackB();
        //com.PackB b = new com.PackB();
        PackC c = new PackC();
        //PackD d = new PackD(); //error - -d 옵션을 안하고 컴파일 했을경우 접근하지 못함 
    }
}