package com.kodilla.linked.list.mylinkedlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyLinkedListApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyLinkedListApplication.class, args);

        StringCollection linkedCollection = new StringCollection();

        linkedCollection.addElement("First element");
        linkedCollection.addElement("Second element");
        linkedCollection.addElement("Third element");
        linkedCollection.addElement("Fourth element");
        linkedCollection.addElement("Fifth element");

        String searched = linkedCollection.getElement(2);
        System.out.println(searched);
    }
}
