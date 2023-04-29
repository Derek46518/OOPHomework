package homework2;

import java.util.ArrayList;

public class Test {
   public static void main(String[] args){
       MyUtility utility = new MyUtility();
       ArrayList<Dog> dogArrayList = new ArrayList<>();
       Dog[] dogs = new Dog[]{new Dog("Buddy",500,1000), new Dog("Charlie",200,400), new Dog("Max",300, 20),new Dog("FOOK",300,50)};


       for(int i = 30 ; i >= 0 ; i--){
            dogArrayList.add(new Dog("Fock", i*10, i*5));
       }

       utility.sort(dogArrayList);
       utility.sort(dogs);
       for(Dog g : dogArrayList){
           System.out.println(g.getAge());
       }
       System.out.println("================");
       for(Dog dog : dogs){
           System.out.println(dog.getName());
       }
   }
}
