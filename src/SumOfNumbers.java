import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,5);

//       Integer res = list.stream().mapToInt(Integer::intValue).sum();
      int res= list.stream().reduce(0, Integer::sum);
       System.out.println(res);
    }
}
