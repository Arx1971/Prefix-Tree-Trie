package TrieHashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Trie trie = new Trie();

        trie.insert("Megatron");

        System.out.println(trie.searchForPrefix("Mega"));

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

        @Override
        public String toString() {
            return "TrieNode{" +
                    "map=" + map +
                    ", isEndOfTheWord=" + isEndOfTheWord +
                    '}';
        }
    }

    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {

        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            TrieNode node = current.map.get(word.charAt(i));
            if (node == null) {
                node = new TrieNode();
                current.map.put(word.charAt(i), node);
            }
            current = node;
        }
        current.isEndOfTheWord = true;
    }

    public TrieNode searchForNode(String word) {

        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            TrieNode node = current.map.get(word.charAt(i));
            if (node == null) return null;
            current = node;
        }

        return current;

    }

    public boolean searchForPrefix(String word) {
        TrieNode node = searchForNode(word);
        if (node == null) return false;
        return true;
    }

    public boolean search(String word) {
        TrieNode node = searchForNode(word);
        return node != null && node.isEndOfTheWord;
    }

    @Override
    public String toString() {
        return "Trie{" +
                "root=" + root +
                '}';
    }
}
