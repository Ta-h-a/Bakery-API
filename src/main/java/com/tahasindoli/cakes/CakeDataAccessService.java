package com.tahasindoli.cakes;

import java.util.ArrayList;
import java.util.List;

public class CakeDataAccessService implements CakeDAO{
    private static List<Cake> cakes;
    static{
        cakes = new ArrayList<>();
        Cake chocolate = new Cake(
                1,
                "Chocolate Cake",
                "Classic",
                "A rich and decadent chocolate cake, perfect for chocolate lovers.",
                List.of(
                        "Flour",
                        "sugar",
                        "cocoa powder",
                        "eggs",
                        "butter",
                        "milk",
                        "baking powder"
                )
        );
        Cake vanillaStrawberryCake = new Cake(
                2,
                "Vanilla Strawberry Cake",
                "Fruit-Flavored",
                "A light and fluffy vanilla cake layered with fresh strawberries.",
                List.of("Flour", "Sugar", "Eggs", "Butter", "Vanilla extract", "Strawberries", "Whipped cream")
        );

        Cake redVelvetCake = new Cake(
                3,
                "Red Velvet Cake",
                "Special Occasion",
                "A vibrant red cake with a hint of cocoa flavor, often served at celebrations.",
                List.of("Flour", "Sugar", "Buttermilk", "Cocoa powder", "Red food coloring", "Cream cheese frosting")
        );

        Cake lemonBlueberryCake = new Cake(
                4,
                "Lemon Blueberry Cake",
                "Citrus Delights",
                "A tangy lemon-flavored cake with bursts of juicy blueberries.",
                List.of("Flour", "Sugar", "Eggs", "Butter", "Lemon zest", "Lemon juice", "Blueberries")
        );

        Cake carrotCake = new Cake(
                5,
                "Carrot Cake",
                "Spiced Delights",
                "A moist cake made with grated carrots and warm spices, typically topped with cream cheese frosting.",
                List.of("Flour", "Sugar", "Eggs", "Vegetable oil", "Grated carrots", "Cinnamon", "Nutmeg", "Cream cheese frosting")
        );

        Cake coconutPineappleCake = new Cake(
                6,
                "Coconut Pineapple Cake",
                "Tropical Flavors",
                "A tropical delight featuring coconut-infused cake layers and pineapple filling.",
                List.of("Flour", "Sugar", "Eggs", "Coconut milk", "Shredded coconut", "Pineapple", "Whipped cream")
        );

        Cake blackForestCake = new Cake(
                7,
                "Black Forest Cake",
                "Indulgent Classics",
                "A German dessert with layers of chocolate cake, cherries, and whipped cream.",
                List.of("Flour", "Sugar", "Cocoa powder", "Eggs", "Butter", "Cherries", "Whipped cream")
        );

        Cake coffeeWalnutCake = new Cake(
                8,
                "Coffee Walnut Cake",
                "Coffee Infusions",
                "A coffee-flavored cake studded with crunchy walnuts.",
                List.of("Flour", "Sugar", "Eggs", "Butter", "Coffee extract", "Walnuts", "Coffee glaze")
        );

        Cake rainbowCake = new Cake(
                9,
                "Rainbow Cake",
                "Playful Creations",
                "A colorful cake with layers in all the colors of the rainbow.",
                List.of("Flour", "Sugar", "Eggs", "Butter", "Food coloring", "Vanilla extract", "Buttercream frosting")
        );

        Cake marbleCake = new Cake(
                10,
                "Marble Cake",
                "Timeless Favorites",
                "A blend of vanilla and chocolate cake batters swirled together.",
                List.of("Flour", "Sugar", "Eggs", "Butter", "Cocoa powder", "Vanilla extract")
        );
    }
    @Override
    public List<Cake> getAllCakes() {
        return cakes;
    }
}
