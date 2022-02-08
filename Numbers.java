import java.util.Arrays;
import java.util.stream.Stream;

public class Numbers {
    public static void main(String[] args) {
        String[] numbersArray = {"1, 2, 0","4, 5"};
        String[] result = Stream.concat(
                Arrays.stream(numbersArray[0].split(", ")),
                Arrays.stream(numbersArray[1].split(", "))
        )
                .sorted()
                .toArray(String[]::new);
        System.out.print(Arrays.toString(result));
    }
}
