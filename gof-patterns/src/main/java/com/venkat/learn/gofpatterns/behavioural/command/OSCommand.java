package com.venkat.learn.gofpatterns.behavioural.command;

public class OSCommand {
    public static int TextPasted;
    public static int TextCopied;

    public static void Cut(){
        System.out.println("Clip cut has been performed");
        TextCopied++;
    }
    public static void Copy(){
        System.out.println("Clip copy has been performed");
        TextCopied++;
    }
    public static void Paste(){
        System.out.println("Clip paste has been performed");
        TextPasted++;
    }
}
