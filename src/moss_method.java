import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;

public class moss_method extends javax.swing.JFrame {

    public moss_method() {
        initComponents();
        centerTable();
    }
    
    private void centerTable() {
        
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < moss_ans.getColumnModel().getColumnCount(); i++) {
            moss_ans.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        guess = new javax.swing.JTextField();
        eq_tx = new javax.swing.JTextField();
        tbx_calculate_moss = new javax.swing.JButton();
        e_t = new javax.swing.JTextField();
        btn_back = new javax.swing.JButton();
        clear_trap = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        moss_ans = new javax.swing.JTable();
        root_not = new javax.swing.JLabel();
        err = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 732));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(1300, 732));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 732));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 732));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        guess.setBackground(new java.awt.Color(239, 235, 233));
        guess.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        guess.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        guess.setBorder(null);
        guess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessActionPerformed(evt);
            }
        });
        jPanel1.add(guess, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 345, 240, 40));

        eq_tx.setBackground(new java.awt.Color(239, 235, 233));
        eq_tx.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        eq_tx.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eq_tx.setBorder(null);
        jPanel1.add(eq_tx, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 142, 240, 40));

        tbx_calculate_moss.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        tbx_calculate_moss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/calculate_normal.png"))); // NOI18N
        tbx_calculate_moss.setContentAreaFilled(false);
        tbx_calculate_moss.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbx_calculate_moss.setPreferredSize(new java.awt.Dimension(80, 30));
        tbx_calculate_moss.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/calculate_mid.png"))); // NOI18N
        tbx_calculate_moss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbx_calculate_mossMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tbx_calculate_mossMouseExited(evt);
            }
        });
        tbx_calculate_moss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbx_calculate_mossActionPerformed(evt);
            }
        });
        jPanel1.add(tbx_calculate_moss, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 200, 60));

        e_t.setBackground(new java.awt.Color(239, 235, 233));
        e_t.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        e_t.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        e_t.setBorder(null);
        e_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_tActionPerformed(evt);
            }
        });
        jPanel1.add(e_t, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 240, 240, 40));

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
        jPanel1.add(clear_trap, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 250, 80));

        moss_ans.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        moss_ans.setModel(new javax.swing.table.DefaultTableModel(
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
                "Iterations", "Value ", "Error"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        moss_ans.setGridColor(new java.awt.Color(153, 153, 255));
        moss_ans.setSelectionBackground(new java.awt.Color(153, 153, 255));
        moss_ans.setSelectionForeground(new java.awt.Color(255, 255, 255));
        moss_ans.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(moss_ans);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 610, 570));

        root_not.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        root_not.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(root_not, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 530, 410, 50));

        err.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        err.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(err, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, 410, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/moss_bg.png"))); // NOI18N
        jLabel5.setIconTextGap(0);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void guessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guessActionPerformed

    private void tbx_calculate_mossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbx_calculate_mossActionPerformed
        table_remove();

        String equation = eq_tx.getText().replace(" ", "");
        String toleranceInput = e_t.getText().replace(" ", "");
        String guessInput = guess.getText().replace(" ", "");

        if (equation.isEmpty() || toleranceInput.isEmpty() || guessInput.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter values for all the text fields.");
            return;
        }

        try {
            
            double tolerance = filter_functions.isValidFractionOrDouble(toleranceInput) ? (toleranceInput.contains("/") ? filter_functions.parseFraction(toleranceInput) : Double.parseDouble(toleranceInput)) : Double.NaN;
            double initialGuess =  filter_functions.isValidFractionOrDouble(guessInput) ? (guessInput.contains("/") ? filter_functions.parseFraction(guessInput) : Double.parseDouble(guessInput)) : Double.NaN;
            
            if(!filter_functions.isValidFractionOrDouble(guessInput))
                JOptionPane.showMessageDialog(null, "Invalid guess input");
            if(!filter_functions.isValidFractionOrDouble(toleranceInput))
                JOptionPane.showMessageDialog(null, "Invalid error tolerance");
           
            Expression expression = new Expression(equation, new Argument("x = " + initialGuess));
            if (!expression.checkSyntax()) {
                JOptionPane.showMessageDialog(null, "Invalid equation input");
                return;
            }
            
            values(initialGuess, equation, tolerance);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numeric values.");
        }
        
    }//GEN-LAST:event_tbx_calculate_mossActionPerformed

    public  void values(double x, String equation, double t){
        
        double derived = derivative_ans(equation, x);
        int iteration=0;
        if (derived<1){
            System.out.println(derived);
            moss_method(x, iteration, equation, t);
        }
        else{
            JOptionPane.showMessageDialog(null, "Try another guess.");
            root_not.setText("");
            err.setText("");


        }
        
    }
    
    public  void moss_method(double x, int iteration, String equation, double tolerance){
        
        double xsub = x;
        int i = iteration;
        
         if(i==0){
            moss_ans.setValueAt(" ",0, 2);
        }
        
        System.out.println(xsub);
        
       moss_ans.setValueAt(i, i, 0);
       moss_ans.setValueAt(xsub, i, 1);
        
        double eq = equiv_val(xsub, equation);
        System.out.println("tryout root: "+eq);
        double stor1 = xsub;
        double stor2 = eq;
        
        double error = Math.abs((stor1-stor2)/stor1);
       
        
            if(error>=tolerance){
                
                
                i++;
                moss_ans.setValueAt(error, i, 2);
                if (i<=1000){
                    moss_method(eq, i, equation, tolerance);
                    
                }
                else{
                    System.out.println("Number is out of range.");
                }
            }
            else{
                moss_ans.setValueAt(i+1, i+1, 0);
                moss_ans.setValueAt(eq, i+1, 1);
                moss_ans.setValueAt(error, i+1, 2);
                System.out.println("final root: "+ eq);
                root_not.setText(String.valueOf(eq));
                System.out.println("error: "+ error);
                err.setText(String.valueOf(error));
            }
    }

    public double equiv_val(double x, String eq) {
        Expression expression = new Expression(eq, new Argument("x = " + x));
        double result = expression.calculate();
        if (Double.isNaN(result)) {
            JOptionPane.showMessageDialog(null, "Guess again");
        }
        return result;
    }

    public double derivative_ans(String eq, double x) {
        
        Argument arg = new Argument("x = " + x);
        Expression exp = new Expression("der(" + eq + ", x)", arg);
        return exp.calculate();
    }
    
    private void e_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e_tActionPerformed

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

    private void tbx_calculate_mossMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbx_calculate_mossMouseExited
        tbx_calculate_moss.setIcon(new ImageIcon(getClass().getResource("assets/calculate_normal.png")));
    }//GEN-LAST:event_tbx_calculate_mossMouseExited

    private void tbx_calculate_mossMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbx_calculate_mossMouseEntered
         tbx_calculate_moss.setIcon(new ImageIcon(getClass().getResource("assets/calculate_hover.png")));
    }//GEN-LAST:event_tbx_calculate_mossMouseEntered

    private void clear_trapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_trapMouseEntered
        clear_trap.setIcon(new ImageIcon(getClass().getResource("assets/clear_hover.png")));
    }//GEN-LAST:event_clear_trapMouseEntered

    private void clear_trapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_trapMouseExited
        clear_trap.setIcon(new ImageIcon(getClass().getResource("assets/clear_normal.png")));
    }//GEN-LAST:event_clear_trapMouseExited

    private void clear_trapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_trapActionPerformed
        eq_tx.setText("");
        e_t.setText("");
        guess.setText("");
        root_not.setText("");
        err.setText("");
        DefaultTableModel model = (DefaultTableModel) moss_ans.getModel();
        for(int i=0;i<moss_ans.getRowCount();i++){
            moss_ans.setValueAt("", i, 0);
            moss_ans.setValueAt("", i, 1);
            moss_ans.setValueAt("", i, 2);
            table_remove();
        }
    }//GEN-LAST:event_clear_trapActionPerformed

    public void table_remove(){
        DefaultTableModel model = (DefaultTableModel) moss_ans.getModel();
        for (int i = 0; i < moss_ans.getRowCount(); i++) {
            for (int j = 0; j < moss_ans.getColumnCount(); j++) {
                moss_ans.setValueAt("", i, j);
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
            java.util.logging.Logger.getLogger(moss_method.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(moss_method.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(moss_method.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(moss_method.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new moss_method().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton clear_trap;
    private javax.swing.JTextField e_t;
    private javax.swing.JTextField eq_tx;
    private javax.swing.JLabel err;
    private javax.swing.JTextField guess;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable moss_ans;
    private javax.swing.JLabel root_not;
    private javax.swing.JButton tbx_calculate_moss;
    // End of variables declaration//GEN-END:variables
}
