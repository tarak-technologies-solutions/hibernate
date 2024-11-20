package com.taraktech.entities;

public class Customer {

    private Integer cid;
    private String cname;
    private String caddr;
    private Long cmobile;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCaddr() {
        return caddr;
    }

    public void setCaddr(String caddr) {
        this.caddr = caddr;
    }

    public Long getCmobile() {
        return cmobile;
    }

    public void setCmobile(Long cmobile) {
        this.cmobile = cmobile;
    }
}
