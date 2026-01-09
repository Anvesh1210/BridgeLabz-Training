package com.medistoreapplication;

//interface used in sub classes
public interface ISellable {
    void sell(int units);
    boolean checkExpiry();
}

