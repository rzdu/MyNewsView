package com.example.administrator.mynewsview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0; i < 10; i++) {
            Fruit fruit = new Fruit("科比：这是我的主场！\n盘点NBA最霸气的怒吼。", R.drawable.kobe2);
            fruitList.add(fruit);
            Fruit fruit2 = new Fruit("apple2", R.mipmap.ic_launcher);
            fruitList.add(fruit2);
            Fruit fruit3 = new Fruit("apple3", R.mipmap.ic_launcher);
            fruitList.add(fruit3);
            Fruit fruit4 = new Fruit("apple4", R.mipmap.ic_launcher);
            fruitList.add(fruit4);
        }
    }
}
