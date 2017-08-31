import org.junit.Before;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Main_Question1 {

    public static void main(String[] args) {

        System.out.println(getHello());

    }

    public static String getHello(){

        return "Hello World!";
    }

    @Test
    public void testOut()
    {
        assertEquals("Hello World!", getHello());
    }

}
