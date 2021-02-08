
public class ForEachExampleOne {

    public static void main(String[] args) {

        int x[] = {10, 20, 30, 40, 50, 60, 70, 80};

        System.out.println("Using Traditional For Loop....");
        for (int i = 0; i < 5; i++) {
            System.out.println(x[i]);
        }

        System.out.println("Using For Each Loop....");

        for (int n : x) {
            System.out.println(n);
        }

    }
}
