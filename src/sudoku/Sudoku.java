package sudoku;

import java.awt.Color;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentListener;

public class Sudoku extends javax.swing.JFrame {

    private PersonalizedTextField[][] arrayTextField = new PersonalizedTextField[9][9];
    private String[][] sudokuSolution = new String[9][9];
    private Boolean sudokuCorrect = true;
    private int counter = 0;

    public Sudoku() {
        initComponents();

        //Guarda los textFiels en un array bidimensional
        SaveTextFieldsInArray();

        //Añade los listener a cada textField
        AddListenerToTextFields();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jPanelCenter = new javax.swing.JPanel();
        jPanelMain1 = new javax.swing.JPanel();
        A1 = new sudoku.PersonalizedTextField();
        B1 = new sudoku.PersonalizedTextField();
        C1 = new sudoku.PersonalizedTextField();
        A2 = new sudoku.PersonalizedTextField();
        B2 = new sudoku.PersonalizedTextField();
        C2 = new sudoku.PersonalizedTextField();
        A3 = new sudoku.PersonalizedTextField();
        B3 = new sudoku.PersonalizedTextField();
        C3 = new sudoku.PersonalizedTextField();
        jPanelMain2 = new javax.swing.JPanel();
        D1 = new sudoku.PersonalizedTextField();
        E1 = new sudoku.PersonalizedTextField();
        F1 = new sudoku.PersonalizedTextField();
        D2 = new sudoku.PersonalizedTextField();
        E2 = new sudoku.PersonalizedTextField();
        F2 = new sudoku.PersonalizedTextField();
        D3 = new sudoku.PersonalizedTextField();
        E3 = new sudoku.PersonalizedTextField();
        F3 = new sudoku.PersonalizedTextField();
        jPanelMain3 = new javax.swing.JPanel();
        G1 = new sudoku.PersonalizedTextField();
        H1 = new sudoku.PersonalizedTextField();
        I1 = new sudoku.PersonalizedTextField();
        G2 = new sudoku.PersonalizedTextField();
        H2 = new sudoku.PersonalizedTextField();
        I2 = new sudoku.PersonalizedTextField();
        G3 = new sudoku.PersonalizedTextField();
        H3 = new sudoku.PersonalizedTextField();
        I3 = new sudoku.PersonalizedTextField();
        jPanelMain4 = new javax.swing.JPanel();
        A4 = new sudoku.PersonalizedTextField();
        B4 = new sudoku.PersonalizedTextField();
        C4 = new sudoku.PersonalizedTextField();
        A5 = new sudoku.PersonalizedTextField();
        B5 = new sudoku.PersonalizedTextField();
        C5 = new sudoku.PersonalizedTextField();
        A6 = new sudoku.PersonalizedTextField();
        B6 = new sudoku.PersonalizedTextField();
        C6 = new sudoku.PersonalizedTextField();
        jPanelMain5 = new javax.swing.JPanel();
        D4 = new sudoku.PersonalizedTextField();
        E4 = new sudoku.PersonalizedTextField();
        F4 = new sudoku.PersonalizedTextField();
        D5 = new sudoku.PersonalizedTextField();
        E5 = new sudoku.PersonalizedTextField();
        F5 = new sudoku.PersonalizedTextField();
        D6 = new sudoku.PersonalizedTextField();
        E6 = new sudoku.PersonalizedTextField();
        F6 = new sudoku.PersonalizedTextField();
        jPanelMain6 = new javax.swing.JPanel();
        G4 = new sudoku.PersonalizedTextField();
        H4 = new sudoku.PersonalizedTextField();
        I4 = new sudoku.PersonalizedTextField();
        G5 = new sudoku.PersonalizedTextField();
        H5 = new sudoku.PersonalizedTextField();
        I5 = new sudoku.PersonalizedTextField();
        G6 = new sudoku.PersonalizedTextField();
        H6 = new sudoku.PersonalizedTextField();
        I6 = new sudoku.PersonalizedTextField();
        jPanelMain7 = new javax.swing.JPanel();
        A7 = new sudoku.PersonalizedTextField();
        B7 = new sudoku.PersonalizedTextField();
        C7 = new sudoku.PersonalizedTextField();
        A8 = new sudoku.PersonalizedTextField();
        B8 = new sudoku.PersonalizedTextField();
        C8 = new sudoku.PersonalizedTextField();
        A9 = new sudoku.PersonalizedTextField();
        B9 = new sudoku.PersonalizedTextField();
        C9 = new sudoku.PersonalizedTextField();
        jPanelMain8 = new javax.swing.JPanel();
        D7 = new sudoku.PersonalizedTextField();
        E7 = new sudoku.PersonalizedTextField();
        F7 = new sudoku.PersonalizedTextField();
        D8 = new sudoku.PersonalizedTextField();
        E8 = new sudoku.PersonalizedTextField();
        F8 = new sudoku.PersonalizedTextField();
        D9 = new sudoku.PersonalizedTextField();
        E9 = new sudoku.PersonalizedTextField();
        F9 = new sudoku.PersonalizedTextField();
        jPanelMain9 = new javax.swing.JPanel();
        G7 = new sudoku.PersonalizedTextField();
        H7 = new sudoku.PersonalizedTextField();
        I7 = new sudoku.PersonalizedTextField();
        G8 = new sudoku.PersonalizedTextField();
        H8 = new sudoku.PersonalizedTextField();
        I8 = new sudoku.PersonalizedTextField();
        G9 = new sudoku.PersonalizedTextField();
        H9 = new sudoku.PersonalizedTextField();
        I9 = new sudoku.PersonalizedTextField();
        jPanelBotton = new javax.swing.JPanel();
        jButtonCreateDifficultSudoku = new javax.swing.JButton();
        jButtonCreateMediumSudoku = new javax.swing.JButton();
        jButtonCreateEasySudoku = new javax.swing.JButton();
        jPanelWest = new javax.swing.JPanel();
        jPanelEast = new javax.swing.JPanel();
        jButtonResolceSudoku = new javax.swing.JButton();
        jButtonGetClue = new javax.swing.JButton();
        jButtonCleanSudoku = new javax.swing.JButton();
        jButtonCorrectSudoku = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMain.setLayout(new java.awt.BorderLayout());

        jLabelTitle.setFont(new java.awt.Font("Zapfino", 1, 18)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Sususudoku");
        jLabelTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setPreferredSize(new java.awt.Dimension(50, 60));
        jPanelMain.add(jLabelTitle, java.awt.BorderLayout.NORTH);

        jPanelCenter.setMaximumSize(new java.awt.Dimension(470, 470));
        jPanelCenter.setMinimumSize(new java.awt.Dimension(470, 470));
        jPanelCenter.setPreferredSize(new java.awt.Dimension(470, 470));
        jPanelCenter.setLayout(new java.awt.GridLayout(3, 3));

        jPanelMain1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanelMain1.setLayout(new java.awt.GridLayout(3, 3));

        A1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        A1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        jPanelMain1.add(A1);

        B1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        B1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        jPanelMain1.add(B1);

        C1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        C1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        jPanelMain1.add(C1);

        A2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        A2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });
        jPanelMain1.add(A2);

