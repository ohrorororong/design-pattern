package creational_patterns.builder.after;

public class App {
    public static void main(String[] args) {
        TourPlanBuilder builder = new DefaultTourBuilder();
        TourPlan plan = builder.title("123")
                .nightsAndDays(1, 3)
                .getPlan();
    }
}
