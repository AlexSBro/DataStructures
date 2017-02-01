package com.company;

import java.util.Random;

public class Test {

    private static BinaryTree binaryTree = new BinaryTree();
    private static LinkedList linkedList = new LinkedList();

    public static void main(String[] args) {
        Random rand = new Random();
        ///*
        for(long i = 0; i < 20; i ++){
            binaryTree.addValue(rand.nextInt(10));
        }
        //*/
        /*
        binaryTree.addValue(4);
        binaryTree.addValue(6);
        binaryTree.addValue(1);
        binaryTree.addValue(5);
        binaryTree.addValue(3);
        binaryTree.addValue(2);
        binaryTree.addValue(9);
        binaryTree.addValue(8);
        binaryTree.addValue(7);
        binaryTree.addValue(10);
        */


        System.out.println(String.valueOf(binaryTree.findValue(4)));
        binaryTree.printoutInOrder();
    }
}
