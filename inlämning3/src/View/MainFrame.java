package View;
import javax.swing.*;
import Main.Controller;

public class MainFrame extends JFrame
{
    private int width = 500;
    private int height = 400;

    Controller controller;
    MainPanel panel;

    public MainFrame(Controller controller)
    {
        this.controller = controller;
        setup();
    }

    public void setup()
    {
        setSize(width,height);
        setTitle("Pizza");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new MainPanel(controller);
        setContentPane(panel);

        // pack seems too overrides the size of the window and make it as small as possible
       // pack();

        setVisible(true);
    }

}
