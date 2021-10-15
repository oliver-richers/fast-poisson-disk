package fast.poisson.disk;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Image {

	private BufferedImage image;

	public Image(int width, int height) {

		this.image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	}

	public int getWidth() {

		return image.getWidth();
	}

	public int getHeight() {

		return image.getHeight();
	}

	public void setPixel(int x, int y) {

		image.setRGB(x, y, 0xFFFFFF);
	}

	public void writePng(File output) {

		try {
			boolean written = ImageIO.write(image, "png", output);
			if (written) {
				System.err.println("Image written.");
			} else {
				throw new RuntimeException("Failed to write image file.");
			}
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
}
