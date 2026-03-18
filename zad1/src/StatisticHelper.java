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
}
