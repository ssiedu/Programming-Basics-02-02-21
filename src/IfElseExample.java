
import java.util.Scanner;


public class IfElseExample {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int marks=sc.nextInt();
        
        if(marks>=60){
            System.out.println("I-Div");
        }else if(marks>=45){
            System.out.println("II-Div");
        }else if(marks>=33){
            System.out.println("III-Div");
        }else{
            System.out.println("Fail");
        }
        
        
    }
}
