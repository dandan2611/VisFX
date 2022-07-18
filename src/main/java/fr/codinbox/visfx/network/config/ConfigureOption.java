package fr.codinbox.visfx.network.config;

public class ConfigureOption {

    private Boolean enabled;
    private FilterType[] filter;
    private Boolean showButton;

    public Boolean isEnabled() {
        return enabled;
    }

    public ConfigureOption setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public FilterType[] getFilter() {
        return filter;
    }

    public ConfigureOption setFilter(FilterType[] filter) {
        this.filter = filter;
        return this;
    }

    public Boolean isShowButton() {
        return showButton;
    }

    public ConfigureOption setShowButton(boolean showButton) {
        this.showButton = showButton;
        return this;
    }

    enum FilterType {
        NODES,
        EDGES,
        LAYOUT,
        INTERACTION,
        MANIPULATION,
        PHYSICS,
        SELECTION,
        RENDERER;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

}
