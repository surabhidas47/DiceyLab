//utilize both to show the statistics

public class Simulation {

    private Bins bin;
    private int numberOfDice;
    private int numberOfTosses;
    private Dice d;
    private int totalSum;

    public static void main(String[] args) {
    Simulation s = new Simulation(2,1000000);
    //new dice obj
    s.d = new Dice(s.numberOfDice);
    //created bin obj w. max bin value
    s.bin =new Bins(s.d.numDice,(s.d.numDice*6));
    s.runSimulation();
    //calculating total sum of all the bins
    int temp=0;
    for(int i = s.numberOfDice; i<= (s.numberOfDice*6); i++){
        temp+= s.bin.getBin(i);
    }
    s.totalSum=temp;
    s.results();

    }
    //constructor for sim
    public Simulation(int numberOfDice,int numberOfTosses){
        this.numberOfDice=numberOfDice;
        //calling method from dice class
        this.numberOfTosses=numberOfTosses;
    }

    public void runSimulation(){
        for (int i=0; i<numberOfTosses;i++){
            int roll= d.tossAndSum();
            bin.incrementBin(roll);
        }
    }

    public void results(){


    }



}

