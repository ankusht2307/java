import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		Map<String, String> obj = new HashMap<String, String>();

		obj.put("name", "Harry potter");
		obj.put("movie", "Deathly Hollows");
		obj.put("wand", "Dragon Heart");
		
		// if we put same key value than first value will be overwritten by new one
		obj.put("name", "Weasly");

		// return object containing values but in randon order
		System.out.println(obj);

		System.out.println("");

		// we can get value by key
		System.out.println(obj.get("name"));

		System.out.println("");

		// if key doesn't exists we it will returns null
		System.out.println(obj.get("game"));

		System.out.println("");

		// to loop through map we need to get the keys
		Set<String> keys = obj.keySet();

//		System.out.println(keys);

		for (String key : keys) {
			System.out.println(obj.get(key));
		}
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		// hashTable
		
		Map<String, String> obj1 = new Hashtable<String, String>();

		obj1.put("name", "Harry potter");
		obj1.put("movie", "Deathly Hollows");
		obj1.put("wand", "Dragon Heart");
		
		// if we put same key value than first value will be overwritten by new one
		obj1.put("name", "Weasly");

		// return object containing values but in randon order
		System.out.println(obj1);

		System.out.println("");

		// we can get value by key
		System.out.println(obj1.get("name"));

		System.out.println("");

		// if key doesn't exists we it will returns null
		System.out.println(obj1.get("game"));

		System.out.println("");

		// to loop through map we need to get the keys
		Set<String> keys1 = obj1.keySet();

//		System.out.println(keys);

		for (String key : keys1) {
			System.out.println(obj1.get(key));
		}
	}

}
