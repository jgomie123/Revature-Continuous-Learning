package maps;

public class CustomMap {
	private int size;
	private CustomEntry[] map;
	
	public CustomMap(int size) {
		this.size = size;
		map = new CustomEntry[size];
	}
	
	public void put(String key, String value) {
		CustomEntry newEntry = new CustomEntry(key, value);
		for(int i = 0; i < size; i++) {
			if(map[i] == null) {
				map[i] = newEntry;
				return;
			} else if(map[i].getKey().equals(key)) {
				map[i].setValue(value);
				return;
			}
		}
	}
	
	public String getValueByKey(String key) {
		int i = 0;
		while(map[i] != null) {
			if(map[i].getKey().equals(key)) {
				return map[i].getValue();
			}
			i++;
		}
		return "Key does not exist";
	}
	
	public void display() {
		for(int i = 0; i < size; i++) {
			if(map[i] != null) {
				System.out.print("[Key: " + map[i].getKey() + ";");
				System.out.print(" Value: " + map[i].getValue() + "] ");
			}
		}
		
	}
	

}
