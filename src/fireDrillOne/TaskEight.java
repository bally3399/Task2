package fireDrillOne;

public class TaskEight {
    public static void main(String[] args) {
        int multiple = 1;
        int sum = 0;
        for (int count = 1; count <= 10; count++) {
            for (int index =1 ; index <= 5; index++) {
                if (count % 4 == 0) {
                    multiple *= count;
                    sum += multiple;
                   System.out.print(" " +sum);
                }
            }
            if(count % 4 == 0) {
                multiple = 1;
                sum = 0;
            }


        }

    }
}
