package com.nick.dependencyInjection;

import java.util.HashMap;

public class Lexicon {

    public HashMap<String, String> wordMap;

    public Lexicon(HashMap<String, String> wordMap) {
        this.wordMap = wordMap;
    }

    public HashMap<String, String> getWordMap() {

        return wordMap;
    }

    public void setWordMap(HashMap<String, String> wordMap) {
        this.wordMap = wordMap;
    }
}
