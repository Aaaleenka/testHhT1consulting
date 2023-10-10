package LogicService;

import java.util.*;

public class LogicService {

    public String getCountCharsToString(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            int count = 0;
            if (map.containsKey(a)) count = map.get(a);
            count++;
            map.put(a, count);
        }

        List<Map.Entry<Character, Integer>> counts = map.entrySet().stream()
                .sorted(Comparator.comparingInt(x -> -x.getValue())).toList();

        StringBuilder s = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : counts) {
            s.append(String.format("\"%s\":%d, " , entry.getKey(), entry.getValue()));
        }
        if (s.length() != 0) s.delete(s.length()-2, s.length());
        return s.toString();
    }

}
