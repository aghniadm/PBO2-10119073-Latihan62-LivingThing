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

public class PBO210119073Latihan62LivingThing {

    public static void main(String[] args) {
        Human human = new Human();
        
        human.setNama("Aghnia Dewi Mahiranie");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
    
}
