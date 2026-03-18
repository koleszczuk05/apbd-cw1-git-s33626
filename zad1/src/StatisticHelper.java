public class StatisticHelper {
    public static double CalculateAverage(int[] numbers){
        if (numbers.length == 0){
            System.out.println("there is no numbers to calculate average");
            return 0;
        }
        double sum = 0.0;
        for (int num:numbers){
            sum += num;
        }
        return sum / numbers.length;
    }
    public static double calcMedian(int[] numbers){
        if(numbers.length != 0){
            java.util.Arrays.sort(numbers);
            if(numbers.length % 2 == 0){
                return (double)(numbers[numbers.length/2 - 1] + numbers[numbers.length / 2]) / 2;
            }
            else{
                return numbers[numbers.length/2];
            }
        }
        System.out.println("there is no median because there are no elements");
        return 0;
    }
}
