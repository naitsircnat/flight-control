package FlightControl.domain;

import java.util.Objects;

public class Flight {
    private Airplane airplane;
    private String departureAirportID;
    private String targetAirportID;
    
    public Flight (Airplane airplane, String departureAirportID, String targetAirportID){
        this.airplane=airplane;
        this.departureAirportID=departureAirportID;
        this.targetAirportID=targetAirportID;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public String getDepartureAirportID() {
        return departureAirportID;
    }

    public String getTargetAirportID() {
        return targetAirportID;
    }
    
    public String toString(){
        return airplane + " (" + departureAirportID + "-" + targetAirportID + ")";
    }             

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Flight other = (Flight) obj;
        if (!Objects.equals(this.departureAirportID, other.departureAirportID)) {
            return false;
        }
        if (!Objects.equals(this.targetAirportID, other.targetAirportID)) {
            return false;
        }
        if (!Objects.equals(this.airplane, other.airplane)) {
            return false;
        }
        return true;
    }

        
}


