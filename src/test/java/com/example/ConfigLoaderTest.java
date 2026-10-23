package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ConfigLoaderTest {
    @Test
    void readsTheSettings() {
        Config config = ConfigLoader.load("name: app\nport: 8080\n");

        assertEquals("app", config.name);
        assertEquals(8080, config.port);
    }
}
