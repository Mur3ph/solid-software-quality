package test.java.ie.murph.collections.maps;

import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Before;
import org.junit.Test;

public class Sorting {
	
	MapCollection mapCollection;
	
	@Before 
	public void createOutputFile() 
    { 
		mapCollection = new MapCollection();
    }
	
	@Test
	public void givenTreeMap_whenOrdersEntriesNaturally_thenCorrect() {
		mapCollection.setTreeMap(new TreeMap<Integer, String>());
	    TreeMap<Integer, String> treeMap = (TreeMap<Integer, String>) mapCollection.getTreeMap();
	    treeMap.put(3, "val");
	    treeMap.put(2, "val");
	    treeMap.put(1, "val");
	    treeMap.put(5, "val");
	    treeMap.put(4, "val");
	 
	    assertEquals("[1, 2, 3, 4, 5]", treeMap.keySet().toString());
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
	
	@Test
	public void givenTreeMap_whenPerformsQueries_thenCorrect() {
	    TreeMap<Integer, String> map = new TreeMap<>();
	    map.put(3, "val");
	    map.put(2, "val");
	    map.put(1, "val");
	    map.put(5, "val");
	    map.put(4, "val");
	         
	    Integer highestKey = map.lastKey();
	    Integer lowestKey = map.firstKey();
	    Set<Integer> keysLessThan3 = map.headMap(3).keySet();
	    Set<Integer> keysGreaterThanEqTo3 = map.tailMap(3).keySet();
	 
	    assertEquals(new Integer(5), highestKey);
	    assertEquals(new Integer(1), lowestKey);
	    assertEquals("[1, 2]", keysLessThan3.toString());
	    assertEquals("[3, 4, 5]", keysGreaterThanEqTo3.toString());
	}

}
