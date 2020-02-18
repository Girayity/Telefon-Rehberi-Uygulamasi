package deu.csc.lecture.homework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class RehberActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rehber);
    }

    public void ekleOnClick(View view) {
        Bilgiler kisi = new Bilgiler(R.drawable.resim, ((TextView)findViewById(R.id.isim)).getText().toString(), ((TextView)findViewById(R.id.numara)).getText().toString());
        Intent intent = new Intent();
        intent.putExtra("kisi", kisi);
        setResult(RESULT_OK, intent);
        finish();
    }
}
