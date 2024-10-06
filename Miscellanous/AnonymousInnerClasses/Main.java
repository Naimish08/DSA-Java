package Miscellanous.AnonymousInnerClasses;
public class Main {
    public static void main(String[] args) {
        //here we made an Anonymous Inner class which we can only make once and we can use it
        //as same as the any other class defn
        NestedAnonymousClass obj = new NestedAnonymousClass(){
            void print(){
                System.out.println("This will Override the print statement above");
            }
        };
    }
}
