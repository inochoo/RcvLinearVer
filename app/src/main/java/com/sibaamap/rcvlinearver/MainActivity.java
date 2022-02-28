package com.sibaamap.rcvlinearver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvUser;
    private UserAdapter userAdapter;
    //private CollapsingToolbarLayout collapsingToolbarLayout;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();
        rcvUser = findViewById(R.id.rcv_user);
        userAdapter = new UserAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvUser.setLayoutManager(linearLayoutManager);
        userAdapter.setData(getListUser());
        rcvUser.setAdapter(userAdapter);
    }
    private List<User> getListUser(){
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.dienthoai2,"Mua bán có tâm"));
        list.add(new User(R.drawable.giamcan2,"Ăn để lăn"));
        list.add(new User(R.drawable.embe2,"Chia sẻ kiến thức tài liệu Montessori"));
        list.add(new User(R.drawable.rautron2,"Thực đơn Eat-Clean giảm cân khỏe đẹp"));
        list.add(new User(R.drawable.kento2,"Easy Kento for busy People"));
        list.add(new User(R.drawable.oto2,"OFFB"));
        list.add(new User(R.drawable.rautron2,"Thực đơn Eat-Clean giảm cân khỏe đẹp"));
        list.add(new User(R.drawable.kento2,"Easy Kento for busy People"));

        return list;

    }
    private void initToolbar(){
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }


}