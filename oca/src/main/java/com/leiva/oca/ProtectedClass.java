package com.leiva.oca;

public class ProtectedClass {

}

/**
 *
 * why a class cannot be defined as protected?
 *
 * Because it makes no sense.
 *
 * Protected class member (method or variable) is just like package-private
 * (default visibility), except that it also can be accessed from subclasses.
 * Since there's no such concept as 'subpackage' or 'package-inheritance' in
 * Java, declaring class protected or package-private would be the same thing.
 *
 * You can declare nested and inner classes as protected or private, though.
 */
//protected class MyProtectedClass{
//}
