package brian.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calculator2Test {
	@Test
	public void testAdd() {
		Calculator2 calculator = new Calculator2();
		int a = 5;
		int b = 4;
		int actual = calculator.add(a, b);
		int expected = 9;
		assertEquals(expected, actual, "Sum is not correct");
		}
		@Test
		void testSubtract() {
		fail("Not yet implemented");}
		}
