package chuchoscorp.obtenersensores;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    SensorManager SM;
    TextView objsensores;
    List<Sensor> lista_Sensores;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SM = (SensorManager) getSystemService(SENSOR_SERVICE);
        objsensores = (TextView) findViewById(R.id.lblSensor);
        lista_Sensores = SM.getSensorList(Sensor.TYPE_ALL);

        for (Sensor sensor : lista_Sensores) {
            objsensores.append(sensor.getName()+"\n");
        }

    }
}
