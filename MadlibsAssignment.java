import java.util.Scanner;

public class MadLib
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//initializing a new Scanner
        System.out.println("What's your name?");
        String name= input.nextLine();
        input.nextLine(); // clears the buffer
        System.out.println ("What day is it today?");
        int day = input.nextInt();
        System.out.println ("What month is it? (1 for january 12 for December)");
        int month = input.nextInt();
        System.out.println ("What year is it?");
        int year = input.nextInt();
        System.out.println ("type an adjective");
        input.nextLine(); //clear the buffer
        String adj1 = input.nextLine();
        System.out.println ("type a type of bird");
        String bird = input.nextLine();
        System.out.println ("type a room in a house");
        String room = input.nextLine();
        System.out.println ("type a verb(past tense)");
        String verbpast = input.nextLine();
        System.out.println ("type a verb");
        String verb = input.nextLine();
        System.out.println ("name a relative of yours");
        String relative = input.nextLine();
        System.out.println ("type a noun");
        String noun = input.nextLine();
        System.out.println ("type a liquid");
        String liquid = input.nextLine();
        System.out.println ("type a verb ending in ing");
        String verbing = input.nextLine();
        System.out.println ("name a part of the body (plural)");
        String body = input.nextLine();
        
        System.out.println("Today's date is " + month + "/" + day +"/" + year + "          " +name);
        System.out.println("Woke up to " + adj1 + " smell of " + bird + " roasting in the " + room + " downstairs. I " + verbpast);
        System.out.println(" down the stairs to see if I could help " + verb + " the dinner. My mom said, 'See if " + relative);
        System.out.println(" needs a fresh " + noun + " .' So I carried a tray of glasses full of " + liquid + " into the " + verbing);
        System.out.println(" room. When I got there I couldn't believe my " + body + " !");
        
    
}
}
