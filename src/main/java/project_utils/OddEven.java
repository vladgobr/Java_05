package project_utils;

public class OddEven {

    public String oddEven (int value) {
    String even = "Even";
    String odd = "Odd";

        if (value % 2 == 0){

            return value + " → " + even;
        } else {

            return value + " → " + odd;
        }

    }

}
