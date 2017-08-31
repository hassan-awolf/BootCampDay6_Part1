import java.util.Scanner;

public class Main_Question3 {

    public static void main (String[] args){
        System.out.println("Please enter a number.");

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++)
        {
            sum += i;
        }
        System.out.println(sum);

    }
}
