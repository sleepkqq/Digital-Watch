import java.util.Scanner;

public class codewars {

    public static String countOfZeros(int type){
        if(type <= 9){
            return "0" + String.valueOf(type);
        } else if(type == 0){
            return "00";
        } else {
            return String.valueOf(type);
        }
    }

    public static String makeReadable(int seconds) {
        int hours = seconds / 3600;
        int minutes = seconds / 60;
        if(minutes > 59){
            minutes = minutes - (60 * ( minutes / 60));
        }
        int sec = seconds - (hours * 3600) - (minutes * 60);

        if(hours > 23){
            hours = hours - (24 * (hours / 24));
        }

        return countOfZeros(hours)+ ":" + countOfZeros(minutes) + ":" + countOfZeros(sec);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        System.out.println(makeReadable(seconds));
    }
}
