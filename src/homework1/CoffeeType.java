package homework1;

public enum CoffeeType {
    ICEAMERICANO, HOTAMERICANO, ICELATTE, HOTLATTE;
    public void addMilk(){
        switch (this){
            case ICELATTE:
            case HOTLATTE:
                System.out.println("加牛奶");
                break;
        }
    }

    public void addIce(IceType type){
        switch(this){
            case ICELATTE:
            case ICEAMERICANO:
                type.add();
                break;
        }
    }
}
