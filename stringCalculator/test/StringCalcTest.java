import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalcTest
{
	@Test void emptyStringReturnsZero()
	{
		initStringCalcAndAssertEquals(0, "");
	}

	@Test void oneStringReturnsOne()
	{
		initStringCalcAndAssertEquals(1, "1");
	}

	@Test void threeCharacterStringReturnsSum()
	{
		initStringCalcAndAssertEquals(10, "5,5");
	}

	@Test void fourOrMoreCharacterStringReturnsSum()
	{
		initStringCalcAndAssertEquals(20,"3,3,3,5,6");
	}

	@Test void handleNewLineBetweenNumbersReturnsSum()
	{
		initStringCalcAndAssertEquals(6,"1\n2,3");
	}

	@Test void nullStringReturnsZero()
	{
		initStringCalcAndAssertEquals(0, null);
	}

	private void initStringCalcAndAssertEquals(int expected, String actual)
	{
		StringCalc sc = new StringCalc();
		assertEquals(expected, sc.add(actual));
	}
}