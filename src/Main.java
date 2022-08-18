public class Main {
    public static void main(String[] args) {

//2

        int[] arr = generateRandomArray();
        int min = 300_000_000;
        int max = 1;
        for (int h = 0; h < arr.length; h++) {
            if (arr[h] < min) {
                min = arr[h];
            }
            if (arr[h]>max) {
                max = arr[h];
            }
        }
        System.out.println(min);
        System.out.println(max);


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