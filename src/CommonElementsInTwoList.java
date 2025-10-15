import java.util.Arrays;
import java.util.List;

public class CommonElementsInTwoList {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,3,5,78,98);
        List<Integer> num2 = Arrays.asList(9,3,5,87,99,5);

        List<Integer> res= num.stream().filter(num2::contains).toList();


        System.out.println(res);
    }
}
