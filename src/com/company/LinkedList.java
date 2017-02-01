package com.company;

/**
 * Created by AlexBrown on 2017-01-23.
 */
public class LinkedList {

    private LLNode head;

    public void addValue(int value){
        if(head == null){
            head = new LLNode(value,null);
        }else{
            LLNode currentNode = head;
            while(currentNode.getChildNode()!=null){
                currentNode = currentNode.getChildNode();
            }
            currentNode.setChildNode(new LLNode(value,null));
        }
    }
    public boolean findValue(int value){
        boolean exists = false;
        LLNode currentNode = head;

        while(currentNode != null){
            if(currentNode.getValue() == value){
                exists = true;
                break;
            }
            currentNode = currentNode.getChildNode();
        }
        return exists;
    }
    public boolean removeFirstOfValue(int value){
        boolean success = true;
        LLNode currentNode = head;

        if(head.getValue() == value){
            head = head.getChildNode();
        }else {
            while (currentNode.getChildNode().getValue() != value) {
                currentNode = currentNode.getChildNode();
                if (currentNode.getChildNode().getChildNode() == null) {
                    success = false;
                    break;
                }
            }
            if(success) currentNode.setChildNode(currentNode.getChildNode().getChildNode());

        }

        return success;
    }
    public int removeAllOfValue(int value){
        int numberRemoved = 0;
        LLNode currentNode = head;

        if(head != null) {

            while (head.getValue() == value) {
                head = head.getChildNode();
            }

            while (currentNode.getChildNode() != null) {
                if (currentNode.getChildNode().getValue() == value) {
                    if (currentNode.getChildNode() != null) {
                        currentNode.setChildNode(currentNode.getChildNode().getChildNode());
                    } else {
                        currentNode.setChildNode(null);
                    }
                    numberRemoved++;
                } else {
                    currentNode = currentNode.getChildNode();
                }
            }

        }

        return numberRemoved;
    }
    public int countValueOccurances(int value){
        int numberOfOccurances = 0;
        LLNode currentNode = head;

            while (currentNode != null) {
                if (currentNode.getValue() == value) numberOfOccurances++;
                currentNode = currentNode.getChildNode();

        }

        return numberOfOccurances;
    }
    public int size(){
        int size = 0;
        LLNode currentNode = head;

        while(currentNode != null){
            size ++;
            currentNode = currentNode.getChildNode();
        }


        return size;
    }
    public String toString(){
        String stringReturned = "";
        LLNode currentNode = head;

        while(currentNode != null){
            stringReturned = stringReturned + String.valueOf(currentNode.getValue()) + " ";
            currentNode = currentNode.getChildNode();

        }

        return stringReturned;
    }

}
