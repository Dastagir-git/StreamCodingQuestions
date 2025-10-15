import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondEvenNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,5,6,7,9);

       java.util.Optional<Integer> optional = list.stream().filter(num-> num%2==0).skip(1).findFirst();

       System.out.println(optional.get());
    }
}
