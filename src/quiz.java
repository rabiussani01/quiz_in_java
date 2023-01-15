import java.util.Scanner;
public class quiz {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("!!!!!!!!!!Welcome to The quiz!!!!!!!!!");
        System.out.println("Please Answer all The questions");
        System.out.println(" Q1 : What kind of fish is Nemo?");
        String ans1 = scan.next();

        while (!(ans1.equals("Clownfish"))){
            System.out.println("Your answer is wrong");
            System.out.println("Please insert correct answer :");
            ans1 = scan.next();
        }
        System.out.println("Congress!! Your answer is correct.");
        System.out.println(" Q2 : Who is the youngest Disney princess?");
        String ans2 = scan.next();

        while (!(ans2.equals("Snow White"))){
            System.out.println("Your answer is wrong");
            System.out.println("Please insert correct answer :");
            ans2 = scan.next();
        }
        System.out.println("Congress!! Your answer is correct.");
        System.out.println(" Q3 : What is the name of Ana’s sister in the movie, Frozen?");
        String ans3 = scan.next();

        while (!(ans3.equals("Elsa"))){
            System.out.println("Your answer is wrong");
            System.out.println("Please insert correct answer :");
            ans3 = scan.next();
        }
        System.out.println("Congress!! Your answer is correct.");
        System.out.println(" Q4 : Which character in Aladdin is blue?");
        String ans4 = scan.next();

        while (!(ans4.equals("The genie"))){
            System.out.println("Your answer is wrong");
            System.out.println("Please insert correct answer :");
            ans4 = scan.next();
        }
        System.out.println("Congress!! Your answer is correct.");
        System.out.println(" Q5 : What kind of animal is Simba?");
        String ans5 = scan.next();

        while (!(ans5.equals("Lion"))){
            System.out.println("Your answer is wrong");
            System.out.println("Please insert correct answer :");
            ans5 = scan.next();
        }
        System.out.println("Congress!! Your answer is correct.");


        System.out.println("!!!Congress!! Your answer All questions.!!!");


    }
}
