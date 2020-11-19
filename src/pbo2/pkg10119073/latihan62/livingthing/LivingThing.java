package pbo2.pkg10119073.latihan62.livingthing;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menampilkan teks
 * dengan konsep abstract class
 *
 */

public abstract class LivingThing {
    public abstract void walk(String nama);
    
    public void breath(String nama){
        System.out.println(nama+ " bernapas");
    }
    
    public void eat(String nama){
        System.out.println(nama+ " makan");
    }
}
