package com.javasolutions.lowleveldesign.structuralpatterns.flyweight.wordprocessor.solution;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory (Class) - creates and manages flyweight objects.
public class LetterFactory {

    private static final Map<Character, ILetter> characterCache = new HashMap<>();

    public static ILetter crateLetter(char characterValue) {
        if (characterCache.containsKey(characterValue)) {
            // if exists, return the cached character object.
            return characterCache.get(characterValue);
        } else {
            // if not exists, create the character object and cache it.
            DocumentCharacter characterObj = new DocumentCharacter(characterValue, "Arial", 10);
            // add to cache
            characterCache.put(characterValue, characterObj);
            return characterObj;
        }
    }

    public static int getTotalCharacters() {
        return characterCache.size();
    }
}

