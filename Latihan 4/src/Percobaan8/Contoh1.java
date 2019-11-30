/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan8;

/**
 *
 * @author prima
 */
public class Contoh1 {
   public static void main( String[] args ){

 String status = "";
 int grade = 80;

 //mendapatkan status pelajar
 status = (grade >= 60)?"Passed":"Fail";
 //print status
 System.out.println( status );
   }
}
