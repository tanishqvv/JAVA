import java.util.*;
class basic{
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println(3+3);
        System.out.println(4*3);
        System.out.println(6/3);
        System.out.println(5/2);
        System.out.println(4%2);
        System.out.println(5-3); //This is comment

        //data types
        String name = "Tanishq";
        int age = 18;
        char firstLetter = 'T';
        boolean isman = true;
        float weight = 42.5f;
        double pi = 3.1475;
        double pi2 = 3.14d;
        short num = 1;
        long num2 = 92233770;
        byte numByte = 100;
        String check = null;

        System.out.println(check);
        System.out.println(numByte);
        System.out.println(num2);
        System.out.println(num);
        System.out.println(name);
        System.out.println(age);
        System.out.println(firstLetter);
        System.out.println(isman);
        System.out.println(weight);
        System.out.println(pi);
        System.out.println(pi2);

        //multiple variables 
        int x = 40, y = 20, z = 30;
        int a , b, c;
        a = b = c = 100;
        System.out.println("sum is " + Integer.valueOf(x+y)); // String to integer convo
        System.out.println(String.valueOf(x)); //int to String conversion
        System.out.println(x+y+z);
        System.out.println(a + b + c);

        /* Non Primitive types
          Strings
          Arrays 
          Classes
          These types can be null.
         */

         //typecasting 
         int cal1  = 9;
         float cal2 = 9.5f;
         System.out.println((float)cal1);
         System.out.println((int)cal2);
         System.out.println(cal1++); //will print 9 but in memory its 10
         System.out.println(--cal1); // will reduce 10 to 9 and print 9
         System.out.println(cal1); //9

         //Strings
         String txt = "bmw";
         System.out.println(txt.toUpperCase());
         System.out.println(txt.toLowerCase());
         System.out.println(txt.indexOf("m"));
         //Numbers and Strings
         String num3 = "10";
         int num4 = 4;
         System.out.println(num3 + num4); //104
         System.out.println(txt.concat(" car"));
         System.out.println("\"Tanishq\"");
         System.out.println(Integer.toString(age) + " your age");
         String num5 = Integer.toString(age);
         System.out.println(num5);
         String msg = "Hello";
         System.out.println(msg.length());

         //conditional statements 
         if (age > 18){
            System.out.println("you can vote");
         }
         else if (age > 18){
            System.out.println(" you cant vote");
         }
         else{
            System.out.println("try next year");
         }

         //leap year or not nested if 
         int year = 1900;

         if (year % 100 == 0){
            if (year % 400 == 0 ){
               System.out.println("Leap year");
            }
            else{
               System.out.println("Not a leap year");
            }
         }
         else if (year % 4  == 0){
             System.out.println("Leap year");
         }
         else{
           System.out.println("Not a leap year");
         }

         //ternary operator / shorthand
         int time = 20;
         String result = (time < 18) ? "Good day" : "Good evening";
         System.out.println(result);

         //switch statement
         int day = 2;

         switch(day){
              case 1 : 
              System.out.println("one");
              break;
              case 2 :
              System.out.println("two");
              break;
              default:
              System.out.println("null");
              break;
         }

         // while loop
         int i = 1;
         while(i <=5){
            if (i == 4){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
         }

         //do while loop
         int j = 1;
         do{
            System.out.println(j);
            j++;
         } while( j <= 3);

         //for loop
         for(int k = 1; k <= 4; k++){
            if (k == 3){
                break;
            }
            System.out.println(k);
         }

         //nested for loop  
         for(int r = 1; r <=3; r++){
            for (int col = 1; col <=r; col++){
                System.out.print("#");
            }
            System.out.println();
         }

         //nested while loop pyramid 
         int l = 1;
         while( l <= 3){
           int m = 1;
           while(m <=l){
                   System.out.print("#");
                   m++;
           }
           System.out.println();
           l++;
         }

         //Arrays
         String[] cars = new String[3];
         cars[0] = "bmw";
         cars[1] = "mercedes";
         cars[2] = "tesla";
         //Looping through arrays
         for(int p = 0 ; p  < cars.length; p++){
               System.out.println(cars[p]);
         }
         
          int[] toys = {5,2,3};
          Arrays.sort(toys);
          for(int u = 0; u < toys.length; u++){
            System.out.println(toys[u]);
          }


         //multi dimensional arrays
         int[][] bikes = {{1,2,3},{4,5}};
         bikes[1][0] = 9;
         System.out.println(bikes[1][0]);
    }

}

