/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */

package com.kingland.test;

import com.kingland.main.Buffer;
import com.kingland.main.Loader.Loader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class LoaderTest {
    private Loader loader;

    @Mock
    private Buffer buffer;

    @BeforeEach
    public void init() {
        loader = new Loader(buffer);
    }

    @Test
    void setNum() {
    }

    @Test
    void run() {
        // given
        loader.setNum(4);

        // when
        loader.run();

        // then
        assertEquals(1, buffer);

    }
}