package com.msfpiyush.admin574;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class EditTextWithWatcher extends AppCompatActivity {
ListView lstview1;
EditText edt1;
String[] name={"Piyush Makwana","Rajat kashyap","Anil Mishra","Piyush Kevat","Rajat Kevat","Piyush Goyel","Anjali Parmar","Hiral Patel"
,"Hitesh Patel","Arpit kakadiya","Arpit Unagar","Ajay vaghela", "Ajay Mali"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editext0watcher);
        edt1=findViewById(R.id.edt1);
        lstview1=findViewById(R.id.lstview1);

        ArrayAdapter<String> Ad=new ArrayAdapter<String>(this,R.layout.listview_watcher,R.id.ListViewText,name);
        lstview1.setAdapter(Ad);

        edt1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                Toast.makeText(EditTextWithWatcher.this, "Before text changed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Ad.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {
//                Toast.makeText(EditTextWithWatcher.this, "Text changed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}