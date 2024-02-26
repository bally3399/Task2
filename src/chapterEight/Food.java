package chapterEight;

public class Food {
    public static void main(String[] args) {
        System.out.println("All Food:");

        for(Food1 food : Food1.values()) {
            System.out.printf("%s: Type - %s, Calories - %d\n", food, food.getType(), food.getCalories());
        }
    }

    public enum Food1{
        APPLE("fruit", 25),
        BANANA("fruit", 35),
        CARROT("Vegetable", 45);

        private final String type;
        private final int calories;

        Food1(String type, int calories) {
            this.calories = calories;
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public int getCalories() {
            return calories;
        }
    }
}

