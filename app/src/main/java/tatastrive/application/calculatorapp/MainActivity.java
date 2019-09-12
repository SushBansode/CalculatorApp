package tatastrive.application.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2;
    Button bt1,bt2,bt3,bt4;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        editText1=findViewById( R.id.editText );
        editText2=findViewById( R.id.editText2 );
        bt1=findViewById( R.id.add );
        bt2=findViewById( R.id.sub );
        bt3=findViewById( R.id.mul );
        bt4=findViewById( R.id.div );
        textView=findViewById( R.id.Result );
        bt1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String s1= String.valueOf( editText1.getText());
            String s2= String.valueOf( editText2.getText());
           int sum=Integer.parseInt( s1)+Integer.parseInt( s2);

            }
        } );



    }
}
