import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("a", "박문수");
		hm.put("b", "이몽룡");
		hm.put("c", "홍길동");
		
		hm.put("d", "월매");
		hm.put("c", "이순신");
		
		System.out.println(hm.size());
		System.out.println(hm.toString());
		
		System.out.println(hm.get("a"));
		System.out.println(hm.get("b"));
		
		// key -> value   전체 데이터 가져오기
		Set<String> keys = hm.keySet();
		System.out.println(keys.toString());
		
		for (String key: keys) {
			System.out.println(key + " : " + hm.get(key));
		}
		
		// Iterator 사용
		Iterator<String> iterator = hm.keySet().iterator();	//keys.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println( key + " : " + hm.get(key));
		}
		
		//value만 가져오기
		Collection<String> values = hm.values();
		for(String value : values) {
			System.out.println(value);
		}
		
		hm.remove("a");
		System.out.println(hm.toString());
	
	}

}
