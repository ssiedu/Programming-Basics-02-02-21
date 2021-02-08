
import java.util.Scanner;


public class UserInputExample {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roll Number : ");
        int rno=sc.nextInt();
        System.out.println("Enter Your Name : ");
        String name=sc.next();
        System.out.println("Enter Your Percentage : ");
        double per=sc.nextDouble();
        System.out.println("Your Information : ");
        System.out.println(rno);
        System.out.println(name);
        System.out.println(per);
        
    }
}
