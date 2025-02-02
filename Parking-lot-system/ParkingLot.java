
import java.util.ArrayList;
import java.util.List;

class ParkingLot{
    private List<Floor> floorList;
    private int maxCapacity;
    private int currentCapacity;

    public ParkingLot(int _maxCap){
        this.floorList = new ArrayList<>();
        this.maxCapacity = _maxCap;
        this.currentCapacity = _maxCap;
    }

    public List<Floor> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<Floor> floorList) {
        this.floorList = floorList;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        if(this.currentCapacity == 0){
            System.err.println("No more capacity");
        }
        else{
            this.currentCapacity = currentCapacity;
        }
    }

    public void assignNearestParking(){
        
    }

}