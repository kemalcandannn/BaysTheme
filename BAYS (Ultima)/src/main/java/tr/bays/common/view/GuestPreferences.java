package tr.bays.common.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Named;

@Named
public class GuestPreferences implements Serializable {

    private String menuMode = "layout-menu-static";

    private String theme = "absolution";

    private boolean orientationRTL;

    private String inputStyle = "outlined";

    private List<FlatTheme> flatThemes = new ArrayList<>();

    private List<GradientTheme> gradientThemes = new ArrayList<>();

    private List<ImageTheme> imageThemes = new ArrayList<>();

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getMenuMode() {
        return menuMode;
    }

    public void setMenuMode(String menuMode) {
        this.menuMode = menuMode;
    }

    public boolean isOrientationRTL() {
        return orientationRTL;
    }

    public void setOrientationRTL(boolean orientationRTL) {
        this.orientationRTL = orientationRTL;
    }

    public String getInputStyleClass() {
        return this.inputStyle.equals("filled") ? "ui-input-filled" : "";
    }

    public String getInputStyle() {
        return inputStyle;
    }

    public void setInputStyle(String inputStyle) {
        this.inputStyle = inputStyle;
    }

    public List<FlatTheme> getFlatThemes() {
        return flatThemes;
    }

    public List<GradientTheme> getGradientThemes() {
        return gradientThemes;
    }

    public List<ImageTheme> getImageThemes() {
        return imageThemes;
    }

    @PostConstruct
    public void init() {
        flatThemes.add(new FlatTheme("Absolution", "absolution", "#628292"));
        flatThemes.add(new FlatTheme("Rebirth", "rebirth", "#007ad9"));
        flatThemes.add(new FlatTheme("Hope", "hope", "#67487e"));
        flatThemes.add(new FlatTheme("Bliss", "bliss", "#00b395"));
        flatThemes.add(new FlatTheme("Grace", "grace", "#5d2f92"));
        flatThemes.add(new FlatTheme("Dusk", "dusk", "#dd8400"));
        flatThemes.add(new FlatTheme("Navy", "navy", "#005a9e"));
        flatThemes.add(new FlatTheme("Infinity", "infinity", "#617e76"));
        flatThemes.add(new FlatTheme("Fate", "fate", "#0d5fa6"));
        flatThemes.add(new FlatTheme("Ruby", "ruby", "#ca5861"));
        flatThemes.add(new FlatTheme("Comfort", "comfort", "#0084a1"));

        gradientThemes.add(new GradientTheme("Faith", "faith","#622774","#c53364"));
        gradientThemes.add(new GradientTheme("Violet", "violet","#5b247a","#1bcedf"));
        gradientThemes.add(new GradientTheme("Honor", "honor","#3bb2b8","#00dac7"));
        gradientThemes.add(new GradientTheme("Rebel", "rebel","#7367f0","#ce9ffc"));
        gradientThemes.add(new GradientTheme("Vanity", "vanity","#f76b1c","#fad961"));
        gradientThemes.add(new GradientTheme("Valor", "valor","#ff6b52","#ff9851"));
        gradientThemes.add(new GradientTheme("Merit", "merit","#1c4652","#3d7b8a"));
        gradientThemes.add(new GradientTheme("Esprit", "esprit","#276174","#33c58e"));
        gradientThemes.add(new GradientTheme("Concord", "concord","#5e2563","#65799b"));
        gradientThemes.add(new GradientTheme("Dulce", "dulce","#b3305f","#ffaa85"));
        gradientThemes.add(new GradientTheme("Royal", "royal","#171717","#020202"));

        imageThemes.add(new ImageTheme("Hazel", "hazel", "hazel.jpg"));
        imageThemes.add(new ImageTheme("Essence", "essence", "essence.jpg"));
        imageThemes.add(new ImageTheme("Eternity", "eternity", "eternity.jpg"));
        imageThemes.add(new ImageTheme("Clarity", "clarity", "clarity.jpg"));
        imageThemes.add(new ImageTheme("Solace", "solace", "solace.jpg"));
        imageThemes.add(new ImageTheme("Joy", "joy", "joy.jpg"));
        imageThemes.add(new ImageTheme("Purity", "purity", "purity.jpg"));
        imageThemes.add(new ImageTheme("Euclid", "euclid", "euclid.jpg"));
        imageThemes.add(new ImageTheme("Elegance", "elegance", "elegance.jpg"));
        imageThemes.add(new ImageTheme("Tranquil", "tranquil", "tranquil.jpg"));
    }

    public class FlatTheme {
        String name;
        String file;
        String color;

        public FlatTheme(String name, String file, String color) {
            this.name = name;
            this.file = file;
            this.color = color;
        }

        public String getName() {
            return this.name;
        }

        public String getFile() {
            return this.file;
        }

        public String getColor() {
            return this.color;
        }
    }

    public class ImageTheme {
        String name;
        String file;
        String image;

        public ImageTheme(String name, String file, String image) {
            this.name = name;
            this.file = file;
            this.image = image;
        }

        public String getName() {
            return this.name;
        }

        public String getFile() {
            return this.file;
        }

        public String getImage() {
            return this.image;
        }
    }

    public class GradientTheme {
        String name;
        String file;
        String color1;
        String color2;

        public GradientTheme (String name, String file, String color1, String color2) {
            this.name = name;
            this.file = file;
            this.color1 = color1;
            this.color2 = color2;
        }

        public String getName() {
            return this.name;
        }

        public String getFile() {
            return this.file;
        }

        public String getColor1() {
            return this.color1;
        }

        public String getColor2() {
            return this.color2;
        }
    }
}
