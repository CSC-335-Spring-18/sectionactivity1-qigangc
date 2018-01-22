import static org.junit.Assert.*;

import org.junit.Test;

public class SortedListTest {

	@Test
	public void test() {
		SortedList<String> newList = new SortedList<>();
		newList.insertInOrder("a");
		assertEquals(newList.size(), 1);
	}
	
	@Test
	public void testInsert(){
		SortedList<String> newList = new SortedList<>();
		newList.insertInOrder("a");
		assertEquals("a", newList.toString());
	}

}