        B2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        B2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain1.add(B2);

        C2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        C2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain1.add(C2);

        A3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        A3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain1.add(A3);

        B3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        B3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain1.add(B3);

        C3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        C3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain1.add(C3);

        jPanelCenter.add(jPanelMain1);

        jPanelMain2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanelMain2.setLayout(new java.awt.GridLayout(3, 3));

        D1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        D1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        D1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain2.add(D1);

        E1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        E1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        E1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain2.add(E1);

        F1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        F1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain2.add(F1);

        D2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        D2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        D2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain2.add(D2);

        E2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        E2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        E2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain2.add(E2);

        F2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        F2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain2.add(F2);

        D3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        D3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        D3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain2.add(D3);

        E3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        E3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        E3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain2.add(E3);

        F3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        F3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain2.add(F3);

        jPanelCenter.add(jPanelMain2);

        jPanelMain3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanelMain3.setLayout(new java.awt.GridLayout(3, 3));

        G1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        G1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        G1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain3.add(G1);

        H1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        H1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        H1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain3.add(H1);

        I1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        I1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        I1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain3.add(I1);

        G2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        G2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        G2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain3.add(G2);

        H2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        H2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        H2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain3.add(H2);

        I2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        I2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        I2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain3.add(I2);

        G3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        G3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        G3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain3.add(G3);

        H3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        H3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        H3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain3.add(H3);

        I3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        I3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        I3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain3.add(I3);

        jPanelCenter.add(jPanelMain3);

