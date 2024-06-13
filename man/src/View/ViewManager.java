package View;

import javax.swing.*;

public class ViewManager {
    private JFrame mainMenu;
    private JFrame stageSelect;
    private JFrame scoreboard;
    public ViewManager() {
        mainMenu = new MainMenu(this);
    }

    public void openLevelSelect(){
        stageSelect = new StageSelect(this);
    }

    public void openScoreboard(){
        stageSelect = new Scoreboard(this);
    }
}
