package tr.bays.common.view;


import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.inject.Named;

@Named
public class GuestPreferences implements Serializable {
    
    private String color = "indigo";
    
    private String darkMode = "light";
        
    private String layoutMode = "layout-static";
    
    private String inputStyle = "outlined";

    private List<LayoutTheme> layoutThemes = new ArrayList<LayoutTheme>();

    private boolean lightLogo = true;
    
    @PostConstruct
    public void init() {
        layoutThemes.add(new LayoutTheme("Blue", "blue","#39a3f4"));
        layoutThemes.add(new LayoutTheme("Green", "green","#6ebc3b"));
        layoutThemes.add(new LayoutTheme("Cyan", "cyan","#26C6DA"));
        layoutThemes.add(new LayoutTheme("Purple", "purple","#7E57C2"));
        layoutThemes.add(new LayoutTheme("Indigo", "indigo","#5C6BC0"));
        layoutThemes.add(new LayoutTheme("Yellow", "yellow","#ffc800"));
        layoutThemes.add(new LayoutTheme("Pink", "pink","#EC407A"));
        layoutThemes.add(new LayoutTheme("Orange", "orange","#f6a821"));
    }

    public String getDarkMode() {
        return darkMode;
    }

    public boolean isLightLogo() {
        return lightLogo;
    }
  
    public void setDarkMode(String darkMode) {
        this.darkMode = darkMode;
    }
    
    public String getTheme() {
        return this.color + "-" +  this.darkMode;
    }

    public String getLayoutMode() {
        return this.layoutMode;
    }
    
    public void setLayoutMode(String value) {
        this.layoutMode = value;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
        this.lightLogo = !this.color.equals("orange") && !this.color.equals("yellow");
    }

    public String getInputStyle() {
        return inputStyle;
    }

    public String getInputStyleClass() {
        return this.inputStyle.equals("filled") ? "ui-input-filled" : "";
    }

    public void setInputStyle(String inputStyle) {
        this.inputStyle = inputStyle;
    }

    public List<LayoutTheme> getLayoutThemes() {
        return layoutThemes;
    }
    
    public class LayoutTheme {
        String name;
        String file;
        String color;

        public LayoutTheme(String name, String file, String color) {
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

}
