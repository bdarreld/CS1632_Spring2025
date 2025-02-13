package edu.pitt.cs;

import static org.junit.Assert.*;
import org.mockito.*;

import org.junit.Test;

public class SquareTest {

	/**
	 * Write an integration test for setSquared.
	 * 
	 * <pre>
	 * Preconditions: A new Square square is created
	 *                A new Number number is created
	 * Execution Steps: Call square.setSquared(number, 3)
	 * PostConditions: The value of number is set to 9
	 * </pre>
	 */
	@Test
	public void testSetSquaredIntegration() {
		// Preconditions
		Square square = new Square();
		Number number = new Number();

		// Execution steps
		square.setSquared(number, 3);

		// Checking postconditions
		assertEquals(9, number.getVal());
	}

	/**
	 * Write a unit test for setSquared.
	 * 
	 * <pre>
	 * Preconditions: A new Square square is created
	 *                A new Number number is created
	 * Execution Steps: Call square.setSquared(number, 3)
	 * PostConditions: The value of number is set to 9
	 * </pre>
	 */
	@Test
	public void testSetSquaredUnit() {
		// Preconditions
		Square square = new Square();
		Number number = Mockito.mock(Number.class);

		// Execution steps
		square.setSquared(number, 3);

		// Checking postconditions
		Mockito.verify(number).setVal(9);
	}
}
