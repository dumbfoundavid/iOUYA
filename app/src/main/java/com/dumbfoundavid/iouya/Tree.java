package com.dumbfoundavid.iouya;

/**
 * Created by adamsornoso on 9/20/16.
 */
public class Tree {
    private String ID;
    private User owner;
    private Node root;



    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        owner = owner;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        root = root;
    }

}
