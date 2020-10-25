import com.venkat.learn.gofpatterns.behavioural.command.*;
import org.junit.jupiter.api.Test;

/*
Made with help of https://refactoring.guru/design-patterns/command
 */

public class CommandTest {
    @Test
    public void TestRender(){
        UIButton copyButton = new UIButton("CopyButton");
        UIControl testControl = new UIControl();
        Screen screen = new Screen();
        screen.UIControlList.add(copyButton);
        screen.UIControlList.add(testControl);
        screen.RenderAllElements();
    }

    @Test
    public void Test1(){
        // Create controls
        UIButton copyButton = new UIButton("CopyButton");
        UIButton cutButton = new UIButton("CutButton");
        UITextBox textBox = new UITextBox("TextBox","Sample Text");

        // Create commands
        CopyCommand copyCommand = new CopyCommand();
        CutCommand cutCommand = new CutCommand();
        PasteCommand pasteCommand = new PasteCommand();

        // Set commands
        copyButton.setCommand(copyCommand);
        cutButton.setCommand(cutCommand);
        textBox.setCommand(pasteCommand);

        // Push to screen
        Screen screen = new Screen();
        screen.UIControlList.add(copyButton);
        screen.UIControlList.add(cutButton);
        screen.UIControlList.add(textBox);
        screen.RenderAllElements();

        // Test few commands
        copyButton.Click();
        cutButton.Click();
        textBox.executeCommand(); // mocking for paste

        assert(OSCommand.TextCopied == 2);
        assert(OSCommand.TextPasted == 1);
    }
}
