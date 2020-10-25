package com.venkat.learn.gofpatterns.behavioural.command;

public class Invoker {
    ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }
    public void executeCommand() {
        if(command != null){
            command.Execute();
        }
    }
}
