package com.example.design.prototype;

public class Mail implements Cloneable{
    private String receiver;
    private String subject;
    private String appellation;
    private String content;
    private String tail;
    public Mail(AdvTemplete advTemplete){
        this.subject=advTemplete.getAdvSubject();
        this.content=advTemplete.getAdvContext();
    }

    @Override
    protected Mail clone() throws CloneNotSupportedException {
        return (Mail) super.clone();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
