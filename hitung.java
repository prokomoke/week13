package lingkaran;

public class hitung {
    public static void main (String []args){

        circle hitung = new circle (7);
        System.out.println("Diameter : "+ hitung.getDiameter());

        hitung.setDiameter(20);
        System.out.println("Diameter : " + hitung.getDiameter());
        System.out.println("Luas : " + hitung.getLuas());
    }
    
}
