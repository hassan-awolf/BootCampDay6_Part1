import org.junit.Rule;
import org.junit.*;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Main_Question2 {

    public static void main (String[] args){

        System.out.println("Please write your name.");
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        System.out.println(getGreeting(name));
    }

    /* Accepts parameter String name
    Returns greeting according to "Hi, <NAME>. How are you?"
    */
    public static String getGreeting(String name)
    {
        return new String("Hi, " + name + ". How are you?");
    }

    @Test
    public void testGreeting()
    {
        assertEquals("Hi, Hassan. How are you?", getGreeting("Hassan"));
        assertEquals("Hi, 321312jkdsa. How are you?", getGreeting("321312jkdsa"));
        assertEquals("Hi, dsajdsahskd. How are you?", getGreeting("dsajdsahskd"));
    }


}
