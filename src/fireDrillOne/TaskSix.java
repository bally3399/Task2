package fireDrillOne;

public class TaskSix {
    public static void main(String[] args) {
        int multiple = 1;
        int counter = 1;
        for (int count = 1; count <= 10; count++) {
            for (int index =1 ; index <= 5; index++) {
                if (count % 4 == 0) {
                    multiple *= count;
                    System.out.print(" " + multiple);
                }
            }
            multiple = 1;
            counter++;

        }

    }
}
