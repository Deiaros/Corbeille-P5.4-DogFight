package jpu2016.dogfight.view;

import jpu2016.dogfight.controller;

public class EventPerformer {
	
	public EventPerformer (IOrderPerformer orderPerformer) {
		
	}
	
	public void eventPerform (KeyEvent keyEvent) {
		
	}
	
	//controle avec le clavier
	
	private UserOrder keyCodeToUserOrder(int keyCode) {
		UserOrder userOrder;
		switch (keyCode) {
		case KeyEvent.VK_RIGHT:
			userOrder = new UserOrder(1, Order.RIGHT);
			break;
		case KeyEvent.VK_LEFT:
			userOrder = new UserOrder(1, Order.LEFT);
			break;
		case KeyEvent.VK_UP:
			userOrder = new UserOrder(1, Order.UP);
			break;
		case KeyEvent.VK_DOWN:
			userOrder = new UserOrder(1, Order.DOWN);
			break;
		case KeyEvent.VK_SPACE:
			userOrder = new UserOrder(1, Order.SHOOT);
			break;
		default:
			userOrder = new UserOrder(0, Order.NOP);
			break;
		}
		return userOrder;
	}

}
