package maps;

/*What is a map: a map is a key value pair mapping, which means that every key is mapped to exactly one value
 * that we can use to retreive the corresponding value from the map.
 * 
 * HashMap: allows for at most 1 null key, and it does not maintain its order
 * TreeMap: does not allow for null keys, but they do allow null values; maintains ascending order (this map implements
 * both Map and SortedMap interfaces
 * LinkedHashMap: allows you to maintain the order of elements inserted and is very similar to HashMap
 * */

public class CustomEntry {
	private String key;
	private String value;
	
	public CustomEntry(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public String getKey() {
		return key;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
