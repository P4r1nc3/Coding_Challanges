package CodeWars.WhichAreIn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        List<String> resultList = new ArrayList<>();

        for (String element1 : array1) {
            for (String element2 : array2) {
                if (element2.contains(element1)) {
                    resultList.add(element1);
                    break;
                }
            }
        }

        String[] result = resultList.toArray(new String[0]);
        Arrays.sort(result);
        return result;
    }
}
