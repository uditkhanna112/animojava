
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author udit
 */
public class f2 extends javax.swing.JFrame {
    public int x;
    public String name;
    public String pname;
    public String pname1;
    public String cont;
    public String email;
    public String vpass;
    public String vname;
    public int age;
   Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
Date d = new Date();
String country[]=Locale.getISOCountries();

    Connection con = null;
    Statement st = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    /**
     * Creates new form f2
     */
    public f2() {
    this.setUndecorated(true);
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        for(int i=0;i<country.length;i++){
       String countryy=country[i];
    Locale l = new Locale("en",countryy);
  
    String ss= l.getDisplayCountry();
    c1.addItem(ss);
}

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel11 = new javax.swing.JLabel();
        t10 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        c1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        p2 = new javax.swing.JPasswordField();
        p1 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 2, 50)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Email");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 200, -1));
        getContentPane().add(t10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 780, 290, 50));

        t7.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        t7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));
        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 310, 60));

        c1.setFont(new java.awt.Font("Arial", 2, 36)); // NOI18N
        c1.setForeground(new java.awt.Color(255, 255, 255));
        c1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 4, true));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 700, 300, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 140, 100));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 2, 50)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Re-Type Password");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 430, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 2, 50)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Password");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 240, -1));

        p2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        p2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));
        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 310, 60));

        p1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 310, 60));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 2, 50)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Age");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 770, 200, 80));

        t3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        t3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 590, 310, 60));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 2, 50)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Country");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 700, 200, 60));

        t1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        t1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 310, 60));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 120)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("REGISTER PAGE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 1110, 120));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 2, 50)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Contact");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 200, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 2, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 230, 60));

        jButton1.setBackground(java.awt.SystemColor.windowBorder);
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 850, 290, 80));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\udit\\Desktop\\architecture-attractive-background-988873.jpg")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -1, 2030, 2580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
       int vage;
       int code=(int) Math.random();
       
        age=Integer.parseInt(t10.getText());
           

        name=t1.getText();

        cont=t3.getText();
         email=t7.getText();
         pname=p1.getText();
         pname1=p2.getText();
         vpass=validatepassword(pname,pname1);
         vname=namevalidation(name); 
        
         System.out.println(name);
        boolean e=emailvalidation(email);
if(vname==null)
    return;
if(vpass==null)
    return;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/myproject","root","uditkhanna112");
            //here sonoo is database name, root is username and password
            String str= "Insert into membership (mname,email,password,age) values('"+vname+"',"
            + "'"+email+"','"+vpass+"','"+age+"'); ";
            st=con.createStatement();
            st.executeUpdate(str);
                    
            con.close();
        }
        catch(ClassNotFoundException | SQLException e1){ System.out.println(e1);}
        working w = new working();
        w.setName(name);
        w.setAge(age);
        login l= new login();
        l.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t7ActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
f1 f=new f1();
f.setVisible(true);
this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(f2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField p1;
    private javax.swing.JPasswordField p2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t7;
    // End of variables declaration//GEN-END:variables

    private boolean emailvalidation(String email) {
       if (email.matches("[A-Za-z0-9_.]+[@][A-Za-z.]+$"))
{
return true;
}
       else{
    JOptionPane.showMessageDialog(rootPane,"Invalid email address");
    return false;
 //To change body of generated methods, choose Tools | Templates.
       } }

    private String namevalidation(String name) {
        String name1;
        if(name.length()>0){
            if(name.matches("[a-zA-Z]{1}+[a-zA-Z0-9\\s]{2,30}")){
        name1=name.trim().toUpperCase();
        return name1;
        }
            else
            {
            JOptionPane.showMessageDialog(rootPane, "Name should start with an alphabet");
            return null;
            }
            
        }
        
        else{
            JOptionPane.showMessageDialog(rootPane, "Please Enter your name");
        return null;
        }
    }

    private String validatepassword(String pname, String pname1) {
      
        if((pname.matches("[a-zA-Z]{1}+[a-zA-Z0-9@._]{7,20}"))&&(pname1.matches("[a-zA-Z]{1}+[a-zA-Z0-9@._]{7,20}"))){
           
            if(pname.equals(pname1))
                return pname;
            else{
                JOptionPane.showMessageDialog(rootPane, "Passwords do not match");
                return null;
            }
            }
        else{
            JOptionPane.showMessageDialog(rootPane, "<html><p>1. Passwords must be atleast 8 letters long</p><p>2. Password should begin with an alphabet and only contains"
                    + " numbers and alphabets</p><p>3. Password should not contain any special character except @ and _ symbol </p>"
                    + " <p>4.Password should not contain any space character</p></html> ");
            return null;
        }
    }}

    

    








