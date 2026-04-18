import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableCellRenderer;

public class jacobi extends javax.swing.JFrame {

    public jacobi() {
        initComponents();
        calc_jcb.setDisabledIcon( (new ImageIcon(getClass().getResource("assets/calculate_mid.png"))));
        centerTable(); 
        
    }
    
    private void centerTable() {
        
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < tab_jcb.getColumnModel().getColumnCount(); i++) {
            tab_jcb.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        headerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < tab_jcb_ans.getColumnModel().getColumnCount(); i++) {
            tab_jcb_ans.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }
    
    public double[] solveJacobi(double[][] coefficients, double[] constants, double tolerance, int maxIterations, double[] initialGuess) {
        JTextField[][] tfa = {
            {a00, a01, a02, a03, a04, a05},
            {a10, a11, a12, a13, a14, a15},
            {a20, a21, a22, a23, a24, a25},
            {a30, a31, a32, a33, a34, a35},
            {a40, a41, a42, a43, a44, a45},
            {a50, a51, a52, a53, a54, a55}
        };

        JTextField[] tfb = {b0, b1, b2, b3, b4, b5};
        table_remove();
        int n = coefficients.length;
        double[] currentSolution = Arrays.copyOf(initialGuess, initialGuess.length); 
        double[] nextSolution = new double[n];
        double[] errors = new double[n];
        int iterations = 0;

        Arrays.fill(errors, 0.0); 
        updateTables(iterations, currentSolution, nextSolution, errors);
        iterations++;

        while (iterations <= maxIterations) {
            for (int i = 0; i < n; i++) {
                double sum = constants[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        String trimmedText = tfa[i][j].getText().trim();
                        trimmedText = trimmedText.replaceAll("\\s", "");
                        double coefficient = Double.parseDouble(trimmedText);
                        sum -= coefficient * currentSolution[j];
                    }
                }
                nextSolution[i] = sum / coefficients[i][i];
            }

            boolean converged = true;
            for (int i = 0; i < n; i++) {
                errors[i] = Math.abs((nextSolution[i] - currentSolution[i]) / nextSolution[i]);
                if (errors[i] >= tolerance) {
                    converged = false;
                }
            }

            updateTables(iterations, currentSolution, nextSolution, errors);

            if (converged) {
                return nextSolution;
            }

            System.arraycopy(nextSolution, 0, currentSolution, 0, n);
            iterations++;
        }

