package project_utils;

public class OddEven {

//    В классе OddEven создать алгоритм oddEven(), который принимает на вход целое число, возвращает “Odd”,  если число нечетное, и “Even”, если число четное.
//
//    Test Data:
//    -345 →  “Odd”
//    0 →  “Even”
//    222222 →  “Even”


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
