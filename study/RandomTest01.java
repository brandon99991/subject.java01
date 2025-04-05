public class RandomTest01 {
    public static void main(String[] args) {
        // 0.0 이상 1.0 미만의 난수 생성
        double randomValue = Math.random();
        System.out.println("Generated random value: " + randomValue);

        // 0 이상 100 미만의 정수 난수 생성
        int randomInt = (int) (Math.random() * 100);
        System.out.println("Generated random integer between 0 and 99: " + randomInt);

    }
}