import java.awt.event.ActionEvent;
import javafx.application.*;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;


public class EventFX extends Application implements EventHandler<ActionEvent>
{
    int count=0;
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button b=new Button("ok");
        b.setOnAction(new EventHandler<ActionEvent>()
                {
                       @Override
    public void handle(ActionEvent t) 
    {
        count++;
        b.setText(""+count);
                }
                });
        b.setPrefSize(100, 100);
        FlowPane fp =new FlowPane(b);
        Scene sc=new Scene(fp,400,400);
        stage.show();
    }

    @Override
    public void handle(ActionEvent t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
