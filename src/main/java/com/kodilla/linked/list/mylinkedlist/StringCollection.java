package com.kodilla.linked.list.mylinkedlist;

public class StringCollection {
    private Element collectionHead = null;
    private Element temp = null;
    private String getResult = null;
    private boolean removeResult = false;

    public String getElement(int n) {
        temp = collectionHead;
        if(n == 1) {
            getResult = collectionHead.getValue();
        } else {
            for (int i = 1;i < n;i++){
                temp = temp.getNext();
                getResult = temp.getValue();
            }
        }
        return getResult;
    }

    public void addElement(String s) {
        if (collectionHead == null) {
            Element element = new Element(s);
            collectionHead = element;
        } else {
            temp = collectionHead;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            Element newElement = new Element(s);
            temp.setNext(newElement);
            newElement.setPrev(temp);
        }
    }

    public boolean removeElement(String s) {
        Element prev;
        Element next;
        temp = collectionHead;
        if (collectionHead.getValue() == s) {
            temp = temp.getNext();
            temp.setPrev(null);
            collectionHead = temp;
            removeResult = true;
        } else {
            while (temp.getNext() != null) {
                if(temp.getValue() == s) {
                    prev = temp.getPrev();
                    next = temp.getNext();
                    prev.setNext(next);
                    next.setPrev(prev);
                    temp.setNext(null);
                    removeResult = true;
                } else {
                    removeResult = false;
                }
            }
        }
        return removeResult;
    }
}