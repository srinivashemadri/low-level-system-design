
import java.util.List;

public class ElevatorSystem{
    
    private static ElevatorSystem instance;
    private List<Elevator> elevators;

    private ElevatorSystem(){
    }

    public static ElevatorSystem getElevatorSystem(){
        if(instance == null){
            return new ElevatorSystem();
        }

        return instance;
    }

    public List<Elevator> getElevators() {
        return elevators;
    }

    public void setElevators(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    public void assignElevator(int from, int to){
        System.out.println("Assigning a lift from: "+ from + " to "+ to);
        //todo: implement
    }

    
}