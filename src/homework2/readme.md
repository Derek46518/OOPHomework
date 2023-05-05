# 作業2想法

首先先設計一個IComparable的interface 裡面規範了function equal跟compareTo
再設計一個Utility class 裡面有兩種sort，一個是Array的 另一個是ArrayList的
兩者都規範只能使用有有實作IComparable的class的陣列 沒有實作則無法套入


使用方式
若是要新增class 讓它可以跑sort，必須將該class實作IComparable 並將equal跟compareTo定義清楚
再將Array(or ArrayList) of 該 class 放進sort裡面 就會排序好了