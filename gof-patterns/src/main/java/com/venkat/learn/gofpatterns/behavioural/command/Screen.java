package com.venkat.learn.gofpatterns.behavioural.command;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    public List<UIControl> UIControlList = new ArrayList<>();
    public void RenderAllElements(){
        for (UIControl UIControl: UIControlList) {
            UIControl.Render();
        }
    }
}
