package jp.ac.shibaura_it.infolab1.chat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CsystemTests {
    String chat = "Hello World";
    //チャットを入力する//

    @Test
    public void addSystemTests(){
        Csystem csystem = new Csystem();
        csystem.Message(chat);
        csystem.pMessage();

        assertThat(csystem.getMessage()).isEqualTo(chat);

    }
}
