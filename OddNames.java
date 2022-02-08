import java.util.ArrayList;
import java.util.List;

public class OddNames {
    public static void main(String[] args) {
        String[] names = {"Tanya", "Ivan", "Arina", "Tymur", "Tamara"};
        List<String> oddNames = new ArrayList<>();
        for(int i=0; i< names.length; i+=2){
            oddNames.add(String.format("%d. %s", i + 1, names[i]));
        }
        oddNames.stream().forEach(x ->{
            if(oddNames.get(oddNames.size()-1).equals(x)){
                System.out.format("%s",x);
            }
            else{
                System.out.format("%s, ", x);
            }
        });
    }
}
