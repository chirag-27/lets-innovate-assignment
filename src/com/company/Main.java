package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
    //we can integrate an app which can give realtime Air quality index such as accuweather but for time being we are just taking a user input variable
    Scanner scan = new Scanner(System.in);
    double aqi = scan.nextDouble();
    //int time = scan.nextInt();
    AirPurifier airpurifier = new AirPurifier();
    if(aqi <= 50){
        System.out.println("All good carry on with your normal routine");
    }else if(aqi >50 && aqi<=100){
        System.out.println("Tend to avoid physically draining activities");
    }else{
        System.out.println("Please stay indoors with good ventilation");
        airpurifier.switchOn(true);
    }
    }
}
