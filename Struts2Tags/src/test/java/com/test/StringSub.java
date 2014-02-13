package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringSub {

	public Map<String, List<StringVO>> addElementstoMap(String value) {
		Map<String, List<StringVO>> stringMap = new HashMap<String, List<StringVO>>();
		StringVO stringVO;

		for (int i = 0; i < value.length(); i++) {
			stringVO = new StringVO();

			if ((stringMap.get(Character.toString(value.charAt(i)))) == null) {
				stringVO.setCharValue(value.charAt(i));
				stringVO.setIndex(i);
				List<StringVO> stringVOs = new ArrayList<StringVO>();
				stringVOs.add(stringVO);
				stringMap.put(Character.toString(value.charAt(i)), stringVOs);
			} else {
				stringVO.setCharValue(value.charAt(i));
				stringVO.setIndex(i);
				List<StringVO> list = (List<StringVO>) stringMap.get(Character
						.toString(value.charAt(i)));
				list.add(stringVO);
				stringMap.put(Character.toString(value.charAt(i)), list);
			}
		}
		return stringMap;
	}

	public List<String> splitString(String value, int[] indexs) {
		List<String> splitedStrings = new ArrayList<String>();
		int idx = 0;
		for (int i = 0; i < indexs.length; i++, idx++) {

			if (i == 0) {
				splitedStrings.add(value.substring(i, indexs[i]+1));
				// System.out.println("INDEX VALUES ARE : " +0 + " : " +
				// indexs[i] );
			} else {
				int val=indexs[i - 1];
				splitedStrings.add(value.substring(val + 1, indexs[i]+1));
				// System.out.println("INDEX VALUES ARE : "
				// +(Integer.valueOf(indexs[i-1])+1) + " : " + indexs[i] );
			}

		}
		return splitedStrings;

	}

	public static void main(String args[]) {

		String bigStringWithDuplicates = "PLEASEDONTIGNOREME";// "bigStringWithDuplicates";
		System.out.println(bigStringWithDuplicates);
		bigStringWithDuplicates = bigStringWithDuplicates.toUpperCase();

		System.out.println(bigStringWithDuplicates);

		StringSub stringSub = new StringSub();
		Map<String, List<StringVO>> map = stringSub
				.addElementstoMap(bigStringWithDuplicates);

		for (Map.Entry<String, List<StringVO>> mapele : map.entrySet()) {

/*			System.out.println("   " + mapele.getKey() + "  "
					+ mapele.getValue().size());*/

			if (mapele.getValue().size() > 3) {

				List<StringVO> indexs = mapele.getValue();
				int[] indexvalue = new int[indexs.size()];
				int i = 0;
				for (StringVO stringVO : indexs) {
					indexvalue[i] = stringVO.getIndex();
					i++;
				}
				List<String> splitedString = stringSub.splitString(
						bigStringWithDuplicates, indexvalue);
				for (String string : splitedString) {
					System.out.println(string);

				}
			}

		}

		/*
		 * char ch[] = bigStringWithDuplicates.toCharArray();
		 * 
		 * Map<Object, List<StringVO>> map = new HashMap<Object,
		 * List<StringVO>>();
		 * 
		 * for (int i = 65; i <= 90; i++) { map.put((char) i, new
		 * ArrayList<StringVO>()); }
		 * 
		 * for (int i = 0; i < ch.length; i++) { StringVO stringVO=new
		 * StringVO(); stringVO.setCharValue((Object)ch[i]);
		 * stringVO.setIndex(i); List voList=map.get(stringVO.getCharValue());
		 * voList.add(stringVO); map.put(stringVO.getCharValue(), voList); }
		 * 
		 * for (Map.Entry<Object, List<StringVO>> entry : map.entrySet()) {
		 * System.out.println(entry.getKey() + " ::::::::::::::: " +
		 * ((List)entry.getValue()).size() + " :::::::::: " +
		 * ((List)entry.getValue()).size()); }
		 */

	}
}
