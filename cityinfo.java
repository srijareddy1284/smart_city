import java.awt.*;
import javax.swing.*;
public class cityinfo extends Frame
{

    cityinfo() 
    {
        JFrame f=new JFrame("city info");

//font
        Font font = new Font("Arial", Font.PLAIN, 15);
        
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


//tabbed pane

JTabbedPane tp=new JTabbedPane();
tp.setBounds(5,105,1530,580);
f.add(tp);

JPanel panel1=new JPanel();
JPanel panel2=new JPanel();
JPanel panel3=new JPanel();
JPanel panel4=new JPanel();
JPanel panel5=new JPanel();
JPanel panel6=new JPanel();


//JLabel hot=new JLabel("Hotels");

JLabel hot;
        ImageIcon imgh= new ImageIcon("hotel.png");
        hot=new JLabel("",imgh,JLabel.CENTER);
        hot.setBounds(50,50,100,100);
        

JLabel res;
        ImageIcon imgr= new ImageIcon("resta.png");
        res=new JLabel("",imgr,JLabel.CENTER);
        res.setBounds(50,50,100,100);
 

JLabel shp;
        ImageIcon imgs= new ImageIcon("shpml.png");
        shp=new JLabel("",imgs,JLabel.CENTER);
        shp.setBounds(50,50,100,100);
        

JLabel tou;
        ImageIcon imgt= new ImageIcon("tourist.png");
        tou=new JLabel("",imgt,JLabel.CENTER);
        tou.setBounds(50,50,100,100);

JLabel tra;
        ImageIcon imgtr= new ImageIcon("transpo.png");
        tra=new JLabel("",imgtr,JLabel.CENTER);
        tra.setBounds(50,50,100,100);

JLabel par;
        ImageIcon imgp= new ImageIcon("park.png");
        par=new JLabel("",imgp,JLabel.CENTER);
        par.setBounds(50,50,100,100);



panel1.add(hot);
panel2.add(res);
panel3.add(shp);
panel4.add(tou);
panel5.add(tra);
panel6.add(par);

tp.add("Hotels",panel1);
tp.add("Restuarants",panel2);
tp.add("shopping marts",panel3);
tp.add("Tourist Places",panel4);
tp.add("Transportation",panel5);
tp.add("Parks",panel6);



        f.setLayout(new BorderLayout());  
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JPanel p4=new JPanel();
        JPanel p5=new JPanel();

        Color bc = new Color	(2,131,205,255);

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
    cityinfo h=new cityinfo();
    
}
    
}