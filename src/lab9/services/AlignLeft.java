package lab9.services;
import lab9.models.*;

public class AlignLeft implements AlignStrategy {

	@Override
	public void render(Paragraph p, Context c) {
		// TODO Auto-generated method stub
		System.out.println("Paragraph: " + p.getName() + " align left");
	}

}
