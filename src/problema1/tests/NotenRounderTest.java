package problema1.tests;
import problema1.main.NotenRounder;
import static problema1.tests.NotenProzessorTest.*;
import org.junit.jupiter.api.Test;
class NotenRounderTest{
    @Test
    public void testAbgerundeteNote_expected() {
        NotenRounder prozessor = new NotenRounder();
        int[] input = {75, 60, 85, 90, 40};
        int[] expectedOutput = {75, 60, 85, 90, 40};
        int[] result = prozessor.abgerundeteNote(input);

        assert arrayEquals(expectedOutput, result) : "testAbgerundeteNote_expected - Failed";
    }

    @Test
    public void testAbgerundeteNote_unexpected() {
        NotenRounder prozessor = new NotenRounder();
        int[] input = {75, 60, 105, -10, 40};
        int[] expectedOutput = new int[0];
        int[] result = prozessor.abgerundeteNote(input);

        assert arrayEquals(expectedOutput, result) : "testAbgerundeteNote_unexpected - Failed";
    }


}