package com.example.administrator.revieweducationcenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.administrator.revieweducationcenter.adapters.CenterAdapter;
import com.example.administrator.revieweducationcenter.controllers.RECManager;
import com.example.administrator.revieweducationcenter.models.Center;
import com.example.administrator.revieweducationcenter.models.Course;
import com.example.administrator.revieweducationcenter.models.Subject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    CenterAdapter centerAdapter;
    ArrayList<Center> listData;
    ListView lvData;
    ImageView imageAddCenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_center);
        getSupportActionBar().hide();
        getData();
        initView();
    }
    private  void initView(){
        centerAdapter = new CenterAdapter(listData, MainActivity.this);
        lvData = (ListView)  findViewById(R.id.lvData);
        lvData.setAdapter(centerAdapter);
        centerAdapter.notifyDataSetChanged();
        imageAddCenter = (ImageView) findViewById(R.id.imgAddPerson);
        lvData.setOnItemClickListener(this);

    }

    private void getData(){
        listData = new ArrayList<>();
        listData.add(new Center(0,"EziEnghlish", "DaNang", "0123456789", R.drawable.ezienghlish, 5));
        listData.add(new Center(1,"Galazy", "DaNang", "0123456789", R.drawable.galaxy, 5));
        listData.add(new Center(2,"Geos", "DaNang", "0123456789", R.drawable.geos, 5));
        listData.add(new Center(3,"Thái Bình Dương", "DaNang", "0123456789", R.drawable.tbd, 5));
        listData.add(new Center(4,"World Win ", "DaNang", "0123456789", R.drawable.workdwin, 5));
        listData.add(new Center(5,"EziEnghlish", "DaNang", "0123456789", R.drawable.ezienghlish, 5));
        listData.add(new Center(6,"Galazy", "DaNang", "0123456789", R.drawable.galaxy, 5));
        listData.add(new Center(7,"Geos", "DaNang", "0123456789", R.drawable.geos, 5));
        listData.add(new Center(8,"Thái Bình Dương", "DaNang", "0123456789", R.drawable.tbd, 5));
        listData.add(new Center(9,"World Win ", "DaNang", "0123456789", R.drawable.workdwin, 5));
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }


}
