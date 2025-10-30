/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Question2;
import java.util.*;
/**
 *
 * @author lab_services_student
 */
public class RunApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the accident vehicle type: ");
        String vType = sc.nextLine();
        
        System.out.println("\nEnter the city for the accidemt: ");
        String city = sc.nextLine();
        
        System.out.println("Enter the total " + vType + "accidents for " + city + ": ");
        
        int accidents = sc.nextInt();
        
        RoadAccidentReport rar = new RoadAccidentReport(vType, city, accidents);
        
        rar.printAccidentreport();
    }
    
}
