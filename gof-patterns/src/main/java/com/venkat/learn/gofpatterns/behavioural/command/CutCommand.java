package com.venkat.learn.gofpatterns.behavioural.command;

public class CutCommand implements ICommand {
    @Override
    public void Execute() {
        OSCommand.Cut();
    }
}
