public class WhileTest02 {
    public static void main(String[] args) {
        int count = 0;

        while (true) {
            System.out.println("Count is: " + count);
            count++;

            // Break the loop when count reaches 5
            if (count == 5) {
                break;
            }
        }

        System.out.println("Loop exited.");
    }
}