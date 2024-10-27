import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "banana", "bat", "cat");
        List<Integer> listInteger = List.of(1, 4, 7, 9);
        printWithFP(list);
        printWithFPFiltering(list);
        printWithFPFilteringOddNumbers(listInteger);
        System.out.println(sumFP(listInteger));
        System.out.println(sumOddFP(listInteger));

    }

    private static void printWithFP(List<String> list) {
        list.stream().forEach(element -> System.out.println(element));
    }

    private static void printNumberFP(List<Integer> list) {
        list.stream().forEach(element -> System.out.println(element));
    }

    private static void printWithFPFiltering(List<String> list)
    // elements that end in at
    {
        list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));
    }

    private static void printWithFPFilteringOddNumbers(List<Integer> list) {
        list.stream().filter(element -> Integer.valueOf(element) % 2 == 0).forEach(element -> System.out.println(element));
    }

    private static int sumFP(List<Integer> list)
    {
        //number1,number2 parameters in the method
        int sum = list.stream().reduce(0,(number1,number2) -> number1 + number2);
        return sum;
    }

    private static int sumOddFP(List<Integer> list)
    {
        int sum = list.stream().filter(number -> number%2 == 1).reduce(0,(number1,number2)->number1+number2);
        return sum;
    }
}