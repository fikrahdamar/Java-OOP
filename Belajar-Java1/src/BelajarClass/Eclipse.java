package BelajarClass;

public class Eclipse {
    int minorAxis;
    int mayorAxis;

    public void setMinorMayor(int minorAxis, int mayorAxis){
     this.minorAxis = minorAxis;
     this.mayorAxis = mayorAxis;
    }
 
    public int getMinorAxis(){
     return this.minorAxis;
    }

    public int getMayorAxis(){
        return this.mayorAxis;
    }
 
    public double getLuas(){
     return 3.14 * minorAxis * mayorAxis;
    }
 
    public double getKeliling(){
        return (3.14 * 2) * Math.sqrt(((minorAxis * minorAxis) + (mayorAxis * mayorAxis)) / 2);
    }
}
