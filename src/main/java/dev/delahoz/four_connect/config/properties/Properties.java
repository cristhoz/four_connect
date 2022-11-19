package dev.delahoz.four_connect.config.properties;

import dev.delahoz.four_connect.config.properties.models.ScreenConfig;
import dev.delahoz.four_connect.config.properties.models.ScreenViewSizeConfig;
import java.io.File;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class Properties {
    private final Configuration config;

    public Properties() {
        Configurations configs = new Configurations();

        try {
            config = configs.properties(new File("application.properties"));
        } catch (ConfigurationException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public ScreenConfig getScreenConfig() {
        return ScreenConfig.builder()
            .title(config.getString("screen.tittle"))
            .viewSize(ScreenViewSizeConfig.builder()
                .width(config.getInt("screen.view_size.width"))
                .height(config.getInt("screen.view_size.height")).build())
            .build();
    }
}
