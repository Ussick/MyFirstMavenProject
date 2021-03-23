package org.example.oop.polimorphism;

public class AppPolimorth {
    private Sender sender;

    public AppPolimorth(Sender sender) {
        this.sender = sender;
    }

    public void sendMessage(String message){
        sender.send(message);

    }

    public static void main(String[] args) {
//        AppPolimorth appMail=new AppPolimorth(new MailSender());
//        AppPolimorth appSms=new AppPolimorth(new SmsSender());
//
//        appMail.sendMessage("message");
//        appSms.sendMessage("message");
        AppPolimorth app;

    }
}
