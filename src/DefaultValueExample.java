
public class DefaultValueExample {

    static int v1=10;             
    static double v2=2.5;          
    static boolean v3=true;         
    static String v4="indore";       
    
    void show(){
        int v5=0;
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
    }
    
    
    public static void main(String[] args) {
        System.out.println("Hello ! We are checking default values....");
        DefaultValueExample ob=new DefaultValueExample();
        ob.show();
    }
}
