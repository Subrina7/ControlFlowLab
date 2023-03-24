import java.util.Scanner;

public class Weatherclothes {
    public static void main(String[] args) {

//        BOUNCER PATTERN

        Scanner reader = new Scanner(System.in);
        System.out.println("Please describe the weather (e.g. sunny, rainy, snowy)");
        String weather =reader.nextLine();
        System.out.println("Please enter the temperature in Celcius");
        int temperature = reader.nextInt();

        if(weather.toLowerCase().equals("sunny") && temperature > 8){
            System.out.println("Short sleeves and shorts");
        }
        if(weather.toLowerCase().equals("Sunny") && temperature < 8){
            System.out.println("Sunglasses and a thin coat and a speedo");
        }
    }

}
