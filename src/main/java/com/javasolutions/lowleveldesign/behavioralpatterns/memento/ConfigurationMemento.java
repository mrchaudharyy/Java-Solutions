package com.javasolutions.lowleveldesign.behavioralpatterns.memento;

// Memento class - stores the state
public class ConfigurationMemento {
    private final String theme;
    private final int fontSize;
    private final boolean notificationsEnabled;
    private final String language;

    public ConfigurationMemento(String theme, int fontSize,
                                boolean notificationsEnabled, String language) {
        this.theme = theme;
        this.fontSize = fontSize;
        this.notificationsEnabled = notificationsEnabled;
        this.language = language;
    }

    // Getters for restoration
    String getTheme() {
        return theme;
    }

    int getFontSize() {
        return fontSize;
    }

    boolean isNotificationsEnabled() {
        return notificationsEnabled;
    }

    String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return String.format("ConfigurationMemento[Theme=%s, Font Size=%d, Notifications=%b, Language=%s]",
                theme, fontSize, notificationsEnabled, language);
    }
}
