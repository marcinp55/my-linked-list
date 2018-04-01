package com.kodilla.linked.list.mylinkedlist;

public class StringCollection {
    private Element collectionHead = null;
    private int index = -1;
    private Element tempPrev = null;
    private String getResult = null;

    public String getElement(int n) {
            if (index == 0 && n == 1) {
                getResult = collectionHead.getValue();
            } else {
                tempPrev = collectionHead.getPrev();
                for(int i = index;i <= n;i--) {
                    tempPrev = tempPrev.getPrev();
                    getResult = tempPrev.getValue();
                }
            }
        return getResult;
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