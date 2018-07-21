package com.example.cristofer.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView  listView;
        listView = findViewById(R.id.MyListView);

        //Create the array
        final List<User> items = new ArrayList<>();

        items.add(new User("1- Cristofer Nuñez","C/ 27 de Febrero"));
        items.add(new User("2- Cristofer Nuñez","C/ 27 de Febrero"));
        items.add(new User("3- Cristofer Nuñez","C/ 27 de Febrero"));
        items.add(new User("4- Cristofer Nuñez","C/ 27 de Febrero"));
        items.add(new User("5- Cristofer Nuñez","C/ 27 de Febrero"));
        items.add(new User("6- Cristofer Nuñez","C/ 27 de Febrero"));
        items.add(new User("8- Cristofer Nuñez","C/ 27 de Febrero"));
        items.add(new User("9- Cristofer Nuñez","C/ 27 de Febrero"));
        items.add(new User("10- Cristofer Nuñez","C/ 27 de Febrero"));
        items.add(new User("11- Cristofer Nuñez","C/ 27 de Febrero"));
        items.add(new User("12- Cristofer Nuñez","C/ 27 de Febrero"));
        items.add(new User("13- Cristofer Nuñez","C/ 27 de Febrero"));
        items.add(new User("14- Cristofer Nuñez","C/ 27 de Febrero"));
        items.add(new User("15- Cristofer Nuñez","C/ 27 de Febrero"));
        items.add(new User("16- Cristofer Nuñez","C/ 27 de Febrero"));
        items.add(new User("17- Cristofer Nuñez","C/ 27 de Febrero"));
        items.add(new User("18- Cristofer Nuñez","C/ 27 de Febrero"));

        //Instantiate the adapter
        UserAdapter adapter = new UserAdapter(this, items);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                User userSelected = items.get(position);

                Toast.makeText(MainActivity.this, "User Name: "+userSelected.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
