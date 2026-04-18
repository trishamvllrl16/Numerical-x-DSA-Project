import javax.swing.JOptionPane;
import javax.swing.*;

public class simpsons extends javax.swing.JFrame {

    public simpsons() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b_tx = new javax.swing.JTextField();
        simp_interval = new javax.swing.JTextField();
        calc_simp = new javax.swing.JButton();
        clear_simp = new javax.swing.JButton();
        simp_equation = new javax.swing.JTextField();
        a_tx = new javax.swing.JTextField();
        btn_back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ans_tx = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1300, 732));
        setMinimumSize(new java.awt.Dimension(1300, 732));
        setPreferredSize(new java.awt.Dimension(1300, 732));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(1300, 732));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 732));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 732));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_tx.setBackground(new java.awt.Color(255, 255, 255));
        b_tx.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        b_tx.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b_tx.setBorder(null);
        b_tx.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        b_tx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_txActionPerformed(evt);
            }
        });
        jPanel1.add(b_tx, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 150, 60));

        simp_interval.setBackground(new java.awt.Color(239, 235, 233));
        simp_interval.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        simp_interval.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        simp_interval.setBorder(null);
        simp_interval.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(simp_interval, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 480, 290, 50));

        calc_simp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/calculate_normal.png"))); // NOI18N
        calc_simp.setContentAreaFilled(false);
        calc_simp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calc_simp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/calculate_mid.png"))); // NOI18N
        calc_simp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calc_simpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calc_simpMouseExited(evt);
            }
        });
        calc_simp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc_simpActionPerformed(evt);
            }
        });
        jPanel1.add(calc_simp, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 562, 220, 50));

        clear_simp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/clear_normal.png"))); // NOI18N
        clear_simp.setContentAreaFilled(false);
        clear_simp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear_simp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/clear_mid.png"))); // NOI18N
        clear_simp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clear_simpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clear_simpMouseExited(evt);
            }
        });
        clear_simp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_simpActionPerformed(evt);
            }
        });
        jPanel1.add(clear_simp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 250, 80));

        simp_equation.setBackground(new java.awt.Color(239, 235, 233));
        simp_equation.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        simp_equation.setBorder(null);
        simp_equation.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        simp_equation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simp_equationActionPerformed(evt);
            }
        });
        jPanel1.add(simp_equation, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 233, 370, 60));

        a_tx.setBackground(new java.awt.Color(255, 255, 255));
        a_tx.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        a_tx.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a_tx.setBorder(null);
        a_tx.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        a_tx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_txActionPerformed(evt);
            }
        });
        jPanel1.add(a_tx, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 362, 150, 60));

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
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 140, 60));

        ans_tx.setEditable(false);
        ans_tx.setColumns(20);
        ans_tx.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        ans_tx.setRows(5);
        jScrollPane1.setViewportView(ans_tx);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 530, 550));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/simpsons_bg.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_txActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_txActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_txActionPerformed
    
    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private boolean isValidEquation(String equation) {
        return equation.equals("1/x") || equation.equals("e^(-x^2)");
    }
    
    private void calc_simpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc_simpActionPerformed
        calc_simp.setIcon(new ImageIcon(getClass().getResource("assets/calculate_mid.png")));
       
        if (a_tx.getText().isEmpty() || b_tx.getText().isEmpty() || simp_equation.getText().isEmpty() || simp_interval.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter values for all the text fields");
            allow = false;
        } else {
            String equation = simp_equation.getText();
            boolean validEquation = isValidEquation(equation);

            if (!validEquation && !isNumeric(a_tx.getText()) && !isNumeric(b_tx.getText()) && !isNumeric(simp_interval.getText())) {
                JOptionPane.showMessageDialog(null, "Enter valid value for equation, upper limit, lower limit, and interval");
                allow = false;
            } else if (!validEquation && !isNumeric(a_tx.getText()) && !isNumeric(b_tx.getText()) && Double.parseDouble(simp_interval.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "Enter valid value for equation, upper limit, lower limit, and non-negative interval");
                allow = false;
            } else if (!validEquation && !isNumeric(a_tx.getText()) && !isNumeric(b_tx.getText())) {
                JOptionPane.showMessageDialog(null, "Enter valid value for equation, upper limit, and lower limit");
                allow = false;
            } else if (!validEquation && !isNumeric(a_tx.getText()) && !isNumeric(simp_interval.getText())) {
                JOptionPane.showMessageDialog(null, "Enter valid value for equation, lower limit, and interval");
                allow = false;
            } else if (!validEquation && !isNumeric(a_tx.getText()) && Double.parseDouble(simp_interval.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "Enter valid value for equation, lower limit, and non-negative interval");
                allow = false;
            } else if (!validEquation && !isNumeric(b_tx.getText()) && !isNumeric(simp_interval.getText())) {
                JOptionPane.showMessageDialog(null, "Enter valid value for equation, upper limit, and interval");
                allow = false;
            } else if (!validEquation && !isNumeric(b_tx.getText()) && Double.parseDouble(simp_interval.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "Enter valid value for equation, upper limit, and non-negative interval");
                allow = false;
            } else if (!isNumeric(a_tx.getText()) && !isNumeric(b_tx.getText()) && !isNumeric(simp_interval.getText())) {
                JOptionPane.showMessageDialog(null, "Enter valid value for upper limit, lower limit, and interval");
                allow = false;
            } else if (!isNumeric(a_tx.getText()) && !isNumeric(b_tx.getText()) && Double.parseDouble(simp_interval.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "Enter valid value for upper limit, lower limit, and non-negative interval");
                allow = false;
            } else if (!validEquation && !isNumeric(a_tx.getText())) {
                JOptionPane.showMessageDialog(null, "Enter valid value for equation and lower limit");
                allow = false;
            } else if (!validEquation && !isNumeric(b_tx.getText())) {
                JOptionPane.showMessageDialog(null, "Enter valid value for equation and upper limit");
                allow = false;
            } else if (!validEquation && !isNumeric(simp_interval.getText())) {
                JOptionPane.showMessageDialog(null, "Enter valid value for equation and interval");
                allow = false;
            } else if (!validEquation && Double.parseDouble(simp_interval.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "Enter valid value for equation and non-negative interval");
                allow = false;
            } else if (!isNumeric(a_tx.getText()) && !isNumeric(b_tx.getText())) {
                JOptionPane.showMessageDialog(null, "Enter valid value for lower limit and upper limit");
                allow = false;
            } else if (!isNumeric(a_tx.getText()) && !isNumeric(simp_interval.getText())) {
                JOptionPane.showMessageDialog(null, "Enter valid value for lower limit and interval");
                allow = false;
            } else if (!isNumeric(a_tx.getText()) && Double.parseDouble(simp_interval.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "Enter valid value for lower limit and non-negative interval");
                allow = false;
            } else if (!isNumeric(b_tx.getText()) && !isNumeric(simp_interval.getText())) {
                JOptionPane.showMessageDialog(null, "Enter valid value for upper limit and interval");
                allow = false;
            } else if (!isNumeric(b_tx.getText()) && Double.parseDouble(simp_interval.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "Enter valid value for upper limit and non-negative interval");
                allow = false;
            } else if (!isNumeric(a_tx.getText())) {
                JOptionPane.showMessageDialog(null, "Enter valid value for lower limit");
                allow = false;
            } else if (!isNumeric(b_tx.getText())) {
                JOptionPane.showMessageDialog(null, "Enter valid value for upper limit");
                allow = false;
            } else if (!isNumeric(simp_interval.getText())) {
                JOptionPane.showMessageDialog(null, "Enter numeric value for interval");
                allow = false;
            } else if (Double.parseDouble(simp_interval.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "Enter a non-negative value for interval");
                allow = false;
            } else {
                double x0 = Double.valueOf(a_tx.getText());
                double xn = Double.valueOf(b_tx.getText());
                double n = Double.valueOf(simp_interval.getText());
                allow = true;
                simpsons_calc(xn, x0, n, equation);
            }
        }   
    }//GEN-LAST:event_calc_simpActionPerformed

    public  boolean allow = true;
    public void simpsons_calc(double xn, double x0, double n, String equation){
         
         double h = (xn - x0) / n;

        double y0 = evaluateEquation(equation, x0);
        double yn = evaluateEquation(equation, xn);
        double sumOdd = 0;
        double sumEven = 0;
        for (int i = 1; i < n; i += 2) {
            sumOdd += evaluateEquation(equation, x0 + i * h);
        }
        for (int i = 2; i < n; i += 2) {
            sumEven += evaluateEquation(equation, x0 + i * h);
        }

        double IS = (h / 3) * (y0 + yn + 4 * sumOdd + 2 * sumEven);

        double trueValue = computeTrueValue(equation, x0, xn);

        double actualError = Math.abs(trueValue - IS);

        double fourthDerivativeMin = fourthDerivative(equation, x0);
        double fourthDerivativeMax = fourthDerivative(equation, xn);

        double upperBoundError = Math.abs(Math.pow(h, 4) / 180 * (xn - x0) * Math.max(fourthDerivativeMin, fourthDerivativeMax));
        double lowerBoundError = Math.abs(Math.pow(h, 4) / 180 * (xn - x0) * Math.min(fourthDerivativeMin, fourthDerivativeMax));

        boolean acceptable = lowerBoundError < actualError && actualError < upperBoundError;

        System.out.println("\nIntegral using Simpson's Rule: " + IS);
        System.out.println("True Value: " + trueValue);
        System.out.println("Actual Error: " + actualError);
        System.out.println("Upper Bound Error: " + upperBoundError);
        System.out.println("Lower Bound Error: " + lowerBoundError);
        System.out.println("\n" + lowerBoundError + " < " + actualError + " < " + upperBoundError);
        System.out.println("Is the answer acceptable? " + (acceptable ? "YES" : "NO"));
        
        if(allow){
            ans_tx.setText("Integral using Simpson's Rule: \n" + IS+"\nTrue Value: \n" + trueValue+"\nActual Error: \n" + actualError+
             "\nUpper Bound Error: \n" + upperBoundError+"\nLower Bound Error: \n" + lowerBoundError+
            "\n\n"+lowerBoundError + " < " + actualError + " < " + upperBoundError+"\n\nIs the answer acceptable? \n" + (acceptable ? "YES" : "NO"));
        }
    }
    
     double evaluateEquation(String equation, double x) {
        switch (equation) {
            case "1/x":
                if (x == 0) {
                    ans_tx.setText(""); 
                    JOptionPane.showMessageDialog(null, "Division by zero!");
                    allow=false;
                    
                }
                return 1 / x;
            case "e^(-x^2)":
                return Math.exp(-x * x);
            default:
                JOptionPane.showMessageDialog(null, "Unsupported equation: " + equation);
                throw new IllegalArgumentException("Unsupported equation: " + equation);
                
        }
    }

    static double computeTrueValue(String equation, double x0, double xn) {
        switch (equation) {
            case "1/x":
                return Math.log(xn) - Math.log(x0);
            case "e^(-x^2)":
                int n = 1000000; 
                double sum = 0;
                double dx = (xn - x0) / n;
                for (int i = 0; i <= n; i++) {
                    double x = x0 + i * dx;
                    double f = Math.exp(-x * x);
                    if (i == 0 || i == n) {
                        sum += f;
                    } else if (i % 2 == 1) {
                        sum += 4 * f;
                    } else {
                        sum += 2 * f;
                    }
                }
                return sum * dx / 3;
            default:
                
                throw new IllegalArgumentException("Unsupported equation: " + equation);
        }
    }

    static double fourthDerivative(String equation, double x) {
        switch (equation) {
            case "1/x":
                return 24/(x*x*x*x*x);
            case "e^(-x^2)":
                return Math.exp(-x * x) * (16 * x * x * x * x - 48 * x * x + 12);
            default:
                throw new IllegalArgumentException("Unsupported equation: " + equation);
        }
    }
    
    private void a_txActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_txActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_txActionPerformed

    private void calc_simpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calc_simpMouseEntered
       calc_simp.setIcon(new ImageIcon(getClass().getResource("assets/calculate_hover.png")));
    }//GEN-LAST:event_calc_simpMouseEntered

    private void calc_simpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calc_simpMouseExited
        calc_simp.setIcon(new ImageIcon(getClass().getResource("assets/calculate_normal.png")));
    }//GEN-LAST:event_calc_simpMouseExited

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

    private void simp_equationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simp_equationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simp_equationActionPerformed

    private void clear_simpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_simpMouseEntered
        clear_simp.setIcon(new ImageIcon(getClass().getResource("assets/clear_hover.png")));
    }//GEN-LAST:event_clear_simpMouseEntered

    private void clear_simpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_simpMouseExited
        clear_simp.setIcon(new ImageIcon(getClass().getResource("assets/clear_normal.png")));
    }//GEN-LAST:event_clear_simpMouseExited

    private void clear_simpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_simpActionPerformed
        a_tx.setText("");
        b_tx.setText("");
        simp_equation.setText("");
        simp_interval.setText("");
        ans_tx.setText("");
    }//GEN-LAST:event_clear_simpActionPerformed

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
            java.util.logging.Logger.getLogger(simpsons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(simpsons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(simpsons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(simpsons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new simpsons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a_tx;
    private javax.swing.JTextArea ans_tx;
    private javax.swing.JTextField b_tx;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton calc_simp;
    private javax.swing.JButton clear_simp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField simp_equation;
    private javax.swing.JTextField simp_interval;
    // End of variables declaration//GEN-END:variables
}
