# 作業1想法

首先先設計一個Abstract Class BeverageMaker，當作所有Maker的父類別 其中prepare步驟設定為final 使其他程式不得改寫
再設計CoffeeMaker跟TeaMaker，繼承BeverageMaker，實作BeverageMaker裡面的抽象方法。
為了能夠讓使用者加多少糖加多少冰，設計出IceType跟TeaType，然後再裡面寫出add function。

使用方式
若是要新增飲料機 就把該類別拿去繼承BeverageMaker，並實作裡面的方法。
然後可以依照自己想喝什麼飲料 冰塊 甜度進行調整。
最後再套prepare進行製作。