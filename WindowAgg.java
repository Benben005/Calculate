import java.util.ArrayList;
import java.util.List;

public class WindowAggregation {
    private List<Double> windowData;
    private int windowSize;

    public WindowAggregation(int size) {
        windowData = new ArrayList<>();
        windowSize = size;
    }

    public void addData(double data) {
        windowData.add(data);

        if (windowData.size() > windowSize) {
            windowData.remove(0);
        }
    }

    public double calculateSum() {
        double sum = 0;
        for (double data : windowData) {
            sum += data;
        }
        return sum;
    }

    public double calculateAverage() {
        double sum = calculateSum();
        return sum / windowData.size();
    }

    public static void main(String[] args) {
        WindowAggregation windowAggregation = new WindowAggregation(5);

        windowAggregation.addData(10);
        windowAggregation.addData(20);
        windowAggregation.addData(30);
        windowAggregation.addData(40);
        windowAggregation.addData(50);

        double sum = windowAggregation.calculateSum();
        double average = windowAggregation.calculateAverage();

        System.out.println("Window Sum: " + sum);
        System.out.println("Window Average: " + average);
    }
}
