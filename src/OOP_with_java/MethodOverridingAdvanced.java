package OOP_with_java;

class ParentA {
    void print() { 
        System.out.println("class A method");
    }
}
class ChildB extends ParentA {
    void print() { 
        System.out.println("class B method");
    }
    void print(boolean parent) {
        super.print();
    }
    void printA() { 
        super.print();
    }
}
public class MethodOverridingAdvanced {
    public static void main(String[] args) { 
        // How to print here "class A method with class B object"
        boolean parent = true;
        ChildB b = new ChildB();

        b.print(parent);
        b.printA();
    }
}
