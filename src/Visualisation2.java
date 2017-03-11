import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Visualisation2 {

	public Visualisation2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		  JFrame frame=new JFrame("Visualisation");
	        frame.setSize(800,800);
	        frame.setResizable(false);
	        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	        DrawTriangle triangle=new DrawTriangle(100,100,100,200,200,100);
	        frame.add(triangle);
	        frame.setVisible(true);
	}

}
