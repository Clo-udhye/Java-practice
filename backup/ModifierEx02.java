class Modifier{
    private String data;
    private boolean tag;

    //접근용 메서드
    public String readData(){
        return this.data;
    }
    public void writeData(String data){
        this.data = data;
    }

    //getter
    public String getData(){
        return this.data;
    } 
    //setter
    public void setData(String data){
        this.data = data;
    }

    //boolean타입의 경우 getter사용
    public boolean isTag(){
        return this.tag;
    } 
}

public class ModifierEx02{
    public static void main(String[] args){
        Modifier m = new Modifier();

        //직접 접근 - error
        //m.data = "테스트";
        //System.out.println(m.data);

        //간접 접근
        m.writeData("테스트");
        System.out.println(m.readData());
    }
}