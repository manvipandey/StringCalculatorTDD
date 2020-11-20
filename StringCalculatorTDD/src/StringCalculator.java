import org.junit.Test;

public class StringCalculator {

    private String delimiter = ",|\n";

    private int stringToInt(String input) {
        return Integer.parseInt(input);
    }
    public int Add(String input) {
        String[] numbers = input.split(delimiter);

        if(input.isEmpty()) {
            return 0;
        }
        if(input.length() == 1) {
            return stringToInt(input);
        }
        else {
            int sum = 0;
            for(int i=0; i<numbers.length; i++) {
                sum += stringToInt(numbers[i]);
            }
            return sum;
        }
    }
}
