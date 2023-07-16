import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @org.junit.jupiter.api.Test
    void getRoll() {
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

    @org.junit.jupiter.api.Test
    void toosAndSum() {

        Dice testSum = new Dice(2);
        boolean actual = false;
        int testVal;

        testVal = testSum.toosAndSum();

        //gives us two numbers, because two seperate rolls
        if ((testVal > 1) && (testVal < 13)) {
            actual = true;

        }
        assertEquals(true, actual);


    }
}