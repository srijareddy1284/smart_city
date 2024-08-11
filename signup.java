import java.awt.*;
import javax.swing.*;
public class signup extends Frame
{

    signup() 
    {
        JFrame f=new JFrame("SIGNUP");
        //color
                Color bc = new Color	(2,131,205,255);
        
                //font
        
                Font font = new Font("Arial", Font.PLAIN, 15);
        
        //login page
                JLabel lo=new JLabel("SIGNUP");
                lo.setBounds(730,135,100,20);
                lo.setFont(font);
                lo.setBackground(Color.blue);
                f.add(lo);

                JLabel fu=new JLabel("Full Name");
                fu.setBounds(600,180,100,20);
                fu.setFont(font);
                f.add(fu);

                JTextField ful=new JTextField();
                ful.setBounds(730,180,200,20);
                f.add(ful);

                JLabel em=new JLabel("E-mail");
                em.setBounds(600,220,100,20);
                em.setFont(font);
                f.add(em);

                JTextField ema=new JTextField();
                ema.setBounds(730,220,200,20);
                f.add(ema);
                

                JLabel u=new JLabel("Username");
                u.setBounds(600,260,100,20);
                u.setFont(font);
                f.add(u);

                JTextField log=new JTextField();
                log.setBounds(730,260,200,20);
                f.add(log);
        
                JLabel p=new JLabel("Password");
                p.setBounds(600,300,100,20);
                p.setFont(font);
                f.add(p);

                JPasswordField pa=new JPasswordField();
                pa.setBounds(730,300,200,20);
                f.add(pa);

                JLabel cp=new JLabel("Confirm Password");
                cp.setBounds(600,340,150,20);
                cp.setFont(font);
                f.add(cp);
        
                
                JPasswordField cpa=new JPasswordField();
                cpa.setBounds(730,340,200,20);
                f.add(cpa);

                JLabel dob=new JLabel("Date of birth");
                dob.setBounds(600,380,150,20);
                dob.setFont(font);
                f.add(dob);

                JTextField db=new JTextField();
                db.setBounds(730,380,200,20);
                f.add(db);


                JLabel gen=new JLabel("Gender");
                gen.setBounds(600,420,150,20);
                gen.setFont(font);
                f.add(gen);

                CheckboxGroup cbg = new CheckboxGroup();  
        	Checkbox c1 = new Checkbox("Male", cbg, false);    
        	c1.setBounds(750,420, 50,20);    
        	Checkbox c2 = new Checkbox("Female", cbg, true);    
        	c2.setBounds(800,420, 50,20);   
                f.add(c1);
                f.add(c2);

                JLabel con=new JLabel("Country/Location");
                con.setBounds(600,460,150,20);
                con.setFont(font);
                f.add(con);

                JTextField cont=new JTextField();
                cont.setBounds(730,460,200,20);
                f.add(cont);

                JLabel mob=new JLabel("Mobile No");
                mob.setBounds(600,500,150,20);
                mob.setFont(font);
                f.add(mob);

                JTextField mobi=new JTextField();
                mobi.setBounds(730,500,200,20);
                f.add(mobi);

                JCheckBox agr =new JCheckBox();
                agr.setBounds(600,540,20,20);
                f.add(agr);

                JLabel agree=new JLabel("agree to the terms and the conditions of using this service.");
                agree.setBounds(630,540,330,20);
                f.add(agree);

                JButton sign =new JButton("SIGN UP");
                sign.setBounds(730,580,100,30);
                f.add(sign);        
               
//borders
Label li1=new Label();
Label li2=new Label();
Label li3=new Label();
Label li4=new Label();
Label li5=new Label();

li1.setBounds(570,130,2,550);
li2.setBounds(570,130,400,2);
li3.setBounds(570,160,400,2);
li4.setBounds(570,680,400,2);
li5.setBounds(970,130,2,550);
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
    signup s=new signup();
    
}
    
}