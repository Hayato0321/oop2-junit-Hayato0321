package jp.ac.shibaura_it.infolab1.chat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChannelTests {
//チャネルを登録//
    String chat="Hello World";
    @Test
    public void addChannel(){

        Channel channel = new Channel();
        channel.Message(chat);
        channel.printMessage();

        assertThat(channel.getMessage()).isEqualTo(chat);

        }
    }
