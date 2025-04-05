public class ArrayTest02 {
    public static void main(String[] args) {
        // 고정 크기 배열 선언 및 초기화
        int[] numbers = new int[5];

        // 배열 요소 설정
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // 배열 요소 출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

    }
}