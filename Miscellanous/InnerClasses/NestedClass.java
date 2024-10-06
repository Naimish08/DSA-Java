package Miscellanous.InnerClasses;
public class NestedClass {

    public void print(){
        System.out.println("Printing from outer class");
        //so this class is only accessable in this print() method only
        class InnerClass2{
            String name = "Naimish";
            void stringprint(){
                System.out.println(name);
            }
        }
    }
   void newprint(){
       InnerClass newobj = new InnerClass();
       newobj.innerprint();
       //private stuff in inner class can be used in outer class
   }
    class InnerClass{
        private int x=5;
        public void innerprint(){
            System.out.println("Printing from the inner class");
        }
    }
}
