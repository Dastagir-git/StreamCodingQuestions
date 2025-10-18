import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharAndCount {

    public static void main(String[] args) {
        String str = "Programming";

        Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(map->map.getValue()>1)
                .forEach(map->System.out.println(map.getKey()+" "+map.getValue()));
    }
}
