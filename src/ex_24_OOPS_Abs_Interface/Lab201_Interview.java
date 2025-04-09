package ex_24_OOPS_Abs_Interface;

public class Lab201_Interview {
}
interface I11{}
interface I12{}

class A1{}
class B1{}

abstract class Promod{}
class Test1 extends A1{}
//class Test2 extends B1,A1{}//Multiple Inheritence by classes is not possible


class Test3 implements I11{}
class Test4 implements I11,I12{}
class Test5 extends A1 implements I11,I12{}
//class Test6 implements I11 extends A1{}

//interface I3 extends A1{}
interface I3{}