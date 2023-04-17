package RadioButton;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

class RadioButton extends JFrame 
{
   private JTextField textField; 
   private Font plainFont; // font for plain text
   private Font boldFont; // font for bold text
   private Font italicFont; // font for italic text
   private Font boldItalicFont; // font for bold and italic text
   private JRadioButton plainJRadioButton; // selects plain text
   private JRadioButton boldJRadioButton; // selects bold text
   private JRadioButton italicJRadioButton; 
   private JRadioButton boldItalicJRadioButton; 
   private ButtonGroup radioGroup; 

   
   public RadioButton()
   {
      super("RadioButton Test");
      setLayout(new FlowLayout()); 

      textField = new JTextField("Watch the font style change", 25);
      add(textField); 

     
      plainJRadioButton = new JRadioButton("Plain", true);
      boldJRadioButton = new JRadioButton("Bold", false);
      italicJRadioButton = new JRadioButton("Italic", false);
      boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
      add(plainJRadioButton);
      add(boldJRadioButton); 
      add(italicJRadioButton); 
      add(boldItalicJRadioButton); 

      
      radioGroup = new ButtonGroup(); 
      radioGroup.add(plainJRadioButton);
      radioGroup.add(boldJRadioButton); 
      radioGroup.add(italicJRadioButton); 
      radioGroup.add(boldItalicJRadioButton); 

    
      plainFont = new Font("Serif", Font.PLAIN, 14);
      boldFont = new Font("Serif", Font.BOLD, 14);
      italicFont = new Font("Serif", Font.ITALIC, 14);
      boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
      textField.setFont(plainFont);

      
     
      plainJRadioButton.addItemListener(
         new RadioButtonHandler(plainFont));
      boldJRadioButton.addItemListener(
         new RadioButtonHandler(boldFont));
      italicJRadioButton.addItemListener(
         new RadioButtonHandler(italicFont));
      boldItalicJRadioButton.addItemListener(
         new RadioButtonHandler(boldItalicFont));
   } 

   
   private class RadioButtonHandler implements ItemListener 
   {
      private Font font; 

      public RadioButtonHandler(Font f)
      {
         font = f; 
      } 

      @Override
      public void itemStateChanged(ItemEvent event)
      {
         textField.setFont(font); 
      } 
   } 


   public static void main(String[] args)
   {
      RadioButton radioButtonFrame = new RadioButton();
      radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      radioButtonFrame.setSize(300, 100); 
      radioButtonFrame.setVisible(true); 
   } 
}