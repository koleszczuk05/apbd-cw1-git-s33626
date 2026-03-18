public class StatisticHelper {
    public static double calcAvg(int[] numbers){
        double sum = 0;
        for(int number:numbers){
            sum += number;
        }
        if(numbers.length != 0){
            return sum / numbers.length;
        }
        else{
            System.out.println("there is no numbers to calculate average");
            return 0;
        }
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
