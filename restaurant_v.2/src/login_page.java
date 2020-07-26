
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class login_page extends javax.swing.JFrame {

 
    public login_page() {
        initComponents();
       setSize(700,600); 
       //setLocation(700,600);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        l_username = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        l_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.red);

        panel.setBackground(new java.awt.Color(3, 24, 24));
        panel.setForeground(new java.awt.Color(0, 255, 255));
        panel.setMinimumSize(new java.awt.Dimension(600, 700));
        panel.setPreferredSize(new java.awt.Dimension(700, 600));

        jLabel1.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USERNAME:");

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASSWORD:");

        l_username.setBackground(new java.awt.Color(3, 24, 24));
        l_username.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        l_username.setForeground(new java.awt.Color(255, 255, 255));
        l_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        l_username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        l_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_usernameActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(3, 24, 24));
        jButton1.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CONNECT");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        l_password.setBackground(new java.awt.Color(3, 24, 24));
        l_password.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        l_password.setForeground(new java.awt.Color(255, 255, 255));
        l_password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        l_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_username)
                    .addComponent(l_password, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(l_username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(l_password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void l_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l_usernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String password=l_password.getText();
        String username=l_username.getText(); 
        if(password.contains("1234")&& (username.contains("waiter"))){
            waiter1 info =new waiter1();
            info.setVisible(true);
            l_password.setText(null);
            l_username.setText(null);
        }
        else if(password.contains("1234")&& (username.contains("manager"))){
            manager info1 =new manager();
            info1.setVisible(true);
            l_password.setText(null);
            l_username.setText(null);
        }
         else{
            JOptionPane.showMessageDialog(null,"invalid username or password","error",JOptionPane.ERROR_MESSAGE);
            l_password.setText(null);
            l_username.setText(null);

         }
          
    }//GEN-LAST:event_jButton1ActionPerformed
    private void l_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l_passwordActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField l_password;
    private javax.swing.JTextField l_username;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
