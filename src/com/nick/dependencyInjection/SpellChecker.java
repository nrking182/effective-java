package com.nick.dependencyInjection;


import java.util.Collections;
import java.util.List;

public class SpellChecker {
    private final Lexicon dictionary;

    //we are using the constructor to 'inject' the 'dictionary' resource
    public SpellChecker(Lexicon dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(String word) {
        return dictionary.getWordMap().containsKey(word);
    }
    public List<String> suggestions(String typo) {
        return Collections.emptyList(); //lol
    }
}
