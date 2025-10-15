import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AvgOfInt {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,3,5,78,98);

       Double res= num.stream().collect(Collectors.averagingInt(Integer::intValue));

       System.out.println(res);

       Optional<Integer> i = num.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst();
        System.out.println(i.get());

        List<Integer> list=num.stream().filter(n->n>10).toList();

        System.out.println(list);
    }
}
