package edu.umb.cs680.hw13Observer;

import java.util.Observable;

import java.util.Observer;

@SuppressWarnings("deprecation")
public class TableObserver implements Observer {

	
	public void update(Observable o, Object obj) {
		if (obj instanceof StockEvent) {
			StockEvent stockEvent = (StockEvent) obj;
			System.out.print("3D of StockEvent: " + stockEvent.getTicker() + " " + stockEvent.getQuote());
		} else if (obj instanceof DJIAEvent) {
			DJIAEvent djiaEvent = (DJIAEvent) obj;
			System.out.print("3D of DJIAEvent: " + djiaEvent.getDjia());
		}
	}
}