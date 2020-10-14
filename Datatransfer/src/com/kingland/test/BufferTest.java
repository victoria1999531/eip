/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */

package com.kingland.test;

import com.kingland.main.Buffer;
import com.kingland.main.Loader.Loader;
import com.kingland.main.Sender;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class BufferTest {
    private Loader loader;
    private Sender sender;

    @Mock
    private Buffer buffer;

    @BeforeEach

    @Test
    void loader() {
        loader = new Loader(buffer);
    }

    @Test
    void sender() {
    }
}