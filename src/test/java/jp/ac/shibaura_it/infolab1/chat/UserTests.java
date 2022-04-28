package jp.ac.shibaura_it.infolab1.chat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTests {
    @Test
    public void addUser(){

        var user1 = new User("Hayato", "PassA");

        assertThat(user1.getName()).isEqualTo("Hayato");
        System.out.println(user1.getName());

        assertThat(user1.getPass()).isEqualTo("PassA");
        System.out.println(user1.getPass());

        var user2 = new User("Hayako", "PassB");
        assertThat(user2.getName()).isEqualTo("Hayako");
        System.out.println(user2.getName());

        assertThat(user2.getPass()).isEqualTo("PassB");
        System.out.println(user2.getPass());
    }

    @Test
    void delUser(){
        System.out.println("deleted");
    }
}
