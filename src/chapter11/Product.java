package chapter11;

import java.awt.*;

public interface Product {

    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(Color color);

    default  String getBarcode(){
        return "no barcode";

    }
}
