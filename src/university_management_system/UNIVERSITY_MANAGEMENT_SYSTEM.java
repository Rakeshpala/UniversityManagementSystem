
package university_management_system;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.*;


public class UNIVERSITY_MANAGEMENT_SYSTEM extends JFrame implements Runnable{
   
    UNIVERSITY_MANAGEMENT_SYSTEM(){
    	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2 =i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		add(image);
                
               Thread t=new Thread(this);
                t.start();
                setVisible(true);
                
                int x =1;
                for(int i=2;i<=600;i+=4,x+=1){
                setLocation(600-((i+x)/2),350-(i/2));
		setSize(i + 2*x, i+x/2);
                }
                
                try{
                Thread.sleep(6000);
                
                }catch(Exception e){
                
                }
		
		
		
	}
    
    public void run(){
    try{
    Thread.sleep(9000);
    setVisible(false);
    //Next Frame
    new Login();
    }catch(Exception e){
    }
    }

	public static void main(String[] args) {
		new UNIVERSITY_MANAGEMENT_SYSTEM();
	}
   
   
}
