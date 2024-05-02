package com.khair.homework2472;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ArrayList<HashMap<String, String>> categoryList = new ArrayList<>();
    HashMap<String, String> categoryMap;

    ArrayList<HashMap<String, String>> songList = new ArrayList<>();
    HashMap<String, String> songMap;

    // variable
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize
        gridView = findViewById(R.id.GridView);

        // load List
        loadCategory();

        CategoryAdapter categoryAdapter = new CategoryAdapter();
        gridView.setAdapter(categoryAdapter);




    }
 /////////////=====================================================================================


    public class CategoryAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return categoryList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView = layoutInflater.inflate(R.layout.item, parent, false);

            ImageView tvImage = myView.findViewById(R.id.tvImage);
            TextView tvTitle = myView.findViewById(R.id.tvTitle);
            CardView categoryItem = myView.findViewById(R.id.categoryItem);

            HashMap<String, String> hashMap = categoryList.get(position);
            String title = hashMap.get("title");
            String catIcon = hashMap.get("catIcon");
            String album = hashMap.get("album");

            int ItemIcon=Integer.parseInt(catIcon);

            tvImage.setImageResource(ItemIcon);

            tvTitle.setText(title);


            // item click
            categoryItem.setOnClickListener(v -> {
                if (album.equals("Nora Fatehi")) {
                    // go to Nora Fatehi Album
                    loadNoraFatehiAlbum();
                    song_list.textViewk=title;
                    song_list.arrayList = songList;
                    startActivity(new Intent(MainActivity.this, song_list.class));
                } else if (album.equals("Mizanur Rahman")) {
                    // go toMizanur Rahman Azhari Album
                    loadShironamhinAlbum();
                    song_list.textViewk=title;
                    song_list.arrayList = songList;
                    startActivity(new Intent(MainActivity.this, song_list.class));
                } else if (album.equals("Sheikh Ahmadulla")) {
                    // go to Sheikh Ahmadulla Album
                    loadAlbum1();
                    song_list.textViewk=title;
                    song_list.arrayList = songList;
                    startActivity(new Intent(MainActivity.this, song_list.class));
                } else if (album.equals("Abrarul Haque Asif ")) {
                    // go to Artcell Album
                    loadAlbum2();
                    song_list.textViewk=title;
                    song_list.arrayList = songList;
                    startActivity(new Intent(MainActivity.this, song_list.class));
                } else if (album.equals("Mufti Nazrul Islam")) {
                    // go to Artcell Album
                    loadAlbum3();
                    song_list.textViewk=title;
                    song_list.arrayList = songList;
                    startActivity(new Intent(MainActivity.this, song_list.class));
                } else if (album.equals("Tariq Jamil")) {
                    // go to Artcell Album
                    loadAlbum4();
                    song_list.textViewk=title;
                    song_list.arrayList = songList;
                    startActivity(new Intent(MainActivity.this, song_list.class));
                } else if (album.equals("James")) {
                    // go to Artcell Album
                    loadAlbum5();
                    song_list.textViewk=title;
                    song_list.arrayList = songList;
                    startActivity(new Intent(MainActivity.this, song_list.class));
                } else if (album.equals("Mainul Ahsan Noble")) {
                    // go to Artcell Album
                    loadAlbum6();
                    song_list.textViewk=title;
                    song_list.arrayList = songList;
                    startActivity(new Intent(MainActivity.this, song_list.class));
                }
            });

            return myView;
        }

    } // CategoryAdapter end here ===========

    void loadCategory() {
        //=== category 1 === //
        categoryMap = new HashMap<>();
        categoryMap.put("title", "Nora Fatehi");
        categoryMap.put("catIcon", String.valueOf(R.drawable.img_3));
        categoryMap.put("album", "Nora Fatehi");
        categoryList.add(categoryMap);


        //=== category 2 === //
        categoryMap = new HashMap<>();
        categoryMap.put("title", "Mizanur Rahman");
        categoryMap.put("catIcon", String.valueOf(R.drawable.img_2));
        categoryMap.put("album", "Mizanur Rahman");
        categoryList.add(categoryMap);

        //=== category 3 === //
        categoryMap = new HashMap<>();
        categoryMap.put("title", "Sheikh Ahmadullah");
        categoryMap.put("catIcon", String.valueOf(R.drawable.img_4));
        categoryMap.put("album", "Sheikh Ahmadulla");
        categoryList.add(categoryMap);

        //=== category 4 === //
        categoryMap = new HashMap<>();
        categoryMap.put("title", "Abrarul Haque Asif");
        categoryMap.put("catIcon", String.valueOf(R.drawable.img_5));
        categoryMap.put("album", "Abrarul Haque Asif ");
        categoryList.add(categoryMap);

        //=== category 5 === //
        categoryMap = new HashMap<>();
        categoryMap.put("title", "Mufti Nazrul Islam");
        categoryMap.put("catIcon", String.valueOf(R.drawable.img_6));
        categoryMap.put("album", "Mufti Nazrul Islam");
        categoryList.add(categoryMap);

        //=== category 6 === //
        categoryMap = new HashMap<>();
        categoryMap.put("title", "Tariq Jamil");
        categoryMap.put("catIcon", String.valueOf(R.drawable.img_7));
        categoryMap.put("album", "Tariq Jamil");
        categoryList.add(categoryMap);

        //=== category 7 === //
        categoryMap = new HashMap<>();
        categoryMap.put("title", "James");
        categoryMap.put("catIcon", String.valueOf(R.drawable.img_8));
        categoryMap.put("album", "James");
        categoryList.add(categoryMap);

        //=== category 8 === //
        categoryMap = new HashMap<>();
        categoryMap.put("title", "Mainul Ahsan Noble");
        categoryMap.put("catIcon", String.valueOf(R.drawable.img_9));
        categoryMap.put("album", "Mainul Ahsan Noble");
        categoryList.add(categoryMap);

     






    } // loadCategory end here =========


  public  void loadNoraFatehiAlbum() {
        songList.clear();

        songMap = new HashMap<>();
        songMap.put("title", "_Jeena_Haraam_Vidyut");
        songMap.put("description", "Tanishk_Bagchi__Vishal_Mishra,Shilpa_Rao");
        songMap.put("songImg", String.valueOf(R.drawable.img_3));
        songMap.put("song", "https://abulk77912.000webhostapp.com/song/song_1.mp3");
        songList.add(songMap);


        songMap = new HashMap<>();
        songMap.put("title", "_Nora_Fatehi ");
        songMap.put("description", "Vishal_Mishra,Shilpa_Rao");
        songMap.put("songImg", String.valueOf(R.drawable.img_3));
        songMap.put("song","https://abulk77912.000webhostapp.com/song/song_2.mp3");
        songList.add(songMap);


        songMap = new HashMap<>();
        songMap.put("title", "Kusu Kusu Song");
        songMap.put("description", "Presenting Kusu Kusu song featuring Nora Fatehi from movie ");
        songMap.put("songImg", String.valueOf(R.drawable.img_3));
        songMap.put("song","https://abulk77912.000webhostapp.com/song/song_7.mp3");
        songList.add(songMap);


        songMap = new HashMap<>();
        songMap.put("title", "Meri Zindagi Hai Tu");
        songMap.put("description", "Gulshan Kumar & T-Series In association with Emmay ");
        songMap.put("songImg", String.valueOf(R.drawable.img_3));
        songMap.put("song","https://abulk77912.000webhostapp.com/song/song_8.mp3");
        songList.add(songMap);


        songMap = new HashMap<>();
        songMap.put("title", " O SAKI SAKI | Batla Hous");
        songMap.put("description", "Nora Fatehi, Tanishk B,Neha");
        songMap.put("songImg", String.valueOf(R.drawable.img_3));
        songMap.put("song","https://abulk77912.000webhostapp.com/song/song_9.mp3");
        songList.add(songMap);




        songMap = new HashMap<>();
        songMap.put("title", "Manike Full Video Song ");
        songMap.put("description", " Nora Fatehi, Sidharth Malhotra | Thank God");
        songMap.put("songImg", String.valueOf(R.drawable.img_3));
        songMap.put("song","https://abulk77912.000webhostapp.com/song/song_10.mp3");
        songList.add(songMap);




        songMap = new HashMap<>();
        songMap.put("title", "ZAALIM Nora Fatehi ");
        songMap.put("description", "Abderafia El Abdioui | Bhushan K");
        songMap.put("songImg", String.valueOf(R.drawable.img_3));
        songMap.put("song","https://abulk77912.000webhostapp.com/song/song_11.mp3");
        songList.add(songMap);



        songMap = new HashMap<>();
        songMap.put("title", "Dhushor Shomoy || ধূসর সময় ");
        songMap.put("description", "Artcell");
        songMap.put("songImg", String.valueOf(R.drawable.img_3));
        songMap.put("song","https://abulk77912.000webhostapp.com/song/song_12.mp3");
        songList.add(songMap);



        songMap = new HashMap<>();
        songMap.put("title", "Dhushor Shomoy || ধূসর সময় ");
        songMap.put("description", "Artcell");
        songMap.put("songImg", String.valueOf(R.drawable.img_3));
        songMap.put("song","https://abulk77912.000webhostapp.com/song/song_13.mp3");
        songList.add(songMap);


        songMap = new HashMap<>();
        songMap.put("title", "Dhushor Shomoy || ধূসর সময় ");
        songMap.put("description", "Artcell");
        songMap.put("songImg", String.valueOf(R.drawable.img_3));
        songMap.put("song","");
        songList.add(songMap);




        songMap = new HashMap<>();
        songMap.put("title", "Dhushor Shomoy || ধূসর সময় ");
        songMap.put("description", "Artcell");
        songMap.put("songImg", String.valueOf(R.drawable.img_3));
        songMap.put("song","");
        songList.add(songMap);



        songMap = new HashMap<>();
        songMap.put("title", "Dhushor Shomoy || ধূসর সময় ");
        songMap.put("description", "Artcell");
        songMap.put("songImg", String.valueOf(R.drawable.img_3));
        songMap.put("song","");
        songList.add(songMap);









    } // loadArtcellAlbum end here ============
