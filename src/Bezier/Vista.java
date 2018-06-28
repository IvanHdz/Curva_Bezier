package Bezier;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

public class Vista {

    private JFrame jFrame = null;  //  @jve:decl-index=0:visual-constraint="179,30"
    private JPanel jContentPane = null;
    private JPanel jPanel = null;
    private JPanel jPanel1 = null;
    private JPanel jPanel2 = null;
    private JPanel jPanel3 = null;
    private JPanel jPanel4 = null;
    private JPanel jPanel5 = null;
    private JPanel jPanel6 = null;
    private JLabel jLabel = null;
    private JLabel jLabel1 = null;
    private JTextField jTextField = null;
    private JTextField jTextField1 = null;
    private JLabel jLabel2 = null;
    private JLabel jLabel3 = null;
    private JTextField jTextField2 = null;
    private JTextField jTextField3 = null;
    private JCheckBox jCheckBox = null;
    private JLabel jLabel5 = null;
    private JLabel jLabel6 = null;
    private JTextField jTextField4 = null;
    private JTextField jTextField5 = null;
    private JLabel jLabel7 = null;
    private JLabel jLabel8 = null;
    private JLabel jLabel9 = null;
    private JTextField jTextField6 = null;
    private JTextField jTextField7 = null;
    private JButton jButton = null;

    private final String MensajeError1 = "- No se puede dibujar -";  //  @jve:decl-index=0:
    private final String MensajeError2 = "[ERROR] Parametros Vacios";  //  @jve:decl-index=0:

    private Bezier bezier;

    /**
     * This method initializes jFrame
     *
     * @return javax.swing.JFrame
     */
    JFrame getJFrame() {
        if (jFrame == null) {
            jFrame = new JFrame();
            jFrame.setSize(new Dimension(935, 568));
            jFrame.setTitle(".:: Ley de Bezier ::.");
            jFrame.setContentPane(getJContentPane());
            jFrame.setVisible(true);
            jFrame.setLocationRelativeTo(null);
            jFrame.setResizable(false);

            bezier = new Bezier(jPanel1.getSize());
            jPanel1.add(bezier);
        }
        return jFrame;
    }

    /**
     * This method initializes jContentPane
     *
     * @return javax.swing.JPanel
     */
    private JPanel getJContentPane() {
        if (jContentPane == null) {
            jContentPane = new JPanel();
            jContentPane.setLayout(null);
            jContentPane.add(getJPanel(), null);
            jContentPane.add(getJPanel1(), null);
        }
        return jContentPane;
    }

    /**
     * This method initializes jPanel
     *
     * @return javax.swing.JPanel
     */
    private JPanel getJPanel() {
        if (jPanel == null) {
            jPanel = new JPanel();
            jPanel.setLayout(null);
            jPanel.setBounds(new Rectangle(1, 0, 915, 152));
            jPanel.add(getJPanel2(), null);
            jPanel.add(getJPanel3(), null);
            jPanel.add(getJPanel4(), null);
            jPanel.add(getJPanel5(), null);
            jPanel.add(getJPanel6(), null);
        }
        return jPanel;
    }

    /**
     * This method initializes jPanel1
     *
     * @return javax.swing.JPanel
     */
    private JPanel getJPanel1() {
        if (jPanel1 == null) {
            jPanel1 = new JPanel();
            jPanel1.setLayout(null);
            jPanel1.setBounds(new Rectangle(1, 156, 919, 373));
        }
        return jPanel1;
    }

    /**
     * This method initializes jPanel2
     *
     * @return javax.swing.JPanel
     */
    private JPanel getJPanel2() {
        if (jPanel2 == null) {
            jLabel1 = new JLabel();
            jLabel1.setBounds(new Rectangle(14, 97, 56, 23));
            jLabel1.setText("Y1 =");
            jLabel = new JLabel();
            jLabel.setBounds(new Rectangle(14, 35, 56, 23));
            jLabel.setText("X1 ="
                    + "");
            jPanel2 = new JPanel();
            jPanel2.setLayout(null);
            jPanel2.setBounds(new Rectangle(1, 3, 168, 149));
            jPanel2.add(jLabel, null);
            jPanel2.add(jLabel1, null);
            jPanel2.setBorder(new TitledBorder("Punto 1:"));
            jPanel2.add(getJTextField(), null);
            jPanel2.add(getJTextField1(), null);
        }
        return jPanel2;
    }

