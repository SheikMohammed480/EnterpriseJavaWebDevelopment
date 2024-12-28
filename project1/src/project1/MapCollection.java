package project1;

import java.util.HashMap;

public class MapCollection {

	public static void main(String[] args) {
	HashMap<Integer,String> h=new HashMap<>();
	h.put(1,"sheik");
	h.put(2,"sharmi");
	h.put(3,"fathi");
	System.out.println(h);
	System.out.println(h.size());
	System.out.println(h.containsKey(1));
	System.out.println(h.containsValue("fathi"));
	System.out.println(h.get(3));
	System.out.println(h.keySet());
	System.out.println(h.values());
	System.out.println(h.entrySet());
	}

}
