package com.leiva.oca.ch2;

/**
 * Following are some important points for method overriding and static methods
 * in Java.<br>
 *
 * 1) For class (or static) methods, the method according to the type of
 * reference is called, not according to the abject being referred, which means
 * method call is decided at compile time.<br>
 *
 * 2) For instance (or non-static) methods, the method is called according to
 * the type of object being referred, not according to the type of reference,
 * which means method calls is decided at run time.<br>
 *
 * 3) An instance method cannot override a static method, and a static method
 * cannot hide an instance method. For example, the following program has two
 * compiler errors.<br>
 *
 * 4) In a subclass (or Derived Class), we can overload the methods inherited
 * from the superclass. Such overloaded methods neither hide nor override the
 * superclass methods — they are new methods, unique to the subclass.
 *
 */
public class Derived extends Base {

    /**
     * call to super must be first statement in constructor
     */
    public Derived() {
        super(null);
        System.out.println("before super");
    }

    // This method hides display() in Base 
    public static void display() {
        System.out.println("Static or class method from Derived");
    }

    // This method overrides print() in Base 
    @Override
    public void print() {
        System.out.println("Non-static or Instance method from Derived");
        super.print();
    }

    public static void main(String[] args) {
        Base obj1 = new Derived();

        // As per overriding rules this should call to class Derive's static 
        // overridden method. Since static method can not be overridden, it 
        // calls Base's display() 
        obj1.display();

        // Here overriding works and Derive's print() is called 
        obj1.print();
    }

    public static void foo() {
        System.out.println("Test.foo() called ");
    }

    public static void foo(int a) {
        System.out.println("Test.foo(int) called ");
    }
    /**
     * We cannot overload two methods in Java if they differ only by static
     * keyword (number of parameters and types of parameters is same).
     */
//    public void foo() {
//    }

}
