/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalsystem;

/**
 *
 * @author tonio
 */
public class HospitalSystemLogInView extends javax.swing.JFrame {
    static HospitalSystemController c = new HospitalSystemController(new HospitalSystemModel(),new HospitalSystemLogInView(),new HospitalSystemPatientView());
    static HospitalSystemLogInView lv = new HospitalSystemLogInView();
    
    /**
     * Creates new form HospitalSystemJFrame
     */
    public HospitalSystemLogInView() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        staffId = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        LogInButton = new javax.swing.JButton();
        incorrectlbl = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(105, 94, 147));
        jPanel5.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Patient Records");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(60, 10, 280, 60);

        jPanel2.setBackground(new java.awt.Color(190, 175, 194));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(239, 220, 249));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Staff ID:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(0, 0, 90, 50);

        staffId.setBackground(new java.awt.Color(239, 220, 249));
        staffId.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        staffId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(staffId);
        staffId.setBounds(90, 10, 178, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(60, 10, 280, 50);

        jPanel4.setBackground(new java.awt.Color(239, 220, 249));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password:");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(0, 0, 100, 50);

        password.setBackground(new java.awt.Color(239, 220, 249));
        password.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(password);
        password.setBounds(90, 10, 178, 30);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(60, 70, 280, 50);

        LogInButton.setBackground(new java.awt.Color(105, 94, 147));
        LogInButton.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        LogInButton.setText("Log In");
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });
        jPanel2.add(LogInButton);
        LogInButton.setBounds(110, 130, 180, 40);

        incorrectlbl.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        incorrectlbl.setForeground(new java.awt.Color(255, 51, 51));
        incorrectlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(incorrectlbl);
        incorrectlbl.setBounds(120, 170, 170, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        //When LogInButton is pressed, staffId and password TextBox Input boxes are validated
        //If no input is provided error message is thrown
        
        if(!this.staffId.getText().equals("")){
            if(!this.password.getText().equals("")){
            if(!c.validateStaff(Integer.parseInt(staffId.getText()),password.getText())){
            this.incorrectlbl.setText("Incorrect Id or password");
            
            }
          
            }
            else{
                this.incorrectlbl.setText("Password not provided");
            }
        }
        else{
            this.incorrectlbl.setText("Staff Id not provided");
        }
        
    }//GEN-LAST:event_LogInButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void startup(){
        //opens HospitalSystemLogInView display window
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HospitalSystemLogInView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalSystemLogInView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalSystemLogInView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalSystemLogInView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                lv.setVisible(true);
            }
        });
        
    }
    public void closeup(){
        //Closes HospitalSystemLogInView display window
        lv.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogInButton;
    private javax.swing.JLabel incorrectlbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField password;
    private javax.swing.JTextField staffId;
    // End of variables declaration//GEN-END:variables
}
