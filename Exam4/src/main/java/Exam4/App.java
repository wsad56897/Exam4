package Exam4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		Random r = new Random();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 50; i++) {
			list.add(r.nextInt(101));
		}
		StringBuffer sb = new StringBuffer();
		for (Integer integer : list) {
			sb.append(integer + ",");
		}
		System.out.println("随机生成了50个小于100的数他们是" + sb);
		HashMap<Integer, Integer[]> map = new HashMap<Integer, Integer[]>();
		for (int i = 1; i < 10; i++) {
			List<Integer> list1 = new ArrayList<Integer>();
			for (int j = 0; j < list.size(); j++) {
				if (i * 10 < list.get(j) && list.get(j) < (i + 1) * 10) {
					list1.add(list.get(j));
				}
			}
			Integer[] a = new Integer[list1.size()];
			map.put(i, list1.toArray(a));
		}
		Set<Entry<Integer, Integer[]>> set = map.entrySet();
		Iterator<Entry<Integer, Integer[]>> it = set.iterator();
		String sbf = "";
		while (it.hasNext()) {
			Entry<Integer, Integer[]> e = it.next();
			Integer key = e.getKey();
			Integer val[] = e.getValue();
			sbf = sbf + key + "=>" + Arrays.toString(val) + ",";
		}
		System.out.println("Map中的数据为：{" + sbf + "}");
		String sb1 = "";
		Iterator<Entry<Integer, Integer[]>> it1 = set.iterator();
		while (it1.hasNext()) {
			Entry<Integer, Integer[]> e = it1.next();
			Integer key = e.getKey();
			Integer val[] = e.getValue();
			val = softArr(val);
			sb1 = sb1 + key + "=>" + Arrays.toString(val) + ",";
		}

		System.out.println("排序后Map为：{" + sb1 + "}");
	}

	public static Integer[] softArr(Integer a[]) {
		boolean flag = false;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
					flag = true;
				}
				if (flag) {
					break;
				}
			}
		}
		return a;
	}

}
