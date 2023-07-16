
public class Bins {

    int minBin;
    int maxBin;

    private int[] bins;
    public Bins(int minBin, int maxBin) {
        int numberOfBins = maxBin - minBin +1;
        bins = new int[numberOfBins];

    }

    public int getMinBin(int bin) {
        return bins[bin];
    }

    public void incrementBin(int bin) {
        bins[bin]++;
    }

}
