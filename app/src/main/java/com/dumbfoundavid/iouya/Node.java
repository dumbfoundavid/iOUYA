package com.dumbfoundavid.iouya;

import java.util.ArrayList;

/**
 * Created by adamsornoso on 9/20/16.
 */
public class Node {

    private String ID;
    private Node parent;
    private ArrayList<Node> children;
    private User helped;
    private String sQRCode;


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        parent = parent;
    }

    public ArrayList getChildren() {
        return children;
    }

    public void setChildren(ArrayList children) {
        children = children;
    }

    public void addChild(Node Child){
        children.add(child);
    }

    public User getHelped() {
        return helped;
    }

    public void setHelped(User helped) {
        helped = helped;
    }

    public String getQRCode() {
        return sQRCode;
    }

    public void setQRCode(String QRCode) {
        this.sQRCode = QRCode;
    }
}
