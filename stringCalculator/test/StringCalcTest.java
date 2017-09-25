import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalcTest
{
    @Test
    void emptyStringReturnsZero() {
        init(0, "");
    }

    @Test
    void oneStringReturnsOne() {
        init(1, "1");
    }

    @Test
    void threeCharacterStringReturnsSum() {
        init(4, "2,2");
    }

    @Test
    void nullStringReturnsZero() {
        init(0, null);
    }

    private void init(int expected, String actual){
        StringCalc sc = new StringCalc();
        assertEquals(expected, sc.add(actual));
    }
}