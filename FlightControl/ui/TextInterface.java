package FlightControl.ui;
import java.util.Scanner;
import FlightControl.logic.FlightControl;


public class TextInterface {
    private Scanner scanner;
    private FlightControl flightControl;
    
    public TextInterface(Scanner scanner, FlightControl flightControl){
        this.scanner=scanner;
        this.flightControl=flightControl;
    }        
                
    public void airportAssetControl(){        
        while (true) {    
            System.out.println("Airport Asset Control");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print("> ");
            
            String input=scanner.nextLine();
            
            if (input.equals("x")){
                break;
            }
            
            else if (input.equals("1")){
                System.out.print("Give the airplane id: ");
                String id=scanner.nextLine();
                
                System.out.print("Give the airplane capacity: ");
                int capacity=Integer.valueOf(scanner.nextLine());
                
                flightControl.addAirplane(id, capacity);                                
            } else if (input.equals("2")){
                System.out.print("Give the airplane id: ");
                String id=scanner.nextLine();
                
                System.out.print("Give the departure airport id: ");
                String departId=scanner.nextLine();
                
                System.out.print("Give the target airport id: ");
                String targetId=scanner.nextLine();                                
                
                flightControl.addFlight(id, departId, targetId);                                
            }                                        
        }        
    }
    
    public void flightControl(){
        while (true) {
            System.out.println("Flight Control");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");
            
            String input=scanner.nextLine();
            
            if(input.equals("x")){
                break;
            } else if(input.equals("1")){
                flightControl.printAirplanes();
            } else if (input.equals("2")){
                flightControl.printFlights();
                System.out.println("");
            } else if (input.equals("3")){
                System.out.print("Give the airplane id: ");                
                String id=scanner.nextLine();                
                flightControl.printAirplaneDetails(id);
                System.out.println("");
            }
        }
    }    
}
