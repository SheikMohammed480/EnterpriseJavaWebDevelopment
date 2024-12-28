package Advanced;
import javax.swing.*;    
public class ToolTipExample {  
	
    public static void main(String[] args) {
    	
     JFrame f=new JFrame("im password block");    
     //Creating PasswordField and label  
     JPasswordField value = new JPasswordField();   
     value.setBounds(100,100,100,30);    
     value.setToolTipText("insert pannunga");  
     JLabel l1=new JLabel("Password:");    
     l1.setBounds(20,100, 40,30);    
     //Adding components to frame  
     f.add(value);  
     f.add(l1);  
     f.setSize(300,300);    
     f.setLayout(null);    
     f.setVisible(true);      
}  
}  
