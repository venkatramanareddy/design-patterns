package com.venkat.learn.gofpatterns.behavioural.command;

public class UITextBox extends UIControl{
    public String DisplayName;
    public String Content;
    public UITextBox(String name, String content){
        DisplayName = name;
        Content = content;
    }
    public void Render(){
        System.out.println("Rendering UITextBox: " + DisplayName
         + ", with content: " + Content);
    }
}
