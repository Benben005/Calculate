public class WindowAggregationTest {
    public static void main(String[] args) {
        WindowAggregation windowAggregation = new WindowAggregation(3);

        // Add data
        windowAggregation.addData(10);
        windowAggregation.addData(20);
        windowAggregation.addData(30);
        windowAggregation.addData(40);

        // cal sum and avg
        double sum = windowAggregation.calculateSum();
        double average = windowAggregation.calculateAverage();

        // output
        System.out.println("Window Sum: " + sum);
        System.out.println("Window Average: " + average);
    }
}
