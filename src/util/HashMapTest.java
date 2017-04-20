package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("둘리", new Integer(100));
		map.put("마이콜", 50); // 박싱
		map.put("도우넛", 90);
		map.put("둘리", 95);

		// int score=map.get("마이콜"); //unboxing
		Integer score = map.get("마이콜"); // 객체 형태로 사용하는게 좋음 !!
		System.out.println(score);
		System.out.println(map.get(new String("둘리")));

		// 평균
		Set<String> keySet = map.keySet();

		int count = keySet.size();

		int sum = 0;

		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {

			String key = it.next();
			System.out.println(key);
			int s=map.get(key);
			sum=sum+s;

		}
		
		System.out.println("평균"+(sum/count));

	}

}
