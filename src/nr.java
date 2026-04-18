import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.mariuszgromada.math.mxparser.*;


public class nr extends javax.swing.JFrame {

    public nr() {
        initComponents();
        centerTable();
    }
    
    private void centerTable() {
        
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < nr_ans.getColumnModel().getColumnCount(); i++) {
            nr_ans.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        eq_nr = new javax.swing.JTextField();
        nr_tolerance = new javax.swing.JTextField();
        nr_guess = new javax.swing.JTextField();
        calc_nr = new javax.swing.JButton();
        clear_trap = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nr_ans = new javax.swing.JTable();
        root_not = new javax.swing.JLabel();
        err = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        eq_nr.setBackground(new java.awt.Color(239, 235, 233));
        eq_nr.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        eq_nr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eq_nr.setBorder(null);
        eq_nr.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        eq_nr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eq_nrActionPerformed(evt);
            }
        });
        jPanel1.add(eq_nr, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 142, 240, 40));

        nr_tolerance.setBackground(new java.awt.Color(239, 235, 233));
        nr_tolerance.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        nr_tolerance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nr_tolerance.setBorder(null);
        nr_tolerance.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nr_tolerance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nr_toleranceActionPerformed(evt);
            }
        });
        jPanel1.add(nr_tolerance, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 240, 240, 40));

        nr_guess.setBackground(new java.awt.Color(239, 235, 233));
        nr_guess.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        nr_guess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nr_guess.setBorder(null);
        nr_guess.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nr_guess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nr_guessActionPerformed(evt);
            }
        });
        jPanel1.add(nr_guess, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 344, 240, 40));

        calc_nr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/calculate_normal.png"))); // NOI18N
        calc_nr.setContentAreaFilled(false);
        calc_nr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calc_nr.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/calculate_mid.png"))); // NOI18N
        calc_nr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calc_nrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calc_nrMouseExited(evt);
            }
        });
        calc_nr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc_nrActionPerformed(evt);
            }
        });
        jPanel1.add(calc_nr, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, -1, -1));

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
        jPanel1.add(clear_trap, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 250, 80));

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

        nr_ans.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        nr_ans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Iterations", "x", "Error"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        nr_ans.setGridColor(new java.awt.Color(153, 153, 255));
        nr_ans.setSelectionBackground(new java.awt.Color(153, 153, 255));
        nr_ans.setSelectionForeground(new java.awt.Color(255, 255, 255));
        nr_ans.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        nr_ans.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(nr_ans);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 66, 600, 530));

        root_not.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        root_not.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(root_not, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 410, 50));

        err.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        err.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(err, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 410, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/nr_bg.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eq_nrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eq_nrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eq_nrActionPerformed

    private void nr_toleranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nr_toleranceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nr_toleranceActionPerformed

    private void nr_guessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nr_guessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nr_guessActionPerformed
    
    public double error_tolerance;
    
    private void calc_nrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc_nrActionPerformed
        table_remove();
        calc_nr.setIcon(new ImageIcon(getClass().getResource("assets/calculate_mid.png")));
        String equation = eq_nr.getText().replace(" ", "");
        String toleranceInput = nr_tolerance.getText().replace(" ", "");
        String guessInput = nr_guess.getText().replace(" ", "");
        boolean go=true;
        if (equation.isEmpty() || toleranceInput.isEmpty() || guessInput.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter values for all the text fields.");
            return;
        }

        error_tolerance =filter_functions.isValidFractionOrDouble(toleranceInput) ? (toleranceInput.contains("/") ? filter_functions.parseFraction(toleranceInput) : Double.parseDouble(toleranceInput)) : Double.NaN;
        double guess = filter_functions.isValidFractionOrDouble(guessInput) ? (guessInput.contains("/") ? filter_functions.parseFraction(guessInput) : Double.parseDouble(guessInput)) : Double.NaN;

        double firstDerivative = firstD(equation, guess);
        double secondDerivative = secondD(equation, guess);

        Expression expression = new Expression(equation, new Argument("x = " + guess));
            if (!expression.checkSyntax()) {
                JOptionPane.showMessageDialog(null, "Invalid equation input");
                root_not.setText("");
                err.setText("");
                go=false;
                return;
            }
        
        
       if(!filter_functions.isValidFractionOrDouble(toleranceInput)){
           go=false;
           JOptionPane.showMessageDialog(null, "Invalid tolerance input");
       }
       else if(!filter_functions.isValidFractionOrDouble(guessInput)){
           go=false;
           JOptionPane.showMessageDialog(null, "Invalid guess input");
       }
        
       else if (declared_functions(equation, guess)*secondDerivative >Math.pow(firstDerivative, 2)) {
            JOptionPane.showMessageDialog(null, "The solution will not converge");
             go=false;
            root_not.setText("");
            err.setText("");
            return;
           
        }

        double functionValue = declared_functions(equation, guess);
        if (Math.abs(functionValue) > 1000) {
            JOptionPane.showMessageDialog(null, "Try guess again: The initial guess results in a large function value.");
            go=false;
            root_not.setText("");
            err.setText("");
            return;
        }
        
        
        

        row = 0;
        if(go){
            newton_raphson_method(equation, guess);
        }
        
        
    }//GEN-LAST:event_calc_nrActionPerformed

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

    private void calc_nrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calc_nrMouseEntered
       calc_nr.setIcon(new ImageIcon(getClass().getResource("assets/calculate_hover.png")));
    }//GEN-LAST:event_calc_nrMouseEntered

    private void calc_nrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calc_nrMouseExited
       calc_nr.setIcon(new ImageIcon(getClass().getResource("assets/calculate_normal.png")));
    }//GEN-LAST:event_calc_nrMouseExited

    private void clear_trapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_trapMouseEntered
        clear_trap.setIcon(new ImageIcon(getClass().getResource("assets/clear_hover.png")));
    }//GEN-LAST:event_clear_trapMouseEntered

    private void clear_trapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_trapMouseExited
        clear_trap.setIcon(new ImageIcon(getClass().getResource("assets/clear_normal.png")));
    }//GEN-LAST:event_clear_trapMouseExited

    private void clear_trapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_trapActionPerformed
        eq_nr.setText("");
        nr_tolerance.setText("");
        nr_guess.setText("");
        root_not.setText("");
        err.setText("");
        DefaultTableModel model = (DefaultTableModel) nr_ans.getModel();
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            model.setValueAt("", i, 0);
            model.setValueAt("", i, 1);
            model.setValueAt("", i, 2);
            table_remove();
        }
    }//GEN-LAST:event_clear_trapActionPerformed
    
    int row=0;
    
    public void newton_raphson_method(String equation, double x){
        double xsub = x;
        double eq = declared_functions(equation, x);
        double deq = firstD(equation, x);
        double newxsub = xsub - (eq / deq);

        double stor1 = xsub;
        double stor2 = newxsub;

        double error = Math.abs((stor1 - stor2) / stor1);

        nr_ans.setValueAt(row, row, 0);
        nr_ans.setValueAt(xsub, row, 1);
        if (row == 0)
            nr_ans.setValueAt("", row, 2);
        
            
        row++;
        nr_ans.setValueAt(error, row, 2);
        System.out.println(error);
        if (error > error_tolerance) {
            newton_raphson_method(equation, newxsub);
        } else {
            System.out.println("final: " + newxsub);
            nr_ans.setValueAt(row, row, 0);
            nr_ans.setValueAt(newxsub, row, 1);
            root_not.setText(String.valueOf("ROOT: " + newxsub));
            System.out.println("error: " + error);
            err.setText(String.valueOf("Error: " + error));
        }
    }
    
    public double declared_functions(String equation, double x) {
        Argument arg = new Argument("x = " + x);
        Expression exp = new Expression(equation, arg);
        return exp.calculate();
    }

    public double firstD(String equation, double x) {
        Argument arg = new Argument("x = " + x);
        Expression exp = new Expression("der(" + equation + ", x)", arg);
        return exp.calculate();
    }

    public double secondD(String equation, double x) {
        Argument arg = new Argument("x = " + x);
        Expression exp = new Expression("der(der(" + equation + ", x), x)", arg);
        return exp.calculate();
    }

    public void table_remove(){
        DefaultTableModel model = (DefaultTableModel) nr_ans.getModel();
        for (int i = 0; i < nr_ans.getRowCount(); i++) {
            for (int j = 0; j < nr_ans.getColumnCount(); j++) {
                nr_ans.setValueAt("", i, j);
            }
        }
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
            java.util.logging.Logger.getLogger(nr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton calc_nr;
    private javax.swing.JButton clear_trap;
    private javax.swing.JTextField eq_nr;
    private javax.swing.JLabel err;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable nr_ans;
    private javax.swing.JTextField nr_guess;
    private javax.swing.JTextField nr_tolerance;
    private javax.swing.JLabel root_not;
    // End of variables declaration//GEN-END:variables
}
