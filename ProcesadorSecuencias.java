import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Orientation;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.List;
import java.util.ArrayList;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.input.KeyCode;
import java.util.Set;
import java.util.HashSet;
import javafx.stage.FileChooser;
import java.io.File;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;

public class ProcesadorSecuencias extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		//---------------------------------------PROCESADOR DE SECUENCIAS---------------------------------
		VBox procesadorPane = new VBox(20);
		HBox hbox1 = new HBox(20);
		HBox hbox2 = new HBox(20);
		HBox hbox3 = new HBox(20);
		Label lbSecuencia1 = new Label("Ingresa la secuencia 1: ");
		Label lbSecuencia2 = new Label("Ingresa la secuencia 2: ");
		Label lbDato = new Label("Dato: ");
		TextField tfSecuencia1 = new TextField();
		TextField tfSecuencia2 = new TextField();
		TextField tfDato = new TextField();
		Button btSumar = new Button("Sumar");
		Button btRestar = new Button("Restar");
		Button btMultiplicar = new Button("Multiplicar");
		Button btAmplificar = new Button("Amplificar");
		Button btAtenuar = new Button("Atenuar");
		Button btDesplazar = new Button("Desplazar");
		Button btReflejar = new Button("Reflejar");
		Button btDiezmar = new Button("Diezmar");
		Button btInterpolar = new Button("Interpolar");
		Button btConvolucion = new Button("Convolucion");
		NumberAxis xAxis1 = new NumberAxis(-10, 10, 1);
        NumberAxis yAxis1 = new NumberAxis(-10, 10, 1);        
        NumberAxis xAxis2 = new NumberAxis(-10, 10, 1);
        NumberAxis yAxis2 = new NumberAxis(-10, 10, 1);        
        NumberAxis xAxis3 = new NumberAxis(-10, 10, 1);
        NumberAxis yAxis3 = new NumberAxis(-10, 10, 1);        
        ScatterChart<Number,Number> sc1 = new ScatterChart<>(xAxis1, yAxis1);
        ScatterChart<Number,Number> sc2 = new ScatterChart<>(xAxis2, yAxis2);
        ScatterChart<Number,Number> sc3 = new ScatterChart<>(xAxis3, yAxis3);
        xAxis1.setLabel("k");                
        yAxis1.setLabel("n(k)");
        xAxis2.setLabel("k");                
        yAxis2.setLabel("n(k)");
        xAxis3.setLabel("k");                
        yAxis3.setLabel("n(k)");
        sc1.setTitle("Secuencia 1");
        sc2.setTitle("Secuencia 2");
        sc3.setTitle("Secuencia 3");

		procesadorPane.setPadding(new Insets(5));
		hbox1.setPadding(new Insets(5));
		hbox2.setPadding(new Insets(5));
		hbox3.setPadding(new Insets(5));
		
		XYChart.Series series1 = new XYChart.Series();
        //series1.setName("Equities");
        series1.getData().add(new XYChart.Data(4.2, 193.2));
        series1.getData().add(new XYChart.Data(2.8, 33.6));
        series1.getData().add(new XYChart.Data(6.2, 24.8));
        series1.getData().add(new XYChart.Data(1, 14));
        series1.getData().add(new XYChart.Data(1.2, 26.4));
        series1.getData().add(new XYChart.Data(4.4, 114.4));
        series1.getData().add(new XYChart.Data(8.5, 323));
        series1.getData().add(new XYChart.Data(6.9, 289.8));
        series1.getData().add(new XYChart.Data(9.9, 287.1));
        series1.getData().add(new XYChart.Data(0.9, -9));
        series1.getData().add(new XYChart.Data(3.2, 150.8));
        series1.getData().add(new XYChart.Data(4.8, 20.8));
        series1.getData().add(new XYChart.Data(7.3, -42.3));
        series1.getData().add(new XYChart.Data(1.8, 81.4));
        series1.getData().add(new XYChart.Data(7.3, 110.3));
        series1.getData().add(new XYChart.Data(2.7, 41.2));
        
		hbox1.getChildren().addAll(lbSecuencia1, tfSecuencia1, lbSecuencia2, tfSecuencia2, lbDato, tfDato);
		hbox2.getChildren().addAll(btSumar, btRestar, btMultiplicar, btAmplificar, btAtenuar, btDesplazar, btReflejar, btDiezmar, btInterpolar, btConvolucion);
		sc1.getData().addAll(series1);
		
		hbox3.getChildren().addAll(sc1, sc2, sc3);
		procesadorPane.getChildren().addAll(hbox1, hbox2, hbox3);

		Scene scene = new Scene(procesadorPane, 1400, 700);
		primaryStage.setScene(scene);
		primaryStage.setTitle("PROCESADOR DE SECUENCIAS");			
		primaryStage.show();

		btSumar.setOnAction
		(
			e -> 
			{
				String s1 = tfSecuencia1.getText();			
				String s2 = tfSecuencia2.getText();			
						
				Par[] x = new Par[100];
				Par[] y = new Par[100];

				String text = getText();
				String array1[] = s1.split(" ");

				i = 0;
				j = 0;
				for(String s: array)
				{
					if(s.charAt(0) == '/')
					{
						x[i] = new Par(0, Integer.parseInt(s));
						j = i;
						i++;
					}
					else
						x[i++] = new Par(-1, Integer.parseInt(s));
				}

				for(i = 0; i < j; i++)
				{
					x[i].indice = i - j;
				}
				for(j = j + 1, i = 0; j < x.length(); j++)
				{
					x[j].indice = i++;
				}
			}
		);
	}	
	
	/*
	public static void main(String[] args) 
	{
		Par[] x = new Par[100];
		Par[] y = new Par[100];

		String text = getText();

		String array[] = text.split(" ");

		i = 0;
		j = 0;
		for(String s: array)
		{
			if(s.charAt(0) == '/')
			{
				x[i] = new Par(0, Integer.parseInt(s));
				j = i;
				i++;
			}
			else
				x[i++] = new Par(-1, Integer.parseInt(s));
		}

		for(i = 0; i < j; i++)
		{
			x[i].indice = i - j;
		}
		for(j = j + 1, i = 0; j < x.length(); j++)
		{
			x[j].indice = i++;
		}
	}
	*/

}