package maps;

import java.util.HashMap;
import java.util.Map;

public class CustomMapDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomMap map = new CustomMap(20);
		
		map.put("peekachu", "an electic type polkaman");
		map.put("fire lizard", "a fire type polkaman");
		map.put("water turtle", "a water type polkaman");
		map.put("big bird", "a flying type polkaman");
		map.put("ferret", "a ground type polkaman");
		
//		map.display();
//		System.out.println();
//		System.out.println(map.getValueByKey("peekachu"));
//		System.out.println(map.getValueByKey("fire lizard"));
		
		Map<String, String> polkamans = new HashMap<String, String>();
		
		polkamans.put("Round Mouse", "a ground type polkaman");
		polkamans.put("Cave monster", "a ghost type polkaman");
		polkamans.put("Peekachu", "an electric type polkaman");
		polkamans.put("Electric bird", "an electric type polkaman");
		polkamans.put("Skittles", "a grass type polkaman");
		
		//retreive a value from a map: 
		System.out.println(polkamans.get("Skittles"));
		
		polkamans.put("Peekachu", "a copy of pikachu");
		System.out.println(polkamans.get("Peekachu"));
		
//		//iterating through a HashMap: 
//		for(String key : polkamans.keySet()) {
//			System.out.println(key);
//		}
//		
//		for(String values : polkamans.values()) {
//			System.out.println(values);
//
//		}
		
		for(Map.Entry<String, String> entry : polkamans.entrySet()) {
			System.out.println(entry);
			System.out.println("=======");
		}
		
	}
	
}
