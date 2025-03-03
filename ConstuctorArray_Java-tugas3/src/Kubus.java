class Kubus {
    int sisi;
    double volume;

    Kubus () {

    }
    Kubus (int sisi){
        this.sisi = sisi;
    }
    public void setSisi(int sisiBaru) {
        this.sisi = sisiBaru;
    }
    public void computeAndSetVolume() {
        this.volume = sisi * sisi * sisi;
    }
    public double getVolume() {
        return volume;
    }
}
