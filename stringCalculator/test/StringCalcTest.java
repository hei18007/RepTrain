import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalcTest
{
    @Test
    void emptyStringReturnNull() {
        StringCalc sc = new StringCalc();
        assertEquals(0, sc.add(""));
    }
}