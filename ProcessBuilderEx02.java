import java.io.IOException;

public class ProcessBuilderEx02{
    public static void main(String[] args){ //throws Exception { 가능한 여기에는 쓰지말기
        try {
            ProcessBuilder processBuilder
                = new ProcessBuilder("C:\\Program Files\\Internet Explorer\\iexplore");
            processBuilder.start(); //IOException을 일으킬수있음 ! 
        } catch(IOException e){
            System.out.println("[예외] : " + e.getMessage());
        }
    }
}