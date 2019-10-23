package com.kyleanderson;

//Challenge:
// In the following interface declaration, what is the visibility of:
//
//1. the Accessible interface: package private
//2. the int variable SOME_CONSTANT: public
//3. methodA?: standard public
//4. methodB and methodC?: public, all interface methods ARE AUTOMATICALLY PUBLIC
// **** It is not possible to have anything except public methods in an interface
// ** Lack of an axis modifier means the default of package private, except with interface methods and variables, which default to public**
//Hint: think back to the lecture on interfaces before answering

interface Accessible {
    int SOME_CONSTANT = 100;
    public void methodA();
    void mtheodB();
    boolean methodC();
}
