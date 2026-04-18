import javax.swing.*;
import org.mariuszgromada.math.mxparser.Expression;
import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.License;

public class trapezoidal extends javax.swing.JFrame {

    public trapezoidal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        a_tx = new javax.swing.JTextField();
        b_tx = new javax.swing.JTextField();
        trap_equation = new javax.swing.JTextField();
        calc = new javax.swing.JButton();
        trap_interval = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ans_tx = new javax.swing.JTextArea();
        btn_back = new javax.swing.JButton();
        clear_trap = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

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

        a_tx.setBackground(new java.awt.Color(255, 255, 255));
        a_tx.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        a_tx.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a_tx.setBorder(null);
        a_tx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_txActionPerformed(evt);
            }
        });
        jPanel1.add(a_tx, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 150, 60));

        b_tx.setBackground(new java.awt.Color(255, 255, 255));
        b_tx.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        b_tx.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b_tx.setBorder(null);
        b_tx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_txActionPerformed(evt);
            }
        });
        jPanel1.add(b_tx, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 362, 150, 60));

        trap_equation.setBackground(new java.awt.Color(239, 235, 233));
        trap_equation.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        trap_equation.setBorder(null);
        trap_equation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trap_equationActionPerformed(evt);
            }
        });
        jPanel1.add(trap_equation, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 234, 370, 60));

        calc.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        calc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/calculate_normal.png"))); // NOI18N
        calc.setContentAreaFilled(false);
        calc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calc.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/calculate_mid.png"))); // NOI18N
        calc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcMouseExited(evt);
            }
        });
        calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcActionPerformed(evt);
            }
        });
        jPanel1.add(calc, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 200, 60));

        trap_interval.setBackground(new java.awt.Color(239, 235, 233));
        trap_interval.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        trap_interval.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        trap_interval.setBorder(null);
        jPanel1.add(trap_interval, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 280, 50));

        ans_tx.setEditable(false);
        ans_tx.setColumns(20);
        ans_tx.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        ans_tx.setRows(5);
        jScrollPane1.setViewportView(ans_tx);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 530, 560));

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
        jPanel1.add(clear_trap, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 250, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/trapezoidal_bg.png"))); // NOI18N
        jLabel3.setIconTextGap(0);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void a_txActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_txActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_txActionPerformed

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
    
    private void calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcActionPerformed
        calc.setIcon(new ImageIcon(getClass().getResource("/assets/calculate_mid.png")));

        if (b_tx.getText().isEmpty() || a_tx.getText().isEmpty() || trap_equation.getText().isEmpty() || trap_interval.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter values for all the text fields");
            allow = false;
        } 
        else if(a_tx.getText().contains("/pi")||b_tx.getText().contains("/pi")){
            JOptionPane.showConfirmDialog(null, "Doesnt suuport pi and fraction");
            allow=false;
        }
        else {
            if(filter_functions.isValidFractionOrDouble(b_tx.getText())&&filter_functions.isValidFractionOrDouble(a_tx.getText())){
            
            double x0 = filter_functions.parseFraction(b_tx.getText());
            
            double xn = filter_functions.parseFraction(a_tx.getText());
            double n = Double.valueOf(trap_interval.getText());
            String equation = trap_equation.getText();
            Expression expression = new Expression(equation, new Argument("x = " + xn));
            if (!expression.checkSyntax()) {
                JOptionPane.showMessageDialog(null, "Invalid equation input");
                return;
            }
            allow = true;
            
            if(Double.isFinite(xn)&&Double.isFinite(x0)){
                trapezoidal_calc(xn, x0, n, equation);
            }
            else
                JOptionPane.showMessageDialog(null, "Invalid input for a or b");
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid input for a or b");
            }
        }
    }//GEN-LAST:event_calcActionPerformed

    private void trap_equationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trap_equationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trap_equationActionPerformed

    private void calcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcMouseEntered
        calc.setIcon(new ImageIcon(getClass().getResource("assets/calculate_hover.png")));
    }//GEN-LAST:event_calcMouseEntered

    private void calcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcMouseExited
       calc.setIcon(new ImageIcon(getClass().getResource("assets/calculate_normal.png")));
    }//GEN-LAST:event_calcMouseExited

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        btn_back.setIcon(new ImageIcon(getClass().getResource("assets/back_mid.png")));
        new main().setVisible(true);
        dispose();        
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseEntered
        btn_back.setIcon(new ImageIcon(getClass().getResource("assets/back_hover.png")));

    }//GEN-LAST:event_btn_backMouseEntered

    private void btn_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseExited
        btn_back.setIcon(new ImageIcon(getClass().getResource("assets/back_normal.png")));
    }//GEN-LAST:event_btn_backMouseExited

    private void clear_trapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_trapMouseEntered
        clear_trap.setIcon(new ImageIcon(getClass().getResource("assets/clear_hover.png")));
    }//GEN-LAST:event_clear_trapMouseEntered

    private void clear_trapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_trapMouseExited
        clear_trap.setIcon(new ImageIcon(getClass().getResource("assets/clear_normal.png")));
    }//GEN-LAST:event_clear_trapMouseExited

    private void clear_trapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_trapActionPerformed
        b_tx.setText("");
        a_tx.setText("");
        trap_equation.setText("");
        trap_interval.setText("");
        ans_tx.setText("");
    }//GEN-LAST:event_clear_trapActionPerformed

    public void trapezoidal_calc(double xn, double x0, double n, String equation){
        double h = (xn - x0) / n;

        double y0 = evaluateEquation(equation, x0);
        double yn = evaluateEquation(equation, xn);

        double sum = 0;
        for (int i = 1; i < n; i++) {
            double xi = x0 + i * h;
            sum += evaluateEquation(equation, xi);
        }

        double IT = (h / 2) * (y0 + yn + 2 * sum);

        double trueValue = computeTrueValue(equation, x0, xn);

        // Compute the second derivative at the endpoints
        double secondDerivativeMax = Math.max(secondDerivative(equation, x0), secondDerivative(equation, xn));
        double secondDerivativeMin = Math.min(secondDerivative(equation, x0), secondDerivative(equation, xn));
        
        if (equation.contains("e")) {
            double temp = secondDerivativeMax;
            secondDerivativeMax = secondDerivativeMin;
            secondDerivativeMin = temp;
        }

        // Calculate the error bounds
        double upperBoundError = Math.abs((Math.pow(h, 2) / 12) * (xn - x0) * secondDerivativeMax);
        double lowerBoundError = Math.abs((Math.pow(h, 2) / 12) * (xn - x0) * secondDerivativeMin);

        double actualError = Math.abs(trueValue - IT);

        boolean acceptable = lowerBoundError < actualError && actualError < upperBoundError;

        if (allow) {
            ans_tx.setText("Integral using Trapezoidal Rule: \n" + IT + "\nTrue Value: \n" + trueValue + "\nActual Error: \n" + actualError +
            "\nUpper Bound Error: \n" + upperBoundError + "\nLower Bound Error: \n" + lowerBoundError +
            "\n\n" + lowerBoundError + " < " + actualError + " < " + upperBoundError + "\n\nIs the answer acceptable? \n" + (acceptable ? "YES" : "NO"));
        }
    }

    private boolean allow = true;

    private double evaluateEquation(String equation, double x) {
        Expression exp = new Expression(equation);
        exp.addArguments(new Argument("x = " + x));
        return exp.calculate();
    }


    private static double computeTrueValue(String equation, double x0, double xn) {
        Expression exp = new Expression("int(" + equation + ", x, " + x0 + ", " + xn + ")");
        return exp.calculate();
    }

    private static double secondDerivative(String equation, double x) {
        Expression exp = new Expression("der(der(" + equation + ", x), x)");
        exp.addArguments(new Argument("x = " + x));
        return exp.calculate();
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
            java.util.logging.Logger.getLogger(trapezoidal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trapezoidal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trapezoidal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trapezoidal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         License.iConfirmNonCommercialUse("hello");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trapezoidal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a_tx;
    private javax.swing.JTextArea ans_tx;
    private javax.swing.JTextField b_tx;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton calc;
    private javax.swing.JButton clear_trap;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField trap_equation;
    private javax.swing.JTextField trap_interval;
    // End of variables declaration//GEN-END:variables
}
