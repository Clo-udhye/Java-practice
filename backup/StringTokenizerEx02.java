import java.util.StringTokenizer;

public class StringTokenizerEx02{
    public static void main(String[] agrs){
        String data = "사과&배&&&복숭아";

        StringTokenizer st = new StringTokenizer(data,"&"); //공백제거
        String[] datas = data.split("&");

        //System.out.println(st.countTokens());
        //System.out.println(datas.length);

        int i = 1;
        while(st.hasMoreTokens()){
            System.out.println(i + " : " + st.nextToken());
            i++;
        }
        
        System.out.println();
        i = 1;
        for(String d: datas){
            System.out.println(i + " : " + d);
            i++;
        }
    }
}