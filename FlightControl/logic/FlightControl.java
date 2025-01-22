package FlightControl.logic;

import java.util.ArrayList;
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import java.util.HashMap;


public class FlightControl {
    private HashMap<String, Airplane>airplanes;
    private ArrayList<Flight>flights;
    
    public FlightControl(){
        this.airplanes=new HashMap<>();
        this.flights=new ArrayList<>();
    }
    
    public void addAirplane(String id, int capacity){        
        if (!(this.airplanes.keySet().contains(id))){        
            Airplane airplane=new Airplane(id, capacity);
            this.airplanes.put(id, airplane);
        } else {
            System.out.println("This airplane already exists.");
        }
    }    
    
    public void addFlight(String id, String departureAirport, String targetAirport){       
        
        Airplane airplane=getAirplane(id);
        
        Flight flight=new Flight(airplane, departureAirport, targetAirport);
        
        if(!(this.flights.contains(flight))){
            this.flights.add(flight);        
        } else {
            System.out.println("This flight already exists.");
        }                
    }            
    
    public void printAirplanes(){
        this.airplanes.values().stream().forEach(a->System.out.println(a));        
    }
    
    public void printFlights(){
        this.flights.stream().forEach(f->System.out.println(f));
    }
    
    public void printAirplaneDetails(String id){                        
        System.out.println(getAirplane(id));
    }
    
    public Airplane getAirplane(String id){
        return this.airplanes.get(id);
    }
    
}
