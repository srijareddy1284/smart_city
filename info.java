import java.awt.*;
import javax.swing.*;
public class info extends Frame
{

    info() 
    {
        JFrame f=new JFrame("info");

//font
        Font font = new Font("Arial", Font.PLAIN, 15);
//color
Color bc = new Color	(2,131,205,255);
        
//logo
JLabel bgg;
        ImageIcon imgg= new ImageIcon("llogo.jpg");
        bgg=new JLabel("",imgg,JLabel.CENTER);
        bgg.setBounds(20,5,100,90);
        f.add(bgg);

//search bar
        JTextField t=new JTextField("search here");
        t.setBounds(240,50,800,30);
        f.add(t);

//search icon
JLabel ic;
        ImageIcon imgc= new ImageIcon("search.png");
        ic=new JLabel("",imgc,JLabel.CENTER);
        ic.setBounds(205,50,30,30);
        f.add(ic);

//info
Button b1= new Button("Hotels");  
Button b2=new Button("Shopping marts");  
Button b3=new Button("Restuarants");  
Button b4=new Button("Tourist places");
Button b5=new Button("Transportation");  
Button b6=new Button("Parks");
b1.setBounds(20,130,400,150);
b2.setBounds(20,330,400,150);
b3.setBounds(20,530,400,150);
b4.setBounds(430,130,400,150);
b5.setBounds(430,330,400,150);
b6.setBounds(430,530,400,150);
 Font fo = new Font("Copper Black", Font.BOLD, 25);
b1.setFont(fo);
b2.setFont(fo);
b3.setFont(fo);
b4.setFont(fo);
b5.setFont(fo);
b6.setFont(fo);
b1.setBackground(bc);
b2.setBackground(bc);
b3.setBackground(bc);
b4.setBackground(bc);
b5.setBackground(bc);
b6.setBackground(bc);
f.add(b1);  
f.add(b2); 
f.add(b3); 
f.add(b4); 
f.add(b5);  
f.add(b6);  

 
//image
        JLabel bg;
        ImageIcon img= new ImageIcon("hyd.jpg");
        bg=new JLabel("",img,JLabel.CENTER);
        bg.setBounds(900,100,600,600);
        f.add(bg);

//footer
        Label contactUsLabel = new Label("Contact Us-+919704802196");
        Label emailLabel = new Label("Email-smartcity@gmail.com");
        Label privacyPolicyLabel = new Label("Privacy Policy|Terms of Service");
         contactUsLabel.setBounds(0, 710, 200,20);
        emailLabel.setBounds(0, 740, 200,20);
        privacyPolicyLabel.setBounds(0, 770, 200,20);

        f.add(contactUsLabel);
        f.add(emailLabel);
        f.add(privacyPolicyLabel);

       
//home,aboutus,Signup
JButton l1=new JButton("Home");
JButton l2=new JButton("About Us");
JButton l3=new JButton("Login");

l1.setBounds(1200,50,80,30);
l2.setBounds(1290,50,100,30);
l3.setBounds(1400,50,100,30);
l1.setFont(font);
l2.setFont(font);
l3.setFont(font);

f.add(l1);
f.add(l2);
f.add(l3);





        f.setLayout(new BorderLayout());  
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JPanel p4=new JPanel();
        JPanel p5=new JPanel();

        

        p1.setBackground(bc);
        p2.setBackground(Color.white);
        p3.setBackground(Color.white);
        p4.setBackground(Color.white);
        p5.setBackground(bc);
        p1.setPreferredSize(new Dimension(100,100));
        p2.setPreferredSize(new Dimension(100,100));
        p3.setPreferredSize(new Dimension(100,100));
        p4.setPreferredSize(new Dimension(100,100));
        p5.setPreferredSize(new Dimension(100,100));
        f.add(p1,BorderLayout.NORTH);   
        f.add(p2,BorderLayout.WEST);
        f.add(p3,BorderLayout.CENTER);
        f.add(p4,BorderLayout.EAST);  
        f.add(p5,BorderLayout.SOUTH);



   
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(1600,1000);

        


    }
public static void main(String[] args) {
    info h=new info();
    
}
    
}