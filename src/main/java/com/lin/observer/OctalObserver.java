package com.lin.observer;

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( subject.getState()+"Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}
