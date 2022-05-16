package in.manasi.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtColorOne;
    private TextView txtColorTwo;
    private TextView txtColorThree;
    private TextView txtColorFour;
    private Button btnsave;
    private EditText edtColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        linearLayout.setPadding(20, 20, 20, 20);

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        linearLayout.setLayoutParams(layoutParams);

        ViewGroup.LayoutParams paramsForView = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );


        txtColorOne = new Button(this);
        txtColorOne.setText("Color One");
        txtColorOne.setBackgroundColor(Color.RED);
        txtColorOne.setPadding(20,20,20,20);
        txtColorOne.setLayoutParams(paramsForView);

        linearLayout.addView(txtColorOne);

        txtColorTwo = new Button(this);
        txtColorTwo.setText("Color Two");
        txtColorTwo.setBackgroundColor(Color.RED);
        txtColorTwo.setPadding(20,20,20,20);
        txtColorTwo.setLayoutParams(paramsForView);

        linearLayout.addView(txtColorTwo);

        txtColorThree = new Button(this);
        txtColorThree.setText("Color Three");
        txtColorThree.setBackgroundColor(Color.RED);
        txtColorThree.setPadding(20,20,20,20);
        txtColorThree.setLayoutParams(paramsForView);

        linearLayout.addView(txtColorThree);

        txtColorFour = new Button(this);
        txtColorFour.setText("Color One");
        txtColorFour.setBackgroundColor(Color.RED);
        txtColorFour.setPadding(20,20,20,20);
        txtColorFour.setLayoutParams(paramsForView);

        linearLayout.addView(txtColorFour);

       edtColor=new EditText(this);
       edtColor.setHint("Enter Number:");

       linearLayout.addView(edtColor);


        btnsave=new Button(this);
        btnsave.setText("Change Color Code");
        btnsave.setBackgroundColor(Color.GREEN);
        linearLayout.addView(btnsave);


        setContentView(linearLayout);
        btnsave.setOnClickListener(new btnSaveClickListener());
    }

    public class btnSaveClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view)
        {
String ChangeColor=edtColor.getText().toString();

switch (ChangeColor){

    case "1":
        txtColorOne.setBackgroundColor(Color.GRAY);
        break;

    case "2":
        txtColorTwo.setBackgroundColor(Color.DKGRAY);
        break;

    case "3":
        txtColorThree.setBackgroundColor(Color.WHITE);
        break;

    case "4":
        txtColorFour.setBackgroundColor(Color.LTGRAY);
        break;

    default:
        edtColor.setText("Enter Valid Color Code");
}

        }
    }
}