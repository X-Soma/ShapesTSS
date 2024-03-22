import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/**
 * TODO javadoc to add
 * GUI project with spinning images of defined shapes.
 * @author X-Soma
 * @version 1.0.1
 *
 * */
public class TitlesFrame extends JFrame {
   public TitlesFrame() {
      this.initUI();
   }
   /**
    * Method to initialise ui.
    * defines size of window, title, and object of Title-panel
    *
    * */

   private void initUI() {
      this.setTitle("Криві фігури");
      this.setDefaultCloseOperation(3);
      this.add(new TitlesPanel(58));
      this.setSize(350, 350);
      this.setLocationRelativeTo((Component)null);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            TitlesFrame ps = new TitlesFrame();
            ps.setVisible(true);
         }
      });
   }
}
