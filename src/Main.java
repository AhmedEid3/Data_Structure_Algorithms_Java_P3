import searching.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 4, 5, 7, 8, 9, 30};

        var sorter = new ExponentialSearch();

        int index = sorter.find(30, numbers);
        System.out.println(index);

    }
}