package deu.csc.lecture.homework;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private static final int REQ_CODE = 123;
    TelefonRehberiAdapter telefonAdapter;
    ArrayList<Bilgiler> kisiListesi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.rehber);
        kisiListesi = new ArrayList<>();

        telefonAdapter = new TelefonRehberiAdapter(this, kisiListesi);
        kisiListesi.add(new Bilgiler(R.drawable.resim, "Giray Budan", "321983"));
        kisiListesi.add(new Bilgiler(R.drawable.resim, "Laura Brehm", "442132"));
        listView.setAdapter(telefonAdapter);
    }

    public void ekleOnClick(View view) {
        Intent intent = new Intent(this, RehberActivity.class);
        startActivityForResult(intent, REQ_CODE);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (requestCode == REQ_CODE) {
            Bilgiler kisi = (Bilgiler)intent.getExtras().get("kisi");
            kisiListesi.add(kisi);
            telefonAdapter.notifyDataSetChanged();
        }
    }
   /* public void
    onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putExtra("name", kisiListesi);
    }

    public void
    onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);
        kisiListesi= inState.getExtra("liste");
    }*/
}