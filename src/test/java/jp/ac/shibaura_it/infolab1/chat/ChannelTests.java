package jp.ac.shibaura_it.infolab1.chat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChannelTests {

    @Test
    void addChannel() {

        var general = new Channel("general");
        assertThat(general.getName()).isEqualTo("general");
        System.out.println(general.getName());

    }
}