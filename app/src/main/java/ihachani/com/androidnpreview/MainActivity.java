package ihachani.com.androidnpreview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button lambdaButton;
    Button refrencaMethodButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lambdaButton = (Button) findViewById(R.id.lambda_button);
        refrencaMethodButton = (Button) findViewById(R.id.refrence_method_button);

        lambdaButton.setOnClickListener((v) -> {
                    String toastText = "I Love Lambdas";
                    showToast(toastText);
                }
        );
        refrencaMethodButton.setOnClickListener(this::methodRefrence);
    }

    private void showToast(String toastText) {
        Toast.makeText(MainActivity.this, toastText, Toast.LENGTH_SHORT).show();
    }

    private void methodRefrence(View view) {
        String toastText = "I Love Method Refrence";
        showToast(toastText);
    }


}
