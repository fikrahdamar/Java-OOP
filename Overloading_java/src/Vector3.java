public class Vector3 {
    private int[] vektor = new int[3];

    public Vector3(int x, int y, int z){
        this.vektor[0] = x;
        this.vektor[1] = y;
        this.vektor[2] = z;
    }

    public Vector3 perkalian(int skalar){
        return new Vector3(vektor[0] * skalar, vektor[1] * skalar, vektor[2] * skalar);
    }

    public int perkalian(Vector3 vektorLain){
        return ((this.vektor[0] * vektorLain.vektor[0]) +
                (this.vektor[1] * vektorLain.vektor[1]) +
                (this.vektor[2] * vektorLain.vektor[2]));
            }
    
    public void display(){
        System.out.println("["+ this.vektor[0] + " " + this.vektor[1] + " "+ this.vektor[2] + "]");
    }
}
