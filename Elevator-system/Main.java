
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        Elevator elevator1 = new Elevator();
        Elevator elevator2 = new Elevator();

        List<Elevator> elevatorList = new ArrayList<>();

        elevatorList.add(elevator1);
        elevatorList.add(elevator2);

        ElevatorSystem elevatorSys = ElevatorSystem.getElevatorSystem();
        elevatorSys.setElevators(elevatorList);

    }
}