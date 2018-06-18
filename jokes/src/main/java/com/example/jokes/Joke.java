package com.example.jokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Joke {

    private static List<String> jokes = new ArrayList<>();

    public static String getJoke(){
        initJokes();

        return jokes.get(new Random().nextInt(jokes.size()));
    }

    private static void initJokes() {
        jokes.add("Q: What did the lightning bolt say to the other lightning bolt?\n" +
                "\n" +
                "A: You're shocking!\n" +
                "\n");
        jokes.add("You know you're a mom when...\n" +
                "\n" +
                "...picking up another human to smell their butt is not only normal but totally necessary");
        jokes.add("Q. Why was the belt sent to jail?\n" +
                "\n" +
                "A. For holding up a pair of pants!");
        jokes.add("Want to hear a joke about construction? I'm still working on it.");
        jokes.add("I was going to make myself a belt made out of watches, but then I realized it would be a waist of time.");
        jokes.add("Q. What sound does a sleeping T-Rex make?\n" +
                "\n" +
                "A. A dino-snore.");
        jokes.add("Want to hear something terrible?\n" +
                "\n" +
                "Paper.\n" +
                "\n" +
                "See? I told you it was tear-able.");
    }
}
