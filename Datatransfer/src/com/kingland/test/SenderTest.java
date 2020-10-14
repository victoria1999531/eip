/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */

package com.kingland.test;

import com.kingland.main.Buffer;
import com.kingland.main.Sender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    private Sender sender;
    @Mock
    private Buffer buffer;
    @BeforeEach
    public void init() {
        sender = new Sender(buffer);
    }
    @Test
    void run() {
        // given
        sender.setNum(4);

        // when
        sender.run();

        // then
        assertEquals(1, buffer);
    }

    @Test
    void setNum() {

    }
}