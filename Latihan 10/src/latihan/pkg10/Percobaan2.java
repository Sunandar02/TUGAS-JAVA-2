/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg10;

/**
 *
 * @author prima
 */
public class Percobaan2 {
    public static void main( String[] args ){
 //membuat 3 object StudentRecord
 Latihan10 annaRecord = new Latihan10();

 Latihan10 beahRecord = new Latihan10();

 Latihan10 crisRecord = new Latihan10();

 //Memberi nama siswa
 annaRecord.setName("Anna");
 beahRecord.setName("Beah");
 crisRecord.setName("Cris");
 //Menampilkan nama siswa “Anna”
 System.out.println( annaRecord.getName() );
 //Menampilkan jumlah siswa
 System.out.println("Count="+Latihan10.getStudentCount()
 );
    }
}
