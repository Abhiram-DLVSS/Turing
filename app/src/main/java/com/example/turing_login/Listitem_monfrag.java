package com.example.turing_login;

public class Listitem_monfrag {
    private String head;
    private String desc;
    private String lect;
    private String col;
    private String link;

    public Listitem_monfrag(String head, String desc, String lect,String col,String link) {
        this.head = head;
        this.desc = desc;
        this.lect= lect;
        this.col=col;
        this.link=link;
    }

    public String getHead() { return head; }

    public String getDesc() { return desc; }

    public String getLect() { return lect; }

    public String getCol() { return col; }

    public String getLink() {return link;}

}
