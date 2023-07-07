import java.util.Random;
public class Dice {

    //actions of rolling a dice


    //have to create constructor
    //could create more parameters... like sides of dice
    int numDice;
    int numSides;



    Dice(int totalDice) {
        this.numDice = totalDice;
    }

    Dice(int totalDice, int totalSides) {
        this.numDice = totalDice;
        this.numSides =totalSides;
    }

    //method for get a random number between 1-6
    public int getRoll() {

        Random rand = new Random();
        //non exclusive
        return (rand.nextInt(6) + 1);

    }

    //method for how many dice we are rolling
    //sum is only being used in toss and sum
    //call get roll
    public int toosAndSum() {

        int sum =0;

        //initialize and assigning
        int totalDice = this.numDice;

        //could just repalce totalDice with this.numDice
        for (int i=0; i<totalDice; i++) {
            sum+=getRoll();

        }

        return sum;
    }


    public static void main(String[] args) {

        Dice dice1 = new Dice(2);
        Dice dice2 = new Dice(20,5);

        //we are calling method toss and sum on object instance
        System.out.println(dice1.toosAndSum());
        System.out.println(dice2.toosAndSum());
    }
}

//for testing random want to make sure

