import java.util.Scanner;

public class Main_Question4 {

    public static void main(String[] args)
    {
        System.out.println("Please enter a number.");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println("Would you like to the sum or product? Enter \"product\" or \"sum\".");
        scan.nextLine();

        String math_method = scan.nextLine();
        int sum = 0;
        if (math_method.equals("sum")){
            for (int i = 1; i <= num; i++)
            {
                sum += i;
            }
        }

        else if (math_method.equals("product")){
            for (int i = 1; i <= num; i++)
            {
                sum *= i;
            }
        }

        System.out.println(sum);
    }
}
