
package resturant;
import javax.swing.*;
import java.awt.*;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
public class Profile extends JFrame {
    
   
    JTextField [] t= new JTextField[100];
    JLabel [] L  = new JLabel[20];
    JButton [] b = new JButton[20]; 
    JPanel first = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JTable table;
    JTextArea tr = new JTextArea("Report Customer");
    DefaultTableModel model = new DefaultTableModel();    
    JPanel sp = new JPanel();
    JScrollPane pr = new JScrollPane(sp,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    public Profile(){
        this.setTitle("Resturant");
        this.setSize(1200,1080);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocation(700,20);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p3.setBounds(0,0, 1200, 1080);
        p3.setBackground(Color.lightGray);
        this.add(p3);
         String [] colums  = {"ID","Name","Password","Eslam"};
          Object [] Row = {"15","Eslam","5484","fayez"};
          Object [][] data  = {{"ID","Name","Password","Eslam"},{"ID","Name","Password","Eslam"},{"ID","Name","Password","Eslam"}};
         
          table = new JTable(model);
          model.addColumn("Id");
          model.addColumn("name");
          model.addColumn("password");
          model.addColumn("Price");
          model.addRow( colums);
          model.addRow(Row);
          table.setRowHeight(30);
          table.setFont( new Font("",NORMAL,15) {
          });
          JScrollPane  pr2= new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);   
          pr2.setBounds(640, 20 ,550, 700);p3.add(pr2);
        p3.setLayout(null);
        JLabel img = new JLabel(new ImageIcon("C:\\Users\\eslam\\Desktop\\h.png"));
        L[9] = new JLabel("Name");L[9].setBounds(30, 100, 150, 50);p3.add(L[9]);L[9].setFont( new Font("",NORMAL,20));
        L[10] = new JLabel("Phone");L[10].setBounds(30, 170, 150, 50);p3.add(L[10]);L[10].setFont( new Font("",NORMAL,20));
        L[11] = new JLabel("Email");L[11].setBounds(30, 240, 150, 50);p3.add(L[11]);L[11].setFont( new Font("",NORMAL,20));
        L[13] = new JLabel ("Age");L[13].setBounds(30, 310, 150, 50);p3.add(L[13]);L[13].setFont( new Font("",NORMAL,20));
        L[14] = new JLabel("Adress");L[14].setBounds(30, 380, 150, 50);p3.add(L[14]);L[14].setFont( new Font("",NORMAL,20));
        L[15] = new JLabel("Number of Home");L[15].setBounds(30, 450, 150, 50);p3.add(L[15]);L[15].setFont( new Font("",NORMAL,20));
        L[16] = new JLabel("Street");L[16].setBounds(290, 450, 150, 50);p3.add(L[16]);L[16].setFont( new Font("",NORMAL,20));
        L[17] = new JLabel("city");L[17].setBounds(30, 530 , 150, 50);p3.add(L[17]);L[17].setFont( new Font("",NORMAL,20));
        L[18] = new JLabel("country");L[18].setBounds(350, 530 , 150, 50);p3.add(L[18]);L[18].setFont( new Font("",NORMAL,20));
        L[19] = new JLabel("Gender");L[19].setBounds(30, 600 , 150, 50);p3.add(L[19]);L[19].setFont( new Font("",NORMAL,20));
        t[7] = new JTextField();t[7].setBounds(180, 100, 250, 40);p3.add(t[7]);t[7].setFont( new Font("",NORMAL,20));
        t[8] = new JTextField();t[8].setBounds(180, 170, 250, 40);p3.add(t[8]);;t[8].setFont( new Font("",NORMAL,20));
        t[9] = new JTextField();t[9].setBounds(180, 240, 350, 40);p3.add(t[9]);t[9].setFont( new Font("",NORMAL,20));
        t[10] = new JTextField();t[10].setBounds(180, 310, 100, 40);p3.add(t[10]);t[10].setFont( new Font("",NORMAL,20));
        t[11] = new JTextField();t[11].setBounds(190, 450, 80, 40);p3.add(t[11]);t[11].setFont( new Font("",NORMAL,20));
        t[12] = new JTextField();t[12].setBounds(370, 450, 250, 40);p3.add(t[12]);t[12].setFont( new Font("",NORMAL,20));
        t[13] = new JTextField();t[13].setBounds(130, 530, 200, 40);p3.add(t[13]);t[13].setFont( new Font("",NORMAL,20));
        t[14] = new JTextField(); t[14].setBounds(430, 530, 200, 40);p3.add(t[14]);t[14].setFont( new Font("",NORMAL,20));
        String Gender[] = {"Male","Female"};
        JComboBox co = new JComboBox(Gender);
        co.setBounds(180,600, 150, 40);p3.add(co);
        
       b[14] = new JButton("Update Data");b[14].setBounds(100, 680, 200, 50);p3.add(b[14]);b[14].setBackground(Color.PINK);b[14].setFont( new Font("",NORMAL,20));
       b[15] = new JButton("Fire Customer");b[15].setBounds(320, 680, 200, 50);p3.add(b[15]);b[15].setBackground(Color.PINK);b[15].setFont( new Font("",NORMAL,20));
       tr.setBounds(50, 750, 800, 200);p3.add(tr);tr.setFont( new Font("",NORMAL,20));
       b[18] = new JButton("Save Report");b[18].setBounds(900, 900, 200, 50);p3.add(b[18]);b[18].setBackground(Color.YELLOW);b[18].setFont( new Font("",NORMAL,20));
        
    }
    
}
