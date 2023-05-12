# 作業4

## 想法
為了達到題目要求，使用`Ingredients`當作所有類別的父類別，裡面有`Ingredients ingredients` 以及 `int cost`，
用來紀錄之前放了什麼奇奇怪怪的原料以及總價。定義`getIngredient`，用來顯示材料，以及`showCost`，用來顯示價格<br>
然後新增的類別，像是`Milk`和`GreenTea`，都去繼承Ingredients，然後在建構子定cost為該材料之定價。若是在建構子中代入Ingredient，
也就是之前有放材料，則基於之前放的再加上該材料之定價。<br>
子類別會改寫getIngredient()，改寫方式為，先去呼叫`super.getIngredient()`，也就是寫在Ingredients中的`ingredients.getIngredient()`，
再去印出自己的東西。
## 使用方式
若是要做飲料，則逐一加上材料 譬如
```java=
    Ingredients in = new Milk(); // 加牛奶
    in = new BlackTea(in); // 基於牛奶加入紅茶
    in = new Peral(in); // 基於紅茶牛奶加入珍珠
    in.getIngredient(); // 印出加入的材料
    in.showCost(); // 印出價格
```
這樣就做出珍珠奶茶了<br>
若是要增加材料，則該類別除了繼承Ingredients外，另外記得給他兩個建構子，一個全空，一個可以代`Ingredients`物件進去。<br>
還要記得改寫`getIngredient()`。