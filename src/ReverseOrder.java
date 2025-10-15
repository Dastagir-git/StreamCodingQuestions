import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReverseOrder {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8,2,1,7,4,3,9,5);

        List<String> names = Arrays.asList("xyz","das","prabhas", "ram");

       List<Integer> list1= list.stream().sorted(Comparator.reverseOrder()).toList();

        Optional<String> list2= names.stream().sorted(Comparator.comparing(s -> s.startsWith("x"))).findFirst();

//       System.out.println(list1);

        System.out.println(list2.get());
    }
}
