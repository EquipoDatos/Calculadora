/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static calculadora.Calcula.calculaResultado;
import static calculadora.Calcula.convierteAArrayList;
import static calculadora.Calcula.traduccionAPilaA;
import static calculadora.Calcula.traduccionAPostfija;

/**
 *
 * @author david
 */
public class InterfazGrafica extends javax.swing.JFrame {

    /**
     * Creates new form InterfazGrafica
     */
    public InterfazGrafica() {
        initComponents();
        jTextField1.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton17 = new javax.swing.JButton();
        offButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        divButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        multButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        pointButton = new javax.swing.JButton();
        openParentesisButton = new javax.swing.JButton();
        closeParentesisButton = new javax.swing.JButton();
        negativeButton = new javax.swing.JButton();
        equalsButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jButton17.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        offButton.setBackground(new java.awt.Color(102, 153, 204));
        offButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        offButton.setForeground(new java.awt.Color(20, 38, 130));
        offButton.setText("OFF");
        offButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offButtonActionPerformed(evt);
            }
        });

        zeroButton.setBackground(new java.awt.Color(102, 153, 204));
        zeroButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 20)); // NOI18N
        zeroButton.setForeground(new java.awt.Color(20, 38, 130));
        zeroButton.setText("0");
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });

        sevenButton.setBackground(new java.awt.Color(102, 153, 204));
        sevenButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 20)); // NOI18N
        sevenButton.setForeground(new java.awt.Color(20, 38, 130));
        sevenButton.setText("7");
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });

        eightButton.setBackground(new java.awt.Color(102, 153, 204));
        eightButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 20)); // NOI18N
        eightButton.setForeground(new java.awt.Color(20, 38, 130));
        eightButton.setText("8");
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });

        nineButton.setBackground(new java.awt.Color(102, 153, 204));
        nineButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 20)); // NOI18N
        nineButton.setForeground(new java.awt.Color(20, 38, 130));
        nineButton.setText("9");
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });

        divButton.setBackground(new java.awt.Color(102, 153, 204));
        divButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 20)); // NOI18N
        divButton.setForeground(new java.awt.Color(20, 38, 130));
        divButton.setText("÷");
        divButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divButtonActionPerformed(evt);
            }
        });

        fourButton.setBackground(new java.awt.Color(102, 153, 204));
        fourButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 20)); // NOI18N
        fourButton.setForeground(new java.awt.Color(20, 38, 130));
        fourButton.setText("4");
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });

        twoButton.setBackground(new java.awt.Color(102, 153, 204));
        twoButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 20)); // NOI18N
        twoButton.setForeground(new java.awt.Color(20, 38, 130));
        twoButton.setText("2");
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });

        multButton.setBackground(new java.awt.Color(102, 153, 204));
        multButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        multButton.setForeground(new java.awt.Color(20, 38, 130));
        multButton.setText("x");
        multButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multButtonActionPerformed(evt);
            }
        });

        sixButton.setBackground(new java.awt.Color(102, 153, 204));
        sixButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 20)); // NOI18N
        sixButton.setForeground(new java.awt.Color(20, 38, 130));
        sixButton.setText("6");
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });

        fiveButton.setBackground(new java.awt.Color(102, 153, 204));
        fiveButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 20)); // NOI18N
        fiveButton.setForeground(new java.awt.Color(20, 38, 130));
        fiveButton.setText("5");
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });

        threeButton.setBackground(new java.awt.Color(102, 153, 204));
        threeButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 20)); // NOI18N
        threeButton.setForeground(new java.awt.Color(20, 38, 130));
        threeButton.setText("3");
        threeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeButtonActionPerformed(evt);
            }
        });

        oneButton.setBackground(new java.awt.Color(102, 153, 204));
        oneButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 20)); // NOI18N
        oneButton.setForeground(new java.awt.Color(20, 38, 130));
        oneButton.setText("1");
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });

        minusButton.setBackground(new java.awt.Color(102, 153, 204));
        minusButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 20)); // NOI18N
        minusButton.setForeground(new java.awt.Color(20, 38, 130));
        minusButton.setText("-");
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(102, 153, 204));
        addButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 20)); // NOI18N
        addButton.setForeground(new java.awt.Color(20, 38, 130));
        addButton.setText("+");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        pointButton.setBackground(new java.awt.Color(102, 153, 204));
        pointButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 20)); // NOI18N
        pointButton.setForeground(new java.awt.Color(20, 38, 130));
        pointButton.setText(".");
        pointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointButtonActionPerformed(evt);
            }
        });

        openParentesisButton.setBackground(new java.awt.Color(102, 153, 204));
        openParentesisButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        openParentesisButton.setForeground(new java.awt.Color(20, 38, 130));
        openParentesisButton.setText("(");
        openParentesisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openParentesisButtonActionPerformed(evt);
            }
        });

        closeParentesisButton.setBackground(new java.awt.Color(102, 153, 204));
        closeParentesisButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        closeParentesisButton.setForeground(new java.awt.Color(20, 38, 130));
        closeParentesisButton.setText(")");
        closeParentesisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeParentesisButtonActionPerformed(evt);
            }
        });

        negativeButton.setBackground(new java.awt.Color(102, 153, 204));
        negativeButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        negativeButton.setForeground(new java.awt.Color(20, 38, 130));
        negativeButton.setText("+ / -");
        negativeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negativeButtonActionPerformed(evt);
            }
        });

        equalsButton.setBackground(new java.awt.Color(102, 153, 204));
        equalsButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 20)); // NOI18N
        equalsButton.setForeground(new java.awt.Color(20, 38, 130));
        equalsButton.setText("=");
        equalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(102, 153, 204));
        clearButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 20)); // NOI18N
        clearButton.setForeground(new java.awt.Color(20, 38, 130));
        clearButton.setText("c");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(102, 153, 204));
        deleteButton.setFont(new java.awt.Font("Perpetua Titling MT", 0, 20)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(20, 38, 130));
        deleteButton.setText("d");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(offButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(openParentesisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pointButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(closeParentesisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(minusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(multButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(negativeButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equalsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(offButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(openParentesisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(closeParentesisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(negativeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(divButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pointButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equalsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private StringBuilder sb = new StringBuilder();
    private boolean ans = false;
    private int lenAns;
    
    private void setText(){
        if (ans){
            jTextField1.setText("Ans"+sb.substring(lenAns).toString());
        }
        else
            jTextField1.setText(sb.toString());
    }
        
    private void openParentesisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openParentesisButtonActionPerformed
        sb.append("(");
        setText();
    }//GEN-LAST:event_openParentesisButtonActionPerformed

    private void closeParentesisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeParentesisButtonActionPerformed
        sb.append(")");
        setText();
    }//GEN-LAST:event_closeParentesisButtonActionPerformed

    private void negativeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negativeButtonActionPerformed
        sb.append("~");
        setText();
    }//GEN-LAST:event_negativeButtonActionPerformed

    private void offButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_offButtonActionPerformed

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
        sb.append("0");
        setText();
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneButtonActionPerformed
        sb.append("1");
        setText();
    }//GEN-LAST:event_oneButtonActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtonActionPerformed
        sb.append("2");
        setText();
    }//GEN-LAST:event_twoButtonActionPerformed

    private void threeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeButtonActionPerformed
        sb.append("3");
        setText();
    }//GEN-LAST:event_threeButtonActionPerformed

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourButtonActionPerformed
        sb.append("4");
        setText();
    }//GEN-LAST:event_fourButtonActionPerformed

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveButtonActionPerformed
        sb.append("5");
        setText();
    }//GEN-LAST:event_fiveButtonActionPerformed

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixButtonActionPerformed
        sb.append("6");
        setText();
    }//GEN-LAST:event_sixButtonActionPerformed

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenButtonActionPerformed
        sb.append("7");
        setText();
    }//GEN-LAST:event_sevenButtonActionPerformed

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightButtonActionPerformed
        sb.append("8");
        setText();
    }//GEN-LAST:event_eightButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed
        sb.append("9");
        setText();
    }//GEN-LAST:event_nineButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        sb.append("+");
        setText();
    }//GEN-LAST:event_addButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        sb.append("-");
        setText();
    }//GEN-LAST:event_minusButtonActionPerformed

    private void multButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multButtonActionPerformed
        sb.append("*");
        setText();
    }//GEN-LAST:event_multButtonActionPerformed

    private void divButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divButtonActionPerformed
        sb.append("/");
        setText();
    }//GEN-LAST:event_divButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if(sb.length() > 0)
            sb.deleteCharAt(sb.length()-1);
        setText();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        ans=false;
        sb.delete(0, sb.length());
        setText();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void equalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsButtonActionPerformed
        if(Valida.valida(sb.toString())){
            PilaA<Object> pila;
            pila = traduccionAPilaA(traduccionAPostfija(convierteAArrayList(Valida.fixNegativo(sb.toString()))));
            double resultado = calculaResultado(pila);
            sb.delete(0, sb.length());
            if (resultado>=0)
                sb.append(resultado);
            else{
                sb.append(0);
                sb.append(resultado);
            }
            ans=true;
            lenAns=sb.length();
            if (resultado-(int)resultado==0){
                jTextField1.setText(String.valueOf((int)(resultado)));
            }
            else
                jTextField1.setText(String.valueOf(resultado));
        }
        else{
            jTextField1.setText("Syntax Error"); 
            sb.delete(0, sb.length());
        }
    }//GEN-LAST:event_equalsButtonActionPerformed

    private void pointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointButtonActionPerformed
        sb.append(".");
        setText();
    }//GEN-LAST:event_pointButtonActionPerformed

    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton closeParentesisButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton divButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton equalsButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JButton jButton17;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton multButton;
    private javax.swing.JButton negativeButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton offButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton openParentesisButton;
    private javax.swing.JButton pointButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}
