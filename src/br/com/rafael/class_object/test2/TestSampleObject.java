package br.com.rafael.class_object.test2;

public class TestSampleObject {
    public static void main(String []args) {
        SampleObject obj = new SampleObject(7, "a string is a chain of characters");
        try {
            System.out.println(obj.getClass().getField("string"));
            System.out.println(obj.getClass().getName());
            System.out.println(obj.getClass()); //Class object.
        } catch(NoSuchFieldException nsfe) {
            System.out.println("Field not found");
        }
    }
}
