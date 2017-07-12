package com.jenny.stopwatch.models;

public class Timer {
	private double start;
	private double end;
	private double total;
	
	private static ArrayList<Timer> timers = new ArrayList<>();
		private static double currentTime = 0;
		private static double runTime =0;
		
	
	
	public Timer(double start, double end){
		this.start= start;
		this.end=end;
		this.total=end-start;
	}
	
	public double getStart() {
		return start;
	}
	public void setStart(double start) {
		this.start = start;
	}
	public double getEnd() {
		return end;
	}
	public void setEnd(double end) {
		this.end = end;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
