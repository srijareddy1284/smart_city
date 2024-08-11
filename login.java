import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
public class login extends Frame
{

    login() 
    {
        JFrame f=new JFrame("LOGIN/SIGNUP");
//color
        Color bc = new Color	(2,131,205,255);

        //font

        Font font = new Font("Arial", Font.PLAIN, 15);

//login page
        JLabel lo=new JLabel("LOGIN");
        lo.setBounds(730,190,100,20);
        lo.setFont(font);
        lo.setBackground(Color.blue);
        f.add(lo);

        JLabel u=new JLabel("Username");
        u.setBounds(600,250,100,20);
        u.setFont(font);
        f.add(u);

        JLabel p=new JLabel("Password");
        p.setBounds(600,330,100,20);
        p.setFont(font);
        f.add(p);

        JTextField log=new JTextField();
        log.setBounds(600,280,150,20);
        JPasswordField pa=new JPasswordField();
        pa.setBounds(600,360,100,20);
        f.add(log);
        f.add(pa);

        Button b =new Button("LOGIN");
        b.setBounds(600,400,100,20);
        b.setBackground(bc);
        f.add(b);

        JLabel or=new JLabel("-------------------------------or------------------------------------  ");
        or.setBounds(600,430,350,20);
        or.setFont(font);
        f.add(or);

        Button b2 =new Button("Continue with Google");
        b2.setBounds(680,460,200,20);
        b2.setBackground(bc);
        f.add(b2);

        JLabel ac=new JLabel("Do You Have an account?");
        ac.setBounds(600,500,200,20);
        ac.setFont(font);
        f.add(ac);

        Button b1 =new Button("SIGN UP");
        b1.setBounds(780,500,100,20);
        b1.setBackground(bc);
        f.add(b1);

//borders
Label li1=new Label();
Label li2=new Label();
Label li3=new Label();
Label li4=new Label();
Label li5=new Label();

li1.setBounds(570,180,2,400);
li2.setBounds(570,180,400,2);
li3.setBounds(570,220,400,2);
li4.setBounds(570,580,400,2);
li5.setBounds(970,180,2,400);
li1.setBackground(Color.black);
li2.setBackground(Color.black);
li3.setBackground(Color.black);
li4.setBackground(Color.black);
li5.setBackground(Color.black);


f.add(li1);
f.add(li2);
f.add(li3);
f.add(li4);
f.add(li5);

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
    login h=new login();
    
}
    
}