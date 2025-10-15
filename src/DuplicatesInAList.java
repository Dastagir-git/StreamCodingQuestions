import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesInAList {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(8,2,1,7,4,3,9,5,2);

        List<String> names = Arrays.asList("xyz","das","prabhas", "ram", "das","xyz");

       List<Integer> list= num.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(map->map.getValue()>1)
                .map(Map.Entry::getKey).toList();

        List<String> list2 = names.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                        .entrySet().stream().filter(map->map.getValue()>1)
                        .map(Map.Entry::getKey).toList();

       System.out.println(list2);
    }
}
