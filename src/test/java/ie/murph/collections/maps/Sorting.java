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
	
	@SuppressWarnings("unchecked")
	@Test
	public void naturalOrderTreemapNumbersTest() {
		mapCollection.setTreeMap(new TreeMap<Integer, String>());
	    TreeMap<Integer, String> treeMap = (TreeMap<Integer, String>) mapCollection.getMap();
	    treeMap.put(3, "val");
	    treeMap.put(2, "val");
	    treeMap.put(1, "val");
	    treeMap.put(5, "val");
	    treeMap.put(4, "val");
	 
	    assertEquals("[1, 2, 3, 4, 5]", treeMap.keySet().toString());
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void naturalOrderTreemapLettersTest() {
		mapCollection.setTreeMap(new TreeMap<String, String>());
	    TreeMap<String, String> treeMap =  (TreeMap<String, String>) mapCollection.getMap();
	    treeMap.put("c", "val");
	    treeMap.put("b", "val");
	    treeMap.put("a", "val");
	    treeMap.put("e", "val");
	    treeMap.put("d", "val");
	 
	    assertEquals("[a, b, c, d, e]", treeMap.keySet().toString());
	}
	
	@Test
	public void comparatorOrderTreemapNumbersTest() {
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
	public void performanceQueriesOrderTreemapNumbersTest() {
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
