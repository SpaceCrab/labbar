package View;

import Main.Controller;
import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SouthPanel extends JPanel
{
    private Controller controller;
    private ButtonGroup btnGroup;
    JButton btnAdd, btnRemove, btnDone, btnClear;

    public SouthPanel(Controller controller)
    {
        this.controller = controller;
        btnGroup = new ButtonGroup();

        BorderLayout layout = new BorderLayout();
        setLayout(layout);

        JPanel pnlButtons = new JPanel();

        Dimension dim = new Dimension(50,50);

        btnAdd = new JButton("add");
        btnAdd.setSize(dim);

        btnDone = new JButton("done");
        btnDone.setSize(dim);

        btnRemove = new JButton("remove");
        btnRemove.setSize(dim);

        btnClear = new JButton("clear");
        btnClear.setSize(dim);

        pnlButtons.add(btnAdd);
        pnlButtons.add(btnRemove);
        pnlButtons.add(btnClear);
        pnlButtons.add(btnDone);

        add(pnlButtons, BorderLayout.EAST);

        addListeners();

    }

    private void addListeners()
    {
        ActionListener listener = new ButtonListeners();

        btnAdd.addActionListener(listener);
        btnRemove.addActionListener(listener);
        btnClear.addActionListener(listener);
        btnDone.addActionListener(listener);
    }

    class ButtonListeners implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == btnAdd)
            {
                controller.buttonPressed(ButtonType.Add);
            }
            else if(e.getSource() == btnRemove)
            {
                controller.buttonPressed(ButtonType.Remove);
            }
            else if(e.getSource() == btnClear)
            {
                controller.buttonPressed(ButtonType.Clear);
            }
            else if(e.getSource() == btnDone)
            {
                controller.buttonPressed(ButtonType.Done);
            }

        }
    }
}
