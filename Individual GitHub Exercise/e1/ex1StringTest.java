package e1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ex1StringTest {

	@Test
	public void test() {
		ex1 o = new ex1();
		
		String[] t = {"h", "k", "a", "c", "z", "r"}; // sample input
		String[] c = {"a", "c", "h", "k", "r", "z"}; // sorted
		
		String[] r = o.sortString(t);
		
		assertArrayEquals(c, r);
		
	}

}
