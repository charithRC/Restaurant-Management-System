
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class waiter1 extends javax.swing.JFrame {
     public String item_name[] = new String[10];
     public String item_price[] = new String[10];
    public String order_id,orderitem,quantity;
    public int price,total_price1,total_price2,total_price3,total_price4,total_price5,total_price6,total_price,month,date;
    JFrame f; 
    String array[];
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        momos_var = new javax.swing.JTextField();
        sandwich_var = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        order_id_var = new javax.swing.JTextField();
        item_name4 = new javax.swing.JTextField();
        item_name1 = new javax.swing.JTextField();
        tf01 = new javax.swing.JTextField();
        tf03 = new javax.swing.JTextField();
        tf02 = new javax.swing.JTextField();
        item_name2 = new javax.swing.JTextField();
        tf22 = new javax.swing.JTextField();
        tf21 = new javax.swing.JTextField();
        tf23 = new javax.swing.JTextField();
        burger_var = new javax.swing.JTextField();
        tf05 = new javax.swing.JTextField();
        tf04 = new javax.swing.JTextField();
        tf06 = new javax.swing.JTextField();
        tf24 = new javax.swing.JTextField();
        tf25 = new javax.swing.JTextField();
        tf26 = new javax.swing.JTextField();
        momos_var1 = new javax.swing.JTextField();
        momos_var2 = new javax.swing.JTextField();
        momos_var3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(3, 24, 24));

        momos_var.setBackground(new java.awt.Color(3, 24, 24));
        momos_var.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        momos_var.setForeground(new java.awt.Color(255, 255, 255));
        momos_var.setText("0");
        momos_var.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        momos_var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                momos_varActionPerformed(evt);
            }
        });

        sandwich_var.setBackground(new java.awt.Color(3, 24, 24));
        sandwich_var.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        sandwich_var.setForeground(new java.awt.Color(255, 255, 255));
        sandwich_var.setText("0");
        sandwich_var.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        sandwich_var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sandwich_varActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(3, 24, 24));
        jButton1.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ORDER");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        order_id_var.setBackground(new java.awt.Color(3, 24, 24));
        order_id_var.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        order_id_var.setForeground(new java.awt.Color(255, 255, 255));
        order_id_var.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        order_id_var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_id_varActionPerformed(evt);
            }
        });

        item_name4.setBackground(new java.awt.Color(3, 24, 24));
        item_name4.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        item_name4.setForeground(new java.awt.Color(255, 255, 255));
        item_name4.setText("QUANTITY");
        item_name4.setBorder(null);
        item_name4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_name4ActionPerformed(evt);
            }
        });

        item_name1.setBackground(new java.awt.Color(3, 24, 24));
        item_name1.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        item_name1.setForeground(new java.awt.Color(255, 255, 255));
        item_name1.setText("MEALS");
        item_name1.setBorder(null);
        item_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_name1ActionPerformed(evt);
            }
        });

        tf01.setEditable(false);
        tf01.setBackground(new java.awt.Color(3, 24, 24));
        tf01.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tf01.setForeground(new java.awt.Color(255, 255, 255));
        tf01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        tf01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf01ActionPerformed(evt);
            }
        });

        tf03.setEditable(false);
        tf03.setBackground(new java.awt.Color(3, 24, 24));
        tf03.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tf03.setForeground(new java.awt.Color(255, 255, 255));
        tf03.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        tf03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf03ActionPerformed(evt);
            }
        });

        tf02.setEditable(false);
        tf02.setBackground(new java.awt.Color(3, 24, 24));
        tf02.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tf02.setForeground(new java.awt.Color(255, 255, 255));
        tf02.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        tf02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf02ActionPerformed(evt);
            }
        });

        item_name2.setBackground(new java.awt.Color(3, 24, 24));
        item_name2.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        item_name2.setForeground(new java.awt.Color(255, 255, 255));
        item_name2.setText("PRICE");
        item_name2.setBorder(null);
        item_name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_name2ActionPerformed(evt);
            }
        });

        tf22.setEditable(false);
        tf22.setBackground(new java.awt.Color(3, 24, 24));
        tf22.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tf22.setForeground(new java.awt.Color(255, 255, 255));
        tf22.setText("30");
        tf22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        tf22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf22ActionPerformed(evt);
            }
        });

        tf21.setEditable(false);
        tf21.setBackground(new java.awt.Color(3, 24, 24));
        tf21.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tf21.setForeground(new java.awt.Color(255, 255, 255));
        tf21.setText("50");
        tf21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        tf21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf21ActionPerformed(evt);
            }
        });

        tf23.setEditable(false);
        tf23.setBackground(new java.awt.Color(3, 24, 24));
        tf23.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tf23.setForeground(new java.awt.Color(255, 255, 255));
        tf23.setText("50");
        tf23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        tf23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf23ActionPerformed(evt);
            }
        });

        burger_var.setBackground(new java.awt.Color(3, 24, 24));
        burger_var.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        burger_var.setForeground(new java.awt.Color(255, 255, 255));
        burger_var.setText("0");
        burger_var.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        burger_var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burger_varActionPerformed(evt);
            }
        });

        tf05.setEditable(false);
        tf05.setBackground(new java.awt.Color(3, 24, 24));
        tf05.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tf05.setForeground(new java.awt.Color(255, 255, 255));
        tf05.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        tf05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf05ActionPerformed(evt);
            }
        });

        tf04.setEditable(false);
        tf04.setBackground(new java.awt.Color(3, 24, 24));
        tf04.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tf04.setForeground(new java.awt.Color(255, 255, 255));
        tf04.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        tf04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf04ActionPerformed(evt);
            }
        });

        tf06.setEditable(false);
        tf06.setBackground(new java.awt.Color(3, 24, 24));
        tf06.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tf06.setForeground(new java.awt.Color(255, 255, 255));
        tf06.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        tf06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf06ActionPerformed(evt);
            }
        });

        tf24.setEditable(false);
        tf24.setBackground(new java.awt.Color(3, 24, 24));
        tf24.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tf24.setForeground(new java.awt.Color(255, 255, 255));
        tf24.setText("50");
        tf24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        tf24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf24ActionPerformed(evt);
            }
        });

        tf25.setEditable(false);
        tf25.setBackground(new java.awt.Color(3, 24, 24));
        tf25.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tf25.setForeground(new java.awt.Color(255, 255, 255));
        tf25.setText("50");
        tf25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        tf25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf25ActionPerformed(evt);
            }
        });

        tf26.setEditable(false);
        tf26.setBackground(new java.awt.Color(3, 24, 24));
        tf26.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        tf26.setForeground(new java.awt.Color(255, 255, 255));
        tf26.setText("50");
        tf26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        tf26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf26ActionPerformed(evt);
            }
        });

        momos_var1.setBackground(new java.awt.Color(3, 24, 24));
        momos_var1.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        momos_var1.setForeground(new java.awt.Color(255, 255, 255));
        momos_var1.setText("0");
        momos_var1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        momos_var1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                momos_var1ActionPerformed(evt);
            }
        });

        momos_var2.setBackground(new java.awt.Color(3, 24, 24));
        momos_var2.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        momos_var2.setForeground(new java.awt.Color(255, 255, 255));
        momos_var2.setText("0");
        momos_var2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        momos_var2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                momos_var2ActionPerformed(evt);
            }
        });

        momos_var3.setBackground(new java.awt.Color(3, 24, 24));
        momos_var3.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        momos_var3.setForeground(new java.awt.Color(255, 255, 255));
        momos_var3.setText("0");
        momos_var3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        momos_var3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                momos_var3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(3, 24, 24));
        jButton2.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("GENERATE ORDER ID");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(item_name1)
                                .addComponent(tf01)
                                .addComponent(tf03)
                                .addComponent(tf05, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tf04)
                                .addComponent(tf06)
                                .addComponent(tf02))
                            .addComponent(jButton2))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(order_id_var)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf22)
                                        .addComponent(tf23, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                        .addComponent(tf21)
                                        .addComponent(tf24, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                        .addComponent(tf25, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                        .addComponent(tf26, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                                    .addComponent(item_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(item_name4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(burger_var, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sandwich_var, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(momos_var1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(momos_var)
                                            .addComponent(momos_var2)
                                            .addComponent(momos_var3))))))))
                .addContainerGap(406, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(order_id_var, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item_name4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(burger_var, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sandwich_var, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(momos_var, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(momos_var1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(momos_var3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(momos_var2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf01ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_tf01ActionPerformed

    private void tf03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf03ActionPerformed

    private void tf02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf02ActionPerformed

    private void item_name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_name2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item_name2ActionPerformed

    private void tf22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf22ActionPerformed

    private void tf21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf21ActionPerformed

    private void tf23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf23ActionPerformed
        // TODO add your hanling code here:
    }//GEN-LAST:event_tf23ActionPerformed

    private void burger_varActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burger_varActionPerformed
                       quantity= burger_var.getText();
                       price=50; 
                       order_id=order_id_var.getText();
                       total_price1=(Integer.parseInt(quantity))*price;
                       orderitem="burger";
                        try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/restaurant_db","root","Pass9876"); 
                Statement st=con.createStatement();
                            System.out.println("orderid12"+order_id);
                            System.out.println("orderitem12"+orderitem);
                            System.out.println("quantity12"+quantity);
                            System.out.println("price"+price);
                String q= "insert into order1 values(?,?,?,?)";
                PreparedStatement pstmt=con.prepareStatement(q);
                pstmt.setString(1,(order_id));              
                pstmt.setString(2,orderitem);               
                pstmt.setInt(3,Integer.parseInt(quantity));
                pstmt.setInt(4,price);
                pstmt.executeUpdate();
                            System.out.println("orderid1"+order_id);
                            System.out.println("orderitem1"+orderitem);
                            System.out.println("quantity1"+quantity);
                            System.out.println("price"+price); 
                         
        } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null,"db error","error",JOptionPane.ERROR_MESSAGE);
                        order_id_var.setText(null);
            System.out.println("DB connection error");
        }
                         try {//zzzzzzzzzzzzzzzzzz
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/restaurant_db","root","Pass9876"); 
                Statement st=con.createStatement();
                String q="insert into billing values(?,?,?,?,?,?,?)";
                             PreparedStatement pstmt2=con.prepareStatement(q);
                             pstmt2.setString(1,orderitem);               
                             pstmt2.setInt(2,Integer.parseInt(quantity));
                             pstmt2.setInt(3,price);
                             pstmt2.setInt(4,total_price1);
                             pstmt2.setString(5,order_id);
                             pstmt2.setInt(6,month);
                             pstmt2.setInt(7,date);



                             pstmt2.executeUpdate();                            
        } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null,"db error2","error",JOptionPane.ERROR_MESSAGE);
                        order_id_var.setText(null);
            System.out.println("DB connection error222222222");
        } 
         
    }//GEN-LAST:event_burger_varActionPerformed

    private void sandwich_varActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sandwich_varActionPerformed
          // TODO add your handling code here:
                      quantity=sandwich_var.getText(); 
                      orderitem="sandwitch";
                      price=60;
                      order_id=order_id_var.getText();     
                      total_price2=(Integer.parseInt(quantity))*price;
                       try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/restaurant_db","root","Pass9876"); 
                Statement st=con.createStatement();
                String q= "insert into order1 values(?,?,?,?)";
                PreparedStatement pstmt=con.prepareStatement(q);
                pstmt.setString(1,(order_id));              
                pstmt.setString(2,orderitem);               
                pstmt.setInt(3,Integer.parseInt(quantity));
                pstmt.setInt(4,price);
                pstmt.executeUpdate();
                            System.out.println("orderid1"+order_id);
                            System.out.println("orderitem1"+orderitem);
                            System.out.println("quantity1"+quantity);
                            System.out.println("price"+price);   
                            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null,"db error","error",JOptionPane.ERROR_MESSAGE);
                        order_id_var.setText(null);
            System.out.println("DB connection error");
        } 
                      try {//zzzzzzzzzzzzzzzzzz
             Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/restaurant_db","root","Pass9876"); 
                Statement st=con.createStatement();
                String q="insert into billing values(?,?,?,?,?,?,?)";
                             PreparedStatement pstmt2=con.prepareStatement(q);
                             pstmt2.setString(1,orderitem);               
                             pstmt2.setInt(2,Integer.parseInt(quantity));
                             pstmt2.setInt(3,price);
                             pstmt2.setInt(4,total_price2);
                             pstmt2.setString(5,order_id);
                             pstmt2.setInt(6,month);
                             pstmt2.setInt(7,date);



                             pstmt2.executeUpdate();                            
        } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null,"db error2","error",JOptionPane.ERROR_MESSAGE);
                        order_id_var.setText(null);
            System.out.println("DB connection error222222222");
        } 
         
                       
    }//GEN-LAST:event_sandwich_varActionPerformed

    private void momos_varActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_momos_varActionPerformed
                   // TODO add your handling code here:
                      quantity=momos_var.getText();
                      orderitem="momos";
                      price=90;
                      order_id=order_id_var.getText();
                      total_price3=(Integer.parseInt(quantity))*price;
                    
                                  try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/restaurant_db","root","Pass9876"); 
                Statement st=con.createStatement();
                String q= "insert into order1 values(?,?,?,?)";
                PreparedStatement pstmt=con.prepareStatement(q);
                pstmt.setString(1,(order_id));              
                pstmt.setString(2,orderitem);               
                pstmt.setInt(3,Integer.parseInt(quantity));
                pstmt.setInt(4,price);
                pstmt.executeUpdate();
                            System.out.println("orderid1"+order_id);
                            System.out.println("orderitem1"+orderitem);
                            System.out.println("quantity1"+quantity);
                            System.out.println("price"+price);   
                            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null,"db error","error",JOptionPane.ERROR_MESSAGE);
                        order_id_var.setText(null);
            System.out.println("DB connection error");
        } 
                      try {//zzzzzzzzzzzzzzzzzz
             Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/restaurant_db","root","Pass9876"); 
                Statement st=con.createStatement();
                String q="insert into billing values(?,?,?,?,?,?,?)";
                             PreparedStatement pstmt2=con.prepareStatement(q);
                             pstmt2.setString(1,orderitem);               
                             pstmt2.setInt(2,Integer.parseInt(quantity));
                             pstmt2.setInt(3,price);
                             pstmt2.setInt(4,total_price3);
                             pstmt2.setString(5,order_id);
                             pstmt2.setInt(6,month);
                             pstmt2.setInt(7,date);



                             pstmt2.executeUpdate();                            
        } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null,"db error2","error",JOptionPane.ERROR_MESSAGE);
                        order_id_var.setText(null);
            System.out.println("DB connection error222222222");
        }
         
         
    }//GEN-LAST:event_momos_varActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                           order_id=order_id_var.getText();     // TODO add your handling code here:

        /*try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/restaurant_db","root","Pass9876"); 
                Statement st=con.createStatement();
                            System.out.println("orderid12"+order_id);
                            System.out.println("orderitem12"+orderitem);
                            System.out.println("quantity12"+quantity);
                            System.out.println("price"+price);
                String q= "insert into order1 values(?,?,?,?)";
                PreparedStatement pstmt=con.prepareStatement(q);
                pstmt.setInt(1,Integer.parseInt(order_id));              
                pstmt.setString(2,orderitem);               
                pstmt.setInt(3,Integer.parseInt(quantity));
                pstmt.setInt(4,price);
                pstmt.executeUpdate();
                 
                            System.out.println("orderid1"+order_id);
                            System.out.println("orderitem1"+orderitem);
                            System.out.println("quantity1"+quantity);
                            System.out.println("price"+price);
                   f=new JFrame();  
                   JOptionPane.showMessageDialog(f,"order successful");               
        } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null,"duplicate order_id","error",JOptionPane.ERROR_MESSAGE);
                        order_id_var.setText(null);
            System.out.println("DB connection error");
        }  */                 
                     f=new JFrame();  
                     JOptionPane.showMessageDialog(f,"order successful");   
                     total_price=total_price1+total_price2+total_price3+total_price4+total_price5+total_price6;
                     System.out.println("totalprice"+total_price);
                     	

                      new billing2(total_price,order_id).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
                    
    private void order_id_varActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_id_varActionPerformed
                  // order_id=order_id_var.getText();     // TODO add your handling code here:
    }//GEN-LAST:event_order_id_varActionPerformed

    private void item_name4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_name4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item_name4ActionPerformed

    private void item_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item_name1ActionPerformed

    private void tf05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf05ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf05ActionPerformed

    private void tf04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf04ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf04ActionPerformed

    private void tf06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf06ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf06ActionPerformed

    private void tf24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf24ActionPerformed

    private void tf25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf25ActionPerformed

    private void tf26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf26ActionPerformed

    private void momos_var1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_momos_var1ActionPerformed
                                    System.out.println("orderitem1ajdjhsabndwhs");
              
                      quantity=momos_var1.getText();
                      orderitem="noodles";
                      //price=Integer.parseInt(item_price[4]);
                      price=50;
                      order_id=order_id_var.getText();
                      total_price4=(Integer.parseInt(quantity))*price;
                    System.out.println("orderid12"+order_id);
                            System.out.println("orderitem12"+orderitem);
                            System.out.println("quantity12"+quantity);
                            System.out.println("price"+price);
                       try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/restaurant_db","root","Pass9876"); 
                Statement st=con.createStatement();
                            System.out.println("orderid12"+order_id);
                            System.out.println("orderitem12"+orderitem);
                            System.out.println("quantity12"+quantity);
                            System.out.println("price"+price);
                String q= "insert into order1 values(?,?,?,?)";
                PreparedStatement pstmt=con.prepareStatement(q);
                pstmt.setString(1,(order_id));              
                pstmt.setString(2,orderitem);               
                pstmt.setInt(3,Integer.parseInt(quantity));
                pstmt.setInt(4,price);
                pstmt.executeUpdate();
                 
                            System.out.println("orderid1"+order_id);
                            System.out.println("orderitem1"+orderitem);
                            System.out.println("quantity1"+quantity);
                            System.out.println("price"+price);
        } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null,"db error","error",JOptionPane.ERROR_MESSAGE);
                        order_id_var.setText(null);
            System.out.println("DB connection error");
        } 
                        try {//zzzzzzzzzzzzzzzzzz
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/restaurant_db","root","Pass9876"); 
                Statement st=con.createStatement();
                String q="insert into billing values(?,?,?,?,?,?,?)";
                             PreparedStatement pstmt2=con.prepareStatement(q);
                             pstmt2.setString(1,orderitem);               
                             pstmt2.setInt(2,Integer.parseInt(quantity));
                             pstmt2.setInt(3,price);
                             pstmt2.setInt(4,total_price4);
                             pstmt2.setString(5,(order_id));
                             pstmt2.setInt(6,month);
                             pstmt2.setInt(7,date);
                             pstmt2.executeUpdate();                            
        } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null,"db error2","error",JOptionPane.ERROR_MESSAGE);
                        order_id_var.setText(null);
            System.out.println("DB connection error222222222");
        } 
                 // TODO add your handling code here:
    }//GEN-LAST:event_momos_var1ActionPerformed

    private void momos_var2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_momos_var2ActionPerformed
