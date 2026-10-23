package com.example;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

/** Reads the settings from YAML. */
public final class ConfigLoader {
    private ConfigLoader() {
    }

    /** The settings in {@code yaml}. */
    public static Config load(String yaml) {
        Yaml parser = new Yaml(new Constructor(Config.class));
        return parser.load(yaml);
    }
}
