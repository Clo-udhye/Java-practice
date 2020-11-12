class Modifier{
    // 멤버 필드 : private
    // 메서드 : public 

    String data1 = "default";
    public String data2 = "public";
    protected String data3= "protected";
    private String data4 = "private"; //외부에서 접근하지 못함

    void method1(){ System.out.println("method1"); } 
    public void method2(){ System.out.println("method2"); } 
    protected void method3(){ System.out.println("method3"); } 
    private void method4(){ System.out.println("method4"); } 

    public void viewData(){
        System.out.println(this.data1);
        System.out.println(this.data2);
        System.out.println(this.data3);
        System.out.println(this.data4); 

        this.method1();
        this.method2();
        this.method3();
        this.method4();
    }
}

public class ModifierEx01{
    public static void main(String[] args){
        Modifier m = new Modifier();
        m.viewData();   

        //System.out.println(m.data1);
        //System.out.println(m.data2);
        //System.out.println(m.data3);
        //System.out.println(m.data4); // error 외부에서 private 접근x 

        m.method1();
        m.method2();
        m.method3();
        //m.method4();    //error - private

    }
}