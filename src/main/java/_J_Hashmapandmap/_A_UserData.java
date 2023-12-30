package _J_Hashmapandmap;

import java.util.HashMap;
import java.util.Map;

public class _A_UserData {
	public static void main(String[] args) {

//		HashMap< String, String > userMap=new HashMap<String,String>();

		Map<String, String> userMap = new HashMap<String, String>();

		userMap.put("id", "1");
		userMap.put("name", "Tom");
		userMap.put("city", "Bangalore");

		System.out.println(userMap.get("id"));
		System.out.println(userMap.size());

		for (Map.Entry m : userMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
