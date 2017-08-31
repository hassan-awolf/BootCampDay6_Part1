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
        long sum = computeSumOrProduct(compute_method, num);

        System.out.println(sum);
    }


    /* Accepts parameter int num and String compute_method
    if compute_method is exactly equal to "sum"
        Returns sum of numbers 1 ... num
        Returns 0 if num < 1
    if compute_method is exactly equal to "product"
        Returns product of numbers 1 ... num
        Returns 1 if num < 1
    Returns 0 if compute_method is not exactly equal to "sum" or "product"
    */
    public static long computeSumOrProduct(String compute_method, int num)
    {
        long sum = 0;
        if (compute_method.equals("sum")){
            for (int i = 1; i <= num; i++)
            {
                sum += Integer.toUnsignedLong(i);
            }
        } else if (compute_method.equals("product")){
            sum = 1;
            for (int i = 1; i <= num; i++)
            {
                sum = sum * Integer.toUnsignedLong(i);
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
        assertEquals(2432902008176640000L, computeSumOrProduct("product", 20));
        assertEquals(1, computeSumOrProduct("sum", 1));
        assertEquals(0, computeSumOrProduct("sum", 0));
        assertEquals(0, computeSumOrProduct("sum", -10));
        assertEquals(1, computeSumOrProduct("product", 0));
        assertEquals(1, computeSumOrProduct("product", -10));
    }
    
}