//====================================================================================================================//
//********************************************************************************************************************//
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

 public void loadShironamhinAlbum() {

        songList.clear();

        songMap = new HashMap<>();
        songMap.put("title", "আল্লাহর_নৈকট্য_পাওয়ার");
        songMap.put("description", "আল্লাহর_নৈকট্য_পাওয়ার_মাধ্যম___মিজানুর_রহমান_আজহারি");
        songMap.put("songImg", String.valueOf(R.drawable.img_2));
        songMap.put("song","https://abulk77912.000webhostapp.com/song/Mizanur%20Rahman_1.m4a");
        songList.add(songMap);

        songMap = new HashMap<>();
        songMap.put("title", "Abar Hashimukh");
        songMap.put("description", "Shironamhin");
        songMap.put("songImg", String.valueOf(R.drawable.img_2));
        songMap.put("song","https://abulk77912.000webhostapp.com/song/song_15.m4a");
        songList.add(songMap);

     songMap = new HashMap<>();
     songMap.put("title", "Ei Obelay");
     songMap.put("description", "Shironamhin");
     songMap.put("songImg", String.valueOf(R.drawable.img_2));
     songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
     songList.add(songMap);

     songMap = new HashMap<>();
     songMap.put("title", "Abar Hashimukh");
     songMap.put("description", "Shironamhin");
     songMap.put("songImg", String.valueOf(R.drawable.img_2));
     songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
     songList.add(songMap);

     songMap = new HashMap<>();
     songMap.put("title", "Ei Obelay");
     songMap.put("description", "Shironamhin");
     songMap.put("songImg", String.valueOf(R.drawable.img_2));
     songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
     songList.add(songMap);

     songMap = new HashMap<>();
     songMap.put("title", "Abar Hashimukh");
     songMap.put("description", "Shironamhin");
     songMap.put("songImg", String.valueOf(R.drawable.img_2));
     songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
     songList.add(songMap);

     songMap = new HashMap<>();
     songMap.put("title", "Ei Obelay");
     songMap.put("description", "Shironamhin");
     songMap.put("songImg", String.valueOf(R.drawable.img_2));
     songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
     songList.add(songMap);

     songMap = new HashMap<>();
     songMap.put("title", "Abar Hashimukh");
     songMap.put("description", "Shironamhin");
     songMap.put("songImg", String.valueOf(R.drawable.img_2));
     songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
     songList.add(songMap);

     songMap = new HashMap<>();
     songMap.put("title", "Ei Obelay");
     songMap.put("description", "Shironamhin");
     songMap.put("songImg", String.valueOf(R.drawable.img_2));
     songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
     songList.add(songMap);

     songMap = new HashMap<>();
     songMap.put("title", "Abar Hashimukh");
     songMap.put("description", "Shironamhin");
     songMap.put("songImg", String.valueOf(R.drawable.img_2));
     songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
     songList.add(songMap);

     songMap = new HashMap<>();
     songMap.put("title", "Ei Obelay");
     songMap.put("description", "Shironamhin");
     songMap.put("songImg", String.valueOf(R.drawable.img_2));
     songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
     songList.add(songMap);

     songMap = new HashMap<>();
     songMap.put("title", "Abar Hashimukh");
     songMap.put("description", "Shironamhin");
     songMap.put("songImg", String.valueOf(R.drawable.img_2));
     songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
     songList.add(songMap);

     


    } // loadArtcellAlbum end here
