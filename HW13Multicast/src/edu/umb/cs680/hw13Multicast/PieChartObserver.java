package edu.umb.cs680.hw13Multicast;

public class PieChartObserver implements DJIAQuoteObserver, StockQuoteObserver {

	public void updateStock(StockEvent obj) {
		StockEvent stockEvent = (StockEvent) obj;
		System.out.print("PieChart of StockEvent: " + stockEvent.getTicker() + " " + stockEvent.getQuote());

	}

	public void updateDJIA(DJIAEvent obj) {
		DJIAEvent djiaEvent = (DJIAEvent) obj;
		System.out.print("PieChart of DJIAEvent: " + djiaEvent.getDjia());
	}

}