import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Main_Question4 {

    public static void main(String[] args)
    {
        System.out.println("Please enter a number.");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println("Would you like to the sum or product? Enter \"product\" or \"sum\".");
        scan.nextLine();

        String compute_method = scan.nextLine();
        int sum = 0;
        if (compute_method.equals("sum")){
            for (int i = 1; i <= num; i++)
            {
                sum += i;
            }
        }

        else if (compute_method.equals("product")){
            for (int i = 1; i <= num; i++)
            {
                sum *= i;
            }
        }

        System.out.println(sum);
    }
    
    public static int computeSumOrProduct(String compute_method, int num)
    {
        int sum = 0;
        if (compute_method.equals("sum")){
            for (int i = 1; i <= num; i++)
            {
                sum += i;
            }
        } 
        else if (compute_method.equals("product")){
            for (int i = 1; i <= num; i++)
            {
                sum *= i;
            }
        }
        
        return sum;
    }

    @Test
    public void testComputeSumOrProduct()
    {
        assertEquals(15, computeSumOrProduct("sum", 5));
        assertEquals(120, computeSumOrProduct("product", 5));
        assertEquals(1, computeSumOrProduct("product", 1));
    }
    
}
