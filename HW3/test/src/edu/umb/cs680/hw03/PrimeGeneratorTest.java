package edu.umb.cs680.hw03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeGeneratorTest {

	 @Test
	 public void primes() {
	       PrimeGenerator gen = new PrimeGenerator(1, 10);
	       gen.generatePrimes();
	       Long[] expectedprimes = { 2L, 3L, 5L, 7L };
	       assertArrayEquals(expectedprimes, gen.getPrimes().toArray());
	 }
	 
	 @Test
	 public void noPrimes() {
	       PrimeGenerator gen = new PrimeGenerator(14, 16);
	       gen.generatePrimes();
	       assertEquals(gen.getPrimes().size(), 0);
	 }

	 @Test
	 public void rangeStartIsAPrime() {
	       PrimeGenerator gen = new PrimeGenerator(11, 30);
	       gen.generatePrimes();
	       Long[] expectedprimes = { 11L, 13L, 17L, 19L, 23L, 29L};
	       assertArrayEquals(expectedprimes, gen.getPrimes().toArray());
	 }

	 @Test
	 public void rangeEndIsAPrime() {
	       PrimeGenerator gen = new PrimeGenerator(11, 30);
	       gen.generatePrimes();
	       Long[] expectedprimes = { 11L, 13L, 17L, 19L, 23L, 29L};
	       assertArrayEquals(expectedprimes, gen.getPrimes().toArray());
	 }

	
	    @Test
	    public void rangeStartZero() {
	        try {
	            PrimeGenerator gen = new PrimeGenerator(0, 10);
	            gen.generatePrimes();
	        } catch (RuntimeException ex) {
	            assertEquals("Wrong input values: from=0 to=10", ex.getMessage());
	        }
	    }

	    @Test
	    public void rangeEndZero() {
	        try {
	            PrimeGenerator gen = new PrimeGenerator(10, 0);
	            gen.generatePrimes();
	        } catch (RuntimeException ex) {
	            assertEquals("Wrong input values: from=10 to=0", ex.getMessage());
	        }
	    }

	    

	    @Test
	    public void rangeStartEndAreEqual() {
	        try {
	            PrimeGenerator gen = new PrimeGenerator(10, 10);
	            gen.generatePrimes();
	        } catch (RuntimeException ex) {
	            assertEquals("Wrong input values: from=10 to=10", ex.getMessage());
	        }
	    }

	   

}