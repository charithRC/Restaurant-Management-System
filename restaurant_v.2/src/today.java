
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;


public class today extends javax.swing.JFrame {
int month,today;
                                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                LocalDate localDate = LocalDate.now();
                             //   System.out.println(dtf.format(localDate));
    public today() {
        initComponents();
        date_area.setText(dtf.format(localDate).toString());
        setSize(700,600);
                        Calendar cal = Calendar.getInstance(); 
                        cal.getTime(); 
                        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss"); 
                        month=cal.get(Calendar.MONTH);
                        today=cal.get(Calendar.DATE);
                        	
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/restaurant_db","root","Pass9876"); 
                Statement st=con.createStatement();
                String q= "select * from billing where date='"+today+"'";  
                ResultSet rs=st.executeQuery(q);
                String value="";
            while(rs.next())
                {  
                   String item_name=rs.getString("item_name");
                   int quantity=rs.getInt("quantity");        
                   int item_price=rs.getInt("item_price");
                   String order_id=rs.getString("order_id");
                   int total=rs.getInt("total");
                   
                    value = value+"ORDER ID="+order_id+"\n"+"ITEM NAME="+item_name+"\n"+"QUANTITY="+quantity+"\n"+"PRICE="+item_price+"\n"+"TOTAL="+total+"\n"; 
//                   bill_area2.setText("ITEM NAME="+item_name+"\n"+"QUANTITY="+quantity+"\n"+"ITEM PRICE="+item_price+"\n"+"TOTAL="+total+"\n"+"ORDER ID="+order_id+"\n"+"TOTAL PRICE="+tp);
                   today_text_area.setText(value);
                   System.out.println("item_name="+item_name+"  quantity="+quantity+"  item_price="+item_price+"  total="+total);
                }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        today_text_area = new javax.swing.JTextArea();
        date_area = new javax.swing.JTextField();
        date = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(3, 24, 24));

        jPanel1.setBackground(new java.awt.Color(3, 24, 24));

        today_text_area.setEditable(false);
        today_text_area.setBackground(new java.awt.Color(3, 24, 24));
        today_text_area.setColumns(20);
        today_text_area.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        today_text_area.setForeground(new java.awt.Color(255, 255, 255));
        today_text_area.setRows(5);
        today_text_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        jScrollPane1.setViewportView(today_text_area);

        date_area.setEditable(false);
        date_area.setBackground(new java.awt.Color(3, 24, 24));
        date_area.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        date_area.setForeground(new java.awt.Color(255, 255, 255));
        date_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        date_area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_areaActionPerformed(evt);
            }
        });

        date.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("DATE:");

        date1.setBackground(new java.awt.Color(3, 24, 24));
        date1.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        date1.setForeground(new java.awt.Color(255, 255, 255));
        date1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date1.setText("TODAY");

        jButton1.setBackground(new java.awt.Color(3, 24, 24));
        jButton1.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(3, 24, 24));
        jButton2.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("EXIT");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(date_area, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(311, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_area, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 290, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void date_areaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_areaActionPerformed
            
    }//GEN-LAST:event_date_areaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         manager info1 =new manager();
            info1.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new today().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JLabel date1;
    private javax.swing.JTextField date_area;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea today_text_area;
    // End of variables declaration//GEN-END:variables
}
