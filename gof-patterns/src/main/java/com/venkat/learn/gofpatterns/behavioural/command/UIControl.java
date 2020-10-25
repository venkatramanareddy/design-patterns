package com.venkat.learn.gofpatterns.behavioural.command;

public class UIControl extends Invoker {
    String DisplayName = null;
    public void Render(){
        System.out.println("Rendering default UI Control");
    }
}
