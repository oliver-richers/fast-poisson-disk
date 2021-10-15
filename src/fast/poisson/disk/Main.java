package fast.poisson.disk;

import java.io.File;
import java.io.IOException;

public class Main {

	private static final File OUTPUT = new File(System.getProperty("user.home") + "/fast-poisson-disk.png");
	private static final int WIDTH = 1024;
	private static final int HEIGHT = 1024;
	private static final int MINIMUM_DISTANCE = 5;
	private static final int NEW_POINTS_COUNT = 30;

	public static void main(String[] args) throws IOException {

		Image image = new Image(WIDTH, HEIGHT);

		new DiskGenerator(WIDTH, HEIGHT, MINIMUM_DISTANCE, NEW_POINTS_COUNT)//
				.generate()//
				.forEach(point -> image.setPixel(point.getX(), point.getY()));

		image.writePng(OUTPUT);
	}
}
