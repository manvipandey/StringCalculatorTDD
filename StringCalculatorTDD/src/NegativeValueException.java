import java.util.ArrayList;

public class NegativeValueException extends Exception{

    public String message;
    ArrayList<Integer> negativeValues;

    public NegativeValueException(String message, ArrayList<Integer> negativeValues) {
        this.message = message;
        this.negativeValues = new ArrayList<>(negativeValues);
    }

    public String toString() {
        return message + " = " + negativeValues;
    }

}