//====================================================================================================================//
//********************************************************************************************************************//
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
public void loadAlbum1() {

    songList.clear();

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_4));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/Sheikh%20Ahmadullah_1.m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_4));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/Sheikh%20Ahmadullah_2.m4a");
    songList.add(songMap);


    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_4));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_4));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_4));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_4));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_4));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_4));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_4));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_4));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);


} // loadArtcellAlbum end here
//====================================================================================================================//
//********************************************************************************************************************//
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

    public void loadAlbum2() {

        songList.clear();

        songMap = new HashMap<>();
        songMap.put("title", "Ei Obelay");
        songMap.put("description", "Shironamhin");
        songMap.put("songImg", String.valueOf(R.drawable.img_5));
        songMap.put("song","https://abulk77912.000webhostapp.com/song/Abrarul%20Haque%20Asif_1.m4a");
        songList.add(songMap);

        songMap = new HashMap<>();
        songMap.put("title", "Abar Hashimukh");
        songMap.put("description", "Shironamhin");
        songMap.put("songImg", String.valueOf(R.drawable.img_5));
        songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
        songList.add(songMap);

        songMap = new HashMap<>();
        songMap.put("title", "Ei Obelay");
        songMap.put("description", "Shironamhin");
        songMap.put("songImg", String.valueOf(R.drawable.img_5));
        songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
        songList.add(songMap);

        songMap = new HashMap<>();
        songMap.put("title", "Abar Hashimukh");
        songMap.put("description", "Shironamhin");
        songMap.put("songImg", String.valueOf(R.drawable.img_5));
        songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
        songList.add(songMap);

        songMap = new HashMap<>();
        songMap.put("title", "Ei Obelay");
        songMap.put("description", "Shironamhin");
        songMap.put("songImg", String.valueOf(R.drawable.img_5));
        songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
        songList.add(songMap);

        songMap = new HashMap<>();
        songMap.put("title", "Abar Hashimukh");
        songMap.put("description", "Shironamhin");
        songMap.put("songImg", String.valueOf(R.drawable.img_5));
        songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
        songList.add(songMap);

        songMap = new HashMap<>();
        songMap.put("title", "Ei Obelay");
        songMap.put("description", "Shironamhin");
        songMap.put("songImg", String.valueOf(R.drawable.img_5));
        songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
        songList.add(songMap);

        songMap = new HashMap<>();
        songMap.put("title", "Abar Hashimukh");
        songMap.put("description", "Shironamhin");
        songMap.put("songImg", String.valueOf(R.drawable.img_5));
        songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
        songList.add(songMap);

        songMap = new HashMap<>();
        songMap.put("title", "Ei Obelay");
        songMap.put("description", "Shironamhin");
        songMap.put("songImg", String.valueOf(R.drawable.img_5));
        songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
        songList.add(songMap);

        songMap = new HashMap<>();
        songMap.put("title", "Abar Hashimukh");
        songMap.put("description", "Shironamhin");
        songMap.put("songImg", String.valueOf(R.drawable.img_5));
        songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
        songList.add(songMap);




    } // loadArtcellAlbum end here
