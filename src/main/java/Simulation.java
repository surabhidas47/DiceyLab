//utilize both to show the statistics

public class Simulation {

    public static void main(String[] args) {

        Dice dice1 = new Dice(2);
        //Dice dice2 = new Dice(20,5);

        //reference
        int example = dice1.numDice;

       // System.out.println(example);

        //we are calling method toss and sum on object instance
        System.out.println(dice1.toosAndSum());
        //System.out.println(dice2.toosAndSum());

    }




}

