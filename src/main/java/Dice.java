import java.util.Random;
public class Dice {

    //actions of rolling a dice


    //have to create constructor
    //could create more parameters... like sides of dice
    public int numDice;
    public int numSides;



    Dice(int totalDice) {

        numDice = totalDice;
        numSides =6;
   }

    Dice(int totalDice, int totalSides) {
        numDice = totalDice;
        numSides =totalSides;
    }

    //method for get a random number between 1-6
    public int getRoll() {

        Random rand = new Random();
        //non exclusive
        return (rand.nextInt(6) + 1);

    }

    //method for how many dice we are rolling

    public int toosAndSum() {

        int sum =0;


        int totalDice = numDice;
        //using get roll method ...we are keep track of the of the sum
        for (int i=0; i<totalDice; i++) {
            sum+=getRoll();

        }

        return sum;
    }


}



