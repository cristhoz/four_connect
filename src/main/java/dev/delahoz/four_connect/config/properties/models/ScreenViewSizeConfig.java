package dev.delahoz.four_connect.config.properties.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ScreenViewSizeConfig {
    private Integer width;
    private Integer height;
}
