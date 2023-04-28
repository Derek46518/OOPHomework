package homework1;

public enum IceType {
    FULL,SEVEN,HALF,THREE,NONE;
    public static void add(IceType type){
        switch(type){
            case FULL:
                System.out.println("加正常冰");
                break;
            case SEVEN:
                System.out.println("加少冰");
                break;
            case HALF:
                System.out.println("加半冰");
                break;
            case THREE:
                System.out.println("加微冰");
                break;
            case NONE:
                System.out.println("去冰");
        }
    }
}
