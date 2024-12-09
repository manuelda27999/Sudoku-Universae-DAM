/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sudoku;

import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author manueldavidcastilloperez
 */
public class PersonalizedTextField extends JTextField {

    public PersonalizedTextField() {
        super();
        
        AbstractDocument document = (AbstractDocument) this.getDocument();
        document.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
                if (text != null && text.matches("[1-9]") && fb.getDocument().getLength() < 1 || (text != null && text.isEmpty())) {
                    super.insertString(fb, offset, text, attr);
                }
            }
            
            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text != null && text.matches("[1-9]") && fb.getDocument().getLength() < 1 || (text != null && text.isEmpty())) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
    }
}
