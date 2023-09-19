package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        int one = number % 1000 % 100 % 10; // search four count
        int two = number % 1000 % 100 / 10;  // search three count
        int zero = number % 1000 / 100;
        int three = number / 1000;
        System.out.println(one + two + three + zero);
    }
}
