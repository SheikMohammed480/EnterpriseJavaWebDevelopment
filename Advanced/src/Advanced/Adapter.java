package Advanced;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Adapter {
	Frame f;
	Adapter()
	{
		f=new Frame("Window Adapter");// solve window closing issue
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing (WindowEvent e)
			{
				f.dispose();
			}
		});
		f.setSize(500,500);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new Adapter();
	}
}
	//Frame f;
//	Adapter()
//	{
//		f=new Frame("windowClosing");
//		f.addWindowListener(new WindowAdapter()
//		{
//			public void windowClosing(WindowEvent e)
//			{
//				f.dispose();
//				
//			}
//			
//		});
//		f.setSize(400,400);
//		f.setVisible(true);
//	}
//	public static void main(String[] args)
//	{
//		new Adapter();
//	}
//	}