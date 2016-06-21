package com.hfad.bitsandpizzas2;

/**
 * Created by chung on 11/20/15.
 */
public class Pizza {
    private String name;
    private int imageResourceId;
    private String description;

    public static final Pizza[] pizzas = {
            new Pizza("Diavolo", R.drawable.diavolo, "1. Peppers\n2. Tomatoes\n3. Cheese"),
            new Pizza("Funghi", R.drawable.funghi, "1. Peppers\n2. Tomatoes\n3. Cheese"),
            new Pizza("Diavolo", R.drawable.diavolo, "1. Peppers\n2. Tomatoes\n3. Cheese"),
            new Pizza("Funghi", R.drawable.funghi, "1. Peppers\n2. Tomatoes\n3. Cheese")
    };

    private Pizza(String name, int imageResourceId, String description) {
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getDescription() {
        return description;
    }
}