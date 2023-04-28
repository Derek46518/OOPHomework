package homework2;

public class Dog implements IComparable{
    private String name;
    private int age;
    private int weight;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getWeight(){
       return this.weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public Dog(){
        this.name = null;
        this.age = 0;
        this.weight = 0;
    }

    public Dog(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    @Override
    public int compareTo(Object comparable) {
        if (!(comparable instanceof Dog)) {
            throw new IllegalArgumentException("Object is not of type Dog");
        }
        Dog other = (Dog) comparable;
        if(this.age > other.age){
            return 1;
        }
        else if(this.age < other.age){
            return -1;
        }
        else return this.name.compareTo(other.name);

    }

    @Override
    public boolean equal(Object comparable) {
        if (!(comparable instanceof Dog)) {
            throw new IllegalArgumentException("Object is not of type Dog");
        }
        Dog other = (Dog) comparable;
        if (this.age==other.age) return true;
        else return this.name.equals(other.name);
    }
}
