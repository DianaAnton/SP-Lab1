package lab10.services;
import lab10.models.*;

public class BMPImageLoader implements ImageLoader {

	@Override
	public ImageContent load(String img) {
		// TODO Auto-generated method stub
		System.out.println("Creating BMP image");
		return new ImageContent(img);
	}
}
