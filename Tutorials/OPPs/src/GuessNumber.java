import java.util.*;

class Game{
    Scanner sc=new Scanner(System.in);
    private int noOfGuess;
    public int random;
    public int n;

    //  Constructor
    public Game(){
        noOfGuess=0;
        random=(int)(Math.random()*100);
    }

    //  Mutator and Accessor Method
    public int getNoOfGuess() {
        return noOfGuess;
    }

    public void setNoOfGuess(int noOfGuess) {
        this.noOfGuess = noOfGuess;
    }

    //  Take Random Number
    public void input(){
        System.out.print("Enter your Guess Number : ");
        n=sc.nextInt();
        noOfGuess++;
    }

    //  Is Correct Number
    public boolean isCorrectNumber(){
        if(n==random){
            return true;
        }
        else{
            return false;
        }
    }
}

public class GuessNumber {
    public static void main(String[] args) {
        Game G=new Game();
        G.input();
        while(!G.isCorrectNumber()){
            if(G.random>G.n){
                System.out.println("Your Guess No is Lesser");
            }
            else{
                System.out.println("Your Guess No is Greater");
            }
            G.input();
        }

        if(G.getNoOfGuess()==1 || G.getNoOfGuess()==2){
            System.out.println("** Great your Guess Number is Absolutely Correct at "+G.getNoOfGuess()+" Chance **");
        }
        else{
            System.out.println("`~` Your Guess Number is Correct at "+G.getNoOfGuess()+" Chance\nImprove your Skill `~`");
        }
    }
}