import java.util.Scanner;

public class Main_Question2 {

    public static void main (String[] args){

        System.out.println("Please write your name.");
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        System.out.println("Hi, " + name + ". How are you?");
    }
}
