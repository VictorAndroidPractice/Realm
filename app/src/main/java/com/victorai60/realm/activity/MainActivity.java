package com.victorai60.realm.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.victorai60.realm.R;
import com.victorai60.realm.entity.DogBean;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {
    private Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        DogBean dogBean = realm.createObject(DogBean.class);
        dogBean.setName("小汪");
        dogBean.setAge(13);
        realm.commitTransaction();

        DogBean dogBean2 = realm.where(DogBean.class).equalTo("age", 13).findFirst();
        System.out.println(dogBean2.getName() + realm.getPath());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close();
    }
}
