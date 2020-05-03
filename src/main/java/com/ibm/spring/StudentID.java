package com.ibm.spring;

public class StudentID {
    String bid;
    int sid;

    public StudentID(String bid, int sid) {
        this.bid = bid;
        this.sid = sid;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}
