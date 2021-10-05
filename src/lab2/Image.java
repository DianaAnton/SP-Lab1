/**
 * 
 */
package lab2;

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
        System.out.println(imageName);
    }
}
