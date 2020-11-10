class Utile{
    // 단수 입력받아 구구단을 출력하는 doGugudan() 메서드 생성
    void doGugudan1(int dan){
        for (int col = 1; col<=9; col++){
            System.out.println( dan +"X"+ col + " = "+ (dan*col) );
        }
    }
    //print - main에서 하는 것을 추천
    String doGugudan2(int dan){
        String result = "";
        for (int col = 1; col<=9; col++){
            result += dan +"X"+ col + " = "+ (dan*col) + "\n";
        }
        return result;
    }
    
    /*
    // ver.1
    String doGugudan3(int ... dans){
        String result = "";
        for( int i=0; i<dans.length; i++){
            for(int j=1; j<=9; j++){
                result += dans[i] +"X"+ j + " = "+ (dans[i]*j) + "\t";
            }
            result += "\n";
        }
        return result;
    }
    */

    //ver.2 강사님
    String doGugudan3(int ... dans){
        String result = "";
        for( int dan : dans ){
            for(int j=1; j<=9; j++){
                result += dan +" X "+ j + " = "+ (dan*j) + "\t";
            }
            result += "\n";
        }
        return result;
    }


}

public class GugudanEx01 {
    public static void main(String[] args){
        Utile ut1 = new Utile();
        //ut1.doGugudan1(5);
        //System.out.println("\n" + ut1.doGugudan2(8));
        System.out.println(ut1.doGugudan3(1));
        System.out.println(ut1.doGugudan3(1, 3));
        System.out.println(ut1.doGugudan3(1, 3, 6));
    }
}