package com.example.vkontakte_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.vkontakte_recyclerview.RecyclerViewAdapterFeed;
import com.example.vkontakte_recyclerview.FeedModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity{

    BottomNavigationView bottomNavigation;
    RecyclerView recView;
    ArrayList<FeedModel>feedModelArrayList=new ArrayList<>();
    RecyclerViewAdapterFeed adapterFeed;
    private TypeFaceUtil TypefaceUtil;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigation = findViewById(R.id.bottom_navigation);
        TypefaceUtil.overrideFont(getApplicationContext(), "SANS_SERIF", "fonts/MontserratSemiBold.ttf");

        populaterecyclerview();

        recView = (RecyclerView) findViewById(R.id.recy_feed);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recView.setLayoutManager(layoutManager);

        adapterFeed = new RecyclerViewAdapterFeed(this,feedModelArrayList);
        recView.setAdapter(adapterFeed);


    }


    private void populaterecyclerview() {
        FeedModel fm1 = new FeedModel("Good Life Inc" , "два часа назад" , "" ,"1K" , R.drawable.profile11 , R.drawable.post11 ,"34" , "59", "30K");
        FeedModel fm2 = new FeedModel("Astellia" ,"три часа назад", "⭐Доступ на серверы открыт! ⭐\n" +
                "\n" +"\n" +
                "Приглашаем всех желающих окунуться в волшебный мир Astellia! Доступ на серверы открыт для всех желающих, скачать клиент можно на странице: https://gamenet.ru/games/astellia/" +"\n" +
                "Благодарим всех за ожидание и желаем приятной игры!","152",R.drawable.profile12,R.drawable.post12,"506","10","7K");
        FeedModel fm3 = new FeedModel("Elation","три часа назад","-улыбочку!","499",R.drawable.profile13,R.drawable.post13,"8","5","5K");
        FeedModel fm4 = new FeedModel("E L E G A N T","8 марта 21:05","Криштиану Роналду вчера провёл свой 1000-й матч в карьере!\n" +
                "\n" +
                "За это время он забил 725 голов и завоевал 31 трофей. \uD83C\uDFC6\n" +
                "\n" +
                "Просто легенда \uD83D\uDC4F\uD83C\uDFFB","2700",R.drawable.profile14,R.drawable.post14,"113","56","18K");
        FeedModel fm5 = new FeedModel("ITProger", "5 марта 00:15",null,"763",R.drawable.profile5,R.drawable.post5,"160","35","14K");
        FeedModel fm6 = new FeedModel("ЗЛОЙ НЕГР","5 марта 04:59","ПАКЕТ","3K",R.drawable.profile15,R.drawable.post15,"216","125","44K");
        FeedModel fm7 = new FeedModel("The Gentlemen","3 марта 15:22","Будтье смелее..." ,"132",R.drawable.profile16,R.drawable.post16,"2","17","1K");
        FeedModel fm8 = new FeedModel("Дети Улиц","3 марта 12:41","Βepнocть - вoпpoc хapaктepa,\n" +
                "a нe oбcтoятeльcтв.\n" +
                "\n" +
                "—Дети Улиц.","342",R.drawable.profile17,R.drawable.post17,"17","104","4К");
        FeedModel fm9 = new FeedModel("UFC","3 марта 00:56","Макгрегор раскритиковал Махачева за высказывание о женщинах в ММА\n" +
                "\n" +
                "Экс-чемпион UFC Конор Макгрегор раскритиковал Ислама Махачева за его высказывание о женщинах в смешанных единоборствах.\n" +
                "\n" +
                "\uD83D\uDCAC«Полный кретин. Обвинённый за стероиды жулик, который сделает всё, чтобы избежать удара и затормозить ход поединка, обсуждает один из величайших боёв с разменом ударами, которые когда-либо проводили девушки-бойцы. Эти маленькие гремлины! Снова. Грязные крысы. Позор нашего спорта», – написал Макгрегор в своём «Твиттере».","3K",R.drawable.profile19,R.drawable.post19,"677","34","60K");
        FeedModel fm10 = new FeedModel("Строки пыльных книг","1 марта 05:05",null,"4K",R.drawable.profilespk,R.drawable.postspg,"433","72","18K");



        feedModelArrayList.add(fm1);
        feedModelArrayList.add(fm2);
        feedModelArrayList.add(fm3);
        feedModelArrayList.add(fm4);
        feedModelArrayList.add(fm5);
        feedModelArrayList.add(fm6);
        feedModelArrayList.add(fm7);
        feedModelArrayList.add(fm8);
        feedModelArrayList.add(fm9);
        feedModelArrayList.add(fm10);

    }

}