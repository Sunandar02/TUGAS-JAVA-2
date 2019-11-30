/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan11;

/**
 *
 * @author prima
 */
public class Latihan11 {
 protected String name;
 protected String address;
 /**
 * Default constructor
 */
 public Latihan11(){
 System.out.println("Inside Person:Constructor");
 name = "";
 address = "";
 }
 /**
 * Constructor dengan dua parameter
 */
 public Latihan11( String name, String address) {
 this.name = name;
 this.address = address;
 }
 /**

 * Method accessor
 */
 public String getName() { 
 return name;
 }
 public String getAddress() {
 return address;
 }
 public void setName(String name) {
 this.name = name;
 }
 public void setAddress(String add) {
 this.address = add;
 }
 }
 public class Student extends Person{
 public Student()
 {
 //super( "SomeName", "SomeAddress");
 //super();
 //super.name = "name";
 System.out.println("Inside Student:Constructor");
 }
 public static void main( String[] args) {
 Student anna = new Student();
 }
 }
