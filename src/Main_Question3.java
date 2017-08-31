import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Main_Question3 {

    public static void main (String[] args){
        System.out.println("Please enter a number.");

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        System.out.println(getSeriesSum(num));

    }

    public static int getSeriesSum(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    @Test
    public void testGetSeriesSum()
    {
        assertEquals( 24310, getSeriesSum(220));
        assertEquals( 15, getSeriesSum(5));
        assertEquals(0, getSeriesSum(0));

    }


}
