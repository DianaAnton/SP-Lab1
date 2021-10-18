/**
 * 
 */
package lab3;

/**
 * @author Diana Anton
 *
 */
public class Image implements Element {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }
    
    public void print(){
        System.out.println("Image with name: " + imageName);
    }

	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub
		// nu e nevoie sa le implementam ca astea sunt frunze
	}

	@Override
	public Element get(int poz) {
		// TODO Auto-generated method stub
		// nu e nevoie sa le implementam ca astea sunt frunze
		return null;
	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		// nu e nevoie sa le implementam ca astea sunt frunze
	}

	@Override
	public boolean find(Element e) {
		// TODO Auto-generated method stub
		if (!(e instanceof Image)) {
			return false;
		}
		else {
			return ((Image) e).imageName.equals(this.imageName);
		}
	}
}
