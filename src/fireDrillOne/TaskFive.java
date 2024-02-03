package fireDrillOne;

public class TaskFive {
    public static void main(String[] args) {
        int counter = 1;
        for (int count = 1; count <= 10; count++) {
            for (int index = 1; index <= 5; index++) {
                if (count % 4 == 0) {
                    counter++;
                    System.out.print("" + count);

                }
            }

        }
    }

}