//====================================================================================================================//
//********************************************************************************************************************//
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
public void loadAlbum3() {

    songList.clear();

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_6));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/Mufti%20Nazrul%20Islam_1.mp3");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_6));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/Mufti%20Nazrul%20Islam_2.m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_6));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_6));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);


    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_6));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_6));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_6));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_6));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_6));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_6));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);


} // loadArtcellAlbum end here
//====================================================================================================================//
//********************************************************************************************************************//
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
public void loadAlbum4() {

    songList.clear();

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_7));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/Tariq%20Jamil_2.mp3");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_7));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/Tariq%20Jamil_1.mp3");
    songList.add(songMap);


    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_7));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_7));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_7));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_7));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_7));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_7));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);


    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_7));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_7));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);


} // loadArtcellAlbum end here
//====================================================================================================================//
//********************************************************************************************************************//
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
public void loadAlbum5() {

    songList.clear();

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_8));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/James_1.mp3");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_8));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/James_2.mp3");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_8));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_8));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_8));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_8));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);


    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_8));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_8));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_8));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_8));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_8));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_8));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_8));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_8));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);


} // loadArtcellAlbum end here
//====================================================================================================================//
//********************************************************************************************************************//
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
public void loadAlbum6() {

    songList.clear();

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_9));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/Mainul%20Ahsan%20Noble_1.mp3");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_9));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/Mainul%20Ahsan%20Noble_2.mp3");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_9));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_9));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_9));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_9));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);


    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_9));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_9));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Ei Obelay");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_9));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_3(128k).m4a");
    songList.add(songMap);

    songMap = new HashMap<>();
    songMap.put("title", "Abar Hashimukh");
    songMap.put("description", "Shironamhin");
    songMap.put("songImg", String.valueOf(R.drawable.img_9));
    songMap.put("song","https://abulk77912.000webhostapp.com/song/song_5.m4a");
    songList.add(songMap);


} // loadArtcellAlbum end here
//====================================================================================================================//
//********************************************************************************************************************//
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//





////===============================================================================================
}