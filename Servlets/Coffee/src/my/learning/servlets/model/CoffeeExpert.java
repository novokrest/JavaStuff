package my.learning.servlets.model;

import java.util.*;

public class CoffeeExpert {

    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if (color.equals("black")) {
            brands.add("Black Brand #1");
            brands.add("Black Brand #2");
        }
        else if (color.equals("white")) {
            brands.add("White Brand #1");
            brands.add("White Brand #2");
            brands.add("White Brand #3");
        }
        return brands;
    }
}