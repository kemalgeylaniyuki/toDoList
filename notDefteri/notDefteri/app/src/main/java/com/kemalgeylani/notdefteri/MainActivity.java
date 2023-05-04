package com.kemalgeylani.notdefteri;

/*
Bir not defteri uygulaması geliştirin. Kullanıcı, uygulama arayüzünde bir metin yazabilir ve
kaydedebilir. Kaydedilmiş notlar, uygulama arayüzünde bir liste halinde gösterilebilir.
Bu örnek uygulama için, kullanıcı girdisini almak için bir EditText bileşeni kullanabilirsiniz
ve kaydedilmiş notları göstermek için bir ListView bileşeni kullanabilirsiniz.
*/

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText noteText;
    ListView noteList;
    ArrayList<String> notes = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noteText = findViewById(R.id.noteText);
        noteList = findViewById(R.id.noteList);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,notes);
        noteList.setAdapter(adapter);

    }

    public void save(View view){

        String txt = noteText.getText().toString();
        notes.add(txt);
        adapter.notifyDataSetChanged();
    }


}