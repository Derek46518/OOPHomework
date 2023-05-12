package homework3;

public class TestRemote {

    public static void main(String[] args) {

        Remote r = new Remote();
        //在此假設第零個按鈕是綁定電視
        r.buttonClicked(0); // 按下第零個按鈕
        r.buttonClicked(0); // 按下第零個按鈕(第二次)
        r.buttonClicked(0); // 按下第零個按鈕(第三次)
        r.buttonClicked(3);
        r.buttonClicked(2);
        r.pressAllButtons();
        r.pressAllButtons();

    }
}