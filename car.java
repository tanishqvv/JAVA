public class car {

    String model;
    int age;

    public car(String model , int age){
        this.model = model;
        this.age = age; //this is used to refer model field of car 
    }
    public void fullThrottle(){
        System.out.println("Car is going as fast as it can");
    }

    public int speed(int speed){
        return speed;
    }

    public void greet(){
        System.out.println("hello " + model + " ur age is " + String.valueOf(age));
    }
    public static void main(String[] args){
      car toyota = new car("Land cruiser",2);

      toyota.fullThrottle();
      System.out.println(toyota.speed(120));

      toyota.greet();
    }
}
