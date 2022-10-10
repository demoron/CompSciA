import java.util.Scanner;


public class Bot2Tester

{
    
    public static void main(String[] args) {
        Bot2 Chatter = new Bot2("Nate");
        Scanner input = new Scanner(System.in);
        Chatter.greeting();
        System.out.println("What's your favorite animal?");
        String Favdog = input.nextLine();
        Chatter.favoriteAnimal(Favdog);
        System.out.println("Where do you live?");
        String Home = input.nextLine();
         Chatter.home(Home);
         System.out.println("What's your favorite number?");
         int num = input.nextInt();
         Chatter.favoriteNumber(num);
         Chatter.goodbye();
    }
}
