import org.junit.Test;

import java.util.ArrayList;

public class StringCalculator {

    private String delimiter = "[^-?0-9]+";
    private ArrayList<Integer> negativeValues = new ArrayList<>();

    private int stringToInt(String input) {
        return Integer.parseInt(input);
    }
    public int Add(String input) throws NegativeValueException {
        String[] numbers = input.split(delimiter);

        if(input.isEmpty()) {
            return 0;
        }
        if(input.length() == 1) {
            return stringToInt(input);
        }
        else {
            int sum = 0, i;
            if(numbers[0].isEmpty()) {
                i = 1;
            }
            else {
                i = 0;
            }
            for(; i<numbers.length; i++) {
                int number = stringToInt(numbers[i]);
                if(number < 0) {
                    negativeValues.add(number);
                }
                else if(number <= 1000) {
                    sum += number;
                }
            }
            if(negativeValues.size() > 0) {
                throw new NegativeValueException("Negatives not allowed", negativeValues);
            }
            else {
                return sum;
            }


        }
    }
}
