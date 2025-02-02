
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/** need to create a racing game in which 1000 bikes will be participating, 
 * Bike can be of following types
 * TVS - black body with red tyres
 * Suzuki - red body with yellow tyres
 * BMW - white body with green tyres **/

interface Vehicle{
    public void draw();
}

class BikeType{
    String bodyColor;
    String tyreColor;
    String brandName;

    public BikeType(String brandName, String tyreColor, String bodyColor){
        this.bodyColor = bodyColor;
        this.brandName = brandName;
        this.tyreColor = tyreColor;
    }
}

class Bike {
    private double xPos;
    private double yPos;
    private final BikeType bikeType;

    public Bike(BikeType bikeType){
        this.xPos = 0;
        this.yPos = 0;
        this.bikeType = bikeType;
    }

    public double getxPos() {
        return xPos;
    }

    public void setxPos(double xPos) {
        this.xPos = xPos;
    }

    public double getyPos() {
        return yPos;
    }

    public void setyPos(double yPos) {
        this.yPos = yPos;
    }

    public BikeType getBikeType() {
        return bikeType;
    }


}

class RacingFactory{
    private static RacingFactory instance;

    private List<Bike> listOfBikes;
    private HashMap<String, BikeType> factoryMap;

    private RacingFactory(){
        this.listOfBikes = new ArrayList<>();
        this.factoryMap = new HashMap<>();
    }

    public static RacingFactory getInstance(){
        if(instance == null){
            return new RacingFactory();
        }
        return instance;
    }

    private String generateKey(String bodyColor, String tyreColor, String brandName){
        return bodyColor+"_"+tyreColor+"_"+brandName;
    }

    public void addBike(double x, double y, String bodyColor, String tyreColor, String brandName){
        String key = generateKey(bodyColor, tyreColor, brandName);

        if(!factoryMap.containsKey(key)){
            BikeType bikeType = new BikeType(brandName, tyreColor, bodyColor);

            factoryMap.put(key, bikeType);
        }
        
        BikeType bikeType = factoryMap.get(key);

        Bike bike = new Bike(bikeType);
        bike.setxPos(x);
        bike.setyPos(y);

        listOfBikes.add(bike);
    }

    public List<Bike> getListOfBikes() {
        return listOfBikes;
    }

    public void setListOfBikes(List<Bike> listOfBikes) {
        this.listOfBikes = listOfBikes;
    }

}

public class FlyweightDesignPattern{
    public static void main(String[] args) {
        
        RacingFactory racingFactory = RacingFactory.getInstance();

        for(int i=0;i<1000;i++){
            double x = Math.random()*100;
            double y = Math.random()*100;

            if(i%3 == 0){
                racingFactory.addBike(x, y, "BLACK", "RED", "TVS");
            }
            else if(i%3 == 1){
                racingFactory.addBike(x, y, "RED", "YELLOW", "SUZUKI");
            }
            else if(i%3 == 2){
                racingFactory.addBike(x, y, "WHITE", "GREEN", "BMW");
            }
        }

        List<Bike> bikesList = racingFactory.getListOfBikes();

        if(bikesList.get(3).getBikeType().equals(bikesList.get(6).getBikeType()) ){
            System.out.println("TVS bikes are same");
        }
        if(bikesList.get(1).getBikeType().equals(bikesList.get(13).getBikeType())){
            System.out.println("SUZUKI bikes are same");
        }
        if(bikesList.get(17).getBikeType().equals(bikesList.get(302).getBikeType())){
            System.out.println("BMW bikes are same");
        }
    }
}