        jPanelMain4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanelMain4.setLayout(new java.awt.GridLayout(3, 3));

        A4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        A4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain4.add(A4);

        B4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        B4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain4.add(B4);

        C4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        C4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain4.add(C4);

        A5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        A5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain4.add(A5);

        B5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        B5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain4.add(B5);

        C5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        C5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain4.add(C5);

        A6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        A6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain4.add(A6);

        B6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        B6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain4.add(B6);

        C6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        C6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain4.add(C6);

        jPanelCenter.add(jPanelMain4);

        jPanelMain5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanelMain5.setLayout(new java.awt.GridLayout(3, 3));

        D4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        D4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        D4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain5.add(D4);

        E4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        E4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        E4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain5.add(E4);

        F4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        F4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain5.add(F4);

        D5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        D5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        D5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain5.add(D5);

        E5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        E5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        E5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain5.add(E5);

        F5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        F5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain5.add(F5);

        D6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        D6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        D6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain5.add(D6);

        E6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        E6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        E6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain5.add(E6);

        F6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        F6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain5.add(F6);

        jPanelCenter.add(jPanelMain5);

        jPanelMain6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanelMain6.setLayout(new java.awt.GridLayout(3, 3));

        G4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        G4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        G4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain6.add(G4);

        H4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        H4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        H4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain6.add(H4);

