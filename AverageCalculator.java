class AverageCalculator {

    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args)
 {
        int[] numbers = {10, 20, 30, 40, 50};
        double average = calculateAverage(numbers);
        System.out.printf("The average is: %.2f%n", average);
    }
}
