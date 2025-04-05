public class ArrayTest01 {
    public static void main(String[] args) {
        // 배열 선언 및 초기화
        int[] numbers = {1, 2, 3, 4, 5};

        // 배열의 길이 출력
        System.out.println("배열의 길이: " + numbers.length);

        // 배열 요소 출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

    }
}