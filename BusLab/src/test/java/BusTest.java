import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("South Bridge", 2);
        person = new Person();
    }

    @Test
    public void can_count_total_passegers(){
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void can_add_passenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengerCount());
        assertEquals(Person.class, person.getClass());
    }

    @Test
    public void check_bus_has_space(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(2, bus.getPassengerCount());
        assertEquals(Person.class, person.getClass());
    }

    @Test
    public void can_remove_passenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(1, bus.getPassengerCount());
        assertEquals(Person.class, person.getClass());
    }


}
