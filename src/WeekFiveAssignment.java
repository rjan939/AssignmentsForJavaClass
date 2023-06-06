public class WeekFiveAssignment {
    public static void main(String[] args) {
        int tmp;
        int[] numbers = {42, 20, 1, 13};
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                System.out.println("number at index is greater than " +
                        "number at index + 1 where i is " + numbers[i]);
                tmp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = tmp;
            }
        }
        printArr(numbers);
    }

    static void printArr(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.println("Number at index " + j + ": " + arr[j]);
        }
    }
}
