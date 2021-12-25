package br.com.rafael.class_object.test1;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
         PrintStream screen = System.out;
         screen.println(null instanceof Object);
         Throwable twb = new Throwable();
         screen.println(twb); //Throwable overrides the method toString() inherited from Object
         PrintStream out = System.out; //System.out refers to an object from class PrintStream.Then, to make it is totally legal
         out.println("Message");
         TestClassObject obj = new TestClassObject("On June 11, 2002, I was born");
         out.println(obj);
         TestClassObject obj2 = new TestClassObject("On June 11, 2002, I was born");
         out.println(obj2);
         out.println("Are those strings equal? " + obj.equals(obj2));
         try {
              TestClassObject clone = (TestClassObject) obj.clone();
              System.out.println("Clone created from " + obj.hashCode());
              System.out.println("Clone hash code: " + clone.hashCode());
              if (clone.equals(obj))
                   System.out.println("Cloned and clone objects are equal");
              else
                   System.out.println("Cloned and clone objects are different");
         } catch(CloneNotSupportedException exception) {
              System.out.println("Clone not supported");
         }
         System.exit(-1); // This public static method from class System shuts JVM down and finishes execution
//       Methods equals() and hashTable() should be made in parallel: only equal objects return the same hash code.
//       Objects.hash() to produce a hash code based on some values you have to pass.
    }
}