    /**
     * This method initializes jPanel3
     *
     * @return javax.swing.JPanel
     */
    private JPanel getJPanel3() {
        if (jPanel3 == null) {
            jLabel3 = new JLabel();
            jLabel3.setBounds(new Rectangle(10, 99, 56, 23));
            jLabel3.setText("Y2 =");
            jLabel2 = new JLabel();
            jLabel2.setBounds(new Rectangle(12, 38, 56, 23));
            jLabel2.setText("X2 =");
            jPanel3 = new JPanel();
            jPanel3.setLayout(null);
            jPanel3.setBounds(new Rectangle(170, 2, 167, 150));
            jPanel3.setBorder(new TitledBorder("Punto 2:"));
            jPanel3.add(jLabel2, null);
            jPanel3.add(jLabel3, null);

            jPanel3.add(getJTextField2(), null);
            jPanel3.add(getJTextField3(), null);
        }
        return jPanel3;
    }

    /**
     * This method initializes jPanel4
     *
     * @return javax.swing.JPanel
     */
    private JPanel getJPanel4() {
        if (jPanel4 == null) {
            jLabel6 = new JLabel();
            jLabel6.setBounds(new Rectangle(9, 98, 56, 23));
            jLabel6.setText("Y3 =");
            jLabel5 = new JLabel();
            jLabel5.setBounds(new Rectangle(9, 35, 56, 23));
            jLabel5.setText("X3 =");
            jPanel4 = new JPanel();
            jPanel4.setLayout(null);
            jPanel4.setBounds(new Rectangle(336, 3, 163, 149));
            jPanel4.setBorder(new TitledBorder("Punto de Control 1:"));
            jPanel4.add(jLabel5, null);
            jPanel4.add(jLabel6, null);
            jPanel4.add(getJTextField4(), null);
            jPanel4.add(getJTextField5(), null);
        }
        return jPanel4;
    }

    /**
     * This method initializes jPanel5
     *
     * @return javax.swing.JPanel
     */
    private JPanel getJPanel5() {
        if (jPanel5 == null) {
            jPanel5 = new JPanel();
            jPanel5.setLayout(null);
            jPanel5.setBounds(new Rectangle(501, 3, 176, 150));

            jLabel7 = new JLabel();
            jLabel7.setBounds(new Rectangle(9, 98, 56, 23));
            jLabel7.setText("Y4 =");
            jLabel8 = new JLabel();
            jLabel8.setBounds(new Rectangle(9, 35, 56, 23));
            jLabel8.setText("X4 =");

            jPanel5.add(jLabel7, null);
            jPanel5.add(jLabel8, null);
            jPanel5.setBorder(new TitledBorder("Punto de Control 2:"));
            jPanel5.add(getJTextField6(), null);
            jPanel5.add(getJTextField7(), null);
        }
        return jPanel5;
    }

    /**
     * This method initializes jPanel6
     *
     * @return javax.swing.JPanel
     */
    private JPanel getJPanel6() {
        if (jPanel6 == null) {
            jPanel6 = new JPanel();
            jPanel6.setLayout(null);
            jPanel6.setBounds(new Rectangle(681, 2, 233, 150));
            jPanel6.setBorder(new TitledBorder("Opciones:"));
            jLabel9 = new JLabel();
            jLabel9.setText("Activar / Desactivar");
            jLabel9.setBounds(new Rectangle(21, 24, 120, 26));

            jPanel6.add(getJButton(), null);
            jPanel6.add(jLabel9, null);
            jPanel6.add(getJCheckBox(), null);
        }
        return jPanel6;
    }

    /**
     * This method initializes jTextField
     *
     * @return javax.swing.JTextField
     */
    private JTextField getJTextField() {
        if (jTextField == null) {
            jTextField = new JTextField();
            jTextField.setBounds(new Rectangle(73, 33, 88, 29));
            jTextField.setText("100");
        }
        return jTextField;
    }

    /**
     * This method initializes jTextField1
     *
     * @return javax.swing.JTextField
     */
    private JTextField getJTextField1() {
        if (jTextField1 == null) {
            jTextField1 = new JTextField();
            jTextField1.setBounds(new Rectangle(73, 93, 88, 29));
            jTextField1.setText("100");
        }
        return jTextField1;
    }

