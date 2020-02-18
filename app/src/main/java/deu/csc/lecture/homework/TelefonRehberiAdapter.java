package deu.csc.lecture.homework;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TelefonRehberiAdapter extends ArrayAdapter<Bilgiler> {

    private Context mContext;
    private ArrayList<Bilgiler> kisiListesi = new ArrayList<>();

    public TelefonRehberiAdapter(Context context, ArrayList<Bilgiler> list) {
        super(context, 0, list);
        mContext = context;
        kisiListesi = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.rehber, parent, false);

        Bilgiler kisi = kisiListesi.get(position);

        ImageView image = (ImageView) listItem.findViewById(R.id.avatar);
        image.setImageResource(kisi.getAvatar());

        TextView name = (TextView) listItem.findViewById(R.id.isim);
        name.setText(kisi.getName());

        TextView phone = (TextView) listItem.findViewById(R.id.numara);
        phone.setText(kisi.getPhone());

        return listItem;
    }
}
