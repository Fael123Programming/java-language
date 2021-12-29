package br.com.rafael.methods;

import java.util.List;
import java.util.ArrayList;

/**
 *    <p>Method is a piece of code that defines a sub-routine able to be called and executed.
 *    It is always defined inside a class and may belong to it (static modifier) or an instance of a class.</p>
 *    <p>The pattern is:
 *    <pre>
 *    &lt;?visibility?&gt; &lt;?type?&gt; &lt;?modifier?&gt; &lt;return&gt; &lt;name&gt;(&lt;?parameter_list?&gt;) &lt;?exceptions?&gt; {
 *      &lt;body&gt;
 *    }
 *    </pre>
 *    </p>
 *    <p>Where "&lt;?...?&gt;" means this definition is up-to-programmer and "&lt;&gt;" is mandatory;</p>
 *    <ul>
 *    <li>Visibility may be: public, protected, package-private (default), private;</li>
 *    <li>Type: concrete or abstract (abstract must belong to an abstract class);</li>
 *    <li>Modifier: static (method of a class) or final (the method cannot have its behavior changed in sub-classes
 *    of the class it belongs to);</li>
 *    <li>Return: data type (primitive type or class type) or void (when there is no return);</li>
 *    <li>Name: Java valid name (camel-case with the first letter in lowercase);</li>
 *    <li>Parameter list: list of couples &lt;data_type&gt; &lt;parameter_name&gt; separated by commas;</li>
 *    <li>Exceptions: names of possible exceptions the method may throw if fitted. These definitions
 *    are preceded by the command/warning "throws" and if they are multiple, they are separated
 *    by commas. This is more a warning of what a method may cause to the runtime;</li>
 *    <li>Body: the execution code or empty.</li>
 *    </ul>
 *    <p>Method signature is a way to identify a method uniquely. It is made of the method name and its parameter
 *    list.</p>
 */

public abstract class SampleClass {
    public String getName() {
        return "A name";
    }

    public double calculateTotalGrade() {
        return Math.random();
    }

    public int checkDistance(int firstCoordinate, int secondCoordinate) {
        return (int) Math.sqrt(Math.pow(firstCoordinate, 2) + Math.pow(secondCoordinate, 2));
    }

    public abstract void execute();

    public void changeManufacturer(Manufacturer manufacturer) {}

    public Report generateAnalyticData(Customer customer) {
        return new Report();
    }

    List<Shopping> shoppingList() {
        return new ArrayList<>();
    }

    public static byte getAByte(byte number){
        return (byte) (Byte.MAX_VALUE - number);
    }

//  Method overload: a same method name being used with a new list of parameters to change behavior.
    public int convertIntoInteger(float number) {
        return (int) number;
    }

    public int convertIntoInteger(double number) {
        return (int) number;
    }

    public int convertIntoInteger(String string) {
        return Integer.parseInt(string);
    }

    public String getBoolText(boolean logicValue) {
        return String.valueOf(logicValue);
    }
}
