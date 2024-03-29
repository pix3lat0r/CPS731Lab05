package com.example.cps731lab05sec01alisonder.dummy;

import com.example.cps731lab05sec01alisonder.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import androidx.annotation.NonNull;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<>();

    static {
        // Add some sample items.
        addItem(new DummyItem("Iced Coffee", "\nWant a nice refreshing drink that involves ice and coffee? This recipe is for you! It is quick, easy, budget-friendly, and tastes just like the gourmet coffee-shops, if not better!", "Ingredients:\n1/2 cup sugar\n1/2 teaspoon vanilla extract\n1 cup coffee, at room temperature\n2 tablespoons half and half, or more, to taste", R.drawable.ic));
        addItem(new DummyItem("French Vanilla", "\nTired of hot chocolate? Look no more! This is the BEST french vanilla recipe that you will ever find in your entire life.", "Ingredients:\n1 cup milk, of your choice\n1 can sweetened condensed milk\n1 vanilla pod\n1 tablespoon vanilla extract", R.drawable.fv));
        addItem(new DummyItem("Earl Grey Tea", "\nHave you ever tried milk with tea? This recipe is PERFECT. Just add milk, earl grey tea bag, water, and you are good to go!", "Ingredients:\n2 cups water\n2 Earl Grey tea bags\n2 tbsp liquid honey\n4 cups milk\n1 vanilla bean", R.drawable.eg));
        addItem(new DummyItem("Lemonade", "\nLemonade! Clap Clap Clap! Crunchy ice! Clap Clap Clap! Sip it once! Clap Clap Clap! Sip it twice! Clap Clap Clap! Turn around, touch the ground, FREEZE! Enjoy this delicious lemonade.", "Ingredients:\n1 cup granulated sugar\n1 cup water\n1 cup lemon juice\n2 to 3 cups cold water", R.drawable.lm));
        addItem(new DummyItem("Strawberry Milkshake", "\nStrawberry galore! Get your milk, strawberries (you will need a lot), ice, ICE CREAM and get ready to devour this yummy treat!", "Ingredients:\n1 cup strawberries\n1 cup vanilla ice cream\n1/2 cup milk", R.drawable.sm));
        addItem(new DummyItem("Hot Chocolate", "\nTired of french vanilla? Look no more! This is the BEST hot chocolate recipe that you will ever find in your entire life.", "Ingredients:\n4 cups milk\n1/4 cup unsweetened cocoa powder\n1/4 cup granulated sugar\n1/2 cup  semisweet chocolate chips\n1/4 teaspoon pure vanilla extract", R.drawable.hc));
        addItem(new DummyItem("Ice Cold Water", "\nNeed something to hydrate yourself? Well you are in luck. This is the best ice cold water recipe for YOU! Just pour yourself a glass of water, add some ice cubes, and you are done!", "Ingredients:\n1 cup water\nA handful of ice cubes", R.drawable.icw));
        addItem(new DummyItem("Orange Juice", "\nOrange + juice = OJ! Fresh organic orange juice. Perfect for kids.", "Ingredients:\n4 oranges", R.drawable.oj));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;
        public final int img;

        public DummyItem(String id, String content, String details, int img) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.img = img;
        }

        @NonNull
        @Override
        public String toString() {
            return content;
        }
    }
}