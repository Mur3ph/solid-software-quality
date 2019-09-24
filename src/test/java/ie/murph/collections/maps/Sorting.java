package test.java.ie.murph.collections.maps;

import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

public class Sorting {
	
	@Test
	public void givenTreeMap_whenOrdersEntriesNaturally_thenCorrect() {
	    TreeMap<Integer, String> map = new TreeMap<>();
	    map.put(3, "val");
	    map.put(2, "val");
	    map.put(1, "val");
	    map.put(5, "val");
	    map.put(4, "val");
	 
	    assertEquals("[1, 2, 3, 4, 5]", map.keySet().toString());
	}
	
	@Test
	public void givenTreeMap_whenOrdersEntriesNaturally_thenCorrect2() {
	    TreeMap<String, String> map = new TreeMap<>();
	    map.put("c", "val");
	    map.put("b", "val");
	    map.put("a", "val");
	    map.put("e", "val");
	    map.put("d", "val");
	 
	    assertEquals("[a, b, c, d, e]", map.keySet().toString());
	}
	
	@Test
	public void givenTreeMap_whenOrdersEntriesByComparator_thenCorrect() {
	    TreeMap<Integer, String> map = 
	      new TreeMap<>(Comparator.reverseOrder());
	    map.put(3, "val");
	    map.put(2, "val");
	    map.put(1, "val");
	    map.put(5, "val");
	    map.put(4, "val");
	         
	    assertEquals("[5, 4, 3, 2, 1]", map.keySet().toString());
	}
	
	
}
