package app.buusk.resume_653;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.EditText;
public class MainActivity extends Activity implements OnClickListener {
private Button btn1, btn2;
private TextView txt11, txt12, txt13, txt14, txt15;
private String show1,show2,show3,show4,show5;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
ViewMatching();
}
private void ViewMatching() {
btn1 = (Button) findViewById(R.id.btnedit);
btn2 = (Button) findViewById(R.id.btnimg);
btn1.setOnClickListener(this);
btn2.setOnClickListener(this);
txt11 = (TextView) findViewById(R.id.textView4);
txt12 = (TextView) findViewById(R.id.textView6);
txt13 = (TextView) findViewById(R.id.textView8);
txt14 = (TextView) findViewById(R.id.textView10);
txt15 = (TextView) findViewById(R.id.textView12);

txt11.setText("Toffyz");
txt12.setText("20");
txt13.setText("089-034-5513");
txt14.setText("Sab_za_nk60@hotmail.com");
txt15.setText("Bnnh Toffy'z");

show1 = getIntent().getStringExtra("txt11");
show2 = getIntent().getStringExtra("txt12");
show3 = getIntent().getStringExtra("txt13");
show4 = getIntent().getStringExtra("txt14");
show5 = getIntent().getStringExtra("txt15");

txt11.setText(show1);
txt12.setText(show2);
txt13.setText(show3);
txt14.setText(show4);
txt15.setText(show5);

}
@Override
public void onClick(View v) {
switch (v.getId()) {
case R.id.btnedit:
Intent i = new Intent(getApplicationContext(), edit_top.class);
startActivity(i);
break;
case R.id.btnimg:
Intent j = new Intent(getApplicationContext(), ImageActivity.class);
startActivity(j);
break;
default:
break;
}
}
}