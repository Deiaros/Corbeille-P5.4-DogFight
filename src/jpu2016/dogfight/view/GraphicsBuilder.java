package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;

public abstract class GraphicsBuilder implements jpu2016.gameframe.IGraphicsBuilder {
	
	public IDogfightModel dogfightModel;

	
	public GraphicsBuilder(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}
	
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {
		
	}
	
	private void buildEmptySky() {
		
	}
	
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer) {
		
	}
	
	public int getGlobalWidth() {
		return 1;
	}
	
	public int getGlobalHeight() {
		return 1;
	}

}