quantity=momos_var1.getText();
                      orderitem="french fries";
                      //price=Integer.parseInt(item_price[4]);
                      price=40;
                      order_id=order_id_var.getText();
                      total_price6=(Integer.parseInt(quantity))*price;
                    System.out.println("orderid12"+order_id);
                            System.out.println("orderitem12"+orderitem);
                            System.out.println("quantity12"+quantity);
                            System.out.println("price"+price);
                       try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/restaurant_db","root","Pass9876"); 
                Statement st=con.createStatement();
                            System.out.println("orderid12"+order_id);
                            System.out.println("orderitem12"+orderitem);
                            System.out.println("quantity12"+quantity);
                            System.out.println("price"+price);
                String q= "insert into order1 values(?,?,?,?)";
                PreparedStatement pstmt=con.prepareStatement(q);
                pstmt.setString(1,(order_id));              
                pstmt.setString(2,orderitem);               
                pstmt.setInt(3,Integer.parseInt(quantity));
                pstmt.setInt(4,price);
                pstmt.executeUpdate();
                 
                            System.out.println("orderid1"+order_id);
                            System.out.println("orderitem1"+orderitem);
                            System.out.println("quantity1"+quantity);
                            System.out.println("price"+price);
        } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null,"db error","error",JOptionPane.ERROR_MESSAGE);
                        order_id_var.setText(null);
            System.out.println("DB connection error");
        } 
                        try {//zzzzzzzzzzzzzzzzzz
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/restaurant_db","root","Pass9876"); 
                Statement st=con.createStatement();
                String q="insert into billing values(?,?,?,?,?,?,?)";
                             PreparedStatement pstmt2=con.prepareStatement(q);
                             pstmt2.setString(1,orderitem);               
                             pstmt2.setInt(2,Integer.parseInt(quantity));
                             pstmt2.setInt(3,price);
                             pstmt2.setInt(4,total_price6);
                             pstmt2.setString(5,(order_id));
                             pstmt2.setInt(6,month);
                             pstmt2.setInt(7,date);
                             pstmt2.executeUpdate();                            
        } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null,"db error2","error",JOptionPane.ERROR_MESSAGE);
                        order_id_var.setText(null);
            System.out.println("DB connection error222222222");
        } 
                 // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_momos_var2ActionPerformed

    private void momos_var3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_momos_var3ActionPerformed
                      quantity=momos_var3.getText();
                      orderitem="hot dog";
                      //price=Integer.parseInt(item_price[4]);
                      price=60;
                      order_id=order_id_var.getText();
                      total_price5=(Integer.parseInt(quantity))*price;
                    System.out.println("orderid12"+order_id);
                            System.out.println("orderitem12"+orderitem);
                            System.out.println("quantity12"+quantity);
                            System.out.println("price"+price);
                       try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/restaurant_db","root","Pass9876"); 
                Statement st=con.createStatement();
                            System.out.println("orderid12"+order_id);
                            System.out.println("orderitem12"+orderitem);
                            System.out.println("quantity12"+quantity);
                            System.out.println("price"+price);
                String q= "insert into order1 values(?,?,?,?)";
                PreparedStatement pstmt=con.prepareStatement(q);
                pstmt.setString(1,(order_id));              
                pstmt.setString(2,orderitem);               
                pstmt.setInt(3,Integer.parseInt(quantity));
                pstmt.setInt(4,price);
                pstmt.executeUpdate();
                 
                            System.out.println("orderid1"+order_id);
                            System.out.println("orderitem1"+orderitem);
                            System.out.println("quantity1"+quantity);
                            System.out.println("price"+price);
        } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null,"db error","error",JOptionPane.ERROR_MESSAGE);
                        order_id_var.setText(null);
            System.out.println("DB connection error");
        } 
                        try {//zzzzzzzzzzzzzzzzzz
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/restaurant_db","root","Pass9876"); 
                Statement st=con.createStatement();
                String q="insert into billing values(?,?,?,?,?,?,?)";
                             PreparedStatement pstmt2=con.prepareStatement(q);
                             pstmt2.setString(1,orderitem);               
                             pstmt2.setInt(2,Integer.parseInt(quantity));
                             pstmt2.setInt(3,price);
                             pstmt2.setInt(4,total_price5);
                             pstmt2.setString(5,(order_id));
                             pstmt2.setInt(6,month);
                             pstmt2.setInt(7,date);
                             pstmt2.executeUpdate();                            
        } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null,"db error2","error",JOptionPane.ERROR_MESSAGE);
                        order_id_var.setText(null);
            System.out.println("DB connection error222222222");
        } 
                 // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_momos_var3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                        Calendar cal = Calendar.getInstance(); 
                        cal.getTime(); 
                        SimpleDateFormat sdf = new SimpleDateFormat("ssHHmm"); 
                        month=cal.get(Calendar.MONTH);
                        date=cal.get(Calendar.DATE);
                        String order_id=sdf.format(cal.getTime());
                    System.out.println("time="+order_id);
                    order_id_var.setText(order_id);
    }//GEN-LAST:event_jButton2ActionPerformed
    public waiter1() {
        initComponents();
               setSize(700,600); 
               String item_name[] = new String[10];
               String item_price[] = new String[10];
               System.out.println("kdkjsjas");
                        
               
                    System.out.println("time="+order_id);
                try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/restaurant_db","root","Pass9876"); 
                Statement st=con.createStatement();
                String sql="select * from item";
               // CallableStatement stmt
               String q= "select * from item";
                ResultSet rs=st.executeQuery(q);
                int i=1;
            while(rs.next())
                {  
                    item_name[i]=rs.getString("item_name");
                    item_price[i]=rs.getString("item_price");
                   System.out.println("item_namefrom DBDBDBD="+item_name[i]);
                   i++;
                }
            System.out.println("sucess");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(login_page.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("DB connection error");
        }
                tf01.setText(item_name[1]);
                tf02.setText(item_name[2]);
                tf03.setText(item_name[3]);
                tf04.setText(item_name[4]);
                tf05.setText(item_name[5]);
                tf06.setText(item_name[6]);
                                    tf21.setText(item_price[1]);
                                    tf22.setText(item_price[2]);
                                    tf23.setText(item_price[3]);
                                    tf24.setText(item_price[4]);
                                    tf25.setText(item_price[5]);
                                    tf26.setText(item_price[6]);

    }
    
    public static void main(String args[]) {
              
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new waiter1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField burger_var;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JTextField item_name1;
    public javax.swing.JTextField item_name2;
    public javax.swing.JTextField item_name4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField momos_var;
    private javax.swing.JTextField momos_var1;
    private javax.swing.JTextField momos_var2;
    private javax.swing.JTextField momos_var3;
    public javax.swing.JTextField order_id_var;
    private javax.swing.JTextField sandwich_var;
    private javax.swing.JTextField tf01;
    private javax.swing.JTextField tf02;
    private javax.swing.JTextField tf03;
    private javax.swing.JTextField tf04;
    private javax.swing.JTextField tf05;
    private javax.swing.JTextField tf06;
    public javax.swing.JTextField tf21;
    public javax.swing.JTextField tf22;
    public javax.swing.JTextField tf23;
    public javax.swing.JTextField tf24;
    public javax.swing.JTextField tf25;
    public javax.swing.JTextField tf26;
    // End of variables declaration//GEN-END:variables

    private void JOptionPane(String order_successful) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
