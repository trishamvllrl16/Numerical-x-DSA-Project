import javax.swing.*;
import java.text.DecimalFormat;

public class nr_sys extends javax.swing.JFrame {

    
    public nr_sys() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        eq1_nr = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        nr_sys_ans = new javax.swing.JTextArea();
        guess1 = new javax.swing.JTextField();
        guess2 = new javax.swing.JTextField();
        eq2_nr = new javax.swing.JTextField();
        tolerance = new javax.swing.JTextField();
        cacl_nr_sys = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        clear_trap = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 732));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(1300, 732));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 732));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 732));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eq1_nr.setBackground(new java.awt.Color(239, 235, 233));
        eq1_nr.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        eq1_nr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eq1_nr.setBorder(null);
        jPanel1.add(eq1_nr, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 182, 240, 40));

        nr_sys_ans.setEditable(false);
        nr_sys_ans.setColumns(20);
        nr_sys_ans.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        nr_sys_ans.setRows(5);
        jScrollPane1.setViewportView(nr_sys_ans);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 40, 570, 570));

        guess1.setBackground(new java.awt.Color(239, 235, 233));
        guess1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        guess1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        guess1.setBorder(null);
        jPanel1.add(guess1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 320, 236, 40));

        guess2.setBackground(new java.awt.Color(239, 235, 233));
        guess2.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        guess2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        guess2.setBorder(null);
        jPanel1.add(guess2, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 319, 236, 40));

        eq2_nr.setBackground(new java.awt.Color(239, 235, 233));
        eq2_nr.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        eq2_nr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eq2_nr.setBorder(null);
        jPanel1.add(eq2_nr, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 182, 240, 40));

        tolerance.setBackground(new java.awt.Color(239, 235, 233));
        tolerance.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        tolerance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tolerance.setBorder(null);
        jPanel1.add(tolerance, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 482, 240, 40));

        cacl_nr_sys.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/calculate_normal.png"))); // NOI18N
        cacl_nr_sys.setContentAreaFilled(false);
        cacl_nr_sys.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cacl_nr_sys.setIconTextGap(0);
        cacl_nr_sys.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/calculate_mid.png"))); // NOI18N
        cacl_nr_sys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cacl_nr_sysMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cacl_nr_sysMouseExited(evt);
            }
        });
        cacl_nr_sys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cacl_nr_sysActionPerformed(evt);
            }
        });
        jPanel1.add(cacl_nr_sys, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, -1, -1));

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back_normal.png"))); // NOI18N
        btn_back.setContentAreaFilled(false);
        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, 60));

        clear_trap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/clear_normal.png"))); // NOI18N
        clear_trap.setContentAreaFilled(false);
        clear_trap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear_trap.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/clear_mid.png"))); // NOI18N
        clear_trap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clear_trapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clear_trapMouseExited(evt);
            }
        });
        clear_trap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_trapActionPerformed(evt);
            }
        });
        jPanel1.add(clear_trap, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 250, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/non_bg.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cacl_nr_sysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cacl_nr_sysActionPerformed
        boolean cont = true;
        double x0 = 0, y0 = 0, relativeError = 0;
        String equation1, equation2;
        
        nr_sys_ans.setText("");

        cacl_nr_sys.setIcon(new ImageIcon(getClass().getResource("assets/calculate_mid.png")));

        if (eq1_nr.getText().replace(" ", "").isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in the equation 1 field.");
            cont = false;
        } else {
            equation1 = eq1_nr.getText().replace(" ", "");
            if (!(equation1.equals("x^2+2y^2=22") || equation1.equals("x^2+xy=10"))) {
                JOptionPane.showMessageDialog(null, "Unsupported equation. Please enter a supported equation 1.");
                cont = false;
            }
        }

        if (eq2_nr.getText().replace(" ", "").isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in the equation 2 field.");
            cont = false;
        } else {
            equation2 = eq2_nr.getText().replace(" ", "");
            if (!(equation2.equals("2x^2-xy+3y=11") || equation2.equals("y+3xy^2=57"))) {
                JOptionPane.showMessageDialog(null, "Unsupported equation. Please enter a supported equation 2.");
                cont = false;
            }
        }

        if (guess1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty guess x0. Please fill in the guess x0 field.");
            cont = false;
        } else {
            try {
                x0 = Double.parseDouble(guess1.getText().replace(" ", ""));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input for guess x0. Please enter a valid numerical value for guess x0.");
                cont = false;
            }
        }

        if (guess2.getText().replace(" ", "").isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty guess y0. Please fill in the guess y0 field.");
            cont = false;
        } else {
            try {
                y0 = Double.parseDouble(guess2.getText().replace(" ", ""));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input for guess y0. Please enter a valid numerical value for guess y0.");
                cont = false;
            }
        }

        if (tolerance.getText().replace(" ", "").isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty relative error. Please fill in the relative error field.");
            cont = false;
        } else {
            try {
                relativeError = Double.parseDouble(tolerance.getText().replace(" ", ""));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input for relative error. Please enter a valid relative error.");
                cont = false;
            }
        }

        if (cont) {
            equation1 = eq1_nr.getText().replace(" ", "");
            equation2 = eq2_nr.getText().replace(" ", "");
            x0 = Double.valueOf(guess1.getText().replace(" ", ""));
            y0 = Double.valueOf(guess2.getText().replace(" ", ""));
            relativeError = Double.valueOf(tolerance.getText().replace(" ", ""));
            newtonRaphson(x0, y0, relativeError, equation1, equation2);
        }
    }//GEN-LAST:event_cacl_nr_sysActionPerformed

    private void btn_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseEntered
        btn_back.setIcon(new ImageIcon(getClass().getResource("assets/back_hover.png")));
    }//GEN-LAST:event_btn_backMouseEntered

    private void btn_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseExited
        btn_back.setIcon(new ImageIcon(getClass().getResource("assets/back_normal.png")));
    }//GEN-LAST:event_btn_backMouseExited

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed

        btn_back.setIcon(new ImageIcon(getClass().getResource("assets/back_mid.png")));

        new main().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void cacl_nr_sysMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cacl_nr_sysMouseEntered
       cacl_nr_sys.setIcon(new ImageIcon(getClass().getResource("assets/calculate_hover.png")));
    }//GEN-LAST:event_cacl_nr_sysMouseEntered

    private void cacl_nr_sysMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cacl_nr_sysMouseExited
        cacl_nr_sys.setIcon(new ImageIcon(getClass().getResource("assets/calculate_normal.png")));
    }//GEN-LAST:event_cacl_nr_sysMouseExited

    private void clear_trapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_trapMouseEntered
        clear_trap.setIcon(new ImageIcon(getClass().getResource("assets/clear_hover.png")));
    }//GEN-LAST:event_clear_trapMouseEntered

    private void clear_trapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_trapMouseExited
        clear_trap.setIcon(new ImageIcon(getClass().getResource("assets/clear_normal.png")));
    }//GEN-LAST:event_clear_trapMouseExited

    private void clear_trapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_trapActionPerformed
        eq1_nr.setText("");
        eq2_nr.setText("");
        guess1.setText("");
        guess2.setText("");
        tolerance.setText("");
        nr_sys_ans.setText("");
    }//GEN-LAST:event_clear_trapActionPerformed

    public  double equation1(double x, double y, String equation) {
        if(equation.equals("x^2+2y^2=22")){
            return x * x + 2 * y * y - 22;
        } if(equation.equals("x^2+xy=10")) {
            return x * x + x * y - 10;
        }
        else
            
            JOptionPane.showMessageDialog(null, "Unsupported equation");
            return 0.0;
    }

    public  double equation2(double x, double y, String equation) {
        if(equation.equals("2x^2-xy+3y=11")){
            return 2 * x * x - x * y + 3 * y - 11;
        } if(equation.equals("y+3xy^2=57")) {
            return y + 3 * x * y * y - 57;
        }
        else
            JOptionPane.showMessageDialog(null, "Unsupported equation");
            return 0.0;
    }

    // Define the derivatives of equations
    public  double[][] jacobian(double x, double y, String equation1, String equation2) {
        if(equation1.equals("x^2+xy=10") && equation2.equals("y+3xy^2=57")) {
            double[][] jacobian = {
                {2 * x + y, x},
                {3 * y * y, 1 + 6 * x * y}
            };
            return jacobian;
        } if(equation1.equals("x^2+2y^2=22") && equation2.equals("2x^2-xy+3y=11")) {
            double[][] jacobian = {
                {2 * x, 4 * y},
                {4 * x - y, -x + 3}
            };
            return jacobian;
        }
        else
            throw new IllegalArgumentException("Unsupported equation");
    }

    // Implement the Newton-Raphson method
    public  void newtonRaphson(double x0, double y0, double relativeError, String equation1, String equation2) {
        DecimalFormat df = new DecimalFormat("#.####");
        double x = x0;
        double y = y0;

        double xPrev, yPrev;
        int iterations = 0;

        System.out.println("Initial guesses:");
        System.out.println("x0 = " + x0);
        System.out.println("y0 = " + y0);
        System.out.println("Equation 1: " + equation1(x0, y0, equation1));
        System.out.println("Equation 2: " + equation2(x0, y0, equation2));
        System.out.println();

        try {
            do {
                xPrev = x;
                yPrev = y;

                double[][] J = jacobian(x, y, equation1, equation2);
                double detJ = J[0][0] * J[1][1] - J[0][1] * J[1][0];
                if (detJ == 0) {
                    throw new ArithmeticException("Jacobian determinant is zero. Division by zero.");
                }
                double invDetJ = 1.0 / detJ;
                double[][] inverseJacobian = {
                    {J[1][1] * invDetJ, -J[0][1] * invDetJ},
                    {-J[1][0] * invDetJ, J[0][0] * invDetJ}
                };

                double[] f = {equation1(x, y, equation1), equation2(x, y, equation2)};

                System.out.println("Iteration " + iterations + ":");
                nr_sys_ans.setText(nr_sys_ans.getText()+"Iteration " + iterations + ":\nJacobian matrix:\n");
                System.out.println("Jacobian matrix:");
                for (double[] row : J) {
                        for (double element : row) {
                            System.out.print(element+"\t");
                            nr_sys_ans.setText(nr_sys_ans.getText()+element+"\t");
                        }
                        System.out.println("");
                        nr_sys_ans.setText(nr_sys_ans.getText()+"\n");
                    }    
                System.out.println("Inverse Jacobian matrix:");
                nr_sys_ans.setText(nr_sys_ans.getText()+"\nInverse Jacobian matrix:\n");
                for (double[] row : inverseJacobian) {
                        for (double element : row) {
                            System.out.print(element+"\t");
                            nr_sys_ans.setText(nr_sys_ans.getText()+element+"\t");
                        }
                        System.out.println("");
                        nr_sys_ans.setText(nr_sys_ans.getText()+"\n");
                    }    
                System.out.println();

                x = x - (inverseJacobian[0][0] * f[0] + inverseJacobian[0][1] * f[1]);
                y = y - (inverseJacobian[1][0] * f[0] + inverseJacobian[1][1] * f[1]);

                iterations++;
                double error1 = Math.abs(x - xPrev) / Math.abs(x);
                double error2 = Math.abs(y - yPrev) / Math.abs(y);
                System.out.println("Error of variable 1[x]\tError of variable 2[y]\n"+error1+"\t"+error2);
                
                nr_sys_ans.setText(nr_sys_ans.getText()+"\nError of variable 1[x]\tError of variable 2[y]\n"+error1+"\t"+error2+"\n\n");
            } while (Math.abs(x - xPrev) / Math.abs(x) > relativeError || Math.abs(y - yPrev) / Math.abs(y) > relativeError);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        System.out.println("Approximate solution after " + iterations + " iterations:");
        System.out.println("x = " + df.format(x));
        System.out.println("y = " + df.format(y));
        
        nr_sys_ans.setText(nr_sys_ans.getText()+"\n\nx = "+x+"\ny = "+y);
        
    }
    
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
            java.util.logging.Logger.getLogger(nr_sys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nr_sys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nr_sys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nr_sys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nr_sys().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton cacl_nr_sys;
    private javax.swing.JButton clear_trap;
    private javax.swing.JTextField eq1_nr;
    private javax.swing.JTextField eq2_nr;
    private javax.swing.JTextField guess1;
    private javax.swing.JTextField guess2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea nr_sys_ans;
    private javax.swing.JTextField tolerance;
    // End of variables declaration//GEN-END:variables
}
