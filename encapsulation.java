/*Encapsulation
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. 
To achieve this, you must:
declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable*/


class Person {
    private String name;

    //getter
    public String getName(){
        return name;
    }

    //setter
    public void setName(String newName){
        this.name = newName;
    }
}

public class encapsulation{
    public static void main(String[] args){
        Person myObj = new Person();
        myObj.setName("Tanishq");
        System.out.println(myObj.getName());

    } 
}
/*
 Why Encapsulation?
Better control of class attributes and methods
Class attributes can be made read-only (if you only use the get method), 
or write-only (if you only use the set method)
Flexible: the programmer can change one part of the code without affecting other parts
Increased security of data
 */