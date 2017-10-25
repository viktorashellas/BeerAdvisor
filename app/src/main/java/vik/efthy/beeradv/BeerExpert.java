package vik.efthy.beeradv;

/**
 * Created by DELL on 26/10/17.
 */

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
            List<String> getBrands(String colors) {
            List<String> brands = new ArrayList<String>();
            if (colors.equals("amber"))
            { brands.add("Jack Amber");
                brands.add("Red Moose");
            } else {
                brands.add("Jail Pale Ale");
                brands.add("Gout Stout");
            }
            return brands;
        }
    }
