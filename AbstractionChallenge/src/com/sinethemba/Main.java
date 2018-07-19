package com.sinethemba;

public class Main {

    public static void main(String[] args) {

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        //String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String stringData = "5 10 1 66 5 12 22 1 0 7 100 2 8";;

        String[] data = stringData.split(" ");
        for (String s: data){
            tree.addItem(new Node(s));
        }

        System.out.println("****************************************");
        tree.traverse(tree.getRoot());

        System.out.println("****************************************");

        tree.removeItem(new Node("5"));
        tree.removeItem(new Node("0"));
        tree.removeItem(new Node("100"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("10"));
        tree.removeItem(new Node("1"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("12"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("22"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("2"));
        tree.removeItem(new Node("7"));
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("66"));
        tree.traverse(tree.getRoot());
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());

    }
}
