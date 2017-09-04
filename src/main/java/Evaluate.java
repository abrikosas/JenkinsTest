public class Evaluate {

    public int checkSum(String expression) {

        int sum = 0;

        for (String exp : expression.split("\\+"))
            sum += Integer.valueOf(exp);
            return sum;


    }

}
