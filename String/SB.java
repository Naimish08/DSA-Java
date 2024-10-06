package String;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        //String builder is mutiable, we can modify the value of string without
        //creating a new object
        builder.append("Naimish");
        System.out.println("StringBuilder: "+builder.toString());
        //Methods:-
        //https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
    }
}
