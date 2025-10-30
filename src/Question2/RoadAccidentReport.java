/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author lab_services_student
 */
public class RoadAccidentReport extends RoadAccidents {

    public RoadAccidentReport(String accidentVehicleType, String city, int accidentTotal) {
        super(accidentVehicleType, city, accidentTotal);
    }
    
    public void printAccidentreport(){
        
        System.out.println("\nVehicle Accident Report");
        System.out.println("*************************************************************");
        System.out.println("Vehicle Type: " + this.getAccidentVehicleType());
        System.out.println("City: " + this.getCity());
        System.out.println("Number of accidents" + this.getAccidentTotal());
        System.out.println("*************************************************************");
    }
    
}
