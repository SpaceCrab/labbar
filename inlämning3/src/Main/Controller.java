package Main;

import Product.Product;
import View.*;
import com.sun.nio.sctp.PeerAddressChangeNotification;

/**
 * This class handles the creation of orders, the orders contain multiple products such as food and or drinks
 */

public class Controller
{
    MainFrame view;

    Product[] order;

    public Controller()
    {
        view = new MainFrame(this);
    }

    public void buttonPressed(ButtonType buttonType)
    {
        switch (buttonType)
        {
            case Add:
            {
                System.out.println("Add");
                addProduct();
            }break;

            case Done:
            {
                System.out.println("Done");
            } break;

            case Clear:
            {
                //do thinga
                System.out.println("Clear");
            }break;

            case Remove:
            {
                //do thing
                System.out.println("Remove");
            }break;
        }
    }

    public void addProduct()
    {

    }

    public void removeProduct(int index)
    {

    }

    public void clearProduct()
    {

    }

    public void done()
    {

    }
}
