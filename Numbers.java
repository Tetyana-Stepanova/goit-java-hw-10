import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Numbers {
    public static void main(String[] args) {
        String[] numbersArray = {"1, 12, 676, 0, 25","4, 15"};
        List<Integer> result = Stream.concat(
                Arrays.stream(numbersArray[0].split(", ")),
                Arrays.stream(numbersArray[1].split(", "))
        )
                .map(Integer::valueOf)
                .sorted()
                .collect(Collectors.toList());
        for (int i = 0; i < result.size(); i++) {
            if( i == result.size()-1){
                System.out.print(result.get(i));
            }
            else{
                System.out.print(result.get(i)+", ");
            }
        }
    }
}
