package FlightControl.domain;

import java.util.Objects;

public class Airplane {
    private String id;
    private int capacity;
    
    public Airplane(String id, int capacity){
        this.id=id;
        this.capacity=capacity;
    }

    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }
            
    public String toString(){
        return id + " ("  + capacity + " capacity)";
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
        final Airplane other = (Airplane) obj;
        if (this.capacity != other.capacity) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }            
}
