package com.example.cps731lab05sec01alisonder.dummy;

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
        addItem(new DummyItem("Iced Coffee", "\nWant a nice refreshing drink that involves ice and coffee? This recipe is for you! It is quick, easy, budget-friendly, and tastes just like the gourmet coffee-shops, if not better!"));
        addItem(new DummyItem("French Vanilla", "\nTired of hot chocolate? Look no more! This is the BEST french vanilla recipe that you will ever find in your entire life."));
        addItem(new DummyItem("Earl Grey Tea", "\nHave you ever tried milk with tea? This recipe is PERFECT. Just add milk, earl grey tea bag, water, and you are good to go!"));
        addItem(new DummyItem("Lemonade", "\nLemonade! Clap Clap Clap! Crunchy ice! Clap Clap Clap! Sip it once! Clap Clap Clap! Sip it twice! Clap Clap Clap! Turn around, touch the ground, FREEZE! Enjoy this delicious lemonade."));
        addItem(new DummyItem("Strawberry Milkshake", "\nStrawberry galore! Get your milk, strawberries (you will need a lot), ice, ICE CREAM and get ready to devour this yummy treat!"));
        addItem(new DummyItem("Hot Chocolate", "\nTired of french vanilla? Look no more! This is the BEST hot chocolate recipe that you will ever find in your entire life."));
        addItem(new DummyItem("Ice Cold Water", "\nNeed something to hydrate yourself? Well you are in luck. This is the best ice cold water recipe for YOU! Just pour yourself a glass of water, add some ice cubes, and you are done!"));
        addItem(new DummyItem("Orange Juice", "\nOrange + juice = OJ! Fresh organic orange juice. Perfect for kids."));
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

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @NonNull
        @Override
        public String toString() {
            return content;
        }
    }
}