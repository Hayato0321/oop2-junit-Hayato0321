package jp.ac.shibaura_it.infolab1.chat;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
public class Channel {

    String message;

    public void Message(String message) {
        this.message = message;

    }

    public String getMessage() {
        return this.message;

    }
    public void printMessage(){
        System.out.println("message:" + this.message);
    }
}



