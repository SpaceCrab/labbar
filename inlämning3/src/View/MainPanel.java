package View;

import Main.Controller;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import java.awt.*;

/**
 * This class creates the main window and the subsequent panels in said window
 *
 */
public class MainPanel extends JPanel
{
    JTextArea txtArea;
    BorderLayout layout;
    Controller controller;
    SouthPanel southPanel;
    WestPanel westPanel;

    public MainPanel(Controller controller)
    {
        this.controller = controller;
        setup();
    }

    public void setup()
    {
        layout = new BorderLayout();
        setLayout(layout);

        Border border = this.getBorder();
        Border margin = BorderFactory.createEmptyBorder(12, 12, 12, 12);
        setBorder(new CompoundBorder(border, margin));

        createInfoText();

        //adds the buttons south of the textbox
        southPanel = new SouthPanel(controller);
        add(southPanel, layout.SOUTH);

    }

    private void createInfoText()
    {
        JPanel pnlProductInfo = new JPanel();
        txtArea = new JTextArea();
        txtArea.setBorder(BorderFactory.createLoweredBevelBorder());
        txtArea.setSize(new Dimension(150,450));
        Font font = new Font("Courier New", Font.ITALIC, 12);
        txtArea.setFont(font);
        txtArea.setForeground(new Color(0x000000));
        txtArea.setPreferredSize(new Dimension(200, 450));
        txtArea.setEditable(false);
        txtArea.setBackground(new Color(120, 120, 120));
        pnlProductInfo.add(txtArea);

        add(pnlProductInfo, layout.EAST);
    }
}
