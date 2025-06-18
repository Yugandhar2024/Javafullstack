class ArrayAddition {

    
    public static int addArrayValues(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Add each element to sum
        }

        return sum;
    }

    public static void main(String[] args) {
      
        int[] numbers = {5, 12,22,45,66};


        int total = addArrayValues(numbers);
        System.out.println("The sum of array values is: " + total);
    }
}
