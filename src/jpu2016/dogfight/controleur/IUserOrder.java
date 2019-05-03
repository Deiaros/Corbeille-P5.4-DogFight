package jpu2016.dogfight.controller;

public interface IUserOrder {
	
	public default int getPlayer() {
		return 1;
	}
	
	public default Order getOrder(){
		return null;
	}
}
