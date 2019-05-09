package com.waywardcabal;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        UIState state = ui.askUser();
	    while(state!=null) {
	        state=state.run();
        }
    }
}
