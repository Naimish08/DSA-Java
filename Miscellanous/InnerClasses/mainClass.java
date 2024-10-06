package Miscellanous.InnerClasses;

public class mainClass {
    public static void main(String[] args) {
        NestedClass obj = new NestedClass();
        obj.print();
        obj.newprint();
        /*so we can't directly create a object of inner class it has some syntax known as*/
        NestedClass.InnerClass inner = obj.new InnerClass();
        /*so if we put staic in the inner class then we can directly write it as
        NestedClass.InnerClass inner = new NestedClass.InnerClass();
        so here java detects that Innerclass is a member of Nested class
         */
    }
}
