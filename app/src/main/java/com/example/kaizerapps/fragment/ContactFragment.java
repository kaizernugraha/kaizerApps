package com.example.kaizerapps.fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.kaizerapps.R;


// 10116336 KAIZER NUGRAHA IF-8  8/14/2019
public class ContactFragment extends Fragment {


    public ContactFragment() {
        // Required empty public constructor
    }

    public static ContactFragment newInstance() {
        return new ContactFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        Button btn_telp =  view.findViewById(R.id.btn_telp);
        btn_telp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_telp:
                        String telp = "081990539091";
                        Intent telpintent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+telp));
                        startActivity(telpintent);
                        break;
                }
            }
        });

        Button btn_gmail =  view.findViewById(R.id.btn_gmail);
        btn_gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_gmail:
                        String gmail = "https://mail.google.com/mail/u/0/?ogbl#inbox";
                        Intent gmailintent = new Intent(Intent.ACTION_VIEW, Uri.parse(gmail));
                        startActivity(gmailintent);
                        break;
                }
            }
        });



        Button btn_wa =  view.findViewById(R.id.btn_wa);
        btn_wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_wa:
                        String wa = "https://api.whatsapp.com/send?phone=6281990539091";
                        Intent waintent = new Intent(Intent.ACTION_VIEW, Uri.parse(wa));
                        startActivity(waintent);
                        break;
                }
            }
        });

        Button btn_twitter =  view.findViewById(R.id.btn_youtube);
        btn_twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_youtube:
                        String twitter = "https://www.youtube.com/channel/UCzoO2RVG4FHLVEIb0W1QNOg?view_as=subscriber";
                        Intent twitterintent = new Intent(Intent.ACTION_VIEW, Uri.parse(twitter));
                        startActivity(twitterintent);
                        break;
                }
            }
        });

        Button btn_ig =  view.findViewById(R.id.btn_ig);
        btn_ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_ig:
                        String ig = "https://www.instagram.com/kaizer_nugraha/";
                        Intent igintent = new Intent(Intent.ACTION_VIEW, Uri.parse(ig));
                        startActivity(igintent);
                        break;
                }
            }
        });

        Button btn_fb =  view.findViewById(R.id.btn_fb);
        btn_fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_fb:
                        String fb = "https://web.facebook.com/yugiautis.squad";
                        Intent fbintent = new Intent(Intent.ACTION_VIEW, Uri.parse(fb));
                        startActivity(fbintent);
                        break;
                }
            }
        });


        return view;
    }

}
