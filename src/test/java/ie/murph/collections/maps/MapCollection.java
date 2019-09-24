package test.java.ie.murph.collections.maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollection {
	
	private Map<?, ?> map;
	
	public void setTreeMap() {
		map = new TreeMap<Integer, String>();
	}
	
	public void setHashMap() {
		map = new HashMap<Integer, String>();
	}
	
	public void setLinkedHashMap() {
		map = new LinkedHashMap<Integer, String>();
	}
	
	public void setHashTable() {
		map = new Hashtable<Integer, String>();
	}
	
	@SuppressWarnings("unchecked")
	public TreeMap<Integer, String> getTreeMap() {
		return (TreeMap<Integer, String>) map;
	}
	
}
