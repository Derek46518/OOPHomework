# 作業3 

## 想法
既然無法改變本來給的三個類別，不如就設計一個介面，去與這些基於三個類別的物件進行互動。<br>
首先先設計出一個`Interface`，名稱為`Device`，並基於`Device`設計出各種`Control Class`。<br>
對於每種裝置都設計出一個`Control`，像是`LightControl`。<br>
最後再`Remote`中新增一個Device陣列，用來儲存各種`Control`
## 使用方式
若是要改變順序，就直接在`Remote`類別中設定<br>
若是新增一個裝置，需要設計出一個新的`Control`，並且該類別必須要實作`Device`，並且將該`Control`
放進`Remote`裡面的`Buttons`。亦或者是透過`addButton(Device device, int n)`增加按鈕。
