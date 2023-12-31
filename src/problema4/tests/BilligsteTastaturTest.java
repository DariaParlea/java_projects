package problema4.tests;
import problema4.main.BilligsteTastatur;
import org.junit.jupiter.api.Test;
public class BilligsteTastaturTest {
    BilligsteTastatur bt = new BilligsteTastatur();

    @Test
    public void testBilligsteTastatur_expected() {
        int[] options = {40, 50, 60, 30};
        int expectedMinimumPrice = 30;

        int result = bt.billigsteTastatur(options);
        assert result == expectedMinimumPrice : "testBilligsteTastatur_expected test failed!";
    }

    @Test
    public void testBilligsteTastatur_unexpected() {
        int[] options = {70, 80, -90, 100};
        int expectedMinimumPrice = -1;

        int result = bt.billigsteTastatur(options);
        assert result == expectedMinimumPrice : "testBilligsteTastatur_unexpected test failed!";
    }

}
