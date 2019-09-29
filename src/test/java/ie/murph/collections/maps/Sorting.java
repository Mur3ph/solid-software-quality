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
	
	@SuppressWarnings("unchecked")
	@Test
	public void comparatorOrderTreemapNumbersTest() {
		mapCollection.setTreeMap(new TreeMap<Integer, String>(Comparator.reverseOrder()));
	    TreeMap<Integer, String> treeMapComparator = (TreeMap<Integer, String>) mapCollection.getMap();
	    treeMapComparator.put(3, "val");
	    treeMapComparator.put(2, "val");
	    treeMapComparator.put(1, "val");
	    treeMapComparator.put(5, "val");
	    treeMapComparator.put(4, "val");
	         
	    assertEquals("[5, 4, 3, 2, 1]", treeMapComparator.keySet().toString());
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void performanceQueriesOrderTreemapNumbersTest() {
		mapCollection.setTreeMap(new TreeMap<Integer, String>());
	    TreeMap<Integer, String> treemapPerformanceQueries = (TreeMap<Integer, String>) mapCollection.getMap();
	    treemapPerformanceQueries.put(3, "val");
	    treemapPerformanceQueries.put(2, "val");
	    treemapPerformanceQueries.put(1, "val");
	    treemapPerformanceQueries.put(5, "val");
	    treemapPerformanceQueries.put(4, "val");
	         
	    Integer highestKey = treemapPerformanceQueries.lastKey();
	    Integer lowestKey = treemapPerformanceQueries.firstKey();
	    Set<Integer> keysLessThan3 = treemapPerformanceQueries.headMap(3).keySet();
	    Set<Integer> keysGreaterThanEqTo3 = treemapPerformanceQueries.tailMap(3).keySet();
	 
	    assertEquals(new Integer(5), highestKey);
	    assertEquals(new Integer(1), lowestKey);
	    assertEquals("[1, 2]", keysLessThan3.toString());
	    assertEquals("[3, 4, 5]", keysGreaterThanEqTo3.toString());
	}
}
