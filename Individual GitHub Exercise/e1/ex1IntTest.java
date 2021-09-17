package e1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ex1IntTest {

	@Test
	public void test() {
		ex1 o = new ex1();

		String[] t = { "5", "23", "1", "7", "0", "49" }; // sample input
		int[] c = { 0, 1, 5, 7, 23, 49 }; // sorted

		int[] r = o.sortInt(t);

		assertArrayEquals(c, r);

	}

}
