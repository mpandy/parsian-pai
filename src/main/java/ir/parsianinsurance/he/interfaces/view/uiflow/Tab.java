package ir.parsianinsurance.he.interfaces.view.uiflow;

/**
 * Created by 8119 on 3/28/2017.
 */
public class Tab {

    private TabName tabName;
    private String farsiTitle;
    private View view;

    public String getFarsiTitle() {
        return farsiTitle;
    }

    public TabName getTabName() {
        return tabName;
    }

    public String getViewPath() {
        return view+".xhtml";
    }

    public void setView(View view) {
        this.view = view;
    }

    public Tab(TabName tabName, String farsiTitle, View view) {
        this.tabName = tabName;
        this.farsiTitle = farsiTitle;
        this.view = view;
    }

    public enum TabName{
        bimenametab,
        elhaghiyetab,
        khesarattab;
    }
}