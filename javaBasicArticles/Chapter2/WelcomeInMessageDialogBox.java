/*在消息对话框中显示Welcome to Java!"*/
import javax.swing.JOptionPane;

public class WelcomeInMessageDialogBox{
  public static void main(String[] args){
    JOptionPane.showMessageDialog(null,
	"Welcome to Java!",
	"Display Message",
	JOptionPane.INFORMATION_MESSAGE);
	}
}