package homework2;

import java.util.ArrayList;

public class Test {
   public static void main(String[] args){
       MyUtility utility = new MyUtility();
       Dog[] dogs = new Dog[]{new Dog("Buddy",500,1000), new Dog("Charlie",200,400), new Dog("Max",300, 20),new Dog("FOOK",300,50)};
       utility.sort(dogs);

       System.out.println("================");
       for(Dog dog : dogs){
           System.out.println(dog.getName());
       }
   }
}
