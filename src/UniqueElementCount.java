import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] arr = {8,8,8};

        List<Integer> list =Arrays.stream(arr).boxed().toList();

        Optional<Integer> i=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(num->num.getValue()>=1).map(Map.Entry::getKey).reduce(Integer::sum);

        System.out.println(i.get());
        }
}