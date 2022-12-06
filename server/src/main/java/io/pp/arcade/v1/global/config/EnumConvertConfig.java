package io.pp.arcade.v1.global.config;

import io.pp.arcade.v1.global.type.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Configuration
public class EnumConvertConfig {
    @Component
    public class StringToGameTypeEnumConverter implements Converter<String, GameType> {
        @Override
        public GameType convert(String source) {
            try {
                GameType gameType = GameType.getEnumFromValue(source.toUpperCase(Locale.ROOT));
                return gameType;
            } catch (Exception e) {
                return null;
            }
        }
    }
    @Component
    public class StringToStatusTypeEnumConverter implements Converter<String, StatusType> {
        @Override
        public StatusType convert(String source) {
            try {
                return StatusType.valueOf(source.toUpperCase(Locale.ROOT));
            } catch (Exception e) {
                return null;
            }
        }
    }
    @Component
    public class StringToRacketTypeEnumConverter implements Converter<String, RacketType> {
        @Override
        public RacketType convert(String source) {
            try {
                return RacketType.valueOf(source.toUpperCase(Locale.ROOT));
            } catch (Exception e) {
                return null;
            }
        }
    }

    @Component
    public class StringToFeedbackTypeEnumConverter implements Converter<String, FeedbackType> {
        @Override
        public FeedbackType convert(String source) {
            try {
                return FeedbackType.valueOf(source.toUpperCase(Locale.ROOT));
            } catch (Exception e) {
                return null;
            }
        }
    }

    @Component
    public class StringToDateTypeEnumConverter implements Converter<String, DateType> {

        @Override
        public DateType convert(String source) {
            try {
                return DateType.valueOf(source.toUpperCase(Locale.ROOT));
            } catch (Exception e) {
                return null;
            }
        }
    }
}
