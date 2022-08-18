public class Main {
    public static void main(String[] args) {
        // 1

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j = 0; j < arr.length; j++ ){
            sum += arr[j];
        }
        System.out.println(sum);


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}