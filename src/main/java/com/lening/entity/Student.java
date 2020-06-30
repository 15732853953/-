package com.lening.entity;

public class Student {
    private Integer sid;
    private String sname;
    private Integer sage;

    private Integer qjts;

    public Integer getQjts() {
        return qjts;
    }

    public void setQjts(Integer qjts) {
        this.qjts = qjts;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }
}
