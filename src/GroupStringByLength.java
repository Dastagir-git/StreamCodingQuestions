import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupStringByLength {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("xyz","das","prabhas", "ram", "das","xyz");

        Map<Integer, List<String>> groupedByLength=names.stream().collect(Collectors.groupingBy(String::length, HashMap::new,Collectors.toList()));

        System.out.println(groupedByLength);
    }
}
