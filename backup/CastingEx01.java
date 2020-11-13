public class CastingEx01{
    public static void main(String[] args){
        int intValue = 103029770;
        System.out.println(intValue);
        
        //byte byteValue = intValue;    //error 
        //() : 강제 형변환
        byte byteValue = (byte)intValue;
        System.out.println(byteValue);
        
        /*
        System.out.println(intValue&0xff);
        System.out.println((intValue>>8)&0xff); // >> : 시프트 연산자  
        System.out.println((intValue>>16)&0xff);
        System.out.println((intValue>>24)&0xff);
        */
    }
}