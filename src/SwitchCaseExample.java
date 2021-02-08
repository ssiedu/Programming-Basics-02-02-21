
import java.util.Scanner;


public class SwitchCaseExample {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter State To Get Its Capital : ");
        String state=sc.next();
        
        switch(state){
            case "MP":
                System.out.println("Bhopal");
            break;
            case "MH":
                System.out.println("Mumbai");
            break;
            case "RJ":
                System.out.println("Jaipur");
            break;
              
        }
        
        /*
        int day=4;
        switch(day){
            case 1:
                System.out.println("Mon");
            break;
            case 2:
                System.out.println("Tue");
            break;
            case 3:
                System.out.println("Wed");
            break;
            case 4:
                System.out.println("Thu");
            break;
            case 5:
                System.out.println("Fri");
            break;
            case 6:
                System.out.println("Sat");
            break;
            case 7:
                System.out.println("Sun");
            break;
            default:
                System.out.println("Invalid Day....");
        }
        */
        
        
        
    }
}
