import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RainDropsTests {
    private Raindrops raindrops = new Raindrops();

    @Test
    @DisplayName("If one is entered then one should be returned")
    void ifOneIsEnteredThenOneShouldBeReturned() {
        Assertions.assertEquals("1",raindrops.convertFactorsToPlingPlangPlong(1));
    }

    @Test
    @DisplayName("If threee is entered, Pling should be returned")
    void ifThreeIsEnteredPlingShouldBeReturned() {
        Assertions.assertEquals("Pling", raindrops.convertFactorsToPlingPlangPlong(3));
    }

    @Test
    @DisplayName("If five is entered, then Plang should be returned")
    void ifFiveIsEnteredThenPlangShouldBeReturned() {
        Assertions.assertEquals("Plang",raindrops.convertFactorsToPlingPlangPlong(5));
    }
    
    @Test
    @DisplayName("If seven is entered, Plong should be returned")
    void ifSevenIsEnteredPlongShouldBeReturned() {
        Assertions.assertEquals("Plong", raindrops.convertFactorsToPlingPlangPlong(7));
    }
    
    @Test
    @DisplayName("if 28 is entered, Plong should be returned")
    void if28IsEnteredPlongShouldBeReturned() {
        Assertions.assertEquals("Plong", raindrops.convertFactorsToPlingPlangPlong(28));
    }
    
    @Test
    @DisplayName("if 30 is entered, PlingPlang should be returned")
    void if30IsEnteredPlingPlangShouldBeReturned() {
        Assertions.assertEquals("PlingPlang",raindrops.convertFactorsToPlingPlangPlong(30));
    }

    @Test
    @DisplayName("if 34 is entered, 34 should be returned as it 4 factors")
    void if34IsEntered34ShouldBeReturned() {
        Assertions.assertEquals("34", raindrops.convertFactorsToPlingPlangPlong(34));
    }
}
