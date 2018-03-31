package com.kodilla.linked.list.mylinkedlist;

public class StringCollection {
    private Element collectionHead = null;
    private int index = -1;
    private Element tempPrevOne = null;
    private Element tempPrevTwo = null;

    public String getElement(int n) {
        for (int i = 0;i <= (n-1);i++) {

        }
    }

    public void addElement(String s) {
        if (collectionHead == null) {
            Element element = new Element(s);
            collectionHead = element;
            index = 0;
        } else {
            Element element = new Element(s);
            collectionHead.setNext(element);
            element.setPrev(collectionHead);
            collectionHead = element;
            index = index + 1;
        }
    }

    public boolean removeElement(String s) {
        return true;
    }
}
