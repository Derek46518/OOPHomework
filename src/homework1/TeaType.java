package homework1;

import javax.sql.rowset.CachedRowSet;

public enum TeaType {
    HOTGREENTEA, ICEGREENTEA, ICEMILKTEA, HOTMILKTEA, ICELEMONTEA,HOTLEMONTEA,ICEMACHA,HOTMACHA;

    public void getType(){
        switch (this){
            case HOTGREENTEA:
            case ICEGREENTEA:
                System.out.print("綠茶葉");
                break;
            case ICELEMONTEA:
            case HOTLEMONTEA:
            case ICEMILKTEA:
            case HOTMILKTEA:
                System.out.print("紅茶葉");
                break;
            case ICEMACHA:
            case HOTMACHA:
                System.out.print("抹茶粉");
                break;
        }
    }

    public void addIce(IceType iceType) {
        switch(this){
            case ICEMACHA:
            case ICEMILKTEA:
            case ICEGREENTEA:
            case ICELEMONTEA:
                iceType.add();
                break;
        }
    }

    public void addLemon(){
        switch (this){
            case ICELEMONTEA:
            case HOTLEMONTEA:
                System.out.println("加檸檬");
                break;
        }
    }
    public void addMilk(){
        switch (this){
            case HOTMILKTEA:
            case ICEMILKTEA:
                System.out.println("加冰牛奶");
                break;
        }

    }
}
