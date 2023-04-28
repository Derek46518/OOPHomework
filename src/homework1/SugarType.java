package homework1;

public enum SugarType {
    FULL,SEVEN,HALF,THREE,NONE;
    public void add(){
        switch (this){
            case FULL:
                System.out.println("加全糖");
                break;
            case SEVEN:
                System.out.println("加七分糖");
                break;
            case HALF:
                System.out.println("加七分糖");
                break;
            case THREE:
                System.out.println("加三分糖");
                break;
            case NONE:
                System.out.println("不加糖");
                break;
        }
    }
}
