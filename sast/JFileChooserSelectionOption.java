import java.io.File;

import javax.swing.JFileChooser;

public class JFileChooserSelectionOption
{

  public static void main(String[] a) {
    JFileChooser fileChooser = new JFileChooser(".");
    int status = fileChooser.showOpenDialog(null);

    if (status == JFileChooser.APPROVE_OPTION) {
      File selectedFile = fileChooser.getSelectedFile();
     // System.out.println(selectedFile.getParent());
      //System.out.println(selectedFile.getName());
      String s = selectedFile.getAbsolutePath();
    } else if (status == JFileChooser.CANCEL_OPTION) {
      System.out.println("canceled");
    }
  }

}