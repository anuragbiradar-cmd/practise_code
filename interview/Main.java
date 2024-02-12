package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<Integer, ArrayList<Integer>>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(2);
		arrayList.add(4);
		arrayList.add(6);
		arrayList.add(8);
		arrayList.add(12);

		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(1);
		arrayList2.add(7);
		arrayList2.add(5);
		arrayList2.add(2);
		arrayList2.add(10);

		hashMap.put(1, arrayList);
		hashMap.put(2, arrayList2);
		System.out.println(hashMap);

//		hashMap.forEach((t, u) -> {
//			Collections.sort(u);
//		});

		for (Entry<Integer, ArrayList<Integer>> entry : hashMap.entrySet()) {
			Collections.sort(entry.getValue());
		}

//		Map<Integer, List<Integer>> collect = hashMap.entrySet().stream().collect(Collectors.toMap(tx -> tx.getKey(),
//				tx -> tx.getValue().stream().sorted().collect(Collectors.toList())));

		System.err.println(hashMap);

	}
}