        return null; 
    }


   private void updateTables(int iteration, double[] currentSolution, double[] nextSolution, double[] errors) {
    // Update table with current solution and errors
    for (int i = 0; i < currentSolution.length; i++) {
        tab_jcb_ans.setValueAt(currentSolution[i], iteration, i + 1);
        tab_jcb.setValueAt(errors[i], iteration, i + 1);
    }

    tab_jcb.setValueAt(iteration, iteration, 0);
    tab_jcb_ans.setValueAt(iteration, iteration, 0);

    if (iteration > 0) {
        int nextIteration = iteration;
        for (int i = 0; i < nextSolution.length; i++) {
            tab_jcb_ans.setValueAt(nextSolution[i], nextIteration, i + 1);
            tab_jcb.setValueAt(errors[i], nextIteration, i + 1);
        }
        tab_jcb.setValueAt(nextIteration, nextIteration, 0);
        tab_jcb_ans.setValueAt(nextIteration, nextIteration, 0);
    }
}
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        a00 = new javax.swing.JTextField();
        a01 = new javax.swing.JTextField();
        a02 = new javax.swing.JTextField();
        a03 = new javax.swing.JTextField();
        a04 = new javax.swing.JTextField();
        a05 = new javax.swing.JTextField();
        a10 = new javax.swing.JTextField();
        a11 = new javax.swing.JTextField();
        a12 = new javax.swing.JTextField();
        a13 = new javax.swing.JTextField();
        a14 = new javax.swing.JTextField();
        a15 = new javax.swing.JTextField();
        a20 = new javax.swing.JTextField();
        a21 = new javax.swing.JTextField();
        a22 = new javax.swing.JTextField();
        a23 = new javax.swing.JTextField();
        a24 = new javax.swing.JTextField();
        a25 = new javax.swing.JTextField();
        a30 = new javax.swing.JTextField();
        a31 = new javax.swing.JTextField();
        a32 = new javax.swing.JTextField();
        a33 = new javax.swing.JTextField();
        a34 = new javax.swing.JTextField();
        a35 = new javax.swing.JTextField();
        a40 = new javax.swing.JTextField();
        a41 = new javax.swing.JTextField();
        a42 = new javax.swing.JTextField();
        a43 = new javax.swing.JTextField();
        a44 = new javax.swing.JTextField();
        a45 = new javax.swing.JTextField();
        a50 = new javax.swing.JTextField();
        a51 = new javax.swing.JTextField();
        a52 = new javax.swing.JTextField();
        a53 = new javax.swing.JTextField();
        a54 = new javax.swing.JTextField();
        a55 = new javax.swing.JTextField();
        no_eq_jcb = new javax.swing.JTextField();
        go_jcb = new javax.swing.JButton();
        calc_jcb = new javax.swing.JButton();
        clr_jcb = new javax.swing.JButton();
        b0 = new javax.swing.JTextField();
        b1 = new javax.swing.JTextField();
        b2 = new javax.swing.JTextField();
        b3 = new javax.swing.JTextField();
        b4 = new javax.swing.JTextField();
        b5 = new javax.swing.JTextField();
        back_button_jcb = new javax.swing.JButton();
        guess_jcb = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_jcb_ans = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_jcb = new javax.swing.JTable();
        tolerance_jcb = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1300, 732));
        setMinimumSize(new java.awt.Dimension(1300, 732));
        setPreferredSize(new java.awt.Dimension(1310, 732));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(1300, 732));
        jPanel1.setMinimumSize(new java.awt.Dimension(1300, 732));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 732));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a00.setEditable(false);
        a00.setBackground(new java.awt.Color(141, 119, 171));
        a00.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a00.setForeground(new java.awt.Color(255, 255, 255));
        a00.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a00.setBorder(null);
        a00.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a00, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 152, 60, -1));

        a01.setEditable(false);
        a01.setBackground(new java.awt.Color(141, 119, 171));
        a01.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a01.setForeground(new java.awt.Color(255, 255, 255));
        a01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a01.setBorder(null);
        a01.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a01, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 152, 60, -1));

        a02.setEditable(false);
        a02.setBackground(new java.awt.Color(141, 119, 171));
        a02.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a02.setForeground(new java.awt.Color(255, 255, 255));
        a02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a02.setBorder(null);
        a02.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a02, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 152, 60, -1));

        a03.setEditable(false);
        a03.setBackground(new java.awt.Color(141, 119, 171));
        a03.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a03.setForeground(new java.awt.Color(255, 255, 255));
        a03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a03.setBorder(null);
        a03.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a03, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 152, 60, -1));

        a04.setEditable(false);
        a04.setBackground(new java.awt.Color(141, 119, 171));
        a04.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a04.setForeground(new java.awt.Color(255, 255, 255));
        a04.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a04.setBorder(null);
        a04.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a04, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 152, 60, -1));

        a05.setEditable(false);
        a05.setBackground(new java.awt.Color(141, 119, 171));
        a05.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a05.setForeground(new java.awt.Color(255, 255, 255));
        a05.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a05.setBorder(null);
        a05.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a05, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 152, 60, -1));

        a10.setEditable(false);
        a10.setBackground(new java.awt.Color(141, 119, 171));
        a10.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a10.setForeground(new java.awt.Color(255, 255, 255));
        a10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a10.setBorder(null);
        a10.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a10, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 221, 60, -1));

        a11.setEditable(false);
        a11.setBackground(new java.awt.Color(141, 119, 171));
        a11.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a11.setForeground(new java.awt.Color(255, 255, 255));
        a11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a11.setBorder(null);
        a11.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a11, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 221, 60, -1));

        a12.setEditable(false);
        a12.setBackground(new java.awt.Color(141, 119, 171));
        a12.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a12.setForeground(new java.awt.Color(255, 255, 255));
        a12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a12.setBorder(null);
        a12.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a12, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 221, 60, -1));

        a13.setEditable(false);
        a13.setBackground(new java.awt.Color(141, 119, 171));
        a13.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a13.setForeground(new java.awt.Color(255, 255, 255));
        a13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a13.setBorder(null);
        a13.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a13, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 221, 60, -1));

        a14.setEditable(false);
        a14.setBackground(new java.awt.Color(141, 119, 171));
        a14.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a14.setForeground(new java.awt.Color(255, 255, 255));
        a14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a14.setBorder(null);
        a14.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a14, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 221, 60, -1));

        a15.setEditable(false);
        a15.setBackground(new java.awt.Color(141, 119, 171));
        a15.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a15.setForeground(new java.awt.Color(255, 255, 255));
        a15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a15.setBorder(null);
        a15.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a15, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 221, 60, -1));

        a20.setEditable(false);
        a20.setBackground(new java.awt.Color(141, 119, 171));
        a20.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a20.setForeground(new java.awt.Color(255, 255, 255));
        a20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a20.setBorder(null);
        a20.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a20, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 290, 60, -1));

        a21.setEditable(false);
        a21.setBackground(new java.awt.Color(141, 119, 171));
        a21.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a21.setForeground(new java.awt.Color(255, 255, 255));
        a21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a21.setBorder(null);
        a21.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a21, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 290, 60, -1));

        a22.setEditable(false);
        a22.setBackground(new java.awt.Color(141, 119, 171));
        a22.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a22.setForeground(new java.awt.Color(255, 255, 255));
        a22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a22.setBorder(null);
        a22.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a22, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 290, 60, -1));

        a23.setEditable(false);
        a23.setBackground(new java.awt.Color(141, 119, 171));
        a23.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a23.setForeground(new java.awt.Color(255, 255, 255));
        a23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a23.setBorder(null);
        a23.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a23, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 290, 60, -1));

        a24.setEditable(false);
        a24.setBackground(new java.awt.Color(141, 119, 171));
        a24.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a24.setForeground(new java.awt.Color(255, 255, 255));
        a24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a24.setBorder(null);
        a24.setPreferredSize(new java.awt.Dimension(70, 40));
        a24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a24ActionPerformed(evt);
            }
        });
        jPanel1.add(a24, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 290, 60, -1));

        a25.setEditable(false);
        a25.setBackground(new java.awt.Color(141, 119, 171));
        a25.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a25.setForeground(new java.awt.Color(255, 255, 255));
        a25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a25.setBorder(null);
        a25.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a25, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 290, 60, -1));

        a30.setEditable(false);
        a30.setBackground(new java.awt.Color(141, 119, 171));
        a30.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a30.setForeground(new java.awt.Color(255, 255, 255));
        a30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a30.setBorder(null);
        a30.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a30, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 359, 60, -1));

        a31.setEditable(false);
        a31.setBackground(new java.awt.Color(141, 119, 171));
        a31.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a31.setForeground(new java.awt.Color(255, 255, 255));
        a31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a31.setBorder(null);
        a31.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a31, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 359, 60, -1));

        a32.setEditable(false);
        a32.setBackground(new java.awt.Color(141, 119, 171));
        a32.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a32.setForeground(new java.awt.Color(255, 255, 255));
        a32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a32.setBorder(null);
        a32.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a32, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 359, 60, -1));

        a33.setEditable(false);
        a33.setBackground(new java.awt.Color(141, 119, 171));
        a33.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a33.setForeground(new java.awt.Color(255, 255, 255));
        a33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a33.setBorder(null);
        a33.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a33, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 359, 60, -1));

        a34.setEditable(false);
        a34.setBackground(new java.awt.Color(141, 119, 171));
        a34.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a34.setForeground(new java.awt.Color(255, 255, 255));
        a34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a34.setBorder(null);
        a34.setPreferredSize(new java.awt.Dimension(70, 40));
        a34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a34ActionPerformed(evt);
            }
        });
        jPanel1.add(a34, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 359, 60, -1));

        a35.setEditable(false);
        a35.setBackground(new java.awt.Color(141, 119, 171));
        a35.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a35.setForeground(new java.awt.Color(255, 255, 255));
        a35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a35.setBorder(null);
        a35.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a35, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 359, 60, -1));

        a40.setEditable(false);
        a40.setBackground(new java.awt.Color(141, 119, 171));
        a40.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a40.setForeground(new java.awt.Color(255, 255, 255));
        a40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a40.setBorder(null);
        a40.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a40, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 427, 60, -1));

        a41.setEditable(false);
        a41.setBackground(new java.awt.Color(141, 119, 171));
        a41.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a41.setForeground(new java.awt.Color(255, 255, 255));
        a41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a41.setBorder(null);
        a41.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a41, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 427, 60, -1));

        a42.setEditable(false);
        a42.setBackground(new java.awt.Color(141, 119, 171));
        a42.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a42.setForeground(new java.awt.Color(255, 255, 255));
        a42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a42.setBorder(null);
        a42.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a42, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 427, 60, -1));

        a43.setEditable(false);
        a43.setBackground(new java.awt.Color(141, 119, 171));
        a43.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a43.setForeground(new java.awt.Color(255, 255, 255));
        a43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a43.setBorder(null);
        a43.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a43, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 427, 60, -1));

        a44.setEditable(false);
        a44.setBackground(new java.awt.Color(141, 119, 171));
        a44.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a44.setForeground(new java.awt.Color(255, 255, 255));
        a44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a44.setBorder(null);
        a44.setPreferredSize(new java.awt.Dimension(70, 40));
        a44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a44ActionPerformed(evt);
            }
        });
        jPanel1.add(a44, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 427, 60, -1));

        a45.setEditable(false);
        a45.setBackground(new java.awt.Color(141, 119, 171));
        a45.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a45.setForeground(new java.awt.Color(255, 255, 255));
        a45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a45.setBorder(null);
        a45.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a45, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 427, 60, -1));

        a50.setEditable(false);
        a50.setBackground(new java.awt.Color(141, 119, 171));
        a50.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a50.setForeground(new java.awt.Color(255, 255, 255));
        a50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a50.setBorder(null);
        a50.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a50, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 497, 60, -1));

        a51.setEditable(false);
        a51.setBackground(new java.awt.Color(141, 119, 171));
        a51.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a51.setForeground(new java.awt.Color(255, 255, 255));
        a51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a51.setBorder(null);
        a51.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a51, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 497, 60, -1));

        a52.setEditable(false);
        a52.setBackground(new java.awt.Color(141, 119, 171));
        a52.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a52.setForeground(new java.awt.Color(255, 255, 255));
        a52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a52.setBorder(null);
        a52.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a52, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 497, 60, -1));

        a53.setEditable(false);
        a53.setBackground(new java.awt.Color(141, 119, 171));
        a53.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a53.setForeground(new java.awt.Color(255, 255, 255));
        a53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a53.setBorder(null);
        a53.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a53, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 497, 60, -1));

        a54.setEditable(false);
        a54.setBackground(new java.awt.Color(141, 119, 171));
        a54.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a54.setForeground(new java.awt.Color(255, 255, 255));
        a54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a54.setBorder(null);
        a54.setPreferredSize(new java.awt.Dimension(70, 40));
        a54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a54ActionPerformed(evt);
            }
        });
        jPanel1.add(a54, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 497, 60, -1));

        a55.setEditable(false);
        a55.setBackground(new java.awt.Color(141, 119, 171));
        a55.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        a55.setForeground(new java.awt.Color(255, 255, 255));
        a55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        a55.setBorder(null);
        a55.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(a55, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 497, 60, -1));

        no_eq_jcb.setBackground(new java.awt.Color(239, 235, 233));
        no_eq_jcb.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        no_eq_jcb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        no_eq_jcb.setBorder(null);
        no_eq_jcb.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(no_eq_jcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 84, 190, 30));

        go_jcb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/go_normal.png"))); // NOI18N
        go_jcb.setContentAreaFilled(false);
        go_jcb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        go_jcb.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/go_mid.png"))); // NOI18N
        go_jcb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                go_jcbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                go_jcbMouseExited(evt);
            }
        });
        go_jcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                go_jcbActionPerformed(evt);
            }
        });
        jPanel1.add(go_jcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 170, 60));

        calc_jcb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/calculate_normal.png"))); // NOI18N
        calc_jcb.setContentAreaFilled(false);
        calc_jcb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calc_jcb.setEnabled(false);
        calc_jcb.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/calculate_mid.png"))); // NOI18N
        calc_jcb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calc_jcbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calc_jcbMouseExited(evt);
            }
        });
        calc_jcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc_jcbActionPerformed(evt);
            }
        });
        jPanel1.add(calc_jcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 620, 200, 60));

        clr_jcb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/clear_normal.png"))); // NOI18N
        clr_jcb.setContentAreaFilled(false);
        clr_jcb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clr_jcb.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/clear_mid.png"))); // NOI18N
        clr_jcb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clr_jcbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clr_jcbMouseExited(evt);
            }
        });
        clr_jcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clr_jcbActionPerformed(evt);
            }
        });
        jPanel1.add(clr_jcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, 180, 60));

        b0.setEditable(false);
        b0.setBackground(new java.awt.Color(141, 119, 171));
        b0.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        b0.setForeground(new java.awt.Color(255, 255, 255));
        b0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b0.setBorder(null);
        b0.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(b0, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 152, 60, -1));

        b1.setEditable(false);
        b1.setBackground(new java.awt.Color(141, 119, 171));
        b1.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b1.setBorder(null);
        b1.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 221, 60, -1));

        b2.setEditable(false);
        b2.setBackground(new java.awt.Color(141, 119, 171));
        b2.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b2.setBorder(null);
        b2.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 60, -1));

        b3.setEditable(false);
        b3.setBackground(new java.awt.Color(141, 119, 171));
        b3.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b3.setBorder(null);
        b3.setPreferredSize(new java.awt.Dimension(70, 40));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 359, 60, -1));

        b4.setEditable(false);
        b4.setBackground(new java.awt.Color(141, 119, 171));
        b4.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        b4.setForeground(new java.awt.Color(255, 255, 255));
        b4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b4.setBorder(null);
        b4.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 427, 60, -1));

        b5.setEditable(false);
        b5.setBackground(new java.awt.Color(141, 119, 171));
        b5.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        b5.setForeground(new java.awt.Color(255, 255, 255));
        b5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        b5.setBorder(null);
        b5.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 497, 60, -1));

        back_button_jcb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back_normal.png"))); // NOI18N
        back_button_jcb.setContentAreaFilled(false);
        back_button_jcb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_button_jcb.setPreferredSize(new java.awt.Dimension(80, 30));
        back_button_jcb.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back_mid.png"))); // NOI18N
        back_button_jcb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                back_button_jcbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                back_button_jcbMouseExited(evt);
            }
        });
        back_button_jcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_button_jcbActionPerformed(evt);
            }
        });
        jPanel1.add(back_button_jcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 60));

        guess_jcb.setBackground(new java.awt.Color(239, 235, 233));
        guess_jcb.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        guess_jcb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        guess_jcb.setBorder(null);
        guess_jcb.setPreferredSize(new java.awt.Dimension(70, 40));
        guess_jcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guess_jcbActionPerformed(evt);
            }
        });
        jPanel1.add(guess_jcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 190, 30));

        jTabbedPane1.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N

        jScrollPane2.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N

        tab_jcb_ans.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        tab_jcb_ans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "k", "x1", "x2", "x3", "x4", "x5", "x6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_jcb_ans.setGridColor(new java.awt.Color(153, 153, 255));
        tab_jcb_ans.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tab_jcb_ans.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tab_jcb_ans.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tab_jcb_ans);

        jTabbedPane1.addTab("Answers", jScrollPane2);

        jScrollPane1.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N

        tab_jcb.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        tab_jcb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "k", "x1", "x2", "x3", "x4", "x5", "x6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tab_jcb.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tab_jcb.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tab_jcb.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tab_jcb);
        if (tab_jcb.getColumnModel().getColumnCount() > 0) {
            tab_jcb.getColumnModel().getColumn(0).setResizable(false);
        }

        jTabbedPane1.addTab("Errors", jScrollPane1);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 584, 600));

        tolerance_jcb.setBackground(new java.awt.Color(239, 235, 233));
        tolerance_jcb.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        tolerance_jcb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tolerance_jcb.setBorder(null);
        tolerance_jcb.setPreferredSize(new java.awt.Dimension(70, 40));
        jPanel1.add(tolerance_jcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 628, 190, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/jacobi_bg.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1305, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void guess_jcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guess_jcbActionPerformed
        System.out.println("baba");
    }//GEN-LAST:event_guess_jcbActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void clr_jcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clr_jcbActionPerformed
        JTextField[][] tfa = {
                            {a00, a01, a02, a03, a04, a05},
                            {a10, a11, a12, a13, a14, a15},
                            {a20, a21, a22, a23, a24, a25},
                            {a30, a31, a32, a33, a34, a35},
                            {a40, a41, a42, a43, a44, a45},
                            {a50, a51, a52, a53, a54, a55}
                            };

        JTextField[] tfb = {b0, b1, b2, b3, b4, b5};

        no_eq_jcb.setText("");
        guess_jcb.setText("");
        guess_jcb.setEnabled(false);
        tolerance_jcb.setText("");
        tolerance_jcb.setEnabled(false);

        for (int i = 0; i < tfa.length; i++) {
            tfb[i].setText("");
            for (int j = 0; j < tfa[i].length; j++) {
                tfa[i][j].setText("");
            }
        }
        calc_jcb.setEnabled(false);
        table_remove();

    }//GEN-LAST:event_clr_jcbActionPerformed
    
    public int y=0;
    public int n;
    
    private void go_jcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_go_jcbActionPerformed
            JTextField[][]tfa = {{a00, a01, a02, a03, a04, a05},
            {a10, a11, a12, a13, a14, a15},
            {a20, a21, a22, a23, a24, a25},
            {a30, a31, a32, a33, a34, a35},
            {a40, a41, a42, a43, a44, a45},
            {a50, a51, a52, a53, a54, a55}};
            
        table_remove();
        boolean conti_jcb = true;
        JTextField[] tfb = {b0, b1, b2, b3, b4, b5};
        
        for(int i=0;i<tfa.length;i++){
            tfb[i].setEditable(false);
            tfb[i].setText("");
            for(int j=0;j<tfa[i].length;j++){
                tfa[i][j].setEditable(false);
                tfa[i][j].setText("");
            }
        }
        calc_jcb.setEnabled(true);
        String inputText = no_eq_jcb.getText().replace(" ", "");
        if (inputText.equals("2.0") || inputText.equals("3.0") || inputText.equals("4.0") ||
                inputText.equals("5.0") || inputText.equals("6.0")) {
            n = Integer.parseInt(inputText.substring(0, 1));
        } else {
            try {
                n = Integer.parseInt(inputText);
                if (n < 2 || n > 6) {
                    JOptionPane.showMessageDialog(null, "Enter a number in the range [2-6]");
                    conti_jcb = false;
                    calc_jcb.setEnabled(false);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Enter a valid number");
                conti_jcb = false;
                calc_jcb.setEnabled(false);
            }
        }

        if (conti_jcb) {
            for (int i = 0; i < n; i++) {
                tfb[i].setEditable(true);
                tfb[i].setText("");
                for (int j = 0; j < n; j++) {
                    tfa[i][j].setEditable(true);
                    tfa[i][j].setText("");
                }
            }
            calc_jcb.setEnabled(true);
            guess_jcb.setEnabled(true);
            tolerance_jcb.setEnabled(true);
        }

    }
    
    public void table_remove() {
        for (int i = 0; i < tab_jcb.getRowCount(); i++) {
            for (int j = 0; j < tab_jcb.getColumnCount(); j++) {
                tab_jcb.setValueAt("", i, j);
                tab_jcb_ans.setValueAt("", i, j);
            }
        }
    }//GEN-LAST:event_go_jcbActionPerformed

    private void a54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a54ActionPerformed

    private void a44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a44ActionPerformed

    private void a34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a34ActionPerformed

    private void a24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a24ActionPerformed

    private void calc_jcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc_jcbActionPerformed
        JTextField[][] tfa = {
            {a00, a01, a02, a03, a04, a05},
            {a10, a11, a12, a13, a14, a15},
            {a20, a21, a22, a23, a24, a25},
            {a30, a31, a32, a33, a34, a35},
            {a40, a41, a42, a43, a44, a45},
            {a50, a51, a52, a53, a54, a55}
        };

        JTextField[] tfb = {b0, b1, b2, b3, b4, b5};
        table_remove();
        double[][] matx = new double[n][n];
        double[] cons = new double[n];

        boolean validInput = true;

        for (int i = 0; i < n; i++) {
            String trimmedText = tfb[i].getText().trim();
            trimmedText = trimmedText.replaceAll("\\s", "");
            if(new Scanner(trimmedText).hasNextDouble()){
                cons[i] = Double.valueOf(trimmedText);
            }
            else{
                if(!trimmedText.contains("/")){
                    validInput=false;
                    break;
                }
                else{
                    cons[i] = filter_functions.parseFraction(trimmedText);
                    if (cons[i] == Double.NaN) 
                        validInput = false;
                        break;
                }
            }

            for (int j = 0; j < n; j++) {
                String trimmedTextMatx = tfa[i][j].getText().trim();
                trimmedTextMatx = trimmedTextMatx.replaceAll("\\s", "");
                if(new Scanner(trimmedTextMatx).hasNextDouble()){
                    matx[i][j] = Double.valueOf(trimmedTextMatx);
                }
                else{
                     if(!trimmedTextMatx.contains("/")){
                        validInput=false;
                        break;
                     }
                     else{
                        matx[i][j] = filter_functions.parseFraction(trimmedTextMatx);
                        if (matx[i][j] == Double.NaN) {
                            validInput = false;
                            break;
                        }
                     }
                }
            }
            if (!validInput) {
                break;
            }
        }

        if (!validInput) {
            JOptionPane.showMessageDialog(null, "Fill all required fields with valid numbers");
            return;
        } 

        if (!isDiagonallyDominant(matx)) {
            JOptionPane.showMessageDialog(null, "Matrix is not diagonally dominant");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Matrix is diagonally dominant");            
        }

        if (!new Scanner(tolerance_jcb.getText()).hasNextDouble()) {
            JOptionPane.showMessageDialog(null, "Fill all required fields with valid numbers");
            return;
        }

        double et = Double.valueOf(tolerance_jcb.getText());
        int maxIterations = 1000;
        double tolerance = et;

        double[] initialGuess = new double[n]; 

        double[] solution = solveJacobi(matx, cons, tolerance, maxIterations, initialGuess);
        if (solution == null) {
            JOptionPane.showMessageDialog(null, "Solution not found within max iterations");
        }
    }//GEN-LAST:event_calc_jcbActionPerformed

    private void back_button_jcbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_button_jcbMouseEntered
        back_button_jcb.setIcon(new ImageIcon(getClass().getResource("assets/back_hover.png")));
    }//GEN-LAST:event_back_button_jcbMouseEntered

    private void back_button_jcbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_button_jcbMouseExited
        back_button_jcb.setIcon(new ImageIcon(getClass().getResource("assets/back_normal.png")));
    }//GEN-LAST:event_back_button_jcbMouseExited

    private void back_button_jcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_button_jcbActionPerformed

        back_button_jcb.setIcon(new ImageIcon(getClass().getResource("assets/back_mid.png")));

        new main().setVisible(true);
        dispose();
    }//GEN-LAST:event_back_button_jcbActionPerformed

    private void go_jcbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_jcbMouseEntered
        go_jcb.setIcon(new ImageIcon(getClass().getResource("assets/go_hover.png")));
    }//GEN-LAST:event_go_jcbMouseEntered

    private void go_jcbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go_jcbMouseExited
        go_jcb.setIcon(new ImageIcon(getClass().getResource("assets/go_normal.png")));
    }//GEN-LAST:event_go_jcbMouseExited

    private void clr_jcbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clr_jcbMouseEntered
        clr_jcb.setIcon(new ImageIcon(getClass().getResource("assets/clear_hover.png")));
    }//GEN-LAST:event_clr_jcbMouseEntered

    private void clr_jcbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clr_jcbMouseExited
        clr_jcb.setIcon(new ImageIcon(getClass().getResource("assets/clear_normal.png")));
    }//GEN-LAST:event_clr_jcbMouseExited

    private void calc_jcbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calc_jcbMouseEntered
         calc_jcb.setIcon(new ImageIcon(getClass().getResource("assets/calculate_hover.png")));
    }//GEN-LAST:event_calc_jcbMouseEntered

    private void calc_jcbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calc_jcbMouseExited
        calc_jcb.setIcon(new ImageIcon(getClass().getResource("assets/calculate_normal.png")));
    }//GEN-LAST:event_calc_jcbMouseExited
    
    private boolean isDiagonallyDominant(double[][] matx) {
        for (int i = 0; i < matx.length; i++) {
            double sum = 0;
            for (int j = 0; j < matx.length; j++) {
                if (i != j) {
                    sum += Math.abs(matx[i][j]);
                }
            }
            if (Math.abs(matx[i][i]) < sum) {
                return false;
            }
        }
        return true;
    }

     
    public int iter=0; 
    
    private double calculatePercentError(double oldValue, double newValue) {
        if (oldValue == 0) {
            return 100;
        }
        return Math.abs((newValue - oldValue) / oldValue) * 100;
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
            java.util.logging.Logger.getLogger(jacobi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jacobi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jacobi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jacobi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jacobi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a00;
    private javax.swing.JTextField a01;
    private javax.swing.JTextField a02;
    private javax.swing.JTextField a03;
    private javax.swing.JTextField a04;
    private javax.swing.JTextField a05;
    private javax.swing.JTextField a10;
    private javax.swing.JTextField a11;
    private javax.swing.JTextField a12;
    private javax.swing.JTextField a13;
    private javax.swing.JTextField a14;
    private javax.swing.JTextField a15;
    private javax.swing.JTextField a20;
    private javax.swing.JTextField a21;
    private javax.swing.JTextField a22;
    private javax.swing.JTextField a23;
    private javax.swing.JTextField a24;
    private javax.swing.JTextField a25;
    private javax.swing.JTextField a30;
    private javax.swing.JTextField a31;
    private javax.swing.JTextField a32;
    private javax.swing.JTextField a33;
    private javax.swing.JTextField a34;
    private javax.swing.JTextField a35;
    private javax.swing.JTextField a40;
    private javax.swing.JTextField a41;
    private javax.swing.JTextField a42;
    private javax.swing.JTextField a43;
    private javax.swing.JTextField a44;
    private javax.swing.JTextField a45;
    private javax.swing.JTextField a50;
    private javax.swing.JTextField a51;
    private javax.swing.JTextField a52;
    private javax.swing.JTextField a53;
    private javax.swing.JTextField a54;
    private javax.swing.JTextField a55;
    private javax.swing.JTextField b0;
    private javax.swing.JTextField b1;
    private javax.swing.JTextField b2;
    private javax.swing.JTextField b3;
    private javax.swing.JTextField b4;
    private javax.swing.JTextField b5;
    private javax.swing.JButton back_button_jcb;
    private javax.swing.JButton calc_jcb;
    private javax.swing.JButton clr_jcb;
    private javax.swing.JButton go_jcb;
    private javax.swing.JTextField guess_jcb;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField no_eq_jcb;
    private javax.swing.JTable tab_jcb;
    private javax.swing.JTable tab_jcb_ans;
    private javax.swing.JTextField tolerance_jcb;
    // End of variables declaration//GEN-END:variables
}
