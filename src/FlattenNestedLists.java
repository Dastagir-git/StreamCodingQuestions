import java.util.Arrays;
import java.util.List;

public class FlattenNestedLists {

    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d", "e"),
                Arrays.asList("f")
        );

        List<String> flatList=nestedList.stream().flatMap(List::stream).toList();

        System.out.println(flatList);

    }
}
