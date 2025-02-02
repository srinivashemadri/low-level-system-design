
import java.util.UUID;


public class Elevator{

    private final String id;
    private int currFloor;
    private Direction direction;
    private InnerControlPanel innerControlPanel;

    public Elevator(){
        
        this.id = UUID.randomUUID().toString();
        this.currFloor = 0;
        this.direction = Direction.IDLE;

        System.out.println("Elevator with id: "+ this.id + " created ");

    }

    public int getCurrFloor() {
        return currFloor;
    }

    public void setCurrFloor(int currFloor) {
        this.currFloor = currFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public InnerControlPanel getInnerControlPanel() {
        return innerControlPanel;
    }

    public void setInnerControlPanel(InnerControlPanel innerControlPanel) {
        this.innerControlPanel = innerControlPanel;
    }

    public String getId() {
        return id;
    }
}