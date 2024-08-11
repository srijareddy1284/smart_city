import java.awt.*;
import javax.swing.*;
public class aboutus extends Frame
{

    aboutus() 
    {
        JFrame f=new JFrame("about us");


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

//about us
Font font1 = new Font("Arial", Font.PLAIN, 16);
Font fonts = new Font("Arial", Font.ITALIC, 25);
Color bc = new Color(2,131,205,255);
        JLabel wel =new JLabel("Welcome to Smart City - Your Ultimate Guide to Urban Exploration!\n");
        wel.setBounds(20,100,1500,30);
        wel.setFont(font1);
        f.add(wel);

        JLabel ab=new JLabel("About Us: Unveiling the Heart of Smart City \n");
        ab.setBounds(20,130,1500,40);
        ab.setFont(fonts);
        ab.setBackground(bc);
        f.add(ab);

         
        JLabel inf=new JLabel("<html>At Smart City, we believe in transforming your visit into an unforgettable urban adventure. Imagine a digital haven where information meets excitement, helping you navigate the bustling streets, discover hidden gems, and immerse yourself in the vibrant tapestry of city life.\n" + //
                        "</html>");
        inf.setBounds(20,170,1500,50);
        inf.setFont(font1);
        f.add(inf);

        JLabel viss=new JLabel("<html>Our Vision: Making Cities Smarter, One Click at a Time\n" + //
                        "</html>");
        viss.setBounds(20,220,1500,50);
        viss.setFont(fonts);
        f.add(viss);

         JLabel vis=new JLabel("<html>Smart City is more than just a website; it's a vision to empower every visitor with the tools they need to unlock the full potential of a city. We're on a mission to simplify exploration, enhance convenience, and make your journey through cityscapes seamless and enjoyable.</html>");
        vis.setBounds(20,260,1500,50);
        vis.setFont(font1);
        f.add(vis);


                JLabel who=new JLabel("<html>Who We Are: Your Digital City Companion\n" + //
                                "</html>");
        who.setBounds(20,310,1500,50);
        who.setFont(fonts);
        f.add(who);

         JLabel wh=new JLabel("<html>Meet the brains behind Smart City - a dynamic team of tech enthusiasts, urban explorers, and city aficionados. We've crafted this platform to be your digital companion, providing insider insights, local secrets, and everything you need to know about the heartbeat of a city.\n" + //
                         "</html>");
        wh.setBounds(20,360,1500,50);
        wh.setFont(font1);
        f.add(wh);


         JLabel what=new JLabel("<html>What Sets Us Apart: Beyond Ordinary Guides\n" + //
                         "</html>");
        what.setBounds(20,410,1500,50);
        what.setFont(fonts);
        f.add(what);

         JLabel wha=new JLabel("<html>Smart City is not your average travel guide. We're your interactive, user-friendly passport to city life. Whether you're a tourist looking for hotspots or a local seeking new adventures, our platform is designed to cater to all, making every city escapade uniquely yours.\n" + //
                         "</html>");
        wha.setBounds(20,460,1500,50);
        wha.setFont(font1);
        f.add(wha);

        JLabel na=new JLabel("<html> Navigating the Smart City Way: Explore, Connect, Enjoy\n" + //
                        "</html>");
        na.setBounds(20,510,1500,50);
        na.setFont(fonts);
        f.add(na);

         JLabel nav=new JLabel("<html>Our website offers a seamless experience - effortlessly surf through categories like hotels, shopping, dining, tourist spots, and transportation. Smart City is your one-stop-shop to plan, explore, and indulge in the essence of any city, big or small.\n" + //
                         "</html>");
        nav.setBounds(20,560,1500,50);
        nav.setFont(font1);
        f.add(nav);


        JLabel em=new JLabel("<html> Embark on Your Smart City Journey Today!\n" + //
                        "</html>");
        em.setBounds(20,610,1500,50);
        em.setFont(fonts);
        f.add(em);

         JLabel emb=new JLabel("<html>Ready to explore? Dive into the world of Smart City and let the urban adventure begin. Discover the city like never before, and let us be your digital guide to creating lasting memories.\n" + //
                         "</html>");
        emb.setBounds(20,650,1500,50);
        emb.setFont(font1);
        f.add(emb);

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
    aboutus h=new aboutus();
    
}
    
}