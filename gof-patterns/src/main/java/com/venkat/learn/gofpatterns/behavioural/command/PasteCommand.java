package com.venkat.learn.gofpatterns.behavioural.command;

public class PasteCommand implements ICommand {

    @Override
    public void Execute() {
        OSCommand.Paste();
    }
}
