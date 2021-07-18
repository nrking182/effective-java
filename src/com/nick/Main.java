package com.nick;

import com.nick.models.Alive;
import com.nick.models.Lizard;
import com.nick.models.Person;
import com.nick.objectReferences.Stack;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Alive lizard = Lizard.from("Jim");
        Alive person = Person.goodHuman("Nick", 1);

        person.hello();
        //System.out.println(person.getGood());
        lizard.hello();

        //map entries
        System.out.println(UnnecessaryObjects.testMap);
        Set<String> keyset = UnnecessaryObjects.testMap.keySet();
        System.out.println(keyset);
        keyset.remove("c");
        System.out.println(keyset);
        System.out.println(UnnecessaryObjects.testMap.keySet());

        System.out.println(UnnecessaryObjects.testMap);

        Stack s = new Stack();
        s.push("hello");
        s.push("world");
        System.out.println(s.pop());

        System.out.println(s.pop());
    }
}
