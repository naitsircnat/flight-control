package FlightControl;
import java.util.Scanner;
import FlightControl.logic.FlightControl;
import FlightControl.ui.TextInterface;


public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        FlightControl flightControl=new FlightControl();                
        
        TextInterface textInterface=new TextInterface(scanner, flightControl);
        
        textInterface.airportAssetControl();
        
        textInterface.flightControl();       
    }
}