        I4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        I4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        I4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        I4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I4ActionPerformed(evt);
            }
        });
        jPanelMain6.add(I4);

        G5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        G5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        G5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain6.add(G5);

        H5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        H5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        H5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain6.add(H5);

        I5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        I5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        I5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain6.add(I5);

        G6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        G6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        G6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain6.add(G6);

        H6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        H6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        H6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain6.add(H6);

        I6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        I6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        I6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain6.add(I6);

        jPanelCenter.add(jPanelMain6);

        jPanelMain7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanelMain7.setLayout(new java.awt.GridLayout(3, 3));

        A7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        A7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain7.add(A7);

        B7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        B7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain7.add(B7);

        C7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        C7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain7.add(C7);

        A8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        A8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain7.add(A8);

        B8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        B8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain7.add(B8);

        C8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        C8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain7.add(C8);

        A9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        A9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain7.add(A9);

        B9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        B9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        B9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain7.add(B9);

        C9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        C9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain7.add(C9);

        jPanelCenter.add(jPanelMain7);

        jPanelMain8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanelMain8.setLayout(new java.awt.GridLayout(3, 3));

        D7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        D7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        D7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain8.add(D7);

        E7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        E7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        E7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain8.add(E7);

        F7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        F7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain8.add(F7);

        D8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        D8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        D8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain8.add(D8);

        E8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        E8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        E8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain8.add(E8);

        F8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        F8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain8.add(F8);

        D9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        D9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        D9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain8.add(D9);

        E9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        E9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        E9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain8.add(E9);

        F9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        F9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        F9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain8.add(F9);

        jPanelCenter.add(jPanelMain8);

        jPanelMain9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanelMain9.setLayout(new java.awt.GridLayout(3, 3));

        G7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        G7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        G7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain9.add(G7);

        H7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        H7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        H7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain9.add(H7);

        I7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        I7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        I7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain9.add(I7);

        G8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        G8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        G8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain9.add(G8);

        H8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        H8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        H8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain9.add(H8);

        I8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        I8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        I8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain9.add(I8);

        G9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        G9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        G9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain9.add(G9);

        H9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        H9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        H9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain9.add(H9);

        I9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        I9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        I9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanelMain9.add(I9);

        jPanelCenter.add(jPanelMain9);

        jPanelMain.add(jPanelCenter, java.awt.BorderLayout.CENTER);

        jPanelBotton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanelBotton.setMinimumSize(new java.awt.Dimension(188, 200));
        jPanelBotton.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 20));

        jButtonCreateDifficultSudoku.setText("Create Difficult Sudoku");
        jButtonCreateDifficultSudoku.setMargin(new java.awt.Insets(2, 10, 2, 10));
        jButtonCreateDifficultSudoku.setPreferredSize(new java.awt.Dimension(160, 30));
        jButtonCreateDifficultSudoku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateDifficultSudokuMouseClicked(evt);
            }
        });
        jButtonCreateDifficultSudoku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateDifficultSudokuActionPerformed(evt);
            }
        });
        jPanelBotton.add(jButtonCreateDifficultSudoku);

        jButtonCreateMediumSudoku.setText("Create Medium Sudoku");
        jButtonCreateMediumSudoku.setMargin(new java.awt.Insets(2, 10, 2, 10));
        jButtonCreateMediumSudoku.setPreferredSize(new java.awt.Dimension(160, 30));
        jButtonCreateMediumSudoku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateMediumSudokuMouseClicked(evt);
            }
        });
        jButtonCreateMediumSudoku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateMediumSudokuActionPerformed(evt);
            }
        });
        jPanelBotton.add(jButtonCreateMediumSudoku);

        jButtonCreateEasySudoku.setText("Create Easy Sudoku");
        jButtonCreateEasySudoku.setPreferredSize(new java.awt.Dimension(160, 30));
        jButtonCreateEasySudoku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateEasySudokuMouseClicked(evt);
            }
        });
        jPanelBotton.add(jButtonCreateEasySudoku);

        jPanelMain.add(jPanelBotton, java.awt.BorderLayout.PAGE_END);

        jPanelWest.setPreferredSize(new java.awt.Dimension(140, 476));

        javax.swing.GroupLayout jPanelWestLayout = new javax.swing.GroupLayout(jPanelWest);
        jPanelWest.setLayout(jPanelWestLayout);
        jPanelWestLayout.setHorizontalGroup(
            jPanelWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanelWestLayout.setVerticalGroup(
            jPanelWestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        jPanelMain.add(jPanelWest, java.awt.BorderLayout.WEST);

        jPanelEast.setPreferredSize(new java.awt.Dimension(140, 476));
        jPanelEast.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        jButtonResolceSudoku.setText("Resolve Sudoku");
        jButtonResolceSudoku.setPreferredSize(new java.awt.Dimension(130, 30));
        jButtonResolceSudoku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonResolceSudokuMouseClicked(evt);
            }
        });
        jPanelEast.add(jButtonResolceSudoku);

        jButtonGetClue.setText("Get Clue");
        jButtonGetClue.setPreferredSize(new java.awt.Dimension(130, 30));
        jButtonGetClue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGetClueMouseClicked(evt);
            }
        });
        jPanelEast.add(jButtonGetClue);

        jButtonCleanSudoku.setText("Clean Sudoku");
        jButtonCleanSudoku.setPreferredSize(new java.awt.Dimension(130, 30));
        jButtonCleanSudoku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCleanSudokuMouseClicked(evt);
            }
        });
        jPanelEast.add(jButtonCleanSudoku);

        jButtonCorrectSudoku.setText("Correct Sudoku");
        jButtonCorrectSudoku.setPreferredSize(new java.awt.Dimension(130, 30));
        jButtonCorrectSudoku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCorrectSudokuMouseClicked(evt);
            }
        });
        jPanelEast.add(jButtonCorrectSudoku);

        jPanelMain.add(jPanelEast, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateDifficultSudokuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateDifficultSudokuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateDifficultSudokuActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A2ActionPerformed

    private void I4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_I4ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C1ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void jButtonCreateDifficultSudokuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateDifficultSudokuMouseClicked
        CreateRandomFullSudoku(61);
    }//GEN-LAST:event_jButtonCreateDifficultSudokuMouseClicked

    private void jButtonCleanSudokuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCleanSudokuMouseClicked
        CleanSudoku();
    }//GEN-LAST:event_jButtonCleanSudokuMouseClicked

    private void jButtonCreateMediumSudokuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateMediumSudokuMouseClicked
        CreateRandomFullSudoku(56);
    }//GEN-LAST:event_jButtonCreateMediumSudokuMouseClicked

    private void jButtonCreateMediumSudokuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateMediumSudokuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateMediumSudokuActionPerformed

    private void jButtonResolceSudokuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonResolceSudokuMouseClicked
        ResolveSudoku();
    }//GEN-LAST:event_jButtonResolceSudokuMouseClicked

    private void jButtonGetClueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGetClueMouseClicked
        GetClue();
    }//GEN-LAST:event_jButtonGetClueMouseClicked

    private void jButtonCreateEasySudokuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateEasySudokuMouseClicked
        CreateRandomFullSudoku(49);
    }//GEN-LAST:event_jButtonCreateEasySudokuMouseClicked

    private void jButtonCorrectSudokuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCorrectSudokuMouseClicked
        CorrectSudoku();
    }//GEN-LAST:event_jButtonCorrectSudokuMouseClicked

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
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sudoku().setVisible(true);
            }
        });
    }

    public void ExecuteRules() {
        boolean someMistake = false;

        //No se puede repetir un número en la misma líneas
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {

                    if (arrayTextField[i][j].getText().equals(arrayTextField[i][k].getText())
                            && !arrayTextField[i][j].getText().isEmpty()
                            && j != k) {
                        sudokuCorrect = false;
                        someMistake = true;
                    }
                }
            }
        }

        //No se puede repetir un número en la misma columna 
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {

                    if (arrayTextField[i][j].getText().equals(arrayTextField[k][j].getText())
                            && !arrayTextField[i][j].getText().isEmpty()
                            && i != k) {
                        sudokuCorrect = false;
                        someMistake = true;
                    }
                }
            }
        }

        //No se puede repetir un número en el mismo rectángulo
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    for (int l = 0; l < 9; l++) {
                        //Primer rectángulo
                        if (i < 3 && j < 3 && k < 3 && l < 3) {
                            if (arrayTextField[i][j].getText().equals(arrayTextField[k][l].getText())
                                    && !arrayTextField[i][j].getText().isEmpty()
                                    && i != k
                                    && j != l) {
                                sudokuCorrect = false;
                                someMistake = true;
                            }
                            //Segundo rectángulo
                        } else if (i < 3 && j >= 3 && j < 6 && k < 3 && l >= 3 && l < 6) {
                            if (arrayTextField[i][j].getText().equals(arrayTextField[k][l].getText())
                                    && !arrayTextField[i][j].getText().isEmpty()
                                    && i != k
                                    && j != l) {
                                sudokuCorrect = false;
                                someMistake = true;
                            }
                            //Tercer rectángulo
                        } else if (i < 3 && j >= 6 && k < 3 && l >= 6) {
                            if (arrayTextField[i][j].getText().equals(arrayTextField[k][l].getText())
                                    && !arrayTextField[i][j].getText().isEmpty()
                                    && i != k
                                    && j != l) {
                                sudokuCorrect = false;
                                someMistake = true;
                            }//Cuarto rectángulo
                        } else if (i >= 3 && i < 6 && j < 3 && k >= 3 && k < 6 && l < 3) {
                            if (arrayTextField[i][j].getText().equals(arrayTextField[k][l].getText())
                                    && !arrayTextField[i][j].getText().isEmpty()
                                    && i != k
                                    && j != l) {
                                sudokuCorrect = false;
                                someMistake = true;
                            }
                            //Quinto rectángulo
                        } else if (i >= 3 && i < 6 && j >= 3 && j < 6 && k >= 3 && k < 6 && l >= 3 && l < 6) {
                            if (arrayTextField[i][j].getText().equals(arrayTextField[k][l].getText())
                                    && !arrayTextField[i][j].getText().isEmpty()
                                    && i != k
                                    && j != l) {
                                sudokuCorrect = false;
                                someMistake = true;
                            }
                            //Sexto rectángulo
                        } else if (i >= 3 && i < 6 && j >= 6 && k >= 3 && k < 6 && l >= 6) {
                            if (arrayTextField[i][j].getText().equals(arrayTextField[k][l].getText())
                                    && !arrayTextField[i][j].getText().isEmpty()
                                    && i != k
                                    && j != l) {
                                sudokuCorrect = false;
                                someMistake = true;
                            }
                            //Séptimo rectángulo
                        } else if (i >= 6 && j < 3 && k >= 6 && l < 3) {
                            if (arrayTextField[i][j].getText().equals(arrayTextField[k][l].getText())
                                    && !arrayTextField[i][j].getText().isEmpty()
                                    && i != k
                                    && j != l) {
                                sudokuCorrect = false;
                                someMistake = true;
                            }
                            //Octavo rectángulo
                        } else if (i >= 6 && j >= 3 && j < 6 && k >= 6 && l >= 3 && l < 6) {
                            if (arrayTextField[i][j].getText().equals(arrayTextField[k][l].getText())
                                    && !arrayTextField[i][j].getText().isEmpty()
                                    && i != k
                                    && j != l) {
                                sudokuCorrect = false;
                                someMistake = true;
                            }
                            //Noveno rectángulo
                        } else if (i >= 6 && j >= 6 && k >= 6 && l >= 6) {
                            if (arrayTextField[i][j].getText().equals(arrayTextField[k][l].getText())
                                    && !arrayTextField[i][j].getText().isEmpty()
                                    && i != k
                                    && j != l) {
                                sudokuCorrect = false;
                                someMistake = true;
                            }
                        }
                    }
                }
            }
        }

        //Controla si ha detectado algún error
        if (!someMistake) {
            sudokuCorrect = true;
        }

        System.out.println(sudokuCorrect);
    }

    public void CreateRandomFullSudoku(int elementsToDelete) {
        Random random = new Random();
        int i = 0;
        int j = 0;

        CleanSudoku();

        do {
            if (arrayTextField[i][0].getText().isEmpty()) {
                CreateRandomLine(i);

                if (!arrayTextField[i][0].getText().isEmpty()) {
                    i++;
                    counter = 0;
                }

                if (counter > 10000) {
                    CleanSudoku();
                    counter = 0;
                    i = 0;
                }
            } else {
                i++;
            }
        } while (i < 9);

        //Borra algunos de los números del Sudoku
        do {
            int random1 = random.nextInt(9);
            int random2 = random.nextInt(9);

            if (!arrayTextField[random1][random2].getText().isEmpty()) {
                arrayTextField[random1][random2].setText("");
                j++;
            }
        } while (j < elementsToDelete);

        //Pinta de gris y pone el elemento como no editable 
        for (int k = 0; k < 9; k++) {
            for (int l = 0; l < 9; l++) {
                if (!arrayTextField[k][l].getText().isEmpty()) {
                    arrayTextField[k][l].setEditable(false);
                    arrayTextField[k][l].setBackground(new Color(150, 150, 150));
                }
            }
        }
    }

    public void CreateRandomLine(int line) {
        Random random = new Random();
        boolean correct = true;
        Set<String> numbersList = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            arrayTextField[line][i].setText("");
        }

        for (int i = 0; i < 9; i++) {
            do {
                correct = true;
                String newNumber = String.valueOf(1 + random.nextInt(9));
                numbersList.add(newNumber);
                arrayTextField[line][i].setText(newNumber);
                ExecuteRules();

                if (!sudokuCorrect) {
                    arrayTextField[line][i].setText("");
                    correct = false;
                    counter++;
                    System.out.println(counter);
                }

                if (numbersList.size() == 9 && correct == false) {
                    for (int j = 0; j < 9; j++) {
                        arrayTextField[line][j].setText("");
                    }
                    break;
                }

                if (counter > 10000) {
                    break;
                }
            } while (!correct);

            numbersList.clear();

        }

        for (int i = 0; i < 9; i++) {
            sudokuSolution[line][i] = arrayTextField[line][i].getText();
        }
    }

    public void CleanSudoku() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arrayTextField[i][j].setText("");
                arrayTextField[i][j].setBackground(Color.white);
                arrayTextField[i][j].setEditable(true);

            }
        }
    }

    public void GetClue() {
        Random random = new Random();
        int random1 = random.nextInt(9);
        int random2 = random.nextInt(9);

        if (arrayTextField[random1][random2].getText().isEmpty()) {
            arrayTextField[random1][random2].setText(sudokuSolution[random1][random2]);
        } else {
            GetClue();
        }
    }

    public void ResolveSudoku() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arrayTextField[i][j].getText().isEmpty()) {
                    arrayTextField[i][j].setText(sudokuSolution[i][j]);
                }
            }
        }
    }

    public void CorrectSudoku() {
        boolean finish = true;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arrayTextField[i][j].getText().isEmpty()) {
                    finish = false;
                }
            }
        }

        if (finish) {
            if (sudokuCorrect) {
                JOptionPane.showMessageDialog(null, "Congratulations, you resolve the Sudoku", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Sorry, the Sudoku is not correct, try again", "Try again", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please finish the Sudoku to correct it", "Finish the Sudoku", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void SaveTextFieldsInArray() {
        // Rellenar la matriz de acuerdo a las letras y números
        arrayTextField[0][0] = A1;
        arrayTextField[0][1] = B1;
        arrayTextField[0][2] = C1;
        arrayTextField[0][3] = D1;
        arrayTextField[0][4] = E1;
        arrayTextField[0][5] = F1;
        arrayTextField[0][6] = G1;
        arrayTextField[0][7] = H1;
        arrayTextField[0][8] = I1;

        arrayTextField[1][0] = A2;
        arrayTextField[1][1] = B2;
        arrayTextField[1][2] = C2;
        arrayTextField[1][3] = D2;
        arrayTextField[1][4] = E2;
        arrayTextField[1][5] = F2;
        arrayTextField[1][6] = G2;
        arrayTextField[1][7] = H2;
        arrayTextField[1][8] = I2;

        arrayTextField[2][0] = A3;
        arrayTextField[2][1] = B3;
        arrayTextField[2][2] = C3;
        arrayTextField[2][3] = D3;
        arrayTextField[2][4] = E3;
        arrayTextField[2][5] = F3;
        arrayTextField[2][6] = G3;
        arrayTextField[2][7] = H3;
        arrayTextField[2][8] = I3;

        arrayTextField[3][0] = A4;
        arrayTextField[3][1] = B4;
        arrayTextField[3][2] = C4;
        arrayTextField[3][3] = D4;
        arrayTextField[3][4] = E4;
        arrayTextField[3][5] = F4;
        arrayTextField[3][6] = G4;
        arrayTextField[3][7] = H4;
        arrayTextField[3][8] = I4;

        arrayTextField[4][0] = A5;
        arrayTextField[4][1] = B5;
        arrayTextField[4][2] = C5;
        arrayTextField[4][3] = D5;
        arrayTextField[4][4] = E5;
        arrayTextField[4][5] = F5;
        arrayTextField[4][6] = G5;
        arrayTextField[4][7] = H5;
        arrayTextField[4][8] = I5;

        arrayTextField[5][0] = A6;
        arrayTextField[5][1] = B6;
        arrayTextField[5][2] = C6;
        arrayTextField[5][3] = D6;
        arrayTextField[5][4] = E6;
        arrayTextField[5][5] = F6;
        arrayTextField[5][6] = G6;
        arrayTextField[5][7] = H6;
        arrayTextField[5][8] = I6;

        arrayTextField[6][0] = A7;
        arrayTextField[6][1] = B7;
        arrayTextField[6][2] = C7;
        arrayTextField[6][3] = D7;
        arrayTextField[6][4] = E7;
        arrayTextField[6][5] = F7;
        arrayTextField[6][6] = G7;
        arrayTextField[6][7] = H7;
        arrayTextField[6][8] = I7;

        arrayTextField[7][0] = A8;
        arrayTextField[7][1] = B8;
        arrayTextField[7][2] = C8;
        arrayTextField[7][3] = D8;
        arrayTextField[7][4] = E8;
        arrayTextField[7][5] = F8;
        arrayTextField[7][6] = G8;
        arrayTextField[7][7] = H8;
        arrayTextField[7][8] = I8;

        arrayTextField[8][0] = A9;
        arrayTextField[8][1] = B9;
        arrayTextField[8][2] = C9;
        arrayTextField[8][3] = D9;
        arrayTextField[8][4] = E9;
        arrayTextField[8][5] = F9;
        arrayTextField[8][6] = G9;
        arrayTextField[8][7] = H9;
        arrayTextField[8][8] = I9;
    }

    public void AddListenerToTextFields() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                arrayTextField[i][j].getDocument().addDocumentListener(new DocumentListener() {
                    @Override
                    public void insertUpdate(javax.swing.event.DocumentEvent e) {
                        ExecuteRules();
                    }

                    @Override
                    public void removeUpdate(javax.swing.event.DocumentEvent e) {
                        ExecuteRules();
                    }

                    @Override
                    public void changedUpdate(javax.swing.event.DocumentEvent e) {
                        ExecuteRules();
                    }
                });

            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sudoku.PersonalizedTextField A1;
    private sudoku.PersonalizedTextField A2;
    private sudoku.PersonalizedTextField A3;
    private sudoku.PersonalizedTextField A4;
    private sudoku.PersonalizedTextField A5;
    private sudoku.PersonalizedTextField A6;
    private sudoku.PersonalizedTextField A7;
    private sudoku.PersonalizedTextField A8;
    private sudoku.PersonalizedTextField A9;
    private sudoku.PersonalizedTextField B1;
    private sudoku.PersonalizedTextField B2;
    private sudoku.PersonalizedTextField B3;
    private sudoku.PersonalizedTextField B4;
    private sudoku.PersonalizedTextField B5;
    private sudoku.PersonalizedTextField B6;
    private sudoku.PersonalizedTextField B7;
    private sudoku.PersonalizedTextField B8;
    private sudoku.PersonalizedTextField B9;
    private sudoku.PersonalizedTextField C1;
    private sudoku.PersonalizedTextField C2;
    private sudoku.PersonalizedTextField C3;
    private sudoku.PersonalizedTextField C4;
    private sudoku.PersonalizedTextField C5;
    private sudoku.PersonalizedTextField C6;
    private sudoku.PersonalizedTextField C7;
    private sudoku.PersonalizedTextField C8;
    private sudoku.PersonalizedTextField C9;
    private sudoku.PersonalizedTextField D1;
    private sudoku.PersonalizedTextField D2;
    private sudoku.PersonalizedTextField D3;
    private sudoku.PersonalizedTextField D4;
    private sudoku.PersonalizedTextField D5;
    private sudoku.PersonalizedTextField D6;
    private sudoku.PersonalizedTextField D7;
    private sudoku.PersonalizedTextField D8;
    private sudoku.PersonalizedTextField D9;
    private sudoku.PersonalizedTextField E1;
    private sudoku.PersonalizedTextField E2;
    private sudoku.PersonalizedTextField E3;
    private sudoku.PersonalizedTextField E4;
    private sudoku.PersonalizedTextField E5;
    private sudoku.PersonalizedTextField E6;
    private sudoku.PersonalizedTextField E7;
    private sudoku.PersonalizedTextField E8;
    private sudoku.PersonalizedTextField E9;
    private sudoku.PersonalizedTextField F1;
    private sudoku.PersonalizedTextField F2;
    private sudoku.PersonalizedTextField F3;
    private sudoku.PersonalizedTextField F4;
    private sudoku.PersonalizedTextField F5;
    private sudoku.PersonalizedTextField F6;
    private sudoku.PersonalizedTextField F7;
    private sudoku.PersonalizedTextField F8;
    private sudoku.PersonalizedTextField F9;
    private sudoku.PersonalizedTextField G1;
    private sudoku.PersonalizedTextField G2;
    private sudoku.PersonalizedTextField G3;
    private sudoku.PersonalizedTextField G4;
    private sudoku.PersonalizedTextField G5;
    private sudoku.PersonalizedTextField G6;
    private sudoku.PersonalizedTextField G7;
    private sudoku.PersonalizedTextField G8;
    private sudoku.PersonalizedTextField G9;
    private sudoku.PersonalizedTextField H1;
    private sudoku.PersonalizedTextField H2;
    private sudoku.PersonalizedTextField H3;
    private sudoku.PersonalizedTextField H4;
    private sudoku.PersonalizedTextField H5;
    private sudoku.PersonalizedTextField H6;
    private sudoku.PersonalizedTextField H7;
    private sudoku.PersonalizedTextField H8;
    private sudoku.PersonalizedTextField H9;
    private sudoku.PersonalizedTextField I1;
    private sudoku.PersonalizedTextField I2;
    private sudoku.PersonalizedTextField I3;
    private sudoku.PersonalizedTextField I4;
    private sudoku.PersonalizedTextField I5;
    private sudoku.PersonalizedTextField I6;
    private sudoku.PersonalizedTextField I7;
    private sudoku.PersonalizedTextField I8;
    private sudoku.PersonalizedTextField I9;
    private javax.swing.JButton jButtonCleanSudoku;
    private javax.swing.JButton jButtonCorrectSudoku;
    private javax.swing.JButton jButtonCreateDifficultSudoku;
    private javax.swing.JButton jButtonCreateEasySudoku;
    private javax.swing.JButton jButtonCreateMediumSudoku;
    private javax.swing.JButton jButtonGetClue;
    private javax.swing.JButton jButtonResolceSudoku;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelBotton;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelEast;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelMain1;
    private javax.swing.JPanel jPanelMain2;
    private javax.swing.JPanel jPanelMain3;
    private javax.swing.JPanel jPanelMain4;
    private javax.swing.JPanel jPanelMain5;
    private javax.swing.JPanel jPanelMain6;
    private javax.swing.JPanel jPanelMain7;
    private javax.swing.JPanel jPanelMain8;
    private javax.swing.JPanel jPanelMain9;
    private javax.swing.JPanel jPanelWest;
    // End of variables declaration//GEN-END:variables
}
