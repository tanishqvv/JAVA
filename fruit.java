public class fruit{
    String color = "red"; // color is attribute over here
    int count = 3; //similarly y is also attribute
    // If you don't want the ability to override existing values, declare the attribute as final
     final int key = 99;

     int box; //class attribute

    static void myStaticMethod(){
      System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod(){
      System.out.println("Public methods must be called by creating objects");
    }

    // constructor 
     //A constructor in Java is a special method that is used to initialize objects. 
     //The constructor is called when an object of a class is created.
     // It can be used to set initial values for object attributes
    public fruit(){
      box = 4;
    }
    public fruit(int y){
      count = y;
    }

  public static void main(String[] args){
      fruit myObj = new fruit();
      fruit apple = new fruit();
      //modify attributes 
      apple.count = 5;
      
      System.out.println(myObj.color); //red
      System.out.println(myObj.count); //3
      System.out.println(apple.color); //red
      System.out.println(apple.count); //5
      System.out.println(apple.key);//99

      myStaticMethod();
      //myPublicMethod(); this will cause error
      apple.myPublicMethod(); // this is correct

      System.out.println(apple.box); // 4
      fruit strawberry = new fruit(5);
      System.out.println(strawberry.count); //5

      
  }
}
