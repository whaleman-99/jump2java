import java.util.ArrayList;
import java.util.Arrays;

public class Q_04_05 {
    public static void main(String[] args) {
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int sum=0;
        for(int mark: marks) {
            sum+=mark;
        }
        int avg = sum/marks.length;
        System.out.println(avg);
    }
}
