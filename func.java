public class func{
    // in java functions are known as method

    //static means that the method belongs to the Main class and not an object of the Main class. 
    static void greet(){
       System.out.println("Hello World");
    }

    static void personalGreet(String name, int age){ //parameters
       System.out.println("Hello " + name + " " + String.valueOf(age));
    }

    //With method overloading, multiple methods can have the same name with different parameters:
    static int sum(int x, int y){
        return x + y;
    }

    static double sum(double a,double b){
        return a + b;
    }


    public static void main(String[] args){
        //main function
        greet();
        personalGreet("Tanishq",22); //arguments
        System.out.println(sum(3,4));
        System.out.println(sum(9.0,4.5));
    }
}