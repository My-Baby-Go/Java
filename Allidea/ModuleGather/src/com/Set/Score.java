package com.Set;

public class Score {
    String name;
    int chinse;
    int math;

    public Score() {
    }

    public Score(String name, int chinse, int math) {
        this.name = name;
        this.chinse = chinse;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinse() {
        return chinse;
    }

    public void setChinse(int chinse) {
        this.chinse = chinse;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
    //求总分的方法
    public int getSum( )
    {
        return this.chinse+this.math;
    }
}
