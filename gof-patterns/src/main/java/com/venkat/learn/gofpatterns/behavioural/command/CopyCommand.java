package com.venkat.learn.gofpatterns.behavioural.command;

public class CopyCommand implements ICommand {

    @Override
    public void Execute() {
        OSCommand.Copy();
    }
}
