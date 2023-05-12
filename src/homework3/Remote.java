package homework3;

import java.util.ArrayList;

public class Remote {
    Device buttons[] = new Device[]{new TelevisionControl(),new LightControl(),new CurtainControl(),new SoundBoxControl()};
    // Device buttons[] = new Device[5];

    // ArrayList<Device> buttons = new ArrayList<>(20);

    /**
     * 設定按鈕在哪個位置
     * @param device 裝置
     * @param n 位置
     */
    void addDevice(Device device, int n){
        if(n >= buttons.length) return;
        buttons[n] = device;
    }
    /**
     * 當有某個按鈕被按的時候會呼叫這個方法，
     * 必須執行對應的裝置
     * @param buttonId 紀錄哪個button被按
     */
    void buttonClicked(int buttonId) {
        if(buttons[buttonId]==null) return;
        buttons[buttonId].execute();
    }

    /**
     * 直接啟動所有的裝置(意即，每個裝置的按鈕都按一下)
     */
    void pressAllButtons() {
        for ( int i = 0; i < buttons.length; i++ ) {
            buttonClicked(i);
        }
    }
}