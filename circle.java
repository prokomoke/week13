package lingkaran;

class circle {
    private double jari2;
    
    circle (double jari2){
        this.jari2 = jari2;
    }
        
    public void setDiameter (double diameter){
        this.jari2 = diameter/2;
    }

    public double getDiameter (){
        return this.jari2*2;
    }
    
    public double getLuas (){
        return 3.14 * jari2 * jari2;
    }
}
