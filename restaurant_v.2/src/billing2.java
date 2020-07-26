
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class billing2 extends javax.swing.JFrame {
    
    public String orderitem,quantity;
    public int price,total_price1,total_price2,total_price3,total_price,i=0;
    JFrame f; 
    String a[]=new String[10];
    public billing2() {
        initComponents(); 
        setSize(700,600); 
        
    }
    public billing2(int total_price,String order) {     
                     initComponents();
                     setSize(700,600); 
                      grand_total.setText("GRAND TOTAL="+total_price);
                      System.out.println("GT="+total_price);
                    String tp=Integer.toString(total_price);
                    System.out.println("total_price on billing "+total_price); 
                    System.out.println("order id on billingNOWNOWNOWNOW="+order);
                    try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/restaurant_db","root","Pass9876"); 
                Statement st=con.createStatement();
                String q= "select * from billing where order_id='"+order+"'";
                ///////////////////////////ltfuyegrfdgfghjkpoiursdfxcnvbjhiy7t6rdnvb,bjkjrnjiyxfgchjbkjjrdghjb
               // PreparedStatement pstmt2=con.prepareStatement(q);
                //pstmt2.setString(1,order);    
                ResultSet rs=st.executeQuery(q);
                String value="";
            while(rs.next())
                {  
                   String item_name=rs.getString("item_name");
                   int quantity=rs.getInt("quantity");        
                   int item_price=rs.getInt("item_price");
                   int total=rs.getInt("total");
                   String order_id=rs.getString("order_id");
                    value = value+ "ITEM NAME="+item_name+"\n"+"QUANTITY="+quantity+"\n"+"PRICE="+item_price+"\n"+"TOTAL="+total+"\n"; 
//                   bill_area2.setText("ITEM NAME="+item_name+"\n"+"QUANTITY="+quantity+"\n"+"ITEM PRICE="+item_price+"\n"+"TOTAL="+total+"\n"+"ORDER ID="+order_id+"\n"+"TOTAL PRICE="+tp);
                   bill_area2.setText(value);
                   System.out.println("item_name="+item_name+"  quantity="+quantity+"  item_price="+item_price+"  total="+total);
                }
            System.out.println("order id="+order);
            System.out.println("sucess");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("DB connection error");
        }
                    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bill_area2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        grand_total = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 24, 24));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 700));

        jButton1.setBackground(new java.awt.Color(3, 24, 24));
        jButton1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ORDER MORE");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(3, 24, 24));
        jButton2.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("EXIT");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(3, 24, 24));
        jButton3.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("LOGOUT");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        bill_area2.setBackground(new java.awt.Color(3, 24, 24));
        bill_area2.setColumns(20);
        bill_area2.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        bill_area2.setForeground(new java.awt.Color(255, 255, 255));
        bill_area2.setRows(5);
        bill_area2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        jScrollPane1.setViewportView(bill_area2);

        jLabel1.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BILLING SUMMARY");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));

        grand_total.setBackground(new java.awt.Color(3, 24, 24));
        grand_total.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        grand_total.setForeground(new java.awt.Color(255, 255, 255));
        grand_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        grand_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grand_totalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grand_total))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grand_total, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(225, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 432, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 530, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            waiter1 info=new waiter1();
            info.setVisible(true);
            
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            login_page info1=new login_page(); 
            info1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void grand_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grand_totalActionPerformed
           
    }//GEN-LAST:event_grand_totalActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billing2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bill_area2;
    private javax.swing.JTextField grand_total;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
