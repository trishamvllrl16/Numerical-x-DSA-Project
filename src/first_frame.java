
import javax.swing.*;
import java.awt.*;

public class first_frame extends javax.swing.JFrame {

    public first_frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_load = new javax.swing.JLabel();
        bar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        btn_menu = new javax.swing.JButton();
        btn_credits = new javax.swing.JButton();
        btn_quit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1305, 732));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_load.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        label_load.setForeground(new java.awt.Color(255, 255, 255));
        label_load.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_load.setText("Loading....");
        getContentPane().add(label_load, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 600, -1, 100));

        bar.setBorder(null);
        getContentPane().add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 680, 1320, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/first_frame_bg1.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jLabel1.setPreferredSize(new java.awt.Dimension(1310, 732));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 1320, 750));

        btn_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menu_normal.png"))); // NOI18N
        btn_menu.setContentAreaFilled(false);
        btn_menu.setIconTextGap(0);
        btn_menu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menu_mid.png"))); // NOI18N
        btn_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_menuMouseExited(evt);
            }
        });
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 140, 60));

        btn_credits.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/credit_normal.png"))); // NOI18N
        btn_credits.setContentAreaFilled(false);
        btn_credits.setIconTextGap(0);
        btn_credits.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/credit_mid.png"))); // NOI18N
        btn_credits.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_creditsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_creditsMouseExited(evt);
            }
        });
        btn_credits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_creditsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_credits, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 160, 70));

        btn_quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/quit_normal.png"))); // NOI18N
        btn_quit.setContentAreaFilled(false);
        btn_quit.setIconTextGap(0);
        btn_quit.setName(""); // NOI18N
        btn_quit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/quit_mid.png"))); // NOI18N
        btn_quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_quitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_quitMouseExited(evt);
            }
        });
        btn_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 160, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/first_frame_bg1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setPreferredSize(new java.awt.Dimension(1310, 732));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1320, 750));

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back_normal.png"))); // NOI18N
        btn_back.setContentAreaFilled(false);
        btn_back.setPreferredSize(new java.awt.Dimension(80, 30));
        btn_back.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back_mid.png"))); // NOI18N
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_backMouseExited(evt);
            }
        });
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/first_frame_bg1.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setPreferredSize(new java.awt.Dimension(1310, 732));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1320, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void bbb(){
        if(main.no==1){
         
            remove(bar);
            remove(jLabel1);
            remove(label_load);

            jLabel2.setIcon(new ImageIcon(first_frame.class.getResource("assets/frame_bg.png")));
            jLabel2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }   
    }
    
    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        dispose();
        new main().setVisible(true);
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_menuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menuMouseEntered
        btn_menu.setIcon(new ImageIcon(first_frame.class.getResource("assets/menu_hover.png")));
    }//GEN-LAST:event_btn_menuMouseEntered

    private void btn_menuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_menuMouseExited
        btn_menu.setIcon(new ImageIcon(first_frame.class.getResource("assets/menu_normal.png")));
    }//GEN-LAST:event_btn_menuMouseExited

    private void btn_creditsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_creditsMouseEntered
        btn_credits.setIcon(new ImageIcon(first_frame.class.getResource("assets/credit_hover.png")));
    }//GEN-LAST:event_btn_creditsMouseEntered

    private void btn_creditsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_creditsMouseExited
        btn_credits.setIcon(new ImageIcon(first_frame.class.getResource("assets/credit_normal.png")));
    }//GEN-LAST:event_btn_creditsMouseExited

    private void btn_creditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_creditsActionPerformed
         remove(bar);
         remove(jLabel1);
         remove(label_load);
         remove(jLabel2);
         remove(btn_credits);
         remove(btn_menu);
         remove(btn_quit);
         
         jLabel3.setIcon(new ImageIcon(first_frame.class.getResource("assets/credit_frame.png")));
         jLabel3.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btn_creditsActionPerformed

    private void btn_quitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_quitMouseEntered
        btn_quit.setIcon(new ImageIcon(first_frame.class.getResource("assets/quit_hover.png")));
    }//GEN-LAST:event_btn_quitMouseEntered

    private void btn_quitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_quitMouseExited
        btn_quit.setIcon(new ImageIcon(first_frame.class.getResource("assets/quit_normal.png")));
    }//GEN-LAST:event_btn_quitMouseExited

    private void btn_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitActionPerformed
        btn_quit.setIcon(new ImageIcon(first_frame.class.getResource("assets/quit_mid.png")));
        Toolkit.getDefaultToolkit().beep();
        int r=JOptionPane.showConfirmDialog(null, "You want to quit the program?", "QUIT", JOptionPane.YES_NO_OPTION);
        if(r==JOptionPane.YES_OPTION)
            dispose();
        
    }//GEN-LAST:event_btn_quitActionPerformed

    private void btn_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseEntered
        btn_back.setIcon(new ImageIcon(getClass().getResource("assets/back_hover.png")));
    }//GEN-LAST:event_btn_backMouseEntered

    private void btn_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseExited
        btn_back.setIcon(new ImageIcon(getClass().getResource("assets/back_normal.png")));
    }//GEN-LAST:event_btn_backMouseExited

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        
        btn_back.setIcon(new ImageIcon(getClass().getResource("assets/back_mid.png")));
        dispose();
        first_frame frame = new first_frame();
        frame.setVisible(true);
        frame.remove(jLabel1);
        frame.remove(bar);
        frame.remove(label_load);
        remove(jLabel3);
        
        jLabel2.setIcon(new ImageIcon(first_frame.class.getResource("assets/frame_bg.png")));
        jLabel2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(first_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(first_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(first_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(first_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        first_frame ff = new first_frame();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ff.setVisible(true);
            }
        });
        try {
            Thread.sleep(1000);
            for (int i = 0; i < 101; i++) {
                Thread.sleep(50);

                if (i == 20) {
                    Thread.sleep(500);
                    bar.setValue(i);
                    label_load.setText("Progress: " + String.valueOf(i) + "%");
                } else if (i == 40) {
                    Thread.sleep(500);
                    bar.setValue(i);
                    label_load.setText("Progress: " + String.valueOf(i) + "%");
                } else if (i == 80) {
                    Thread.sleep(200);
                    bar.setValue(i);
                    label_load.setText("Progress: " + String.valueOf(i) + "%");
                } else if (i == 98) {
                    Thread.sleep(600);
                    bar.setValue(i);
                    label_load.setText("Progress: " + String.valueOf(i) + "%");
                } else {
                    bar.setValue(i);
                    label_load.setText("Progress: " + String.valueOf(i) + "%");
                }
            }
        } catch (Exception e) {

        }

        if (label_load.getText().equalsIgnoreCase("Progress: 100%")) {
            System.out.println("bol");
            ff.remove(jLabel1);
            ff.remove(bar);
            label_load.setText("");
            jLabel2.setIcon(new ImageIcon(first_frame.class.getResource("assets/frame_bg.png")));
            jLabel2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }

       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JProgressBar bar;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_credits;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_quit;
    public static javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel label_load;
    // End of variables declaration//GEN-END:variables
}
