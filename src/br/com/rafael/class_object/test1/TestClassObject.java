package br.com.rafael.class_object.test1;

//Testing and overriding .toString() and .equals(), methods from class Object

import java.util.Objects;

public final class TestClassObject /*extends Object*/ implements Cloneable {
    private final String string;

    public TestClassObject(String string){
        this.string = string;
    }

    public String getString(){return this.string;}

    @Override //from class Object inherited automatically
    public String toString(){ //If not overridden, it would provide the memory address of the object
        return "string: " + this.string;
    }

    @Override //from class Object inherited automatically
    public boolean equals(Object toCompare){
        if (!(toCompare instanceof TestClassObject casted)) return false; //If toCompare is null the line above will catch it also!
        return casted.getString().equals(this.string);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.string);
//      According to wikipedia, a hash function is
//          "any function that can be used to map data of arbitrary size to
//          fixed-size values. The values returned by a hash function are called hash values, hash codes, digests, or
//          simply hashes. The values are usually used to index a fixed-size table called a hash table. Use of a hash
//          function to index a hash table is called hashing or scatter storage addressing."
    }

    /**
     * How to make an implementation of the clone method?
     * There goes an example of that.
     * @return a clone of the object calling this method
     * @throws CloneNotSupportedException if clone is not possible due some constraint
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //All values are copied.
    }
}
