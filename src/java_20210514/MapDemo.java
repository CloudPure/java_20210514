package java_20210514;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		// HashMap : key값은 유일해야 하고, value는 객체의 중복을 허용함
		HashMap map = new HashMap();
		map.put("a", "1111");
		map.put("b", "2222");
		map.put("c", "3333");
		
		String value1 = (String)map.get("a");
		String value2 = (String)map.get("a");
		String value3 = (String)map.get("a");
		
		System.out.printf("%s, %s, %s %n", value1, value2, value3);
		
		// 이렇게 반환을 했으면
		Set keySet = map.keySet();
		
		// 그 다음에 키 값을 꺼내야함.
		Iterator i = keySet.iterator();
		while(i.hasNext()) {
			String key = (String)i.next();
			String value = (String) map.get(key); // 반환값 자체가 string이니까 앞에 (String) 이거 붙여주기
			
			System.out.printf("%s : %s %n", key, value);
		}
	}
}
