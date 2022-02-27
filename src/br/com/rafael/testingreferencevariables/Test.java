package exercises.testingreferencevariables;

public class Test {
    public static void main(String[] args) {
        Obj obj1 = new Obj();
        obj1.value = 1000;
        change(obj1);
//      'object' passes to point to the same memory address 'obj1' already points to.
//       Then, reassigning 'object' inside the method does not affect 'obj1'.
        System.out.println(obj1.value);
//      Conclusions: you cannot change an object's reference passing into a method!
    }

    private static void change(Obj object) {
        Obj newObj = new Obj();
        newObj.value = 100;
        object = newObj;
    }
}
