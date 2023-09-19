package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int one = number % 100 % 10;
        int two = number / 10 % 10;
        int three = number / 100;
        System.out.println(one + "" + two + "" + three);

    }
}
