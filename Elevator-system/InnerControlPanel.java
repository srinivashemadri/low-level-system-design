
import java.util.ArrayList;
import java.util.List;

public class InnerControlPanel{
    private List<Integer> destFloor;
    private Elevator elevator;
    private boolean isDoorOpen;

    public InnerControlPanel(Elevator elevator){
        this.elevator = elevator;
        this.destFloor = new ArrayList<>();
        this.isDoorOpen = false;
    }

    public void pressSOS(){
        System.err.println("Emergency button pressed for " + elevator.getId());
    }

    public void closeDoor(){
        if(isDoorOpen == true){
            System.out.println("Closing door for elevator "+ elevator.getId());
        }
    }

    public void openDoor(){
        if(isDoorOpen == false && elevator.getDirection() == Direction.IDLE){
            System.out.println("Opening door for elevator "+ elevator.getId());
        }
    }

    public List<Integer> getDestFloor() {
        return destFloor;
    }

    public void setDestFloor(List<Integer> destFloor) {
        this.destFloor = destFloor;
    }

    public Elevator getElevator() {
        return elevator;
    }

    public void setElevator(Elevator elevator) {
        this.elevator = elevator;
    }

    public boolean isIsDoorOpen() {
        return isDoorOpen;
    }

    public void setIsDoorOpen(boolean isDoorOpen) {
        this.isDoorOpen = isDoorOpen;
    }
    
}