package com.example.design.prototype;

public class Client {
    public static void main(String[] args) throws Exception {
        Mail mail=new Mail(new AdvTemplete());
        mail.setTail("XXX版权所有");
        for (int i = 0; i < 10; i++) {
            Mail cloneMail=mail.clone();
            cloneMail.setAppellation(i+" 先生(女士)");
            cloneMail.setReceiver(i+"@qq.com");
            sendMail(cloneMail);
        }
    }

    private static void sendMail(Mail cloneMail) {
        System.out.println("标题: "+cloneMail.getSubject()+"\t收件人:"+cloneMail.getReceiver());
    }
}
