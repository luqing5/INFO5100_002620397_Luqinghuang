package exercises.exercise3b;

import java.io.Serializable;

public class Square extends Rectangle implements Serializable {
    public Square(double sideLength){
        super(sideLength,sideLength);
    }
    
}
