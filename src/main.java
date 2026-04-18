import javax.swing.*;
import org.mariuszgromada.math.mxparser.License;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bi_b = new javax.swing.JButton();
        moss_b = new javax.swing.JButton();
        nr_b = new javax.swing.JButton();
        gauss_e = new javax.swing.JButton();
        gj = new javax.swing.JButton();
        jcb = new javax.swing.JButton();
        trap = new javax.swing.JButton();
        simps = new javax.swing.JButton();
        shift = new javax.swing.JToggleButton();
        back = new javax.swing.JButton();
        nr_sys_b = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1306, 732));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1310, 732));
        jPanel1.setLayout(null);

        bi_b.setContentAreaFilled(false);
        bi_b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bi_b.setName(""); // NOI18N
        bi_b.setPreferredSize(new java.awt.Dimension(100, 50));
        bi_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bi_bActionPerformed(evt);
            }
        });
        jPanel1.add(bi_b);
        bi_b.setBounds(70, 80, 140, 110);
        bi_b.getAccessibleContext().setAccessibleName("bi_b");

        moss_b.setContentAreaFilled(false);
        moss_b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        moss_b.setName(""); // NOI18N
        moss_b.setPreferredSize(new java.awt.Dimension(100, 50));
        moss_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moss_bActionPerformed(evt);
            }
        });
        jPanel1.add(moss_b);
        moss_b.setBounds(410, 20, 160, 150);

        nr_b.setContentAreaFilled(false);
        nr_b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nr_b.setName(""); // NOI18N
        nr_b.setPreferredSize(new java.awt.Dimension(100, 50));
        nr_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nr_bActionPerformed(evt);
            }
        });
        jPanel1.add(nr_b);
        nr_b.setBounds(1060, 150, 150, 150);

        gauss_e.setContentAreaFilled(false);
        gauss_e.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gauss_e.setName(""); // NOI18N
        gauss_e.setPreferredSize(new java.awt.Dimension(100, 50));
        gauss_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gauss_eActionPerformed(evt);
            }
        });
        jPanel1.add(gauss_e);
        gauss_e.setBounds(700, 290, 170, 170);

        gj.setContentAreaFilled(false);
        gj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gj.setName(""); // NOI18N
        gj.setPreferredSize(new java.awt.Dimension(100, 50));
        gj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gjActionPerformed(evt);
            }
        });
        jPanel1.add(gj);
        gj.setBounds(430, 540, 190, 160);

        jcb.setContentAreaFilled(false);
        jcb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcb.setName(""); // NOI18N
        jcb.setPreferredSize(new java.awt.Dimension(100, 50));
        jcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbActionPerformed(evt);
            }
        });
        jPanel1.add(jcb);
        jcb.setBounds(770, 0, 180, 140);

        trap.setContentAreaFilled(false);
        trap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trap.setName(""); // NOI18N
        trap.setPreferredSize(new java.awt.Dimension(100, 50));
        trap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trapActionPerformed(evt);
            }
        });
        jPanel1.add(trap);
        trap.setBounds(1010, 460, 280, 240);

        simps.setContentAreaFilled(false);
        simps.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simps.setName(""); // NOI18N
        simps.setPreferredSize(new java.awt.Dimension(100, 50));
        simps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpsActionPerformed(evt);
            }
        });
        jPanel1.add(simps);
        simps.setBounds(50, 520, 150, 130);

        shift.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/shift_normal.png"))); // NOI18N
        shift.setContentAreaFilled(false);
        shift.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shift.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/shift_mid.png"))); // NOI18N
        shift.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/shift_hover.png"))); // NOI18N
        shift.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shiftMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                shiftMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                shiftMousePressed(evt);
            }
        });
        shift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftActionPerformed(evt);
            }
        });
        jPanel1.add(shift);
        shift.setBounds(280, 480, 90, 90);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back_fn.png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back_fm.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(440, 280, 200, 130);

        nr_sys_b.setContentAreaFilled(false);
        nr_sys_b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nr_sys_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nr_sys_bActionPerformed(evt);
            }
        });
        jPanel1.add(nr_sys_b);
        nr_sys_b.setBounds(230, 270, 120, 120);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/main_bg.png"))); // NOI18N
        jLabel2.setIconTextGap(0);
        jLabel2.setMaximumSize(new java.awt.Dimension(1300, 720));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1300, 700);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 1306, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public static int num;
    
    private void bi_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bi_bActionPerformed
        if(!shift.isSelected()){
        new bisection_method().setVisible(true);
        dispose();
        
        }
        if(shift.isSelected()){
            num=1;
            new meanings().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_bi_bActionPerformed

    private void gauss_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gauss_eActionPerformed
        
        if(!shift.isSelected()){
        dispose();
        new ge().setVisible(true);
        
        }
        if(shift.isSelected()){
            num=4;
            new meanings().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_gauss_eActionPerformed

    private void nr_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nr_bActionPerformed
        
        if(!shift.isSelected()){
            dispose();
            new nr().setVisible(true);

        }
        if(shift.isSelected()){
            num=3;
            new meanings().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_nr_bActionPerformed

    private void gjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gjActionPerformed
        
        if(!shift.isSelected()){
            dispose();
            new gauss_jordan().setVisible(true);

        }
        if(shift.isSelected()){
            num=5;
            new meanings().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_gjActionPerformed

    private void jcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbActionPerformed
        
        if(!shift.isSelected()){
            dispose();
            new jacobi().setVisible(true);

        }
        if(shift.isSelected()){
            num=6;
            new meanings().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jcbActionPerformed

    private void trapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trapActionPerformed
        
       if(!shift.isSelected()){
            dispose();
            new trapezoidal().setVisible(true);

        }
        if(shift.isSelected()){
            num=8;
            new meanings().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_trapActionPerformed

    private void simpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpsActionPerformed
       
       if(!shift.isSelected()){
            dispose();
            new simpsons().setVisible(true);

        }
        if(shift.isSelected()){
            num=9;
            new meanings().setVisible(true);
            dispose();
        }
       
    }//GEN-LAST:event_simpsActionPerformed

    private void moss_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moss_bActionPerformed
        
        
        if(!shift.isSelected()){
            dispose();
            new moss_method().setVisible(true);

        }
        if(shift.isSelected()){
            num=2;
            new meanings().setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_moss_bActionPerformed

    private void shiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftActionPerformed
  
    }//GEN-LAST:event_shiftActionPerformed

    private void nr_sys_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nr_sys_bActionPerformed
        if(!shift.isSelected()){
            dispose();
            new nr_sys().setVisible(true);

        }
        if(shift.isSelected()){
            num=7;
            new meanings().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_nr_sys_bActionPerformed
    public static int no;
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        no=1;
        first_frame frame = new first_frame();
        frame.setVisible(true);
        frame.bbb();

    }//GEN-LAST:event_backActionPerformed

    private void shiftMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiftMouseEntered
       if(!shift.isSelected())
            shift.setIcon(new ImageIcon(getClass().getResource("assets/shift_hover.png")));
       else
            shift.setPressedIcon(new ImageIcon(getClass().getResource("assets/shift_hover.png")));
    }//GEN-LAST:event_shiftMouseEntered

    private void shiftMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiftMouseExited
       shift.setIcon(new ImageIcon(getClass().getResource("assets/shift_normal.png")));
    }//GEN-LAST:event_shiftMouseExited

    private void shiftMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiftMousePressed
       shift.setIcon(new ImageIcon(getClass().getResource("assets/shift_hover.png")));
    }//GEN-LAST:event_shiftMousePressed

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
       back.setIcon(new ImageIcon(getClass().getResource("assets/back_fh.png")));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
       back.setIcon(new ImageIcon(getClass().getResource("assets/back_fn.png")));
    }//GEN-LAST:event_backMouseExited

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        License.iConfirmNonCommercialUse("hello");

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton bi_b;
    private javax.swing.JButton gauss_e;
    private javax.swing.JButton gj;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jcb;
    private javax.swing.JButton moss_b;
    private javax.swing.JButton nr_b;
    private javax.swing.JButton nr_sys_b;
    private javax.swing.JToggleButton shift;
    private javax.swing.JButton simps;
    private javax.swing.JButton trap;
    // End of variables declaration//GEN-END:variables
}
