package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map3 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("abc","bca","cba","xyz","yzx","zxy","ab","ba");
		Map<String ,List<String>> map= new HashMap<>();
		for(String word :words) {
			char[] ch = word.toCharArray();
			Arrays.sort(ch);
			String key = new String(ch);

       
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        int groupNum = 1;
        for (List<String> group : map.values()) {
            System.out.println("Group" + groupNum + ":" + group);
            groupNum++;
        }

		
	}

}
