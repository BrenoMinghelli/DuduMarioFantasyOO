package tesssssssss;

import java.awt.image.BufferedImage;

public class teeee {
	
	private BufferedImage image;
	
	public teeee(BufferedImage image) {
		this.image=image;
		
	}
	
	public BufferedImage grabImage(int col, int row, int wid, int hei) {
		BufferedImage img = image.getSubimage((col*72)-72, (row*72)-72, wid, hei);
		return img;
	}

}
