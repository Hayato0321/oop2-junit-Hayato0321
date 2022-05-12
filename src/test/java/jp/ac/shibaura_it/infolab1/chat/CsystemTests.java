package jp.ac.shibaura_it.infolab1.chat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CsystemTests {
    String chat = "Hello World";
    //チャットを入力する//

    @Test
    public void addCsystem(){
        Csystem csystem = new Csystem();
        csystem.onMessage(chat);
        csystem.printMessage();

        assertThat(csystem.getMessage()).isEqualTo(chat);

    }
}
