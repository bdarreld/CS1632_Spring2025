package edu.pitt.cs;

import static org.junit.Assert.*;
import org.mockito.*;

import org.junit.Test;

public class DeathStarTest {

	/**
	 * Write an integration test for shoot.
	 * 
	 * <pre>
	 * Preconditions: A new DeathStar deathStar is created
	 *                A new Planet planet is created with hit points 10
	 * Execution Steps: Call deathStar.shoot(planet)
	 * PostConditions: Return value of call is "Wimpy planet was hit by the superlaser!"
	 *                 Planet receives a damage of 100 hit points
	 * </pre>
	 */
	@Test
	public void testShootPlanetIntegration() {
		// Preconditions
		DeathStar ds = new DeathStar();
		Planet p = new Planet(10);

		// Checking postconditions
		assertEquals("Wimpy planet was hit by the superlaser!", ds.shoot(p)); // return value
		assertEquals(10 - 100, p.getHitPoints());
	}

	/**
	 * Write an unit test for shoot.
	 * 
	 * <pre>
	 * Preconditions: A new DeathStar deathStar is created
	 *                A new Planet planet is created with hit points 10
	 * Execution Steps: Call deathStar.shoot(planet)
	 * PostConditions: Return value of call is "Wimpy planet was hit by the superlaser!"
	 *                 Planet receives a damage of 100 hit points
	 * </pre>
	 */
	@Test
	public void testShootPlanetUnit() {
		// Preconditions
		DeathStar ds = new DeathStar();
		Planet p = Mockito.mock(Planet.class);

		// Define mock behavior
		Mockito.when(p.toString()).thenReturn("Wimpy planet");
		Mockito.when(p.getHitPoints()).thenReturn(10);
		Mockito.doNothing().when(p).damage(100);

		assertEquals("Wimpy planet was hit by the superlaser!", ds.shoot(p));

		Mockito.verify(p).damage(100);
	}
}
