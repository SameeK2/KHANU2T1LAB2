import java.util.Scanner;

public class ChatBotRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ChatBot debbie = new ChatBot("Debbie", 20);
        System.out.print("What is your name? ");
        String yourName = scan.nextLine();
        debbie.greeting(yourName);//calls the first method
        debbie.weather();//calls the second method
        double meters = debbie.convertFeetToMeters(30);
        System.out.print("There are " + meters + " in 30 feet.");



    }
}
