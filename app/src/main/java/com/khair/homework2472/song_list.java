package com.khair.homework2472;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class song_list extends AppCompatActivity {

    public static ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

    boolean isPlayIcon = false;

    ListView listView;
    MediaPlayer mediaPlayer;
    ImageView imageView;
    public static String textViewk;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);


        listView = findViewById(R.id.listView);
        imageView=findViewById(R.id.image_1);
        textView2=findViewById(R.id.text);

        // Adapter কে পরিচয় করিয়ে দেওয়া হয়েছে এবং list এর মধ্যে set করে দেওয়া হয়েছে ।
        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);

        textView2.setText(""+textViewk);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                song_list.super.onBackPressed();
                mediaPlayer.release();
            }
        });




    }
   ///=============================================================================================





    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return arrayList.size();
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
            View myView = layoutInflater.inflate(R.layout.item2, parent, false);

            // পরিচয় করিয়ে দেওয়া হয়েছে ।
            TextView tvTitle = myView.findViewById(R.id.tvTitle);
            TextView tvDescription = myView.findViewById(R.id.tvDescription);
            ImageView tvSong = myView.findViewById(R.id.tvSong);
            ImageView imgPlay = myView.findViewById(R.id.imgPlay);

            // list থেকে data get করা হয়েছে ।
            HashMap<String, String> hashMap1 = arrayList.get(position);
            String title = hashMap1.get("title");
            String description = hashMap1.get("description");
            String songImg = hashMap1.get("songImg");
            String song = hashMap1.get("song");

            // data list item এ set করে দেওয়া হয়েছে ।
            tvTitle.setText(title);
            tvDescription.setText(description);
            tvSong.setImageResource(Integer.parseInt(songImg));



            // onClick লেখা হয়েছে ।
            imgPlay.setOnClickListener(v -> {

                if (imgPlay.getTag() != null && imgPlay.getTag().toString().contains("NOT_PLAYING")) {
                    if (mediaPlayer != null) mediaPlayer.release();

                    mediaPlayer=new MediaPlayer();
                    try {
                        mediaPlayer.setDataSource(song);
                        mediaPlayer.prepare();
                        mediaPlayer.start();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    imgPlay.setTag("PLAYING_NOW");

                    // when complete the song
                    mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            imgPlay.setImageResource(R.drawable.img);
                            imgPlay.setTag("NOT_PLAYING");
                        }
                    });
                    isPlayIcon = false;

                } else {
                    if (mediaPlayer != null) mediaPlayer.release();
                    imgPlay.setImageResource(R.drawable.img);
                    imgPlay.setTag("NOT_PLAYING");
                    isPlayIcon = true;
                }
                // icon play reset
                for (int xx = 0; xx < listView.getChildCount(); xx++) {
                    View xxView = listView.getChildAt(xx);
                    ImageView xxImageView = xxView.findViewById(R.id.imgPlay);
                    xxImageView.setImageResource(R.drawable.img);
                }
                if (!isPlayIcon){
                    imgPlay.setImageResource(R.drawable.img_1);
                }

            });


            return myView;
        }


    } // MyAdapter end here =================




//==================================================================================================
}