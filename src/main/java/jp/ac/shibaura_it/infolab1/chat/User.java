package jp.ac.shibaura_it.infolab1.chat;

public class User {
    String name;
    String pass;

    public User(String name, String pass){
        this.name = name;
        this.pass = pass;
    }

    public String getName() {
        return this.name;
    }

    public String getPass(){
        return this.pass;

    }
}
