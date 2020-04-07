package TrieHashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }
}

class Trie {

    public class TrieNode {
        Map<Character, TrieNode> map;
        boolean isEndOfTheWord;

        public TrieNode() {
            map = new HashMap<>();
            isEndOfTheWord = false;

        }
    }

}
