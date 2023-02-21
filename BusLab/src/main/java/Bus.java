import java.util.ArrayList;

public class Bus {
    private String destination;
    private Integer capacity;
    private ArrayList<Person> passengerList;

    public Bus(String destination, Integer capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengerList = new ArrayList<>();
    }

    public int getPassengerCount(){
        return this.passengerList.size();
    }

    public void addPassenger(Person person) {
        if (checkBusHasSpace()) {
            this.passengerList.add(person);
        }
    }

    public Boolean checkBusHasSpace(){
        if (getPassengerCount() < this.capacity){
            return true;
        } else {
            return false;
        }
    }

    public void removePassenger() {
        this.passengerList.remove(0);
    }
}
