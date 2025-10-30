/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Question1;
import java.util.*;
/**
 *
 * @author lab_services_student
 */
public class AccidentReport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        String[] city = {"Cape Town", "Johannesburg", "Port Elizabeth"};
        
        int[][] accidents = new int[3][2]; 
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Enter number of car accidents for " + city[i] + ": ");
            accidents[i][0] = sc.nextInt();
            
            System.out.println("Enter the number of motorbike accidents for " + city[i] + ": ");
            accidents[i][1] = sc.nextInt();
            
        }
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("--------------------------------------------------------------------");
        
        System.out.println("\t\t\tCar \t\tMotor Bike");
        
        for (int i = 0; i < accidents.length; i++) {
            
            System.out.println(city[i] + "\t\t" + accidents[i][0]+ "\t\t" + accidents[i][1]);
            
        }
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTAL");
        System.out.println("--------------------------------------------------------------------");
        String highCity = "";
        int high = 0;
        
        for (int i = 0; i < accidents.length; i++) {

            int cityTotal = accidents[i][0] +  accidents[i][1];
            
            System.out.println(city[i] + ": " + cityTotal);
            
            if (cityTotal > high){
                
                highCity = city[i];
                high = cityTotal;
            }
            
            
        }
        
        System.out.println("City with the most vehicle accidents: " + highCity);
        System.out.println("--------------------------------------------------------------------");
    }
    
}
