import java.util.Map;
import java.util.TreeMap;
public class Bins {
    int minBin;
    int maxBin;
    public Map<Integer, Integer> bins = new TreeMap<>();
    public Bins(int min, int max) {

        this.minBin=min;
        this.maxBin=max;

        for (int i=min;i<=max;i++){
            bins.put(i,0);
        }
    }
    public int getBin(int numBin) {
        return bins.get(numBin);
    }
    public void incrementBin(int numBin) {

        int nV= bins.get(numBin);
        nV += 1;
        bins.replace(numBin,nV);
    }
}
