package test.java.ie.murph.collections.maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapCollection {
	
	private Map<?, ?> m_map;
	
	public void setTreeMap(Map<?, ?> map) {
		m_map = map;
	}
	
	public void setHashMap() {
		m_map = new HashMap<Integer, String>();
	}
	
	public void setLinkedHashMap() {
		m_map = new LinkedHashMap<Integer, String>();
	}
	
	public void setHashTable() {
		m_map = new Hashtable<Integer, String>();
	}
	
	public  Map<?, ?> getTreeMap() {
		return m_map;
	}
	
}
