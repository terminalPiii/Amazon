import java.util.Scanner;
public class refresh {
    public static int multiply(int x, int y) {
        return x + y;
    }
    public static void main (String[] args) {
        //This is going to be a refresher
        //This is how we write
        System.out.println("Lets try to remeber, shall we?");

        //This is how we create a scanner object
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = scan.nextLine();
        System.out.println("Hi, it is nice to meet you, "+ name);

        //Now, lets write some methods to make our life easier
        int ans = multiply(3,4);
        System.out.println(ans);
    }
}
