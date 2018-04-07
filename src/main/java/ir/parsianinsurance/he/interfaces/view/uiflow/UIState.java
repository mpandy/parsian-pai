package ir.parsianinsurance.he.interfaces.view.uiflow;

/**
 * Created by Mohammad on 6/29/2017.
 */
public class UIState {

    StateName state;
    View view;

    public UIState(StateName state, View view) {
        this.state = state;
        this.view = view;
    }

    public StateName getState() {
        return state;
    }

    public View getView() {
        return view;
    }

    public String getViewFile() {
        return getView().name()+".xhtml";
    }

}
