package test.java.ie.murph.collections.maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollection {
	
	private Map<Object, Object> map;
	
	public void createTreeMap() {
		map = new TreeMap<Object, Object>();
	}
	
	public void createHashMap() {
		map = new HashMap<Object, Object>();
	}
	
	public void createLinkedHashMap() {
		map = new LinkedHashMap<Object, Object>();
	}
	
	public void createHashTable() {
		map = new Hashtable<Object, Object>();
	}
	
	public Map<Object, Object> getMap(){
		return map;
	}

}
