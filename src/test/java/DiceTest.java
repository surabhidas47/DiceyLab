import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    public void getRoll() {
        //we made dice object!!
        Dice testDice = new Dice(1);
        boolean actual = false;
        int testVal;

        testVal = testDice.getRoll();

        //gives us two numbers, because two seperate rolls
        if ((testVal > 0) && (testVal < 7)) {
            actual = true;

        }
        assertEquals(true, actual);
    }

    @Test
    public void toosAndSum() {

        Dice testSum = new Dice(2);
        boolean actual = false;
        int testVal;

        testVal = testSum.tossAndSum();


        if ((testVal > 1) && (testVal < 13)) {
            actual = true;

        }
        assertEquals(true, actual);


    }
}