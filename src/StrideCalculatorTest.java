import static org.junit.Assert.*;
import org.junit.Test;

public class StrideCalculatorTest {
	StrideCalculatorComponent effortCalculator = new StrideCalculatorComponent();
	
	@Test
	public void testThatStrideCalculatorReturnsCorrectNumberOfStrides() {
		int[] flightsTestSet1 = {6, 6};
		int[] flightsTestSet2 = {7, 6, 2};
		assertEquals(effortCalculator.calculateStrides(flightsTestSet1, 3), "{ \"leastNumberOfStrides\": 6.0 }");
		assertEquals(effortCalculator.calculateStrides(flightsTestSet2, 2), "{ \"leastNumberOfStrides\": 12.0 }");
	}

}