    /**
     * This method initializes jTextField2
     *
     * @return javax.swing.JTextField
     */
    private JTextField getJTextField2() {
        if (jTextField2 == null) {
            jTextField2 = new JTextField();
            jTextField2.setBounds(new Rectangle(72, 36, 88, 29));
            jTextField2.setText("200");
        }
        return jTextField2;
    }

    /**
     * This method initializes jTextField3
     *
     * @return javax.swing.JTextField
     */
    private JTextField getJTextField3() {
        if (jTextField3 == null) {
            jTextField3 = new JTextField();
            jTextField3.setBounds(new Rectangle(71, 92, 88, 29));
            jTextField3.setText("300");
        }
        return jTextField3;
    }

    /**
     * This method initializes jCheckBox
     *
     * @return javax.swing.JCheckBox
     */
    private JCheckBox getJCheckBox() {
        if (jCheckBox == null) {
            jCheckBox = new JCheckBox();
            jCheckBox.setBounds(new Rectangle(145, 23, 74, 31));
            jCheckBox.setText("Cubica");
            jCheckBox.addItemListener(new java.awt.event.ItemListener() {
                @Override
                public void itemStateChanged(java.awt.event.ItemEvent e) {
                    if (jCheckBox.isSelected()) {
                        jTextField6.setEnabled(true);
                        jTextField7.setEnabled(true);
                    } else {
                        jTextField6.setEnabled(false);
                        jTextField7.setEnabled(false);
                        jTextField6.setText("");
                        jTextField7.setText("");
                        jPanel1.repaint();
                    } // TODO Auto-generated Event stub itemStateChanged()
                }
            });
        }
        return jCheckBox;
    }

    /**
     * This method initializes jTextField4
     *
     * @return javax.swing.JTextField
     */
    private JTextField getJTextField4() {
        if (jTextField4 == null) {
            jTextField4 = new JTextField();
            jTextField4.setBounds(new Rectangle(67, 33, 88, 29));
            jTextField4.setText("400.0");
        }
        return jTextField4;
    }

    /**
     * This method initializes jTextField5
     *
     * @return javax.swing.JTextField
     */
    private JTextField getJTextField5() {
        if (jTextField5 == null) {
            jTextField5 = new JTextField();
            jTextField5.setBounds(new Rectangle(69, 93, 88, 29));
            jTextField5.setText("200.0");
        }
        return jTextField5;
    }

    /**
     * This method initializes jTextField6
     *
     * @return javax.swing.JTextField
     */
    private JTextField getJTextField6() {
        if (jTextField6 == null) {
            jTextField6 = new JTextField();
            jTextField6.setBounds(new Rectangle(78, 32, 88, 29));
            jTextField6.setEnabled(false);
        }
        return jTextField6;
    }

    /**
     * This method initializes jTextField7
     *
     * @return javax.swing.JTextField
     */
    private JTextField getJTextField7() {
        if (jTextField7 == null) {
            jTextField7 = new JTextField();
            jTextField7.setBounds(new Rectangle(76, 92, 88, 29));
            jTextField7.setEnabled(false);
        }
        return jTextField7;
    }

    /**
     * This method initializes jButton
     *
     * @return javax.swing.JButton
     */
    private JButton getJButton() {
        if (jButton == null) {
            jButton = new JButton();
            jButton.setBounds(new Rectangle(44, 85, 165, 38));
            jButton.setText("Dibujar Funcion Bezier");
            jButton.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    if (jCheckBox.isSelected()) {
                        if (jTextField6.getText().equals("")) {
                            JOptionPane.showMessageDialog(jFrame, MensajeError1 + "\n " + MensajeError2);
                        } else if (jTextField7.getText().equals("")) {
                            JOptionPane.showMessageDialog(jFrame, MensajeError1 + "\n " + MensajeError2);
                        } else {
                            bezier.setPoint2D2(jTextField.getText(), jTextField1.getText(), jTextField2.getText(), jTextField3.getText(), jTextField4.getText(), jTextField5.getText(), jTextField6.getText(), jTextField7.getText(), true);
                        }

                    } else {
                        bezier.setPoint2D(jTextField.getText(), jTextField1.getText(), jTextField2.getText(), jTextField3.getText(), jTextField4.getText(), jTextField5.getText(), false);
                    }
                }
            });
        }
        return jButton;
    }
}
