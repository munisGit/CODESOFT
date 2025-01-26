import java.util.Random;
import java.util.Scanner;

class NumberGame {
    Random rand = new Random();
    int i;
    int score = 0;
    void display(){
        Scanner scan  = new Scanner(System.in);
        System.out.println("1.Start Game");
        System.out.println("2.Check Score");
        int get = scan.nextInt();
        if(get==1){
            start_game();
        }
        else if(get == 2){
            check_score();
        }
    }
    void start_game(){
        int inp = rand.nextInt(100);
        for(i = 1;i<=3;i++){
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the number between(1-100): ");
        int x = st.nextInt();
         if(x > inp){
            System.out.println("The Number might be Lower! Try again");
        }
        else if(x == inp){
            System.out.println("Congradulations you guess it right!");
            score++;
            display();
            break;
        }
        else if(i == 3){
            System.out.println("The limited chance is 3!");
            display();
        }
        else{
            System.out.println("The Number might be Higher! Try again");
             }
         }
       }
    void check_score(){
        Scanner out = new Scanner(System.in);
        System.out.println("Attempts: " + i);
        System.out.println("Your Score: " + score);
        System.out.println("Want to try again?(Y/N)");
        String y = out.nextLine();
        if(y.equalsIgnoreCase("Y")){
            start_game();
        }
        else{
            System.out.println("Thanks for Playing");
        }
}
public static void main(String[] args) {
    NumberGame go = new NumberGame();
    go.display();
}
}