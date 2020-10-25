package com.venkat.learn.gofpatterns.behavioural.command;

public class UIButton extends UIControl{
    public String DisplayName;
    public UIButton(String name){
        DisplayName = name;
    }
    public void Render(){
        System.out.println("Rendering UIButton: " + DisplayName);
    }

    public void Click() {
        executeCommand();
    }
}
