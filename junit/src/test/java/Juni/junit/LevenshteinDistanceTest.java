package Juni.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class LevenshteinDistanceTest {
	LevenshteinDistanceTest _distancia = new LevenshteinDistanceTest();

	@Test
	public void test1() {
		assertEquals("prueba1", 1, LevenshteinDistance.computeLevenshteinDistance("doctor", "doctora"));
	}
	
	@Test
	public void test2() {
		assertEquals("prueba1", 5, LevenshteinDistance.computeLevenshteinDistance("viceps", "coche"));
	}

}
