public class SystemEx02{
    public static void main(String[] args){
        System.out.println( System.getProperty( "java.version" ));
    
        System.out.println( System.getProperty( "user.name" )); //사용자이름 
        System.out.println( System.getProperty( "user.home" )); //사용자 전용 디렉토리 
        System.out.println( System.getProperty( "user.dir" ));  //현재 작업 디렉토리
    }
}