public class ExceptionEx06 {
    public static void main(String[] args){
       try{

            String data1 = args[0];
            String data2 = args[1];
        
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);

            int result = value1 + value2;
            System.out.println( data1 + " + " + data2 + " = " + result );

        //} catch (Exception e){  
        // Exception class는 모든 예외클래스의 부모클래스이기 때문에 위에있으면 다른 catch구문에 도달 불가        
        } catch (ArrayIndexOutOfBoundsException e){

            System.out.println("실행 매개값의 수가 부족합니다.");
            System.out.println(" [ 실행방법 ] ");
            System.out.println("java 클래스명 num1 num2");
        
        } catch (Exception e){

            System.out.println("숫자로 변환할 수 없습니다.");
        
        } finally {
            
            System.out.println("다시 실행하세요.");
        }
    }
}