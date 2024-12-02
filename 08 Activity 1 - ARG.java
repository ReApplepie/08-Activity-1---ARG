#1
public interface Carnivore {
    int pieces = 10; 

    public static void eatGrass(); 

    public default int chew() { // Changed and added Default 
        return 13;
    }
}

#2
interface HasWings {
    public int getNumberOfWings(); 

abstract class Insect implements HasWings {
    abstract int getNumberOfLegs(); 
}

public class Dragonfly extends Insect {
    @Override
    public int getNumberOfLegs() {
        return 6; 
    }

    @Override
    public int getNumberOfWings() {
        return 4; // added getNumberofWings for the HasWings interface
    }
}
