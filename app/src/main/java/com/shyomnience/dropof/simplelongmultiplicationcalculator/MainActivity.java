package com.shyomnience.dropof.simplelongmultiplicationcalculator;

//import com.google.android.gms.ads.AdListener;
//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.InterstitialAd;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private AdView mAdView;
    private Button btnFullscreenAd;

    private FirebaseAnalytics mFirebaseAnalytics;

    int screenWidth;
    int screenHeight;
    int topGap;
    static int step;
    public static int hei;
    public static int wid;

    static int res1A;
    static int res2A;
    static int res3A;
    static int res4A;
    static int res5A;
    static int res6A;
    static int res7A;

    static int res1C;
    static int res2C;
    static int res3C;
    static int res4C;
    static int res5C;
    static int res6C;
    static int res7C;

    static int res1D;
    static int res2D;
    static int res3D;
    static int res4D;
    static int res5D;
    static int res6D;
    static int res7D;

    static int res1E;
    static int res2E;
    static int res3E;
    static int res4E;
    static int res5E;
    static int res6E;
    static int res7E;

    static int res1F;
    static int res2F;
    static int res3F;
    static int res4F;
    static int res5F;
    static int res6F;
    static int res7F;

    static int res1G;
    static int res2G;
    static int res3G;
    static int res4G;
    static int res5G;
    static int res6G;
    static int res7G;

    Thread ourThread = null;
    SurfaceHolder ourHolder;
    volatile boolean calculating;
    Paint paint;
    Canvas canvas;

    private Button equalsBut;
    private Button areYouSure;
    private Button second;
    private Button third;
    private Button fourth;
    private Button fifth;
    private Button sixth;
    private Button repeat;
    private Button seventh;

    private TextView stepCount;

    private TextView topE;
    private TextView bottE;

    private TextView top;
    private TextView top2;
    private TextView top3;
    private TextView top4;
    private TextView top5;
    private TextView top6;

    private TextView bott;
    private TextView bott2;
    private TextView bott3;
    private TextView bott4;
    private TextView bott5;
    private TextView bott6;

    private TextView fst1;
    private TextView fst2;
    private TextView fst3;
    private TextView fst4;
    private TextView fst5;
    private TextView fst6;
    private TextView fst7;

    private TextView scnd1;
    private TextView scnd2;
    private TextView scnd3;
    private TextView scnd4;
    private TextView scnd5;
    private TextView scnd6;
    private TextView scnd7;
    private TextView scnd8;

    private TextView trd1;
    private TextView trd2;
    private TextView trd3;
    private TextView trd4;
    private TextView trd5;
    private TextView trd6;
    private TextView trd7;
    private TextView trd8;
    private TextView trd9;

    private TextView frth1;
    private TextView frth2;
    private TextView frth3;
    private TextView frth4;
    private TextView frth5;
    private TextView frth6;
    private TextView frth7;
    private TextView frth8;
    private TextView frth9;
    private TextView frth10;

    private TextView ffth1;
    private TextView ffth2;
    private TextView ffth3;
    private TextView ffth4;
    private TextView ffth5;
    private TextView ffth6;
    private TextView ffth7;
    private TextView ffth8;
    private TextView ffth9;
    private TextView ffth10;
    private TextView ffth11;

    private TextView sxth1;
    private TextView sxth2;
    private TextView sxth3;
    private TextView sxth4;
    private TextView sxth5;
    private TextView sxth6;
    private TextView sxth7;
    private TextView sxth8;
    private TextView sxth9;
    private TextView sxth10;
    private TextView sxth11;
    private TextView sxth12;

    private TextView car11;
    private TextView car12;
    private TextView car13;
    private TextView car14;
    private TextView car15;

    private TextView car21;
    private TextView car22;
    private TextView car23;
    private TextView car24;
    private TextView car25;

    private TextView car31;
    private TextView car32;
    private TextView car33;
    private TextView car34;
    private TextView car35;

    private TextView car41;
    private TextView car42;
    private TextView car43;
    private TextView car44;
    private TextView car45;

    private TextView car51;
    private TextView car52;
    private TextView car53;
    private TextView car54;
    private TextView car55;

    private TextView car61;
    private TextView car62;
    private TextView car63;
    private TextView car64;
    private TextView car65;

    private TextView ans1;
    private TextView ans2;
    private TextView ans3;
    private TextView ans4;
    private TextView ans5;
    private TextView ans6;
    private TextView ans7;
    private TextView ans8;
    private TextView ans9;
    private TextView ans10;
    private TextView ans11;
    private TextView ans12;
    private TextView ans13;

    private TextView add2;
    private TextView add3;
    private TextView add4;
    private TextView add5;
    private TextView add6;
    private TextView add7;
    private TextView add8;
    private TextView add9;
    private TextView add10;
    private TextView add11;

    private ImageView carln1;
    private ImageView carln2;
    private ImageView carln3;
    private ImageView carln4;
    private ImageView carln5;
    private ImageView carln6;

    public ImageView topline;
    public ImageView bottline;

    public ImageView addhor;
    public ImageView addver;

    public ImageView arrowbod;
    public ImageView arrowheadleft;
    public ImageView arrowheadright;

    public ImageView bottlineMove;

    public Animation bottlineMovement;

    public ImageView timesleftdown;
    public ImageView timesleftup;

    public Bitmap bmp1;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        //  create a full screen window
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mAdView = (AdView) findViewById(R.id.Banner_Long_Calc);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest2);

        //mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);


        btnFullscreenAd = (Button) findViewById(R.id.btn_fullscreen_ad);
        btnFullscreenAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        //adapt the image to the size of the display
        Display displayf = getWindowManager().getDefaultDisplay();
        Point sizef = new Point();
        displayf.getSize(sizef);
        Bitmap bmp = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(
                getResources(), R.drawable.kids), sizef.x, sizef.y, true);

        // fill the background ImageView with the resized image
        ImageView iv_background = (ImageView) findViewById(R.id.iv_background);
        iv_background.setImageBitmap(bmp);
        screenWidth = sizef.x;
        screenHeight = sizef.y;
        topGap = screenHeight / 20;


        step = 0;
        res1A = 0;
        res2A = 0;
        res3A = 0;
        res4A = 0;
        res5A = 0;
        res6A = 0;
        res7A = 0;

        res1C = 0;
        res2C = 0;
        res3C = 0;
        res4C = 0;
        res5C = 0;
        res6C = 0;
        res7C = 0;

        res1D = 0;
        res2D = 0;
        res3D = 0;
        res4D = 0;
        res5D = 0;
        res6D = 0;
        res7D = 0;

        res1E = 0;
        res2E = 0;
        res3E = 0;
        res4E = 0;
        res5E = 0;
        res6E = 0;
        res7E = 0;

        res1F = 0;
        res2F = 0;
        res3F = 0;
        res4F = 0;
        res5F = 0;
        res6F = 0;
        res7F = 0;

        res1G = 0;
        res2G = 0;
        res3G = 0;
        res4G = 0;
        res5G = 0;
        res6G = 0;
        res7G = 0;


        equalsBut = (Button) findViewById(R.id.equals);
        areYouSure = (Button) findViewById(R.id.areYouSure);
        second = (Button) findViewById(R.id.second);
        third = (Button) findViewById(R.id.third);
        fourth = (Button) findViewById(R.id.fourth);
        fifth = (Button) findViewById(R.id.fifth);
        sixth = (Button) findViewById(R.id.sixth);
        repeat = (Button) findViewById(R.id.repeat);
        seventh = (Button) findViewById(R.id.practice);

        areYouSure.setVisibility(View.INVISIBLE);
        areYouSure.setText("reset");
        second.setVisibility(View.INVISIBLE);
        third.setVisibility(View.INVISIBLE);
        fourth.setVisibility(View.INVISIBLE);
        fifth.setVisibility(View.INVISIBLE);
        sixth.setVisibility(View.INVISIBLE);
        repeat.setVisibility(View.INVISIBLE);
        repeat.setText(("repeat?"));
        seventh.setVisibility(View.VISIBLE);


        stepCount = (TextView) findViewById(R.id.stepCount);

        topE = (EditText) findViewById(R.id.topE);
        bottE = (EditText) findViewById(R.id.bottE);

        top = (EditText) findViewById(R.id.top);
        top2 = (EditText) findViewById(R.id.top2);
        top3 = (EditText) findViewById(R.id.top3);
        top4 = (EditText) findViewById(R.id.top4);
        top5 = (EditText) findViewById(R.id.top5);
        top6 = (EditText) findViewById(R.id.top6);

        bott = (EditText) findViewById(R.id.bott);
        bott2 = (EditText) findViewById(R.id.bott2);
        bott3 = (EditText) findViewById(R.id.bott3);
        bott4 = (EditText) findViewById(R.id.bott4);
        bott5 = (EditText) findViewById(R.id.bott5);
        bott6 = (EditText) findViewById(R.id.bott6);

        fst1 = (TextView) findViewById(R.id.fst1);
        fst2 = (TextView) findViewById(R.id.fst2);
        fst3 = (TextView) findViewById(R.id.fst3);
        fst4 = (TextView) findViewById(R.id.fst4);
        fst5 = (TextView) findViewById(R.id.fst5);
        fst6 = (TextView) findViewById(R.id.fst6);
        fst7 = (TextView) findViewById(R.id.fst7);


        scnd1 = (TextView) findViewById(R.id.scnd1);
        scnd2 = (TextView) findViewById(R.id.scnd2);
        scnd3 = (TextView) findViewById(R.id.scnd3);
        scnd4 = (TextView) findViewById(R.id.scnd4);
        scnd5 = (TextView) findViewById(R.id.scnd5);
        scnd6 = (TextView) findViewById(R.id.scnd6);
        scnd7 = (TextView) findViewById(R.id.scnd7);
        scnd8 = (TextView) findViewById(R.id.scnd8);

        trd1 = (TextView) findViewById(R.id.trd1);
        trd2 = (TextView) findViewById(R.id.trd2);
        trd3 = (TextView) findViewById(R.id.trd3);
        trd4 = (TextView) findViewById(R.id.trd4);
        trd5 = (TextView) findViewById(R.id.trd5);
        trd6 = (TextView) findViewById(R.id.trd6);
        trd7 = (TextView) findViewById(R.id.trd7);
        trd8 = (TextView) findViewById(R.id.trd8);
        trd9 = (TextView) findViewById(R.id.trd9);

        frth1 = (TextView) findViewById(R.id.frth1);
        frth2 = (TextView) findViewById(R.id.frth2);
        frth3 = (TextView) findViewById(R.id.frth3);
        frth4 = (TextView) findViewById(R.id.frth4);
        frth5 = (TextView) findViewById(R.id.frth5);
        frth6 = (TextView) findViewById(R.id.frth6);
        frth7 = (TextView) findViewById(R.id.frth7);
        frth8 = (TextView) findViewById(R.id.frth8);
        frth9 = (TextView) findViewById(R.id.frth9);
        frth10 = (TextView) findViewById(R.id.frth10);

        ffth1 = (TextView) findViewById(R.id.ffth1);
        ffth2 = (TextView) findViewById(R.id.ffth2);
        ffth3 = (TextView) findViewById(R.id.ffth3);
        ffth4 = (TextView) findViewById(R.id.ffth4);
        ffth5 = (TextView) findViewById(R.id.ffth5);
        ffth6 = (TextView) findViewById(R.id.ffth6);
        ffth7 = (TextView) findViewById(R.id.ffth7);
        ffth8 = (TextView) findViewById(R.id.ffth8);
        ffth9 = (TextView) findViewById(R.id.ffth9);
        ffth10 = (TextView) findViewById(R.id.ffth10);
        ffth11 = (TextView) findViewById(R.id.ffth11);

        sxth1 = (TextView) findViewById(R.id.sxth1);
        sxth2 = (TextView) findViewById(R.id.sxth2);
        sxth3 = (TextView) findViewById(R.id.sxth3);
        sxth4 = (TextView) findViewById(R.id.sxth4);
        sxth5 = (TextView) findViewById(R.id.sxth5);
        sxth6 = (TextView) findViewById(R.id.sxth6);
        sxth7 = (TextView) findViewById(R.id.sxth7);
        sxth8 = (TextView) findViewById(R.id.sxth8);
        sxth9 = (TextView) findViewById(R.id.sxth9);
        sxth10 = (TextView) findViewById(R.id.sxth10);
        sxth11 = (TextView) findViewById(R.id.sxth11);
        sxth12 = (TextView) findViewById(R.id.sxth12);

        car11 = (TextView) findViewById(R.id.car11);
        car12 = (TextView) findViewById(R.id.car12);
        car13 = (TextView) findViewById(R.id.car13);
        car14 = (TextView) findViewById(R.id.car14);
        car15 = (TextView) findViewById(R.id.car15);
        car21 = (TextView) findViewById(R.id.car21);
        car22 = (TextView) findViewById(R.id.car22);
        car23 = (TextView) findViewById(R.id.car23);
        car24 = (TextView) findViewById(R.id.car24);
        car25 = (TextView) findViewById(R.id.car25);
        car31 = (TextView) findViewById(R.id.car31);
        car32 = (TextView) findViewById(R.id.car32);
        car33 = (TextView) findViewById(R.id.car33);
        car34 = (TextView) findViewById(R.id.car34);
        car35 = (TextView) findViewById(R.id.car35);
        car41 = (TextView) findViewById(R.id.car41);
        car42 = (TextView) findViewById(R.id.car42);
        car43 = (TextView) findViewById(R.id.car43);
        car44 = (TextView) findViewById(R.id.car44);
        car45 = (TextView) findViewById(R.id.car45);
        car51 = (TextView) findViewById(R.id.car51);
        car52 = (TextView) findViewById(R.id.car52);
        car53 = (TextView) findViewById(R.id.car53);
        car54 = (TextView) findViewById(R.id.car54);
        car55 = (TextView) findViewById(R.id.car55);
        car61 = (TextView) findViewById(R.id.car61);
        car62 = (TextView) findViewById(R.id.car62);
        car63 = (TextView) findViewById(R.id.car63);
        car64 = (TextView) findViewById(R.id.car64);
        car65 = (TextView) findViewById(R.id.car65);

        ans1 = (TextView) findViewById(R.id.ans1);
        ans2 = (TextView) findViewById(R.id.ans2);
        ans3 = (TextView) findViewById(R.id.ans3);
        ans4 = (TextView) findViewById(R.id.ans4);
        ans5 = (TextView) findViewById(R.id.ans5);
        ans6 = (TextView) findViewById(R.id.ans6);
        ans7 = (TextView) findViewById(R.id.ans7);
        ans8 = (TextView) findViewById(R.id.ans8);
        ans9 = (TextView) findViewById(R.id.ans9);
        ans10 = (TextView) findViewById(R.id.ans10);
        ans11 = (TextView) findViewById(R.id.ans11);
        ans12 = (TextView) findViewById(R.id.ans12);
        ans13 = (TextView) findViewById(R.id.ans13);

        add2 = (TextView) findViewById(R.id.add2);
        add3 = (TextView) findViewById(R.id.add3);
        add4 = (TextView) findViewById(R.id.add4);
        add5 = (TextView) findViewById(R.id.add5);
        add6 = (TextView) findViewById(R.id.add6);
        add7 = (TextView) findViewById(R.id.add7);
        add8 = (TextView) findViewById(R.id.add8);
        add9 = (TextView) findViewById(R.id.add9);
        add10 = (TextView) findViewById(R.id.add10);
        add11 = (TextView) findViewById(R.id.add11);

        carln1 = (ImageView) findViewById(R.id.carln1);
        carln2 = (ImageView) findViewById(R.id.carln2);
        carln3 = (ImageView) findViewById(R.id.carln3);
        carln4 = (ImageView) findViewById(R.id.carln4);
        carln5 = (ImageView) findViewById(R.id.carln5);
        carln6 = (ImageView) findViewById(R.id.carln6);

        topline = (ImageView) findViewById(R.id.topline);
        bottline = (ImageView) findViewById(R.id.bottline);

        addhor = (ImageView) findViewById(R.id.addhor);
        addver = (ImageView) findViewById(R.id.addver);

        timesleftdown = (ImageView) findViewById(R.id.timesleftdown);
        timesleftup = (ImageView) findViewById(R.id.timesleftup);


        arrowbod = (ImageView) findViewById(R.id.arrowbod);

        topE.setVisibility(View.INVISIBLE);
        bottE.setVisibility(View.INVISIBLE);

        add2.setText("");
        add3.setText("");
        add4.setText("");
        add5.setText("");
        add6.setText("");
        add7.setText("");
        add8.setText("");
        add9.setText("");
        add10.setText("");
        add11.setText("");

        ans1.setText("");
        ans2.setText("");
        ans3.setText("");
        ans4.setText("");
        ans5.setText("");
        ans6.setText("");
        ans7.setText("");
        ans8.setText("");
        ans9.setText("");
        ans10.setText("");
        ans11.setText("");
        ans12.setText("");

        ans1.setVisibility(View.INVISIBLE);
        ans2.setVisibility(View.INVISIBLE);
        ans3.setVisibility(View.INVISIBLE);
        ans4.setVisibility(View.INVISIBLE);
        ans5.setVisibility(View.INVISIBLE);
        ans6.setVisibility(View.INVISIBLE);
        ans7.setVisibility(View.INVISIBLE);
        ans8.setVisibility(View.INVISIBLE);
        ans9.setVisibility(View.INVISIBLE);
        ans10.setVisibility(View.INVISIBLE);
        ans11.setVisibility(View.INVISIBLE);
        ans12.setVisibility(View.INVISIBLE);
        ans13.setVisibility(View.INVISIBLE);

        scnd1.setVisibility(View.INVISIBLE);

        trd1.setVisibility(View.INVISIBLE);
        trd2.setVisibility(View.INVISIBLE);

        frth1.setVisibility(View.INVISIBLE);
        frth2.setVisibility(View.INVISIBLE);
        frth3.setVisibility(View.INVISIBLE);

        ffth1.setVisibility(View.INVISIBLE);
        ffth2.setVisibility(View.INVISIBLE);
        ffth3.setVisibility(View.INVISIBLE);
        ffth4.setVisibility(View.INVISIBLE);

        sxth1.setVisibility(View.INVISIBLE);
        sxth2.setVisibility(View.INVISIBLE);
        sxth3.setVisibility(View.INVISIBLE);
        sxth4.setVisibility(View.INVISIBLE);
        sxth5.setVisibility(View.INVISIBLE);

        car11.setText("");
        car12.setText("");
        car13.setText("");
        car14.setText("");
        car15.setText("");

        car21.setText("");
        car22.setText("");
        car23.setText("");
        car24.setText("");
        car25.setText("");

        car31.setText("");
        car32.setText("");
        car33.setText("");
        car34.setText("");
        car35.setText("");

        car41.setText("");
        car42.setText("");
        car43.setText("");
        car44.setText("");
        car45.setText("");

        car51.setText("");
        car52.setText("");
        car53.setText("");
        car54.setText("");
        car55.setText("");

        car61.setText("");
        car62.setText("");
        car63.setText("");
        car64.setText("");
        car65.setText("");

        car11.setVisibility(View.INVISIBLE);
        car12.setVisibility(View.INVISIBLE);
        car13.setVisibility(View.INVISIBLE);
        car14.setVisibility(View.INVISIBLE);
        car15.setVisibility(View.INVISIBLE);

        car21.setVisibility(View.INVISIBLE);
        car22.setVisibility(View.INVISIBLE);
        car23.setVisibility(View.INVISIBLE);
        car24.setVisibility(View.INVISIBLE);
        car25.setVisibility(View.INVISIBLE);

        car31.setVisibility(View.INVISIBLE);
        car32.setVisibility(View.INVISIBLE);
        car33.setVisibility(View.INVISIBLE);
        car34.setVisibility(View.INVISIBLE);
        car35.setVisibility(View.INVISIBLE);

        car41.setVisibility(View.INVISIBLE);
        car42.setVisibility(View.INVISIBLE);
        car43.setVisibility(View.INVISIBLE);
        car44.setVisibility(View.INVISIBLE);
        car45.setVisibility(View.INVISIBLE);

        car51.setVisibility(View.INVISIBLE);
        car52.setVisibility(View.INVISIBLE);
        car53.setVisibility(View.INVISIBLE);
        car54.setVisibility(View.INVISIBLE);
        car55.setVisibility(View.INVISIBLE);

        car61.setVisibility(View.INVISIBLE);
        car62.setVisibility(View.INVISIBLE);
        car63.setVisibility(View.INVISIBLE);
        car64.setVisibility(View.INVISIBLE);
        car65.setVisibility(View.INVISIBLE);

        carln1.setVisibility(View.INVISIBLE);
        carln2.setVisibility(View.INVISIBLE);
        carln3.setVisibility(View.INVISIBLE);
        carln4.setVisibility(View.INVISIBLE);
        carln5.setVisibility(View.INVISIBLE);

        timesleftup.setVisibility(View.VISIBLE);
        timesleftdown.setVisibility(View.VISIBLE);


        first();
        magicHappens();
        moveBottlinefirst();
        addhor.setVisibility(View.INVISIBLE);
        addver.setVisibility(View.INVISIBLE);

        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                Toast.makeText(getApplicationContext(), "Ad is loaded!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdClosed() {
                Toast.makeText(getApplicationContext(), "Ad is closed!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                Toast.makeText(getApplicationContext(), "Ad failed to load! error code: " + errorCode, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdLeftApplication() {
                Toast.makeText(getApplicationContext(), "Ad left application!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdOpened() {
                Toast.makeText(getApplicationContext(), "Ad is opened!", Toast.LENGTH_SHORT).show();
            }
        });

    }


    public void first() {
        equalsBut.setVisibility(View.VISIBLE);
        reset();
        movearrowbodstart();
        moveStuffAround();
        timesleftup.setVisibility(View.VISIBLE);
        timesleftdown.setVisibility(View.VISIBLE);
        practice();

        if (fst1.length() == 0) {
            equalsBut.setText("equals");
            stepCount.setText("Start");

            equalsBut.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    if (stepCount.getText() == "Start") {

                        if (top.length() == 0 || bott.length() == 0) {
                            // display a short message to the screen if things go wrong
                            if (equalsBut.getText() == "reset") {

                            } else {
                                Toast.makeText(getApplicationContext(), "Enter one number at least on the rightmost top row and bottom row", Toast.LENGTH_LONG).show();
                            }

                        } else {

                            int topA = Integer.parseInt(top.getText().toString().trim());
                            int bottA = Integer.parseInt(bott.getText().toString().trim());

                            int res1A = topA * bottA;

                            //Split the results
                            int fst1A = res1A % 10; //2
                            int carA = res1A / 10;  //1

                            fst1.setText(String.valueOf(fst1A)); // line answer
                            //  magicHappens();
                            if (top2.length() == 0) {
                                if (bott2.length() != 0) {

                                    fst2.setText(String.valueOf(carA));
                                    second();

                                    moveBottlinesec();
                                    second.setVisibility(View.VISIBLE);
                                    equalsBut.setVisibility(View.INVISIBLE);
                                    step++;
                                    stepCount.setText("Step " + step);

                                } else {

                                    fst2.setText(String.valueOf(carA)); // line answer

                                    movearrowbodfirstans();
                                    stepCount.setText("done!");
                                    done();
                                    moveanssec();
                                    moveaddallrestcar();
                                    equalsBut.setText("reset");
                                    reset();
                                    repeat();
                                }
                            } else {
                                if (carA == 0) {

                                } else {
                                    car11.setText(String.valueOf(carA));
                                }// carry
                                step++;
                                stepCount.setText("Step " + step);
                                equalsBut.setText("next");

                            }


                        }
                    }

                    if (fst1.length() != 0) {

                        equalsBut.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {

                                if (stepCount.getText().equals("Step " + step)) {

                                    if (top2.length() == 0 || bott.length() == 0) {

                                        if (equalsBut.getText() == "reset") {

                                        } else {
                                            // display a short message to the screen if things go wrong
                                            Toast.makeText(getApplicationContext(), "Enter one number on the second rightmost> top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                        }
                                    } else {

                                        int top2A = Integer.parseInt(top2.getText().toString().trim());
                                        int bottA = Integer.parseInt(bott.getText().toString().trim());

                                        int res2A = top2A * bottA;

                                        //Split the results
                                        int fst2A = res2A % 10; //2
                                        int car2A = res2A / 10;  //1

                                        if (car11.length() == 0) {

                                        } else {
                                            int carOn = Integer.parseInt(car11.getText().toString().trim());

                                            fst2A = fst2A + carOn;
                                        }
                                        int newCar = fst2A / 10; //1
                                        fst2A %= 10; //2
                                        car2A = car2A + newCar;

                                        fst2.setText(String.valueOf(fst2A));

                                        if (top3.length() == 0) {
                                            if (bott2.length() != 0) {
                                                fst3.setText(String.valueOf(car2A));
                                                second();

                                                movearrowbodfirstans();
                                                moveBottlinesec();
                                                second.setVisibility(View.VISIBLE);
                                                equalsBut.setVisibility(View.INVISIBLE);
                                                step++;
                                                stepCount.setText("Step " + step);
                                            } else {
                                                fst3.setText(String.valueOf(car2A));
                                                stepCount.setText("done!");
                                                done();

                                                movearrowbodfirstans();

                                                moveanssec();
                                                equalsBut.setText("reset");
                                                reset();
                                            }
                                        } else {
                                            if (car2A == 0) {

                                            } else {
                                                car12.setText(String.valueOf(car2A));
                                            }
                                            step++;
                                            stepCount.setText("Step " + step);
                                        }


                                    }
                                }

                                if (fst2.length() != 0) {

                                    equalsBut.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

                                            if (stepCount.getText().equals("Step " + step)) {

                                                if (top3.length() == 0 || bott.length() == 0) {
                                                    if (equalsBut.getText() == "reset") {

                                                    } else {
                                                        // display a short message to the screen if things go wrong
                                                        Toast.makeText(getApplicationContext(), "Enter one number on the third right> top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                    }
                                                } else {

                                                    int top3A = Integer.parseInt(top3.getText().toString().trim());
                                                    int bottA = Integer.parseInt(bott.getText().toString().trim());

                                                    int res3A = top3A * bottA;

                                                    //Split the results
                                                    int fst3A = res3A % 10; //2
                                                    int car3A = res3A / 10;  //1
                                                    if (car12.length() == 0) {

                                                    } else {
                                                        int carOn = Integer.parseInt(car12.getText().toString().trim());

                                                        fst3A = fst3A + carOn;
                                                    }
                                                    int newCar = fst3A / 10; //1
                                                    fst3A %= 10; //2
                                                    car3A = car3A + newCar;

                                                    fst3.setText(String.valueOf(fst3A));

                                                    if (top4.length() == 0) {
                                                        if (bott2.length() != 0) {
                                                            fst4.setText(String.valueOf(car3A));
                                                            second();

                                                            movearrowbodfirstans();
                                                            moveBottlinesec();
                                                            second.setVisibility(View.VISIBLE);
                                                            equalsBut.setVisibility(View.INVISIBLE);
                                                            step++;
                                                            stepCount.setText("Step " + step);
                                                        } else {
                                                            fst4.setText(String.valueOf(car3A));
                                                            stepCount.setText("done!");
                                                            done();

                                                            movearrowbodfirstans();
                                                            moveanssec();

                                                            equalsBut.setText("reset");
                                                            reset();
                                                        }
                                                    } else {
                                                        if (car3A == 0) {

                                                        } else {
                                                            car13.setText(String.valueOf(car3A));
                                                        }
                                                        step++;
                                                        stepCount.setText("Step " + step);
                                                    }


                                                }
                                            }

                                            if (fst3.length() != 0) {

                                                equalsBut.setOnClickListener(new View.OnClickListener() {

                                                    @Override
                                                    public void onClick(View v) {

                                                        if (stepCount.getText().equals("Step " + step)) {

                                                            if (top4.length() == 0 || bott.length() == 0) {
                                                                if (equalsBut.getText() == "reset") {

                                                                } else {
                                                                    // display a short message to the screen if things go wrong
                                                                    Toast.makeText(getApplicationContext(), "Enter one number on the fourth top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                                }
                                                            } else {

                                                                int top4A = Integer.parseInt(top4.getText().toString().trim());
                                                                int bottA = Integer.parseInt(bott.getText().toString().trim());

                                                                int res4A = top4A * bottA;

                                                                //Split the results
                                                                int fst4A = res4A % 10; //2
                                                                int car4A = res4A / 10;  //1
                                                                if (car13.length() == 0) {

                                                                } else {
                                                                    int carOn = Integer.parseInt(car13.getText().toString().trim());
                                                                    fst4A = fst4A + carOn;
                                                                }
                                                                int newCar = fst4A / 10; //1
                                                                fst4A %= 10; //2
                                                                car4A = car4A + newCar;

                                                                fst4.setText(String.valueOf(fst4A));

                                                                if (top5.length() == 0) {
                                                                    if (bott2.length() != 0) {
                                                                        fst5.setText(String.valueOf(car4A));
                                                                        second();
                                                                        movearrowbodfirstans();

                                                                        moveBottlinesec();
                                                                        second.setVisibility(View.VISIBLE);
                                                                        equalsBut.setVisibility(View.INVISIBLE);
                                                                        step++;
                                                                        stepCount.setText("Step " + step);
                                                                    } else {
                                                                        fst5.setText(String.valueOf(car4A));
                                                                        stepCount.setText("done!");
                                                                        done();

                                                                        movearrowbodfirstans();
                                                                        moveanssec();
                                                                        equalsBut.setText("reset");
                                                                        reset();
                                                                    }
                                                                } else {
                                                                    if (car4A == 0) {

                                                                    } else {
                                                                        car14.setText(String.valueOf(car4A));
                                                                    }
                                                                    step++;
                                                                    stepCount.setText("Step " + step);
                                                                }


                                                            }
                                                        }

                                                        if (fst4.length() != 0) {

                                                            equalsBut.setOnClickListener(new View.OnClickListener() {

                                                                @Override
                                                                public void onClick(View v) {

                                                                    if (stepCount.getText().equals("Step " + step)) {

                                                                        if (top5.length() == 0 || bott.length() == 0) {
                                                                            if (equalsBut.getText() == "reset") {

                                                                            } else {
                                                                                // display a short message to the screen if things go wrong
                                                                                Toast.makeText(getApplicationContext(), "Enter one number on the fifth top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                                            }
                                                                        } else {

                                                                            int top5A = Integer.parseInt(top5.getText().toString().trim());
                                                                            int bottA = Integer.parseInt(bott.getText().toString().trim());

                                                                            int res5A = top5A * bottA;

                                                                            //Split the results
                                                                            int fst5A = res5A % 10; //2
                                                                            int car5A = res5A / 10;  //1
                                                                            if (car14.length() == 0) {

                                                                            } else {
                                                                                int carOn = Integer.parseInt(car14.getText().toString().trim());

                                                                                fst5A = fst5A + carOn;
                                                                            }
                                                                            int newCar = fst5A / 10; //1
                                                                            fst5A %= 10; //2
                                                                            car5A = car5A + newCar;

                                                                            fst5.setText(String.valueOf(fst5A));

                                                                            if (top6.length() == 0) {
                                                                                if (bott2.length() != 0) {
                                                                                    fst6.setText(String.valueOf(car5A));
                                                                                    second();
                                                                                    movearrowbodfirstans();

                                                                                    moveBottlinesec();
                                                                                    second.setVisibility(View.VISIBLE);
                                                                                    equalsBut.setVisibility(View.INVISIBLE);
                                                                                    step++;
                                                                                    stepCount.setText("Step " + step);
                                                                                } else {
                                                                                    fst6.setText(String.valueOf(car5A));
                                                                                    stepCount.setText("done!");
                                                                                    done();
                                                                                    movearrowbodfirstans();

                                                                                    moveanssec();

                                                                                    equalsBut.setText("reset");
                                                                                    reset();
                                                                                }
                                                                            } else {
                                                                                if (car5A == 0) {

                                                                                } else {
                                                                                    car15.setText(String.valueOf(car5A));
                                                                                }
                                                                                step++;
                                                                                stepCount.setText("Step " + step);
                                                                            }


                                                                        }
                                                                    }

                                                                    if (fst5.length() != 0) {

                                                                        equalsBut.setOnClickListener(new View.OnClickListener() {

                                                                            @Override
                                                                            public void onClick(View v) {

                                                                                if (stepCount.getText().equals("Step " + step)) {

                                                                                    if (top6.length() == 0 || bott.length() == 0) {
                                                                                        if (equalsBut.getText() == "reset") {

                                                                                        } else {
                                                                                            // display a short message to the screen if things go wrong
                                                                                            Toast.makeText(getApplicationContext(), "Enter one number on the last top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                                                        }
                                                                                    } else {

                                                                                        int top6A = Integer.parseInt(top6.getText().toString().trim());
                                                                                        int bottA = Integer.parseInt(bott.getText().toString().trim());

                                                                                        int res6A = top6A * bottA;

                                                                                        //Split the results
                                                                                        int fst6A = res6A % 10; //2
                                                                                        int car6A = res6A / 10;  //1
                                                                                        if (car15.length() == 0) {

                                                                                        } else {
                                                                                            int carOn = Integer.parseInt(car15.getText().toString().trim());
                                                                                            fst6A = fst6A + carOn;
                                                                                        }
                                                                                        int newCar = fst6A / 10; //1
                                                                                        fst6A %= 10; //2
                                                                                        car6A = car6A + newCar;

                                                                                        fst6.setText(String.valueOf(fst6A));

                                                                                        if (bott2.length() == 0) {
                                                                                            fst7.setText(String.valueOf(car6A));
                                                                                            stepCount.setText("done!");
                                                                                            done();
                                                                                            movearrowbodfirstans();

                                                                                            moveanssec();
                                                                                            equalsBut.setText("reset");
                                                                                            reset();
                                                                                        } else {
                                                                                            fst7.setText(String.valueOf(car6A));
                                                                                            second();
                                                                                            movearrowbodfirstans();
                                                                                            moveBottlinesec();
                                                                                            second.setVisibility(View.VISIBLE);
                                                                                            equalsBut.setVisibility(View.INVISIBLE);
                                                                                            step++;
                                                                                            stepCount.setText("Step " + step);

                                                                                            magicHappens();
                                                                                        }
                                                                                        magicHappens();
                                                                                    }
                                                                                    magicHappens();
                                                                                }
                                                                                magicHappens();
                                                                            }

                                                                        });

                                                                        magicHappens();
                                                                    }
                                                                    magicHappens();
                                                                }


                                                            });

                                                            magicHappens();
                                                        }
                                                        magicHappens();
                                                    }


                                                });

                                                magicHappens();
                                            }
                                            magicHappens();
                                        }


                                    });

                                    magicHappens();
                                }
                                magicHappens();
                            }


                        });


                    }
                    magicHappens();
                }


            });

            magicHappens();

        }
        magicHappens();
    }

    public void second() {

        if (scnd2.length() == 0) {

            second.setText("next");
            scnd1.setVisibility(View.VISIBLE);
            moveBottlinesec();

            second.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    if (top.length() == 0 || bott2.length() == 0) {
                        if (second.getText() == "reset") {

                        } else {
                            // display a short message to the screen if things go wrong
                            Toast.makeText(getApplicationContext(), "Enter one number at least on the rightmost top row and bottom row", Toast.LENGTH_LONG).show();
                        }
                    } else {

                        int topA = Integer.parseInt(top.getText().toString().trim());
                        int bott2A = Integer.parseInt(bott2.getText().toString().trim());

                        int res1A = topA * bott2A;

                        //Split the results
                        int scnd2A = res1A % 10; //2
                        int carA = res1A / 10;  //1

                        scnd2.setText(String.valueOf(scnd2A)); // line answer

                        if (top2.length() == 0) {
                            if (bott3.length() != 0) {
                                scnd3.setText(String.valueOf(carA)); // line answer
                                third();

                                moveBottlinethird();
                                third.setVisibility(View.VISIBLE);
                                equalsBut.setVisibility(View.INVISIBLE);
                                second.setVisibility(View.INVISIBLE);
                                step++;
                                stepCount.setText("Step " + step);

                            } else {
                                scnd3.setText(String.valueOf(carA));
                                stepCount.setText("done!");
                                done();
                                moveansthird();
                                moveaddsignsec();
                                moveaddallrestcar();
                                movearrowbodfirstans();
                                second.setText("reset");
                                reset();
                            }
                        } else {
                            if (carA == 0) {

                            } else {
                                car21.setText(String.valueOf(carA)); // carry
                            }
                            step++;
                            stepCount.setText("Step " + step);
                        }
                    }

                    if (scnd2.length() != 0) {

                        second.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {

                                if (stepCount.getText().equals("Step " + step)) {

                                    if (top2.length() == 0 || bott2.length() == 0) {
                                        if (second.getText() == "reset") {

                                        } else {
                                            // display a short message to the screen if things go wrong
                                            Toast.makeText(getApplicationContext(), "Enter one number on the second rightmost> top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                        }
                                    } else {

                                        int top2A = Integer.parseInt(top2.getText().toString().trim());
                                        int bott2A = Integer.parseInt(bott2.getText().toString().trim());

                                        int res2A = top2A * bott2A;

                                        //Split the results
                                        int scnd3A = res2A % 10; //2
                                        int car2A = res2A / 10;  //1
                                        if (car21.length() == 0) {

                                        } else {
                                            int carOn = Integer.parseInt(car21.getText().toString().trim());
                                            scnd3A = scnd3A + carOn;
                                        }
                                        int newCar = scnd3A / 10; //1
                                        scnd3A %= 10; //2
                                        car2A = car2A + newCar;


                                        scnd3.setText(String.valueOf(scnd3A));

                                        if (top3.length() == 0) {
                                            if (bott3.length() != 0) {
                                                scnd4.setText(String.valueOf(car2A)); // line answer
                                                third();

                                                movearrowbodsecans();
                                                moveBottlinethird();
                                                third.setVisibility(View.VISIBLE);
                                                equalsBut.setVisibility(View.INVISIBLE);
                                                second.setVisibility(View.INVISIBLE);
                                                step++;
                                                stepCount.setText("Step " + step);


                                            } else {
                                                scnd4.setText(String.valueOf(car2A));
                                                stepCount.setText("done!");
                                                done();
                                                moveaddsignsec();
                                                moveansthird();
                                                movearrowbodsecans();
                                                second.setText("reset");
                                                reset();
                                            }
                                        } else {
                                            if (car2A == 0) {

                                            } else {
                                                car22.setText(String.valueOf(car2A));
                                            }
                                            step++;
                                            stepCount.setText("Step " + step);
                                        }
                                    }
                                }

                                if (scnd3.length() != 0) {

                                    second.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

                                            if (stepCount.getText().equals("Step " + step)) {

                                                if (top3.length() == 0 || bott2.length() == 0) {
                                                    if (second.getText() == "reset") {

                                                    } else {
                                                        // display a short message to the screen if things go wrong
                                                        Toast.makeText(getApplicationContext(), "Enter one number on the third right> top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                    }
                                                } else {

                                                    int top3A = Integer.parseInt(top3.getText().toString().trim());
                                                    int bott2A = Integer.parseInt(bott2.getText().toString().trim());

                                                    int res3A = top3A * bott2A;

                                                    //Split the results
                                                    int scnd4A = res3A % 10; //2
                                                    int car3A = res3A / 10;  //1
                                                    if (car22.length() == 0) {

                                                    } else {
                                                        int carOn = Integer.parseInt(car22.getText().toString().trim());
                                                        scnd4A = scnd4A + carOn;
                                                    }
                                                    int newCar = scnd4A / 10; //1
                                                    scnd4A %= 10; //2
                                                    car3A = car3A + newCar;

                                                    scnd4.setText(String.valueOf(scnd4A));

                                                    if (top4.length() == 0) {
                                                        if (bott3.length() != 0) {
                                                            scnd5.setText(String.valueOf(car3A)); // line answer
                                                            third();

                                                            movearrowbodsecans();
                                                            moveBottlinethird();
                                                            third.setVisibility(View.VISIBLE);
                                                            equalsBut.setVisibility(View.INVISIBLE);
                                                            second.setVisibility(View.INVISIBLE);
                                                            step++;
                                                            stepCount.setText("Step " + step);


                                                        } else {
                                                            scnd5.setText(String.valueOf(car3A));
                                                            stepCount.setText("done!");
                                                            done();
                                                            moveaddsignsec();
                                                            moveansthird();
                                                            movearrowbodsecans();
                                                            second.setText("reset");
                                                            reset();
                                                        }
                                                    } else {
                                                        if (car3A == 0) {

                                                        } else {
                                                            car23.setText(String.valueOf(car3A));
                                                        }
                                                        step++;
                                                        stepCount.setText("Step " + step);
                                                    }
                                                }
                                            }

                                            if (scnd4.length() != 0) {

                                                second.setOnClickListener(new View.OnClickListener() {

                                                    @Override
                                                    public void onClick(View v) {

                                                        if (stepCount.getText().equals("Step " + step)) {

                                                            if (top4.length() == 0 || bott2.length() == 0) {
                                                                if (second.getText() == "reset") {

                                                                } else {
                                                                    // display a short message to the screen if things go wrong
                                                                    Toast.makeText(getApplicationContext(), "Enter one number on the fourth top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                                }
                                                            } else {

                                                                int top4A = Integer.parseInt(top4.getText().toString().trim());
                                                                int bott2A = Integer.parseInt(bott2.getText().toString().trim());

                                                                int res4A = top4A * bott2A;

                                                                //Split the results
                                                                int scnd5A = res4A % 10; //2
                                                                int car4A = res4A / 10;  //1
                                                                if (car23.length() == 0) {

                                                                } else {
                                                                    int carOn = Integer.parseInt(car23.getText().toString().trim());

                                                                    scnd5A = scnd5A + carOn;
                                                                }
                                                                int newCar = scnd5A / 10; //1
                                                                scnd5A %= 10; //2
                                                                car4A = car4A + newCar;

                                                                scnd5.setText(String.valueOf(scnd5A));

                                                                if (top5.length() == 0) {
                                                                    if (bott3.length() != 0) {
                                                                        scnd6.setText(String.valueOf(car4A)); // line answer
                                                                        third();

                                                                        moveBottlinethird();
                                                                        movearrowbodsecans();
                                                                        third.setVisibility(View.VISIBLE);
                                                                        equalsBut.setVisibility(View.INVISIBLE);
                                                                        second.setVisibility(View.INVISIBLE);
                                                                        step++;
                                                                        stepCount.setText("Step " + step);


                                                                    } else {
                                                                        scnd6.setText(String.valueOf(car4A));
                                                                        stepCount.setText("done!");
                                                                        done();
                                                                        moveaddsignsec();
                                                                        movearrowbodsecans();
                                                                        moveansthird();
                                                                        second.setText("reset");
                                                                        reset();
                                                                    }
                                                                } else {
                                                                    if (car4A == 0) {

                                                                    } else {
                                                                        car24.setText(String.valueOf(car4A));
                                                                    }
                                                                    step++;
                                                                    stepCount.setText("Step " + step);
                                                                }
                                                            }
                                                        }

                                                        if (scnd5.length() != 0) {

                                                            second.setOnClickListener(new View.OnClickListener() {

                                                                @Override
                                                                public void onClick(View v) {

                                                                    if (stepCount.getText().equals("Step " + step)) {

                                                                        if (top5.length() == 0 || bott2.length() == 0) {
                                                                            if (second.getText() == "reset") {

                                                                            } else {
                                                                                // display a short message to the screen if things go wrong
                                                                                Toast.makeText(getApplicationContext(), "Enter one number on the fourth top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                                            }
                                                                        } else {

                                                                            int top5A = Integer.parseInt(top5.getText().toString().trim());
                                                                            int bott2A = Integer.parseInt(bott2.getText().toString().trim());

                                                                            int res5A = top5A * bott2A;

                                                                            //Split the results
                                                                            int scnd6A = res5A % 10; //2
                                                                            int car5A = res5A / 10;  //1
                                                                            if (car24.length() == 0) {

                                                                            } else {
                                                                                int carOn = Integer.parseInt(car24.getText().toString().trim());
                                                                                scnd6A = scnd6A + carOn;
                                                                            }
                                                                            int newCar = scnd6A / 10; //1
                                                                            scnd6A %= 10; //2
                                                                            car5A = car5A + newCar;

                                                                            scnd6.setText(String.valueOf(scnd6A));

                                                                            if (top6.length() == 0) {
                                                                                if (bott3.length() != 0) {
                                                                                    scnd7.setText(String.valueOf(car5A)); // line answer
                                                                                    third();
                                                                                    movearrowbodsecans();

                                                                                    moveBottlinethird();
                                                                                    third.setVisibility(View.VISIBLE);
                                                                                    equalsBut.setVisibility(View.INVISIBLE);
                                                                                    second.setVisibility(View.INVISIBLE);
                                                                                    step++;
                                                                                    stepCount.setText("Step " + step);


                                                                                } else {
                                                                                    scnd7.setText(String.valueOf(car5A));
                                                                                    stepCount.setText("done!");
                                                                                    done();
                                                                                    moveaddsignsec();
                                                                                    movearrowbodsecans();
                                                                                    moveansthird();
                                                                                    second.setText("reset");
                                                                                    reset();
                                                                                }
                                                                            } else {
                                                                                if (car5A == 0) {

                                                                                } else {
                                                                                    car25.setText(String.valueOf(car5A));
                                                                                }
                                                                                step++;
                                                                                stepCount.setText("Step " + step);
                                                                            }
                                                                        }
                                                                    }

                                                                    if (scnd6.length() != 0) {

                                                                        second.setOnClickListener(new View.OnClickListener() {

                                                                            @Override
                                                                            public void onClick(View v) {

                                                                                if (stepCount.getText().equals("Step " + step)) {

                                                                                    if (top6.length() == 0 || bott2.length() == 0) {
                                                                                        if (second.getText() == "reset") {

                                                                                        } else {
                                                                                            // display a short message to the screen if things go wrong
                                                                                            Toast.makeText(getApplicationContext(), "Enter one number on the last top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                                                        }
                                                                                    } else {

                                                                                        int top6A = Integer.parseInt(top6.getText().toString().trim());
                                                                                        int bott2A = Integer.parseInt(bott2.getText().toString().trim());

                                                                                        int res6A = top6A * bott2A;

                                                                                        //Split the results
                                                                                        int scnd7A = res6A % 10; //2
                                                                                        int car6A = res6A / 10;  //1
                                                                                        if (car25.length() == 0) {

                                                                                        } else {
                                                                                            int carOn = Integer.parseInt(car25.getText().toString().trim());
                                                                                            scnd7A = scnd7A + carOn;
                                                                                        }
                                                                                        scnd7A %= 10; //2

                                                                                        scnd7.setText(String.valueOf(scnd7A));

                                                                                        if (bott3.length() == 0) {
                                                                                            scnd8.setText(String.valueOf(car6A));
                                                                                            stepCount.setText("done!");
                                                                                            done();
                                                                                            moveaddsignsec();
                                                                                            movearrowbodsecans();
                                                                                            moveansthird();
                                                                                            second.setText("reset");
                                                                                            reset();
                                                                                        } else {
                                                                                            scnd8.setText(String.valueOf(car6A));
                                                                                            third();


                                                                                            moveBottlinethird();
                                                                                            movearrowbodsecans();
                                                                                            second.setVisibility(View.INVISIBLE);
                                                                                            equalsBut.setVisibility(View.INVISIBLE);
                                                                                            third.setVisibility(View.VISIBLE);
                                                                                            step++;
                                                                                            stepCount.setText("Step " + step);

                                                                                            magicHappens();
                                                                                        }
                                                                                        magicHappens();
                                                                                    }
                                                                                    magicHappens();
                                                                                }
                                                                                magicHappens();
                                                                            }

                                                                        });

                                                                        magicHappens();
                                                                    }
                                                                    magicHappens();
                                                                }


                                                            });

                                                            magicHappens();
                                                        }
                                                        magicHappens();
                                                    }


                                                });

                                                magicHappens();
                                            }
                                            magicHappens();
                                        }


                                    });

                                    magicHappens();
                                }
                                magicHappens();
                            }


                        });

                        magicHappens();
                    }
                    magicHappens();
                }


            });
            magicHappens();
        }
        magicHappens();
    }

    public void third() {

        if (trd3.length() == 0) {

            third.setText("next");
            trd1.setVisibility(View.VISIBLE);
            trd2.setVisibility(View.VISIBLE);
            moveBottlinethird();

            third.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    if (top.length() == 0 || bott3.length() == 0) {
                        if (third.getText() == "reset") {

                        } else {
                            // display a short message to the screen if things go wrong
                            Toast.makeText(getApplicationContext(), "Enter one number at least on the rightmost top row and bottom row", Toast.LENGTH_LONG).show();
                        }
                    } else {

                        int topA = Integer.parseInt(top.getText().toString().trim());
                        int bott3A = Integer.parseInt(bott3.getText().toString().trim());

                        int res1A = topA * bott3A;

                        //Split the results
                        int trd3A = res1A % 10; //2
                        int carA = res1A / 10;  //1

                        trd3.setText(String.valueOf(trd3A)); // line answer

                        if (top2.length() == 0) {
                            if (bott4.length() != 0) {
                                trd4.setText(String.valueOf(carA)); // line answer
                                fourth();

                                moveBottlinefourth();


                                third.setVisibility(View.INVISIBLE);
                                fourth.setVisibility(View.VISIBLE);
                                equalsBut.setVisibility(View.INVISIBLE);
                                second.setVisibility(View.INVISIBLE);
                                step++;
                                stepCount.setText("Step " + step);

                            } else {
                                trd4.setText(String.valueOf(carA));
                                stepCount.setText("done!");
                                done();
                                moveansfourth();
                                moveaddallrestcar();
                                moveaddsignthird();
                                movearrowbodfirstans();
                                third.setText("reset");
                                reset();
                            }
                        } else {
                            if (carA == 0) {

                            } else {
                                car31.setText(String.valueOf(carA)); // carry
                            }
                            step++;

                            stepCount.setText("Step " + step);
                        }
                    }

                    if (trd3.length() != 0) {

                        third.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {

                                if (stepCount.getText().equals("Step " + step)) {

                                    if (top2.length() == 0 || bott3.length() == 0) {
                                        if (third.getText() == "reset") {

                                        } else {
                                            // display a short message to the screen if things go wrong
                                            Toast.makeText(getApplicationContext(), "Enter one number on the third rightmost> top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                        }
                                    } else {

                                        int top2A = Integer.parseInt(top2.getText().toString().trim());
                                        int bott3A = Integer.parseInt(bott3.getText().toString().trim());

                                        int res2A = top2A * bott3A;

                                        //Split the results
                                        int trd4A = res2A % 10; //2
                                        int car2A = res2A / 10;  //1
                                        if (car31.length() == 0) {

                                        } else {
                                            int carOn = Integer.parseInt(car31.getText().toString().trim());
                                            trd4A = trd4A + carOn;
                                        }
                                        int newCar = trd4A / 10; //1
                                        trd4A %= 10; //2
                                        car2A = car2A + newCar;

                                        trd4.setText(String.valueOf(trd4A));

                                        if (top3.length() == 0) {
                                            if (bott4.length() != 0) {
                                                trd5.setText(String.valueOf(car2A)); // line answer
                                                fourth();
                                                movearrowbodthirdans();

                                                moveBottlinefourth();
                                                third.setVisibility(View.INVISIBLE);
                                                fourth.setVisibility(View.VISIBLE);
                                                equalsBut.setVisibility(View.INVISIBLE);
                                                second.setVisibility(View.INVISIBLE);
                                                step++;
                                                stepCount.setText("Step " + step);


                                            } else {
                                                trd5.setText(String.valueOf(car2A));
                                                stepCount.setText("done!");
                                                done();
                                                moveansfourth();
                                                moveaddsignthird();
                                                movearrowbodthirdans();

                                                third.setText("reset");
                                                reset();
                                            }
                                        } else {
                                            if (car2A == 0) {

                                            } else {
                                                car32.setText(String.valueOf(car2A));
                                            }
                                            step++;
                                            stepCount.setText("Step " + step);
                                        }
                                    }
                                }

                                if (trd4.length() != 0) {

                                    third.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

                                            if (stepCount.getText().equals("Step " + step)) {

                                                if (top3.length() == 0 || bott3.length() == 0) {
                                                    if (third.getText() == "reset") {

                                                    } else {
                                                        // display a short message to the screen if things go wrong
                                                        Toast.makeText(getApplicationContext(), "Enter one number on the third right> top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                    }
                                                } else {

                                                    int top3A = Integer.parseInt(top3.getText().toString().trim());
                                                    int bott3A = Integer.parseInt(bott3.getText().toString().trim());

                                                    int res3A = top3A * bott3A;

                                                    //Split the results
                                                    int trd5A = res3A % 10; //2
                                                    int car3A = res3A / 10;  //1
                                                    if (car32.length() == 0) {

                                                    } else {
                                                        int carOn = Integer.parseInt(car32.getText().toString().trim());
                                                        trd5A = trd5A + carOn;
                                                    }
                                                    int newCar = trd5A / 10; //1
                                                    trd5A %= 10; //2
                                                    car3A = car3A + newCar;

                                                    trd5.setText(String.valueOf(trd5A));

                                                    if (top4.length() == 0) {
                                                        if (bott4.length() != 0) {
                                                            trd6.setText(String.valueOf(car3A)); // line answer
                                                            fourth();
                                                            movearrowbodthirdans();

                                                            moveBottlinefourth();
                                                            third.setVisibility(View.INVISIBLE);
                                                            fourth.setVisibility(View.VISIBLE);
                                                            equalsBut.setVisibility(View.INVISIBLE);
                                                            second.setVisibility(View.INVISIBLE);
                                                            step++;
                                                            stepCount.setText("Step " + step);


                                                        } else {
                                                            trd6.setText(String.valueOf(car3A));
                                                            stepCount.setText("done!");
                                                            done();
                                                            moveansfourth();
                                                            moveaddsignthird();
                                                            movearrowbodthirdans();

                                                            third.setText("reset");
                                                            reset();
                                                        }
                                                    } else {
                                                        if (car3A == 0) {

                                                        } else {
                                                            car33.setText(String.valueOf(car3A));
                                                        }
                                                        step++;
                                                        stepCount.setText("Step " + step);
                                                    }
                                                }
                                            }

                                            if (trd5.length() != 0) {

                                                third.setOnClickListener(new View.OnClickListener() {

                                                    @Override
                                                    public void onClick(View v) {

                                                        if (stepCount.getText().equals("Step " + step)) {

                                                            if (top4.length() == 0 || bott3.length() == 0) {
                                                                if (third.getText() == "reset") {

                                                                } else {
                                                                    // display a short message to the screen if things go wrong
                                                                    Toast.makeText(getApplicationContext(), "Enter one number on the fourth top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                                }
                                                            } else {

                                                                int top4A = Integer.parseInt(top4.getText().toString().trim());
                                                                int bott3A = Integer.parseInt(bott3.getText().toString().trim());

                                                                int res4A = top4A * bott3A;

                                                                //Split the results
                                                                int trd6A = res4A % 10; //2
                                                                int car4A = res4A / 10;  //1
                                                                if (car33.length() == 0) {

                                                                } else {
                                                                    int carOn = Integer.parseInt(car33.getText().toString().trim());
                                                                    trd6A = trd6A + carOn;
                                                                }
                                                                int newCar = trd6A / 10; //1
                                                                trd6A %= 10; //2
                                                                car4A = car4A + newCar;

                                                                trd6.setText(String.valueOf(trd6A));

                                                                if (top5.length() == 0) {
                                                                    if (bott4.length() != 0) {
                                                                        trd7.setText(String.valueOf(car4A)); // line answer
                                                                        fourth();
                                                                        movearrowbodthirdans();

                                                                        moveBottlinefourth();
                                                                        third.setVisibility(View.INVISIBLE);
                                                                        fourth.setVisibility(View.VISIBLE);
                                                                        equalsBut.setVisibility(View.INVISIBLE);
                                                                        second.setVisibility(View.INVISIBLE);
                                                                        step++;
                                                                        stepCount.setText("Step " + step);


                                                                    } else {
                                                                        trd7.setText(String.valueOf(car4A));
                                                                        stepCount.setText("done!");
                                                                        done();
                                                                        moveansfourth();
                                                                        moveaddsignthird();
                                                                        movearrowbodthirdans();

                                                                        third.setText("reset");
                                                                        reset();
                                                                    }
                                                                } else {
                                                                    if (car4A == 0) {

                                                                    } else {
                                                                        car34.setText(String.valueOf(car4A));
                                                                    }
                                                                    step++;
                                                                    stepCount.setText("Step " + step);
                                                                }
                                                            }
                                                        }

                                                        if (trd6.length() != 0) {

                                                            third.setOnClickListener(new View.OnClickListener() {

                                                                @Override
                                                                public void onClick(View v) {

                                                                    if (stepCount.getText().equals("Step " + step)) {

                                                                        if (top5.length() == 0 || bott3.length() == 0) {
                                                                            if (third.getText() == "reset") {

                                                                            } else {
                                                                                // display a short message to the screen if things go wrong
                                                                                Toast.makeText(getApplicationContext(), "Enter one number on the fifth top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                                            }
                                                                        } else {

                                                                            int top5A = Integer.parseInt(top5.getText().toString().trim());
                                                                            int bott3A = Integer.parseInt(bott3.getText().toString().trim());

                                                                            int res5A = top5A * bott3A;

                                                                            //Split the results
                                                                            int trd7A = res5A % 10; //2
                                                                            int car5A = res5A / 10;  //1
                                                                            if (car34.length() == 0) {

                                                                            } else {
                                                                                int carOn = Integer.parseInt(car34.getText().toString().trim());
                                                                                trd7A = trd7A + carOn;
                                                                            }
                                                                            int newCar = trd7A / 10; //1
                                                                            trd7A %= 10; //2
                                                                            car5A = car5A + newCar;

                                                                            trd7.setText(String.valueOf(trd7A));

                                                                            if (top6.length() == 0) {
                                                                                if (bott4.length() != 0) {
                                                                                    trd8.setText(String.valueOf(car5A)); // line answer
                                                                                    fourth();
                                                                                    movearrowbodthirdans();

                                                                                    moveBottlinefourth();
                                                                                    third.setVisibility(View.INVISIBLE);
                                                                                    fourth.setVisibility(View.VISIBLE);
                                                                                    equalsBut.setVisibility(View.INVISIBLE);
                                                                                    second.setVisibility(View.INVISIBLE);
                                                                                    step++;
                                                                                    stepCount.setText("Step " + step);


                                                                                } else {
                                                                                    trd8.setText(String.valueOf(car5A));
                                                                                    stepCount.setText("done!");
                                                                                    done();
                                                                                    moveansfourth();
                                                                                    moveaddsignthird();
                                                                                    movearrowbodthirdans();

                                                                                    third.setText("reset");
                                                                                    reset();
                                                                                }
                                                                            } else {
                                                                                if (car5A == 0) {

                                                                                } else {
                                                                                    car35.setText(String.valueOf(car5A));
                                                                                }
                                                                                step++;
                                                                                stepCount.setText("Step " + step);
                                                                            }
                                                                        }
                                                                    }

                                                                    if (trd7.length() != 0) {

                                                                        third.setOnClickListener(new View.OnClickListener() {

                                                                            @Override
                                                                            public void onClick(View v) {

                                                                                if (stepCount.getText().equals("Step " + step)) {

                                                                                    if (top6.length() == 0 || bott3.length() == 0) {
                                                                                        if (third.getText() == "reset") {

                                                                                        } else {
                                                                                            // display a short message to the screen if things go wrong
                                                                                            Toast.makeText(getApplicationContext(), "Enter one number on the last top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                                                        }
                                                                                    } else {

                                                                                        int top6A = Integer.parseInt(top6.getText().toString().trim());
                                                                                        int bott3A = Integer.parseInt(bott3.getText().toString().trim());

                                                                                        int res6A = top6A * bott3A;

                                                                                        //Split the results
                                                                                        int trd8A = res6A % 10; //2
                                                                                        int car6A = res6A / 10;  //1
                                                                                        if (car35.length() == 0) {

                                                                                        } else {
                                                                                            int carOn = Integer.parseInt(car35.getText().toString().trim());
                                                                                            trd8A = trd8A + carOn;
                                                                                        }
                                                                                        int newCar = trd8A / 10; //1
                                                                                        trd8A %= 10; //2
                                                                                        car6A = car6A + newCar;

                                                                                        trd8.setText(String.valueOf(trd8A));

                                                                                        if (bott4.length() == 0) {
                                                                                            trd9.setText(String.valueOf(car6A));
                                                                                            stepCount.setText("done!");
                                                                                            done();
                                                                                            moveansfourth();
                                                                                            moveaddsignthird();
                                                                                            movearrowbodthirdans();

                                                                                            third.setText("reset");
                                                                                            reset();
                                                                                        } else {
                                                                                            trd9.setText(String.valueOf(car6A));
                                                                                            step++;
                                                                                            fourth();
                                                                                            movearrowbodthirdans();

                                                                                            moveBottlinefourth();
                                                                                            second.setVisibility(View.INVISIBLE);
                                                                                            equalsBut.setVisibility(View.INVISIBLE);
                                                                                            third.setVisibility(View.INVISIBLE);
                                                                                            fourth.setVisibility(View.VISIBLE);
                                                                                            stepCount.setText("Step " + step);


                                                                                            magicHappens();
                                                                                        }
                                                                                        magicHappens();
                                                                                    }
                                                                                    magicHappens();
                                                                                }
                                                                                magicHappens();
                                                                            }

                                                                        });

                                                                        magicHappens();
                                                                    }
                                                                    magicHappens();
                                                                }


                                                            });

                                                            magicHappens();
                                                        }
                                                        magicHappens();
                                                    }


                                                });

                                                magicHappens();
                                            }
                                            magicHappens();
                                        }


                                    });

                                    magicHappens();
                                }
                                magicHappens();
                            }


                        });

                        magicHappens();
                    }
                    magicHappens();
                }


            });

            magicHappens();
        }
        magicHappens();
    }


    public void fourth() {

        if (frth4.length() == 0) {

            fourth.setText("next");
            frth1.setVisibility(View.VISIBLE);
            frth2.setVisibility(View.VISIBLE);
            frth3.setVisibility(View.VISIBLE);
            moveBottlinefourth();

            fourth.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    if (top.length() == 0 || bott4.length() == 0) {
                        if (fourth.getText() == "reset") {

                        } else {
                            // display a short message to the screen if things go wrong
                            Toast.makeText(getApplicationContext(), "Enter one number at least on the rightmost top row and bottom row", Toast.LENGTH_LONG).show();
                        }
                    } else {

                        int topA = Integer.parseInt(top.getText().toString().trim());
                        int bott4A = Integer.parseInt(bott4.getText().toString().trim());

                        int res1A = topA * bott4A;

                        //Split the results
                        int frth4A = res1A % 10; //2
                        int carA = res1A / 10;  //1

                        frth4.setText(String.valueOf(frth4A)); // line answer

                        if (top2.length() == 0) {
                            if (bott5.length() != 0) {
                                frth5.setText(String.valueOf(carA)); // line answer
                                fifth();

                                moveBottlinefifth();
                                equalsBut.setVisibility(View.INVISIBLE);
                                second.setVisibility(View.INVISIBLE);
                                third.setVisibility(View.INVISIBLE);
                                fourth.setVisibility(View.INVISIBLE);
                                fifth.setVisibility(View.VISIBLE);
                                step++;
                                stepCount.setText("Step " + step);


                            } else {
                                frth5.setText(String.valueOf(carA));
                                stepCount.setText("done!");
                                done();
                                moveansfifth();
                                moveaddsignfourth();
                                movearrowbodfirstans();
                                moveaddallrestcar();
                                fourth.setText("reset");
                                reset();
                            }
                        } else {
                            if (carA == 0) {

                            } else {
                                car41.setText(String.valueOf(carA)); // carry
                            }
                            step++;
                            stepCount.setText("Step " + step);
                        }
                    }

                    if (frth4.length() != 0) {

                        fourth.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {

                                if (stepCount.getText().equals("Step " + step)) {

                                    if (top2.length() == 0 || bott4.length() == 0) {
                                        if (fourth.getText() == "reset") {

                                        } else {
                                            // display a short message to the screen if things go wrong
                                            Toast.makeText(getApplicationContext(), "Enter one number on the fourth rightmost> top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                        }
                                    } else {

                                        int top2A = Integer.parseInt(top2.getText().toString().trim());
                                        int bott4A = Integer.parseInt(bott4.getText().toString().trim());

                                        int res2A = top2A * bott4A;

                                        //Split the results
                                        int frth5A = res2A % 10; //2
                                        int car2A = res2A / 10;  //1
                                        if (car41.length() == 0) {

                                        } else {
                                            int carOn = Integer.parseInt(car41.getText().toString().trim());
                                            frth5A = frth5A + carOn;
                                        }
                                        int newCar = frth5A / 10; //1
                                        frth5A %= 10; //2
                                        car2A = car2A + newCar;

                                        frth5.setText(String.valueOf(frth5A));

                                        if (top3.length() == 0) {
                                            if (bott5.length() != 0) {
                                                frth6.setText(String.valueOf(car2A)); // line answer
                                                fifth();
                                                movearrowbodfourthans();

                                                moveBottlinefifth();
                                                equalsBut.setVisibility(View.INVISIBLE);
                                                second.setVisibility(View.INVISIBLE);
                                                third.setVisibility(View.INVISIBLE);
                                                fourth.setVisibility(View.INVISIBLE);
                                                fifth.setVisibility(View.VISIBLE);
                                                step++;
                                                stepCount.setText("Step " + step);


                                            } else {
                                                frth6.setText(String.valueOf(car2A));
                                                stepCount.setText("done!");
                                                done();
                                                moveansfifth();
                                                moveaddsignfourth();
                                                movearrowbodfourthans();

                                                fourth.setText("reset");
                                                reset();
                                            }
                                        } else {
                                            if (car2A == 0) {

                                            } else {
                                                car42.setText(String.valueOf(car2A));
                                            }
                                            step++;
                                            stepCount.setText("Step " + step);
                                        }
                                    }
                                }

                                if (frth5.length() != 0) {

                                    fourth.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

                                            if (stepCount.getText().equals("Step " + step)) {

                                                if (top3.length() == 0 || bott4.length() == 0) {
                                                    if (fourth.getText() == "reset") {

                                                    } else {
                                                        // display a short message to the screen if things go wrong
                                                        Toast.makeText(getApplicationContext(), "Enter one number on the fourth right> top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                    }
                                                } else {

                                                    int top3A = Integer.parseInt(top3.getText().toString().trim());
                                                    int bott4A = Integer.parseInt(bott4.getText().toString().trim());

                                                    int res3A = top3A * bott4A;

                                                    //Split the results
                                                    int frth6A = res3A % 10; //2
                                                    int car3A = res3A / 10;  //1
                                                    if (car42.length() == 0) {

                                                    } else {
                                                        int carOn = Integer.parseInt(car42.getText().toString().trim());
                                                        frth6A = frth6A + carOn;
                                                    }
                                                    int newCar = frth6A / 10; //1
                                                    frth6A %= 10; //2
                                                    car3A = car3A + newCar;


                                                    frth6.setText(String.valueOf(frth6A));

                                                    if (top4.length() == 0) {
                                                        if (bott5.length() != 0) {
                                                            frth7.setText(String.valueOf(car3A)); // line answer
                                                            fifth();
                                                            movearrowbodfourthans();

                                                            moveBottlinefifth();
                                                            equalsBut.setVisibility(View.INVISIBLE);
                                                            second.setVisibility(View.INVISIBLE);
                                                            third.setVisibility(View.INVISIBLE);
                                                            fourth.setVisibility(View.INVISIBLE);
                                                            fifth.setVisibility(View.VISIBLE);
                                                            step++;
                                                            stepCount.setText("Step " + step);


                                                        } else {
                                                            frth7.setText(String.valueOf(car3A));
                                                            stepCount.setText("done!");
                                                            done();
                                                            moveansfifth();
                                                            moveaddsignfourth();
                                                            movearrowbodfourthans();

                                                            fourth.setText("reset");
                                                            reset();
                                                        }
                                                    } else {
                                                        if (car3A == 0) {

                                                        } else {
                                                            car43.setText(String.valueOf(car3A));
                                                        }
                                                        step++;
                                                        stepCount.setText("Step " + step);
                                                    }
                                                }
                                            }

                                            if (frth6.length() != 0) {

                                                fourth.setOnClickListener(new View.OnClickListener() {

                                                    @Override
                                                    public void onClick(View v) {

                                                        if (stepCount.getText().equals("Step " + step)) {

                                                            if (top4.length() == 0 || bott4.length() == 0) {
                                                                if (fourth.getText() == "reset") {

                                                                } else {
                                                                    // display a short message to the screen if things go wrong
                                                                    Toast.makeText(getApplicationContext(), "Enter one number on the fourth top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                                }
                                                            } else {

                                                                int top4A = Integer.parseInt(top4.getText().toString().trim());
                                                                int bott4A = Integer.parseInt(bott4.getText().toString().trim());

                                                                int res4A = top4A * bott4A;

                                                                //Split the results
                                                                int frth7A = res4A % 10; //2
                                                                int car4A = res4A / 10;  //1
                                                                if (car43.length() == 0) {

                                                                } else {
                                                                    int carOn = Integer.parseInt(car43.getText().toString().trim());
                                                                    frth7A = frth7A + carOn;
                                                                }
                                                                int newCar = frth7A / 10; //1
                                                                frth7A %= 10; //2
                                                                car4A = car4A + newCar;


                                                                frth7.setText(String.valueOf(frth7A));

                                                                if (top5.length() == 0) {
                                                                    if (bott5.length() != 0) {
                                                                        frth8.setText(String.valueOf(car4A)); // line answer
                                                                        fifth();
                                                                        movearrowbodfourthans();

                                                                        moveBottlinefifth();
                                                                        equalsBut.setVisibility(View.INVISIBLE);
                                                                        second.setVisibility(View.INVISIBLE);
                                                                        third.setVisibility(View.INVISIBLE);
                                                                        fourth.setVisibility(View.INVISIBLE);
                                                                        fifth.setVisibility(View.VISIBLE);
                                                                        step++;
                                                                        stepCount.setText("Step " + step);


                                                                    } else {
                                                                        frth8.setText(String.valueOf(car4A));
                                                                        stepCount.setText("done!");
                                                                        done();
                                                                        moveansfifth();
                                                                        moveaddsignfourth();
                                                                        movearrowbodfourthans();

                                                                        fourth.setText("reset");
                                                                        reset();
                                                                    }
                                                                } else {
                                                                    if (car4A == 0) {

                                                                    } else {
                                                                        car44.setText(String.valueOf(car4A));
                                                                    }
                                                                    step++;
                                                                    stepCount.setText("Step " + step);
                                                                }
                                                            }
                                                        }

                                                        if (frth7.length() != 0) {

                                                            fourth.setOnClickListener(new View.OnClickListener() {

                                                                @Override
                                                                public void onClick(View v) {

                                                                    if (stepCount.getText().equals("Step " + step)) {

                                                                        if (top5.length() == 0 || bott4.length() == 0) {
                                                                            if (fourth.getText() == "reset") {

                                                                            } else {
                                                                                // display a short message to the screen if things go wrong
                                                                                Toast.makeText(getApplicationContext(), "Enter one number on the fifth top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                                            }
                                                                        } else {

                                                                            int top5A = Integer.parseInt(top5.getText().toString().trim());
                                                                            int bott4A = Integer.parseInt(bott4.getText().toString().trim());

                                                                            int res5A = top5A * bott4A;

                                                                            //Split the results
                                                                            int frth8A = res5A % 10; //2
                                                                            int car5A = res5A / 10;  //1
                                                                            if (car44.length() == 0) {

                                                                            } else {
                                                                                int carOn = Integer.parseInt(car44.getText().toString().trim());
                                                                                frth8A = frth8A + carOn;
                                                                            }
                                                                            int newCar = frth8A / 10; //1
                                                                            frth8A %= 10; //2
                                                                            car5A = car5A + newCar;


                                                                            frth8.setText(String.valueOf(frth8A));

                                                                            if (top6.length() == 0) {
                                                                                if (bott5.length() != 0) {
                                                                                    frth9.setText(String.valueOf(car5A)); // line answer
                                                                                    fifth();
                                                                                    movearrowbodfourthans();

                                                                                    moveBottlinefifth();
                                                                                    equalsBut.setVisibility(View.INVISIBLE);
                                                                                    second.setVisibility(View.INVISIBLE);
                                                                                    third.setVisibility(View.INVISIBLE);
                                                                                    fourth.setVisibility(View.INVISIBLE);
                                                                                    fifth.setVisibility(View.VISIBLE);
                                                                                    step++;
                                                                                    stepCount.setText("Step " + step);


                                                                                } else {
                                                                                    frth9.setText(String.valueOf(car5A));
                                                                                    stepCount.setText("done!");
                                                                                    done();
                                                                                    moveansfifth();
                                                                                    moveaddsignfourth();
                                                                                    movearrowbodfourthans();

                                                                                    fourth.setText("reset");
                                                                                    reset();
                                                                                }
                                                                            } else {
                                                                                if (car5A == 0) {

                                                                                } else {
                                                                                    car45.setText(String.valueOf(car5A));
                                                                                }
                                                                                step++;
                                                                                stepCount.setText("Step " + step);
                                                                            }
                                                                        }
                                                                    }

                                                                    if (frth8.length() != 0) {

                                                                        fourth.setOnClickListener(new View.OnClickListener() {

                                                                            @Override
                                                                            public void onClick(View v) {

                                                                                if (stepCount.getText().equals("Step " + step)) {

                                                                                    if (top6.length() == 0 || bott4.length() == 0) {
                                                                                        if (fourth.getText() == "reset") {

                                                                                        } else {
                                                                                            // display a short message to the screen if things go wrong
                                                                                            Toast.makeText(getApplicationContext(), "Enter one number on the last top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                                                        }
                                                                                    } else {

                                                                                        int top6A = Integer.parseInt(top6.getText().toString().trim());
                                                                                        int bott4A = Integer.parseInt(bott4.getText().toString().trim());

                                                                                        int res6A = top6A * bott4A;

                                                                                        //Split the results
                                                                                        int frth9A = res6A % 10; //2
                                                                                        int car6A = res6A / 10;  //1
                                                                                        if (car45.length() == 0) {

                                                                                        } else {
                                                                                            int carOn = Integer.parseInt(car45.getText().toString().trim());
                                                                                            frth9A = frth9A + carOn;
                                                                                        }
                                                                                        int newCar = frth9A / 10; //1
                                                                                        frth9A %= 10; //2
                                                                                        car6A = car6A + newCar;


                                                                                        frth9.setText(String.valueOf(frth9A));

                                                                                        if (bott5.length() == 0) {
                                                                                            frth10.setText(String.valueOf(car6A));
                                                                                            stepCount.setText("done!");
                                                                                            done();
                                                                                            moveaddsignfourth();
                                                                                            movearrowbodfourthans();
                                                                                            moveansfifth();
                                                                                            fourth.setText("reset");
                                                                                            reset();
                                                                                        } else {
                                                                                            frth10.setText(String.valueOf(car6A));
                                                                                            step++;
                                                                                            fifth();
                                                                                            movearrowbodfourthans();

                                                                                            moveBottlinefifth();
                                                                                            equalsBut.setVisibility(View.INVISIBLE);
                                                                                            second.setVisibility(View.INVISIBLE);
                                                                                            third.setVisibility(View.INVISIBLE);
                                                                                            fourth.setVisibility(View.INVISIBLE);
                                                                                            fifth.setVisibility(View.VISIBLE);
                                                                                            stepCount.setText("Step " + step);


                                                                                            magicHappens();
                                                                                        }
                                                                                        magicHappens();
                                                                                    }
                                                                                    magicHappens();
                                                                                }
                                                                                magicHappens();
                                                                            }

                                                                        });

                                                                        magicHappens();
                                                                    }
                                                                    magicHappens();
                                                                }


                                                            });

                                                            magicHappens();
                                                        }
                                                        magicHappens();
                                                    }


                                                });

                                                magicHappens();
                                            }
                                            magicHappens();
                                        }


                                    });

                                    magicHappens();
                                }
                                magicHappens();
                            }


                        });

                        magicHappens();
                    }
                    magicHappens();
                }


            });

            magicHappens();
        }
        magicHappens();
    }

    public void fifth() {
        if (ffth5.length() == 0) {

            fifth.setText("next");
            ffth1.setVisibility(View.VISIBLE);
            ffth2.setVisibility(View.VISIBLE);
            ffth3.setVisibility(View.VISIBLE);
            ffth4.setVisibility(View.VISIBLE);
            moveBottlinefifth();

            fifth.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    if (top.length() == 0 || bott5.length() == 0) {
                        if (fifth.getText() == "reset") {

                        } else {
                            // display a short message to the screen if things go wrong
                            Toast.makeText(getApplicationContext(), "Enter one number at least on the rightmost top row and bottom row", Toast.LENGTH_LONG).show();
                        }
                    } else {

                        int topA = Integer.parseInt(top.getText().toString().trim());
                        int bott5A = Integer.parseInt(bott5.getText().toString().trim());

                        int res1A = topA * bott5A;

                        //Split the results
                        int ffth5A = res1A % 10; //2
                        int carA = res1A / 10;  //1

                        ffth5.setText(String.valueOf(ffth5A)); // line answer

                        if (top2.length() == 0) {
                            if (bott6.length() != 0) {
                                ffth6.setText(String.valueOf(carA)); // line answer

                                equalsBut.setVisibility(View.INVISIBLE);
                                second.setVisibility(View.INVISIBLE);
                                third.setVisibility(View.INVISIBLE);
                                fourth.setVisibility(View.INVISIBLE);
                                fifth.setVisibility(View.INVISIBLE);
                                sixth.setVisibility(View.VISIBLE);
                                sixth();

                                moveBottlinesixth();
                                step++;
                                stepCount.setText("Step " + step);


                            } else {
                                ffth6.setText(String.valueOf(carA));
                                stepCount.setText("done!");
                                done();
                                moveanssixth();
                                moveaddsignfifth();
                                movearrowbodfirstans();
                                moveaddallrestcar();
                                fifth.setText("reset");
                                reset();
                            }
                        } else {
                            if (carA == 0) {

                            } else {
                                car51.setText(String.valueOf(carA)); // carry
                            }
                            step++;
                            stepCount.setText("Step " + step);
                        }

                    }
                    if (ffth5.length() != 0) {

                        fifth.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {

                                if (stepCount.getText().equals("Step " + step)) {

                                    if (top2.length() == 0 || bott5.length() == 0) {
                                        if (fifth.getText() == "reset") {

                                        } else {
                                            // display a short message to the screen if things go wrong

                                            Toast.makeText(getApplicationContext(), "Enter one number on the fifth rightmost> top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                        }
                                    } else {

                                        int top2A = Integer.parseInt(top2.getText().toString().trim());
                                        int bott5A = Integer.parseInt(bott5.getText().toString().trim());

                                        int res2A = top2A * bott5A;

                                        //Split the results
                                        int ffth6A = res2A % 10; //2
                                        int car2A = res2A / 10;  //1
                                        if (car51.length() == 0) {

                                        } else {
                                            int carOn = Integer.parseInt(car51.getText().toString().trim());
                                            ffth6A = ffth6A + carOn;
                                        }
                                        int newCar = ffth6A / 10; //1
                                        ffth6A %= 10; //2
                                        car2A = car2A + newCar;


                                        ffth6.setText(String.valueOf(ffth6A));

                                        if (top3.length() == 0) {
                                            if (bott6.length() != 0) {
                                                ffth7.setText(String.valueOf(car2A)); // line answer

                                                equalsBut.setVisibility(View.INVISIBLE);
                                                second.setVisibility(View.INVISIBLE);
                                                third.setVisibility(View.INVISIBLE);
                                                fourth.setVisibility(View.INVISIBLE);
                                                fifth.setVisibility(View.INVISIBLE);
                                                sixth.setVisibility(View.VISIBLE);
                                                step++;
                                                sixth();
                                                movearrowbodfifthans();

                                                moveBottlinesixth();
                                                stepCount.setText("Step " + step);


                                            } else {
                                                ffth7.setText(String.valueOf(car2A));
                                                stepCount.setText("done!");
                                                done();
                                                moveaddsignfifth();
                                                movearrowbodfifthans();
                                                moveanssixth();
                                                fifth.setText("reset");
                                                reset();
                                            }
                                        } else {
                                            if (car2A == 0) {

                                            } else {
                                                car52.setText(String.valueOf(car2A));
                                            }
                                            step++;
                                            stepCount.setText("Step " + step);
                                        }
                                    }
                                }

                                if (ffth6.length() != 0) {

                                    fifth.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

                                            if (stepCount.getText().equals("Step " + step)) {

                                                if (top3.length() == 0 || bott5.length() == 0) {
                                                    if (fifth.getText() == "reset") {

                                                    } else {
                                                        // display a short message to the screen if things go wrong
                                                        Toast.makeText(getApplicationContext(), "Enter one number on the fifth right> top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                    }
                                                } else {

                                                    int top3A = Integer.parseInt(top3.getText().toString().trim());
                                                    int bott5A = Integer.parseInt(bott5.getText().toString().trim());

                                                    int res3A = top3A * bott5A;

                                                    //Split the results
                                                    int ffth7A = res3A % 10; //2
                                                    int car3A = res3A / 10;  //1
                                                    if (car52.length() == 0) {

                                                    } else {
                                                        int carOn = Integer.parseInt(car52.getText().toString().trim());
                                                        ffth7A = ffth7A + carOn;
                                                    }
                                                    int newCar = ffth7A / 10; //1
                                                    ffth7A %= 10; //2
                                                    car3A = car3A + newCar;

                                                    ffth7.setText(String.valueOf(ffth7A));

                                                    if (top4.length() == 0) {
                                                        if (bott6.length() != 0) {
                                                            ffth8.setText(String.valueOf(car3A)); // line answer
                                                            sixth();
                                                            movearrowbodfifthans();

                                                            moveBottlinesixth();
                                                            equalsBut.setVisibility(View.INVISIBLE);
                                                            second.setVisibility(View.INVISIBLE);
                                                            third.setVisibility(View.INVISIBLE);
                                                            fourth.setVisibility(View.INVISIBLE);
                                                            fifth.setVisibility(View.INVISIBLE);
                                                            sixth.setVisibility(View.VISIBLE);
                                                            step++;
                                                            stepCount.setText("Step " + step);


                                                        } else {
                                                            ffth8.setText(String.valueOf(car3A));
                                                            stepCount.setText("done!");
                                                            done();
                                                            moveaddsignfifth();
                                                            movearrowbodfifthans();
                                                            moveanssixth();
                                                            fifth.setText("reset");
                                                            reset();
                                                        }
                                                    } else {
                                                        if (car3A == 0) {

                                                        } else {
                                                            car53.setText(String.valueOf(car3A));
                                                        }
                                                        step++;
                                                        stepCount.setText("Step " + step);
                                                    }
                                                }
                                            }

                                            if (ffth7.length() != 0) {

                                                fifth.setOnClickListener(new View.OnClickListener() {

                                                    @Override
                                                    public void onClick(View v) {

                                                        if (stepCount.getText().equals("Step " + step)) {

                                                            if (top4.length() == 0 || bott5.length() == 0) {
                                                                if (fifth.getText() == "reset") {

                                                                } else {
                                                                    // display a short message to the screen if things go wrong
                                                                    Toast.makeText(getApplicationContext(), "Enter one number on the fifth top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                                }
                                                            } else {

                                                                int top4A = Integer.parseInt(top4.getText().toString().trim());
                                                                int bott5A = Integer.parseInt(bott5.getText().toString().trim());

                                                                int res4A = top4A * bott5A;

                                                                //Split the results
                                                                int ffth8A = res4A % 10; //2
                                                                int car4A = res4A / 10;  //1
                                                                if (car53.length() == 0) {

                                                                } else {
                                                                    int carOn = Integer.parseInt(car53.getText().toString().trim());
                                                                    ffth8A = ffth8A + carOn;
                                                                }
                                                                int newCar = ffth8A / 10; //1
                                                                ffth8A %= 10; //2
                                                                car4A = car4A + newCar;

                                                                ffth8.setText(String.valueOf(ffth8A));

                                                                if (top5.length() == 0) {
                                                                    if (bott6.length() != 0) {
                                                                        ffth9.setText(String.valueOf(car4A)); // line answer
                                                                        sixth();

                                                                        moveBottlinesixth();
                                                                        movearrowbodfifthans();
                                                                        equalsBut.setVisibility(View.INVISIBLE);
                                                                        second.setVisibility(View.INVISIBLE);
                                                                        third.setVisibility(View.INVISIBLE);
                                                                        fourth.setVisibility(View.INVISIBLE);
                                                                        fifth.setVisibility(View.INVISIBLE);
                                                                        sixth.setVisibility(View.VISIBLE);
                                                                        step++;
                                                                        stepCount.setText("Step " + step);

                                                                    } else {
                                                                        ffth9.setText(String.valueOf(car4A));
                                                                        stepCount.setText("done!");
                                                                        done();
                                                                        moveaddsignfifth();
                                                                        movearrowbodfifthans();
                                                                        moveanssixth();
                                                                        fifth.setText("reset");
                                                                        reset();
                                                                    }
                                                                } else {
                                                                    if (car4A == 0) {

                                                                    } else {
                                                                        car54.setText(String.valueOf(car4A));
                                                                    }
                                                                    step++;
                                                                    stepCount.setText("Step " + step);
                                                                }
                                                            }
                                                        }

                                                        if (ffth8.length() != 0) {

                                                            fifth.setOnClickListener(new View.OnClickListener() {

                                                                @Override
                                                                public void onClick(View v) {

                                                                    if (stepCount.getText().equals("Step " + step)) {

                                                                        if (top5.length() == 0 || bott5.length() == 0) {
                                                                            if (fifth.getText() == "reset") {

                                                                            } else {
                                                                                // display a short message to the screen if things go wrong
                                                                                Toast.makeText(getApplicationContext(), "Enter one number on the fifth top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                                            }
                                                                        } else {

                                                                            int top5A = Integer.parseInt(top5.getText().toString().trim());
                                                                            int bott5A = Integer.parseInt(bott5.getText().toString().trim());

                                                                            int res5A = top5A * bott5A;

                                                                            //Split the results
                                                                            int ffth9A = res5A % 10; //2
                                                                            int car5A = res5A / 10;  //1
                                                                            if (car54.length() == 0) {

                                                                            } else {
                                                                                int carOn = Integer.parseInt(car54.getText().toString().trim());
                                                                                ffth9A = ffth9A + carOn;
                                                                            }
                                                                            int newCar = ffth9A / 10; //1
                                                                            ffth9A %= 10; //2
                                                                            car5A = car5A + newCar;

                                                                            ffth9.setText(String.valueOf(ffth9A));

                                                                            if (top6.length() == 0) {
                                                                                if (bott6.length() != 0) {
                                                                                    ffth10.setText(String.valueOf(car5A)); // line answer
                                                                                    sixth();
                                                                                    movearrowbodfifthans();

                                                                                    moveBottlinesixth();
                                                                                    equalsBut.setVisibility(View.INVISIBLE);
                                                                                    second.setVisibility(View.INVISIBLE);
                                                                                    third.setVisibility(View.INVISIBLE);
                                                                                    fourth.setVisibility(View.INVISIBLE);
                                                                                    fifth.setVisibility(View.INVISIBLE);
                                                                                    sixth.setVisibility(View.VISIBLE);
                                                                                    step++;
                                                                                    stepCount.setText("Step " + step);

                                                                                } else {
                                                                                    ffth10.setText(String.valueOf(car5A));
                                                                                    stepCount.setText("done!");
                                                                                    done();
                                                                                    moveaddsignfifth();
                                                                                    movearrowbodfifthans();
                                                                                    moveanssixth();
                                                                                    fifth.setText("reset");
                                                                                    reset();
                                                                                }
                                                                            } else {
                                                                                if (car5A == 0) {

                                                                                } else {
                                                                                    car55.setText(String.valueOf(car5A));
                                                                                }
                                                                                step++;
                                                                                stepCount.setText("Step " + step);
                                                                            }
                                                                        }
                                                                    }

                                                                    if (ffth9.length() != 0) {

                                                                        fifth.setOnClickListener(new View.OnClickListener() {

                                                                            @Override
                                                                            public void onClick(View v) {

                                                                                if (stepCount.getText().equals("Step " + step)) {

                                                                                    if (top6.length() == 0 || bott5.length() == 0) {
                                                                                        if (fifth.getText() == "reset") {

                                                                                        } else {
                                                                                            // display a short message to the screen if things go wrong
                                                                                            Toast.makeText(getApplicationContext(), "Enter one number on the last top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                                                        }
                                                                                    } else {

                                                                                        int top6A = Integer.parseInt(top6.getText().toString().trim());
                                                                                        int bott5A = Integer.parseInt(bott5.getText().toString().trim());

                                                                                        int res6A = top6A * bott5A;

                                                                                        //Split the results
                                                                                        int ffth10A = res6A % 10; //2
                                                                                        int car6A = res6A / 10;  //1
                                                                                        if (car55.length() == 0) {

                                                                                        } else {
                                                                                            int carOn = Integer.parseInt(car55.getText().toString().trim());
                                                                                            ffth10A = ffth10A + carOn;
                                                                                        }
                                                                                        int newCar = ffth10A / 10; //1
                                                                                        ffth10A %= 10; //2
                                                                                        car6A = car6A + newCar;

                                                                                        ffth10.setText(String.valueOf(ffth10A));

                                                                                        if (bott6.length() == 0) {
                                                                                            ffth11.setText(String.valueOf(car6A));
                                                                                            stepCount.setText("done!");
                                                                                            done();
                                                                                            moveaddsignfifth();
                                                                                            movearrowbodfifthans();
                                                                                            moveanssixth();
                                                                                            fifth.setText("reset");
                                                                                            reset();
                                                                                        } else {
                                                                                            ffth11.setText(String.valueOf(car6A));
                                                                                            step++;
                                                                                            sixth();
                                                                                            movearrowbodfifthans();

                                                                                            moveBottlinesixth();
                                                                                            equalsBut.setVisibility(View.INVISIBLE);
                                                                                            second.setVisibility(View.INVISIBLE);
                                                                                            third.setVisibility(View.INVISIBLE);
                                                                                            fourth.setVisibility(View.INVISIBLE);
                                                                                            fifth.setVisibility(View.INVISIBLE);
                                                                                            sixth.setVisibility(View.VISIBLE);
                                                                                            stepCount.setText("Step " + step);


                                                                                            magicHappens();
                                                                                        }
                                                                                        magicHappens();
                                                                                    }
                                                                                    magicHappens();
                                                                                }
                                                                                magicHappens();
                                                                            }

                                                                        });

                                                                        magicHappens();
                                                                    }
                                                                    magicHappens();
                                                                }


                                                            });

                                                            magicHappens();
                                                        }
                                                        magicHappens();
                                                    }


                                                });

                                                magicHappens();
                                            }
                                            magicHappens();
                                        }


                                    });

                                    magicHappens();
                                }
                                magicHappens();
                            }


                        });

                        magicHappens();
                    }
                    magicHappens();
                }


            });

            magicHappens();
        }
        magicHappens();
    }

    public void sixth() {

        if (sxth6.length() == 0) {

            sixth.setText("next");
            sxth1.setVisibility(View.VISIBLE);
            sxth2.setVisibility(View.VISIBLE);
            sxth3.setVisibility(View.VISIBLE);
            sxth4.setVisibility(View.VISIBLE);
            sxth5.setVisibility(View.VISIBLE);
            moveBottlinesixth();

            sixth.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    if (top.length() == 0 || bott6.length() == 0) {
                        if (sixth.getText() == "reset") {

                        } else {
                            // display a short message to the screen if things go wrong
                            reset();
                            Toast.makeText(getApplicationContext(), "Enter one number at least on the rightmost top row and bottom row", Toast.LENGTH_LONG).show();
                        }
                    } else {

                        int topA = Integer.parseInt(top.getText().toString().trim());
                        int bott6A = Integer.parseInt(bott6.getText().toString().trim());

                        int res1A = topA * bott6A;

                        //Split the results
                        int sxth6A = res1A % 10; //2
                        int carA = res1A / 10;  //1

                        sxth6.setText(String.valueOf(sxth6A)); // line answer

                        if (top2.length() == 0) {
                            if (1 == 1) {
                                sxth7.setText(String.valueOf(carA)); // line answer
                                equalsBut.setVisibility(View.INVISIBLE);
                                second.setVisibility(View.INVISIBLE);
                                third.setVisibility(View.INVISIBLE);
                                fourth.setVisibility(View.INVISIBLE);
                                fifth.setVisibility(View.INVISIBLE);
                                sixth.setVisibility(View.INVISIBLE);
                                stepCount.setText("done!");
                                done();
                                moveaddallrestcar();
                                moveaddsignsixth();
                                movearrowbodfirstans();
                                sixth.setText("reset");
                                reset();
                                repeat();
                                step++;
                                stepCount.setText("Step " + step + "; done!");

                            } else {
                                sxth7.setText(String.valueOf(carA));
                                stepCount.setText("done!");
                                done();
                                moveaddsignsixth();
                                movearrowbodfirstans();
                                sixth.setText("reset");
                                reset();
                                repeat();
                            }
                        } else {
                            if (carA == 0) {

                            } else {
                                car61.setText(String.valueOf(carA)); // carry
                            }
                            step++;
                            stepCount.setText("Step " + step);
                        }
                    }

                    if (sxth6.length() != 0) {

                        sixth.setOnClickListener(new View.OnClickListener() {

                            @Override
                            public void onClick(View v) {

                                if (stepCount.getText().equals("Step " + step)) {

                                    if (top2.length() == 0 || bott6.length() == 0) {
                                        if (sixth.getText() == "reset") {

                                        } else {
                                            // display a short message to the screen if things go wrong
                                            Toast.makeText(getApplicationContext(), "Enter one number on the sixth rightmost> top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                        }
                                    } else {

                                        int top2A = Integer.parseInt(top2.getText().toString().trim());
                                        int bott6A = Integer.parseInt(bott6.getText().toString().trim());

                                        int res2A = top2A * bott6A;

                                        //Split the results
                                        int sxth7A = res2A % 10; //2
                                        int car2A = res2A / 10;  //1
                                        if (car61.length() == 0) {

                                        } else {
                                            int carOn = Integer.parseInt(car61.getText().toString().trim());
                                            sxth7A = sxth7A + carOn;
                                        }
                                        int newCar = sxth7A / 10; //1
                                        sxth7A %= 10; //2
                                        car2A = car2A + newCar;

                                        sxth7.setText(String.valueOf(sxth7A));

                                        if (top3.length() == 0) {
                                            if (1 == 1) {
                                                sxth8.setText(String.valueOf(car2A)); // line answer
                                                equalsBut.setVisibility(View.INVISIBLE);
                                                second.setVisibility(View.INVISIBLE);
                                                third.setVisibility(View.INVISIBLE);
                                                fourth.setVisibility(View.INVISIBLE);
                                                fifth.setVisibility(View.INVISIBLE);
                                                sixth.setVisibility(View.INVISIBLE);
                                                stepCount.setText("done!");
                                                done();
                                                moveaddsignsixth();
                                                movearrowbodsixthans();

                                                sixth.setText("reset");
                                                reset();
                                                repeat();
                                                step++;
                                                stepCount.setText("Step " + step + "; done!");

                                            } else {
                                                sxth8.setText(String.valueOf(car2A));
                                                stepCount.setText("done!");
                                                done();
                                                moveaddsignsixth();
                                                movearrowbodsixthans();
                                                sixth.setText("reset");
                                                reset();
                                                repeat();
                                            }
                                        } else {
                                            if (car2A == 0) {

                                            } else {
                                                car62.setText(String.valueOf(car2A));
                                            }
                                            step++;
                                            stepCount.setText("Step " + step);
                                        }
                                    }
                                }

                                if (sxth7.length() != 0) {

                                    sixth.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

                                            if (stepCount.getText().equals("Step " + step)) {

                                                if (top3.length() == 0 || bott6.length() == 0) {
                                                    if (sixth.getText() == "reset") {

                                                    } else {
                                                        // display a short message to the screen if things go wrong
                                                        Toast.makeText(getApplicationContext(), "Enter one number on the sixth right> top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                    }
                                                } else {

                                                    int top3A = Integer.parseInt(top3.getText().toString().trim());
                                                    int bott6A = Integer.parseInt(bott6.getText().toString().trim());

                                                    int res3A = top3A * bott6A;

                                                    //Split the results
                                                    int sxth8A = res3A % 10; //2
                                                    int car3A = res3A / 10;  //1
                                                    if (car61.length() == 0) {

                                                    } else {
                                                        int carOn = Integer.parseInt(car62.getText().toString().trim());

                                                        sxth8A = sxth8A + carOn;
                                                    }
                                                    int newCar = sxth8A / 10; //1
                                                    sxth8A %= 10; //2
                                                    car3A = car3A + newCar;

                                                    sxth8.setText(String.valueOf(sxth8A));

                                                    if (top4.length() == 0) {
                                                        if (1 == 1) {
                                                            sxth9.setText(String.valueOf(car3A)); // line answer
                                                            equalsBut.setVisibility(View.INVISIBLE);
                                                            second.setVisibility(View.INVISIBLE);
                                                            third.setVisibility(View.INVISIBLE);
                                                            fourth.setVisibility(View.INVISIBLE);
                                                            fifth.setVisibility(View.INVISIBLE);
                                                            sixth.setVisibility(View.INVISIBLE);
                                                            stepCount.setText("done!");
                                                            done();
                                                            moveaddsignsixth();
                                                            movearrowbodsixthans();

                                                            sixth.setText("reset");
                                                            reset();
                                                            repeat();
                                                            step++;
                                                            stepCount.setText("Step " + step + "; done!");

                                                        } else {
                                                            sxth9.setText(String.valueOf(car3A));
                                                            stepCount.setText("done!");
                                                            done();
                                                            moveaddsignsixth();

                                                            movearrowbodsixthans();
                                                            sixth.setText("reset");
                                                            reset();
                                                            repeat();
                                                        }
                                                    } else {
                                                        if (car3A == 0) {

                                                        } else {
                                                            car63.setText(String.valueOf(car3A));
                                                        }
                                                        step++;
                                                        stepCount.setText("Step " + step);
                                                    }
                                                }
                                            }

                                            if (sxth8.length() != 0) {

                                                sixth.setOnClickListener(new View.OnClickListener() {

                                                    @Override
                                                    public void onClick(View v) {

                                                        if (stepCount.getText().equals("Step " + step)) {

                                                            if (top4.length() == 0 || bott6.length() == 0) {
                                                                if (sixth.getText() == "reset") {

                                                                } else {
                                                                    // display a short message to the screen if things go wrong
                                                                    Toast.makeText(getApplicationContext(), "Enter one number on the sixth top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                                }
                                                            } else {

                                                                int top4A = Integer.parseInt(top4.getText().toString().trim());
                                                                int bott6A = Integer.parseInt(bott6.getText().toString().trim());

                                                                int res4A = top4A * bott6A;

                                                                //Split the results
                                                                int sxth9A = res4A % 10; //2
                                                                int car4A = res4A / 10;  //1
                                                                if (car63.length() == 0) {

                                                                } else {
                                                                    int carOn = Integer.parseInt(car63.getText().toString().trim());
                                                                    sxth9A = sxth9A + carOn;
                                                                }
                                                                int newCar = sxth9A / 10; //1
                                                                sxth9A %= 10; //2
                                                                car4A = car4A + newCar;

                                                                sxth9.setText(String.valueOf(sxth9A));

                                                                if (top5.length() == 0) {
                                                                    if (1 == 1) {
                                                                        sxth10.setText(String.valueOf(car4A)); // line answer
                                                                        equalsBut.setVisibility(View.INVISIBLE);
                                                                        second.setVisibility(View.INVISIBLE);
                                                                        third.setVisibility(View.INVISIBLE);
                                                                        fourth.setVisibility(View.INVISIBLE);
                                                                        fifth.setVisibility(View.INVISIBLE);
                                                                        sixth.setVisibility(View.INVISIBLE);
                                                                        stepCount.setText("done!");
                                                                        done();
                                                                        moveaddsignsixth();

                                                                        movearrowbodsixthans();
                                                                        sixth.setText("reset");
                                                                        reset();
                                                                        repeat();
                                                                        step++;
                                                                        stepCount.setText("Step " + step + "; done!");

                                                                    } else {
                                                                        sxth10.setText(String.valueOf(car4A));
                                                                        stepCount.setText("done!");
                                                                        done();
                                                                        moveaddsignsixth();
                                                                        movearrowbodsixthans();

                                                                        sixth.setText("reset");
                                                                        reset();
                                                                        repeat();
                                                                    }
                                                                } else {
                                                                    if (car4A == 0) {

                                                                    } else {
                                                                        car64.setText(String.valueOf(car4A));
                                                                    }
                                                                    step++;
                                                                    stepCount.setText("Step " + step);
                                                                }
                                                            }
                                                        }

                                                        if (sxth9.length() != 0) {

                                                            sixth.setOnClickListener(new View.OnClickListener() {

                                                                @Override
                                                                public void onClick(View v) {

                                                                    if (stepCount.getText().equals("Step " + step)) {

                                                                        if (top5.length() == 0 || bott6.length() == 0) {
                                                                            if (sixth.getText() == "reset") {

                                                                            } else {
                                                                                // display a short message to the screen if things go wrong
                                                                                Toast.makeText(getApplicationContext(), "Enter one number on the sixth top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                                            }
                                                                        } else {

                                                                            int top5A = Integer.parseInt(top5.getText().toString().trim());
                                                                            int bott6A = Integer.parseInt(bott6.getText().toString().trim());

                                                                            int res5A = top5A * bott6A;

                                                                            //Split the results
                                                                            int sxth10A = res5A % 10; //2
                                                                            int car5A = res5A / 10;  //1
                                                                            if (car64.length() == 0) {

                                                                            } else {
                                                                                int carOn = Integer.parseInt(car64.getText().toString().trim());

                                                                                sxth10A = sxth10A + carOn;
                                                                            }
                                                                            int newCar = sxth10A / 10; //1
                                                                            sxth10A %= 10; //2
                                                                            car5A = car5A + newCar;

                                                                            sxth10.setText(String.valueOf(sxth10A));

                                                                            if (top6.length() == 0) {
                                                                                if (1 == 1) {
                                                                                    sxth11.setText(String.valueOf(car5A)); // line answer
                                                                                    equalsBut.setVisibility(View.INVISIBLE);
                                                                                    second.setVisibility(View.INVISIBLE);
                                                                                    third.setVisibility(View.INVISIBLE);
                                                                                    fourth.setVisibility(View.INVISIBLE);
                                                                                    fifth.setVisibility(View.INVISIBLE);
                                                                                    sixth.setVisibility(View.INVISIBLE);
                                                                                    stepCount.setText("done!");
                                                                                    done();
                                                                                    moveaddsignsixth();


                                                                                    movearrowbodsixthans();
                                                                                    sixth.setText("reset");
                                                                                    reset();
                                                                                    repeat();
                                                                                    step++;
                                                                                    stepCount.setText("Step " + step + "; done!");

                                                                                } else {
                                                                                    sxth11.setText(String.valueOf(car5A));
                                                                                    stepCount.setText("done!");
                                                                                    done();
                                                                                    moveaddsignsixth();
                                                                                    repeat();
                                                                                    movearrowbodsixthans();

                                                                                    sixth.setText("reset");
                                                                                    reset();
                                                                                    repeat();
                                                                                }
                                                                            } else {
                                                                                if (car5A == 0) {

                                                                                } else {
                                                                                    car65.setText(String.valueOf(car5A));
                                                                                }
                                                                                step++;
                                                                                stepCount.setText("Step " + step);
                                                                            }
                                                                        }
                                                                    }

                                                                    if (sxth10.length() != 0) {

                                                                        sixth.setOnClickListener(new View.OnClickListener() {

                                                                            @Override
                                                                            public void onClick(View v) {

                                                                                if (stepCount.getText().equals("Step " + step)) {

                                                                                    if (top6.length() == 0 || bott6.length() == 0) {
                                                                                        if (sixth.getText() == "reset") {

                                                                                        } else {
                                                                                            // display a short message to the screen if things go wrong
                                                                                            Toast.makeText(getApplicationContext(), "Enter one number on the last top row and first rightmost> bottom row", Toast.LENGTH_LONG).show();
                                                                                        }
                                                                                    } else {

                                                                                        int top6A = Integer.parseInt(top6.getText().toString().trim());
                                                                                        int bott6A = Integer.parseInt(bott6.getText().toString().trim());

                                                                                        int res6A = top6A * bott6A;

                                                                                        //Split the results
                                                                                        int sxth11A = res6A % 10; //2
                                                                                        int car6A = res6A / 10;  //1
                                                                                        if (car65.length() == 0) {

                                                                                        } else {
                                                                                            int carOn = Integer.parseInt(car65.getText().toString().trim());
                                                                                            sxth11A = sxth11A + carOn;
                                                                                        }
                                                                                        int newCar = sxth11A / 10; //1
                                                                                        sxth11A %= 10; //2
                                                                                        car6A = car6A + newCar;

                                                                                        sxth11.setText(String.valueOf(sxth11A));

                                                                                        if (sxth6.length() == 0) {
                                                                                            sxth12.setText(String.valueOf(car6A));
                                                                                            stepCount.setText("done!");
                                                                                            done();
                                                                                            moveaddsignsixth();
                                                                                            movearrowbodsixthans();

                                                                                            sixth.setText("reset");
                                                                                            reset();
                                                                                            repeat();
                                                                                        } else {
                                                                                            sxth12.setText(String.valueOf(car6A));
                                                                                            step++;
                                                                                            reset();
                                                                                            repeat();
                                                                                            moveaddsignsixth();
                                                                                            movearrowbodsixthans();
                                                                                            equalsBut.setVisibility(View.INVISIBLE);
                                                                                            second.setVisibility(View.INVISIBLE);
                                                                                            third.setVisibility(View.INVISIBLE);
                                                                                            fourth.setVisibility(View.INVISIBLE);
                                                                                            fifth.setVisibility(View.INVISIBLE);
                                                                                            sixth.setVisibility(View.INVISIBLE);
                                                                                            stepCount.setText("Step " + step + "; done!");
                                                                                            done();


                                                                                            magicHappens();
                                                                                        }
                                                                                        magicHappens();
                                                                                    }
                                                                                    magicHappens();
                                                                                }

                                                                            }

                                                                        });

                                                                        magicHappens();
                                                                    }

                                                                }


                                                            });

                                                            magicHappens();
                                                        }

                                                    }


                                                });

                                                magicHappens();
                                            }

                                        }


                                    });

                                    magicHappens();
                                }

                            }


                        });

                        magicHappens();
                    }
                    magicHappens();
                }


            });

            magicHappens();
        }
        magicHappens();
    }

    public void done() {


        if (fst1.length() == 0) {

        } else {
            res1A = Integer.parseInt(fst1.getText().toString().trim());
        }
        if (fst2.length() == 0) {

        } else {
            res2A = Integer.parseInt(fst2.getText().toString().trim());
        }
        if (fst3.length() == 0) {

        } else {
            res3A = Integer.parseInt(fst3.getText().toString().trim());
        }
        if (fst4.length() == 0) {

        } else {
            res4A = Integer.parseInt(fst4.getText().toString().trim());
        }
        if (fst5.length() == 0) {

        } else {
            res5A = Integer.parseInt(fst5.getText().toString().trim());
        }
        if (fst6.length() == 0) {

        } else {
            res6A = Integer.parseInt(fst6.getText().toString().trim());
        }
        if (fst7.length() == 0) {

        } else {
            res7A = Integer.parseInt(fst7.getText().toString().trim());
        }

        if (scnd2.length() == 0) {

        } else {
            res1C = Integer.parseInt(scnd2.getText().toString().trim());
        }
        if (scnd3.length() == 0) {

        } else {
            res2C = Integer.parseInt(scnd3.getText().toString().trim());
        }
        if (scnd4.length() == 0) {

        } else {
            res3C = Integer.parseInt(scnd4.getText().toString().trim());
        }
        if (scnd5.length() == 0) {

        } else {
            res4C = Integer.parseInt(scnd5.getText().toString().trim());
        }
        if (scnd6.length() == 0) {

        } else {
            res5C = Integer.parseInt(scnd6.getText().toString().trim());
        }
        if (scnd7.length() == 0) {

        } else {
            res6C = Integer.parseInt(scnd7.getText().toString().trim());
        }
        if (scnd8.length() == 0) {

        } else {
            res7C = Integer.parseInt(scnd8.getText().toString().trim());
        }
        if (trd3.length() == 0) {

        } else {
            res1D = Integer.parseInt(trd3.getText().toString().trim());
        }
        if (trd4.length() == 0) {

        } else {
            res2D = Integer.parseInt(trd4.getText().toString().trim());
        }
        if (trd5.length() == 0) {

        } else {
            res3D = Integer.parseInt(trd5.getText().toString().trim());
        }
        if (trd6.length() == 0) {

        } else {
            res4D = Integer.parseInt(trd6.getText().toString().trim());
        }
        if (trd7.length() == 0) {

        } else {
            res5D = Integer.parseInt(trd7.getText().toString().trim());
        }
        if (trd8.length() == 0) {

        } else {
            res6D = Integer.parseInt(trd8.getText().toString().trim());
        }
        if (trd9.length() == 0) {

        } else {
            res7D = Integer.parseInt(trd9.getText().toString().trim());
        }
        if (frth4.length() == 0) {

        } else {
            res1E = Integer.parseInt(frth4.getText().toString().trim());
        }
        if (frth5.length() == 0) {

        } else {
            res2E = Integer.parseInt(frth5.getText().toString().trim());
        }
        if (frth6.length() == 0) {

        } else {
            res3E = Integer.parseInt(frth6.getText().toString().trim());
        }
        if (frth7.length() == 0) {

        } else {
            res4E = Integer.parseInt(frth7.getText().toString().trim());
        }
        if (frth8.length() == 0) {

        } else {
            res5E = Integer.parseInt(frth8.getText().toString().trim());
        }
        if (frth9.length() == 0) {

        } else {
            res6E = Integer.parseInt(frth9.getText().toString().trim());
        }
        if (frth10.length() == 0) {

        } else {
            res7E = Integer.parseInt(frth10.getText().toString().trim());
        }
        if (ffth5.length() == 0) {

        } else {
            res1F = Integer.parseInt(ffth5.getText().toString().trim());
        }
        if (ffth6.length() == 0) {

        } else {
            res2F = Integer.parseInt(ffth6.getText().toString().trim());
        }
        if (ffth7.length() == 0) {

        } else {
            res3F = Integer.parseInt(ffth7.getText().toString().trim());
        }
        if (ffth8.length() == 0) {

        } else {
            res4F = Integer.parseInt(ffth8.getText().toString().trim());
        }
        if (ffth9.length() == 0) {

        } else {
            res5F = Integer.parseInt(ffth9.getText().toString().trim());
        }
        if (ffth10.length() == 0) {

        } else {
            res6F = Integer.parseInt(ffth10.getText().toString().trim());
        }
        if (ffth11.length() == 0) {

        } else {
            res7F = Integer.parseInt(ffth11.getText().toString().trim());
        }
        if (sxth6.length() == 0) {

        } else {

            res1G = Integer.parseInt(sxth6.getText().toString().trim());
        }
        if (sxth7.length() == 0) {

        } else {
            res2G = Integer.parseInt(sxth7.getText().toString().trim());
        }
        if (sxth8.length() == 0) {

        } else {
            res3G = Integer.parseInt(sxth8.getText().toString().trim());
        }
        if (sxth9.length() == 0) {

        } else {
            res4G = Integer.parseInt(sxth9.getText().toString().trim());
        }
        if (sxth10.length() == 0) {

        } else {
            res5G = Integer.parseInt(sxth10.getText().toString().trim());
        }
        if (sxth11.length() == 0) {

        } else {
            res6G = Integer.parseInt(sxth11.getText().toString().trim());
        }
        if (sxth12.length() == 0) {

        } else {
            res7G = Integer.parseInt(sxth12.getText().toString().trim());
        }

        int tot1 = res1A;
        int tot2 = res2A + res1C; //16
        int tot3 = res3A + res2C + res1D; //16
        int tot4 = res4A + res3C + res2D + res1E; //11
        int tot5 = res5A + res4C + res3D + res2E + res1F;
        int tot6 = res6A + res5C + res4D + res3E + res2F + res1G;
        int tot7 = res7A + res6C + res5D + res4E + res3F + res2G;
        int tot8 = res7C + res6D + res5E + res4F + res3G;
        int tot9 = res7D + res6E + res5F + res4G;
        int tot10 = res7E + res6F + res5G;
        int tot11 = res7F + res6G;
        int tot12 = res7G;

        //Split the results

        int secondRowCar = tot2 / 10; //1
        int secondRowBod = tot2 % 10; //2

        int thirdRowBodHappy = tot3 + secondRowCar;
        int thirdRowBod = thirdRowBodHappy % 10;
        int thirdRowCar = thirdRowBodHappy / 10;

        int fourthRowBodHappy = tot4 + thirdRowCar;
        int fourthRowBod = fourthRowBodHappy % 10;
        int fourthRowCar = fourthRowBodHappy / 10;

        int fifthRowBodHappy = tot5 + fourthRowCar;
        int fifthRowBod = fifthRowBodHappy % 10;
        int fifthRowCar = fifthRowBodHappy / 10;

        int sixthRowBodHappy = tot6 + fifthRowCar;
        int sixthRowBod = sixthRowBodHappy % 10;
        int sixthRowCar = sixthRowBodHappy / 10;

        int seventhRowBodHappy = tot7 + sixthRowCar;
        int seventhRowBod = seventhRowBodHappy % 10;
        int seventhRowCar = seventhRowBodHappy / 10;

        int eigthRowBodHappy = tot8 + seventhRowCar;
        int eigthRowBod = eigthRowBodHappy % 10;
        int eigthRowCar = eigthRowBodHappy / 10;

        int ninthRowBodHappy = tot9 + eigthRowCar;
        int ninthRowBod = ninthRowBodHappy % 10;
        int ninthRowCar = ninthRowBodHappy / 10;

        int tenthRowBodHappy = tot10 + ninthRowCar;
        int tenthRowBod = tenthRowBodHappy % 10;
        int tenthRowCar = tenthRowBodHappy / 10;

        int eleventhRowBodHappy = tot11 + tenthRowCar;
        int eleventhRowBod = eleventhRowBodHappy % 10;
        int eleventhRowCar = eleventhRowBodHappy / 10;

        int twelfthRowBodHappy = tot12 + eleventhRowCar;
        int twelfthRowBod = twelfthRowBodHappy % 10;
        int twelfthRowCar = twelfthRowBodHappy / 10;

        int thirteenthRowBodHappy = twelfthRowCar;
        int thirteenthRowBod = thirteenthRowBodHappy;
        int thirteenthRowCar = thirteenthRowBodHappy;


        add2.setText(String.valueOf(secondRowCar));
        add3.setText(String.valueOf(thirdRowCar));
        add4.setText(String.valueOf(fourthRowCar));
        add5.setText(String.valueOf(fifthRowCar));
        add6.setText(String.valueOf(sixthRowCar));
        add7.setText(String.valueOf(seventhRowCar));
        add8.setText(String.valueOf(eigthRowCar));
        add9.setText(String.valueOf(ninthRowCar));
        add10.setText(String.valueOf(tenthRowCar));
        add11.setText(String.valueOf(eleventhRowCar));

        ans1.setText(String.valueOf(tot1));
        ans2.setText(String.valueOf(secondRowBod));
        ans3.setText(String.valueOf(thirdRowBod));
        ans4.setText(String.valueOf(fourthRowBod));
        ans5.setText(String.valueOf(fifthRowBod));
        ans6.setText(String.valueOf(sixthRowBod));
        ans7.setText(String.valueOf(seventhRowBod));
        ans8.setText(String.valueOf(eigthRowBod));
        ans9.setText(String.valueOf(ninthRowBod));
        ans10.setText(String.valueOf(tenthRowBod));
        ans11.setText(String.valueOf(eleventhRowBod));
        ans12.setText(String.valueOf(twelfthRowBod));
        ans13.setText(String.valueOf(thirteenthRowCar));

        magicHappens();

        ans1.setVisibility(View.VISIBLE);
        ans2.setVisibility(View.VISIBLE);
        ans3.setVisibility(View.VISIBLE);
        ans4.setVisibility(View.VISIBLE);
        ans5.setVisibility(View.VISIBLE);
        ans6.setVisibility(View.VISIBLE);
        ans7.setVisibility(View.VISIBLE);
        ans8.setVisibility(View.VISIBLE);
        ans9.setVisibility(View.VISIBLE);
        ans10.setVisibility(View.VISIBLE);
        ans11.setVisibility(View.VISIBLE);
        ans12.setVisibility(View.VISIBLE);

        int num1 = Integer.valueOf(ans1.getText().toString());
        int num2 = Integer.valueOf(ans2.getText().toString());
        int num3 = Integer.valueOf(ans3.getText().toString());
        int num4 = Integer.valueOf(ans4.getText().toString());
        int num5 = Integer.valueOf(ans5.getText().toString());
        int num6 = Integer.valueOf(ans6.getText().toString());
        int num7 = Integer.valueOf(ans7.getText().toString());
        int num8 = Integer.valueOf(ans8.getText().toString());
        int num9 = Integer.valueOf(ans9.getText().toString());
        int num10 = Integer.valueOf(ans10.getText().toString());
        int num11 = Integer.valueOf(ans11.getText().toString());
        int num12 = Integer.valueOf(ans12.getText().toString());
        int num13 = Integer.valueOf(ans13.getText().toString());

        int addnum2 = Integer.valueOf(add2.getText().toString());
        int addnum3 = Integer.valueOf(add3.getText().toString());
        int addnum4 = Integer.valueOf(add4.getText().toString());
        int addnum5 = Integer.valueOf(add5.getText().toString());
        int addnum6 = Integer.valueOf(add6.getText().toString());
        int addnum7 = Integer.valueOf(add7.getText().toString());
        int addnum8 = Integer.valueOf(add8.getText().toString());
        int addnum9 = Integer.valueOf(add9.getText().toString());
        int addnum10 = Integer.valueOf(add10.getText().toString());
        int addnum11 = Integer.valueOf(add11.getText().toString());


        if (num2 == 0 && num3 == 0 && num4 == 0 && num5 == 0 && num6 == 0 && num7 == 0 && num8 == 0 && num9 == 0 && num10 == 0 && num11 == 0 && num12 == 0) {
            ans2.setVisibility(View.INVISIBLE);
            ans3.setVisibility(View.INVISIBLE);
            ans4.setVisibility(View.INVISIBLE);
            ans5.setVisibility(View.INVISIBLE);
            ans6.setVisibility(View.INVISIBLE);
            ans7.setVisibility(View.INVISIBLE);
            ans8.setVisibility(View.INVISIBLE);
            ans9.setVisibility(View.INVISIBLE);
            ans10.setVisibility(View.INVISIBLE);
            ans11.setVisibility(View.INVISIBLE);
            ans12.setVisibility(View.INVISIBLE);

        }

        if (num3 == 0 && num4 == 0 && num5 == 0 && num6 == 0 && num7 == 0 && num8 == 0 && num9 == 0 && num10 == 0 && num11 == 0 && num12 == 0) {
            ans3.setVisibility(View.INVISIBLE);
            ans4.setVisibility(View.INVISIBLE);
            ans5.setVisibility(View.INVISIBLE);
            ans6.setVisibility(View.INVISIBLE);
            ans7.setVisibility(View.INVISIBLE);
            ans8.setVisibility(View.INVISIBLE);
            ans9.setVisibility(View.INVISIBLE);
            ans10.setVisibility(View.INVISIBLE);
            ans11.setVisibility(View.INVISIBLE);
            ans12.setVisibility(View.INVISIBLE);

        }

        if (num4 == 0 && num5 == 0 && num6 == 0 && num7 == 0 && num8 == 0 && num9 == 0 && num10 == 0 && num11 == 0 && num12 == 0) {
            ans4.setVisibility(View.INVISIBLE);
            ans5.setVisibility(View.INVISIBLE);
            ans6.setVisibility(View.INVISIBLE);
            ans7.setVisibility(View.INVISIBLE);
            ans8.setVisibility(View.INVISIBLE);
            ans9.setVisibility(View.INVISIBLE);
            ans10.setVisibility(View.INVISIBLE);
            ans11.setVisibility(View.INVISIBLE);
            ans12.setVisibility(View.INVISIBLE);

        }

        if (num5 == 0 && num6 == 0 && num7 == 0 && num8 == 0 && num9 == 0 && num10 == 0 && num11 == 0 && num12 == 0) {
            ans5.setVisibility(View.INVISIBLE);
            ans6.setVisibility(View.INVISIBLE);
            ans7.setVisibility(View.INVISIBLE);
            ans8.setVisibility(View.INVISIBLE);
            ans9.setVisibility(View.INVISIBLE);
            ans10.setVisibility(View.INVISIBLE);
            ans11.setVisibility(View.INVISIBLE);
            ans12.setVisibility(View.INVISIBLE);

        }

        if (num6 == 0 && num6 == 0 && num7 == 0 && num8 == 0 && num9 == 0 && num10 == 0 && num11 == 0 && num12 == 0) {
            ans6.setVisibility(View.INVISIBLE);
            ans7.setVisibility(View.INVISIBLE);
            ans8.setVisibility(View.INVISIBLE);
            ans9.setVisibility(View.INVISIBLE);
            ans10.setVisibility(View.INVISIBLE);
            ans11.setVisibility(View.INVISIBLE);
            ans12.setVisibility(View.INVISIBLE);

        }


        if (num7 == 0 && num8 == 0 && num9 == 0 && num10 == 0 && num11 == 0 && num12 == 0) {
            ans7.setVisibility(View.INVISIBLE);
            ans8.setVisibility(View.INVISIBLE);
            ans9.setVisibility(View.INVISIBLE);
            ans10.setVisibility(View.INVISIBLE);
            ans11.setVisibility(View.INVISIBLE);
            ans12.setVisibility(View.INVISIBLE);

        }

        if (num8 == 0 && num9 == 0 && num10 == 0 && num11 == 0 && num12 == 0) {
            ans8.setVisibility(View.INVISIBLE);
            ans9.setVisibility(View.INVISIBLE);
            ans10.setVisibility(View.INVISIBLE);
            ans11.setVisibility(View.INVISIBLE);
            ans12.setVisibility(View.INVISIBLE);

        }

        if (num9 == 0 && num10 == 0 && num11 == 0 && num12 == 0) {
            ans9.setVisibility(View.INVISIBLE);
            ans10.setVisibility(View.INVISIBLE);
            ans11.setVisibility(View.INVISIBLE);
            ans12.setVisibility(View.INVISIBLE);

        }

        if (num10 == 0 && num11 == 0 && num12 == 0) {
            ans10.setVisibility(View.INVISIBLE);
            ans11.setVisibility(View.INVISIBLE);
            ans12.setVisibility(View.INVISIBLE);

        }

        if (num11 == 0 && num12 == 0) {
            ans11.setVisibility(View.INVISIBLE);
            ans12.setVisibility(View.INVISIBLE);

        }


        if (addnum2 == 0) {
            add2.setText("");
        }
        if (addnum3 == 0) {
            add3.setText("");
        }
        if (addnum4 == 0) {
            add4.setText("");
        }
        if (addnum5 == 0) {
            add5.setText("");
        }
        if (addnum6 == 0) {
            add6.setText("");
        }
        if (addnum7 == 0) {
            add7.setText("");
        }
        if (addnum8 == 0) {
            add8.setText("");
        }
        if (addnum9 == 0) {
            add9.setText("");
        }
        if (addnum10 == 0) {
            add10.setText("");
        }
        if (addnum11 == 0) {
            add11.setText("");
        }

        moveadd3first();
        moveadd4sec();
        moveadd5third();
        moveadd6fourth();
        moveadd7fifth();

        moveadd4first2();
        moveadd5sec2();
        moveadd6third2();
        moveadd7fourth2();
        moveadd8fifth2();

        moveadd5first3();
        moveadd6sec3();
        moveadd7third3();
        moveadd8fourth3();
        moveadd9fifth3();

        moveadd6first4();
        moveadd7sec4();
        moveadd8third4();
        moveadd9fourth4();
        moveadd10fifth4();

        moveadd7first5();
        moveadd8sec5();
        moveadd9third5();
        moveadd10fourth5();
        moveadd11fifth5();


    }


    public void repeat() {
        repeat.setVisibility(View.VISIBLE);

        repeat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Toast.makeText(getApplicationContext(), "Repeat Steps?", Toast.LENGTH_LONG).show();
                repeat.setText("Yes");
                areYouSure.setText("No, Reset");

                if (repeat.getText() == "Yes" || repeat.getText() == "No, Reset") {
                    repeat.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {

                            magicHappens();
                            moveStuffAround();
                            moveBottlinefirst();

                            areYouSure.setVisibility(View.INVISIBLE);
                            areYouSure.setText("reset");
                            equalsBut.setVisibility(View.VISIBLE);
                            equalsBut.setText("equals");
                            stepCount.setText("Start");
                            second.setVisibility(View.INVISIBLE);
                            second.setText(("next"));
                            third.setVisibility(View.INVISIBLE);
                            third.setText(("next"));
                            fourth.setVisibility(View.INVISIBLE);
                            fourth.setText(("next"));
                            fifth.setVisibility(View.INVISIBLE);
                            fifth.setText(("next"));
                            sixth.setVisibility(View.INVISIBLE);
                            sixth.setText(("next"));
                            repeat.setVisibility(View.INVISIBLE);
                            repeat.setText(("repeat?"));
                            seventh.setVisibility(View.VISIBLE);

                            fst1.setText("");
                            fst2.setText("");
                            fst3.setText("");
                            fst4.setText("");
                            fst5.setText("");
                            fst6.setText("");
                            fst7.setText("");

                            scnd1.setText("");
                            scnd2.setText("");
                            scnd3.setText("");
                            scnd4.setText("");
                            scnd5.setText("");
                            scnd6.setText("");
                            scnd7.setText("");
                            scnd8.setText("");

                            trd1.setText("");
                            trd2.setText("");
                            trd3.setText("");
                            trd4.setText("");
                            trd5.setText("");
                            trd6.setText("");
                            trd7.setText("");
                            trd8.setText("");
                            trd9.setText("");

                            frth1.setText("");
                            frth2.setText("");
                            frth3.setText("");
                            frth4.setText("");
                            frth5.setText("");
                            frth6.setText("");
                            frth7.setText("");
                            frth8.setText("");
                            frth9.setText("");
                            frth10.setText("");

                            ffth1.setText("");
                            ffth2.setText("");
                            ffth3.setText("");
                            ffth4.setText("");
                            ffth5.setText("");
                            ffth6.setText("");
                            ffth7.setText("");
                            ffth8.setText("");
                            ffth9.setText("");
                            ffth10.setText("");
                            ffth11.setText("");

                            sxth1.setText("");
                            sxth2.setText("");
                            sxth3.setText("");
                            sxth4.setText("");
                            sxth5.setText("");
                            sxth6.setText("");
                            sxth7.setText("");
                            sxth8.setText("");
                            sxth9.setText("");
                            sxth10.setText("");
                            sxth11.setText("");
                            sxth12.setText("");

                            car11.setText("");
                            car12.setText("");
                            car13.setText("");
                            car14.setText("");
                            car15.setText("");

                            car21.setText("");
                            car22.setText("");
                            car23.setText("");
                            car24.setText("");
                            car25.setText("");

                            car31.setText("");
                            car32.setText("");
                            car33.setText("");
                            car34.setText("");
                            car35.setText("");

                            car41.setText("");
                            car42.setText("");
                            car43.setText("");
                            car44.setText("");
                            car45.setText("");

                            car51.setText("");
                            car52.setText("");
                            car53.setText("");
                            car54.setText("");
                            car55.setText("");

                            car61.setText("");
                            car62.setText("");
                            car63.setText("");
                            car64.setText("");
                            car65.setText("");

                            ans1.setText("");
                            ans2.setText("");
                            ans3.setText("");
                            ans4.setText("");
                            ans5.setText("");
                            ans6.setText("");
                            ans7.setText("");
                            ans8.setText("");
                            ans9.setText("");
                            ans10.setText("");
                            ans11.setText("");
                            ans12.setText("");
                            ans13.setText("");

                            add2.setText("");
                            add3.setText("");
                            add4.setText("");
                            add5.setText("");
                            add6.setText("");
                            add7.setText("");
                            add8.setText("");
                            add9.setText("");
                            add10.setText("");
                            add11.setText("");

                            step = 0;

                            res1A = 0;
                            res2A = 0;
                            res3A = 0;
                            res4A = 0;
                            res5A = 0;
                            res6A = 0;
                            res7A = 0;

                            res1C = 0;
                            res2C = 0;
                            res3C = 0;
                            res4C = 0;
                            res5C = 0;
                            res6C = 0;
                            res7C = 0;

                            res1D = 0;
                            res2D = 0;
                            res3D = 0;
                            res4D = 0;
                            res5D = 0;
                            res6D = 0;
                            res7D = 0;

                            res1E = 0;
                            res2E = 0;
                            res3E = 0;
                            res4E = 0;
                            res5E = 0;
                            res6E = 0;
                            res7E = 0;

                            res1F = 0;
                            res2F = 0;
                            res3F = 0;
                            res4F = 0;
                            res5F = 0;
                            res6F = 0;
                            res7F = 0;

                            res1G = 0;
                            res2G = 0;
                            res3G = 0;
                            res4G = 0;
                            res5G = 0;
                            res6G = 0;
                            res7G = 0;

                            scnd1.setVisibility(View.INVISIBLE);

                            trd1.setVisibility(View.INVISIBLE);
                            trd2.setVisibility(View.INVISIBLE);

                            frth1.setVisibility(View.INVISIBLE);
                            frth2.setVisibility(View.INVISIBLE);
                            frth3.setVisibility(View.INVISIBLE);

                            ffth1.setVisibility(View.INVISIBLE);
                            ffth2.setVisibility(View.INVISIBLE);
                            ffth3.setVisibility(View.INVISIBLE);
                            ffth4.setVisibility(View.INVISIBLE);

                            sxth1.setVisibility(View.INVISIBLE);
                            sxth2.setVisibility(View.INVISIBLE);
                            sxth3.setVisibility(View.INVISIBLE);
                            sxth4.setVisibility(View.INVISIBLE);
                            sxth5.setVisibility(View.INVISIBLE);

                            carln1.setVisibility(View.INVISIBLE);
                            carln2.setVisibility(View.INVISIBLE);
                            carln3.setVisibility(View.INVISIBLE);
                            carln4.setVisibility(View.INVISIBLE);
                            carln5.setVisibility(View.INVISIBLE);
                            carln6.setVisibility(View.INVISIBLE);


                            first();
                            moveaddsigngone();
                            addhor.setVisibility(View.INVISIBLE);
                            addver.setVisibility(View.INVISIBLE);
                            moveaddallrestcar();
                            moveansreset();

                        }
                    });
                }
            }

        });


    }


    public void magicHappens() {

        ArrayList<TextView> all = new ArrayList<TextView>();

        all.add(car11);
        all.add(car12);
        all.add(car13);
        all.add(car14);
        all.add(car15);

        all.add(car21);
        all.add(car22);
        all.add(car23);
        all.add(car24);
        all.add(car25);

        all.add(car31);
        all.add(car32);
        all.add(car33);
        all.add(car34);
        all.add(car35);

        all.add(car41);
        all.add(car42);
        all.add(car43);
        all.add(car44);
        all.add(car45);

        all.add(car51);
        all.add(car52);
        all.add(car53);
        all.add(car54);
        all.add(car55);

        all.add(car61);
        all.add(car62);
        all.add(car63);
        all.add(car64);
        all.add(car65);


        all.add(fst1);
        all.add(fst2);
        all.add(fst3);
        all.add(fst4);
        all.add(fst5);
        all.add(fst6);
        all.add(fst7);

        all.add(scnd2);
        all.add(scnd3);
        all.add(scnd4);
        all.add(scnd5);
        all.add(scnd6);
        all.add(scnd7);
        all.add(scnd8);

        all.add(trd3);
        all.add(trd4);
        all.add(trd5);
        all.add(trd6);
        all.add(trd7);
        all.add(trd8);
        all.add(trd9);

        all.add(frth4);
        all.add(frth5);
        all.add(frth6);
        all.add(frth7);
        all.add(frth8);
        all.add(frth9);
        all.add(frth10);

        all.add(ffth5);
        all.add(ffth6);
        all.add(ffth7);
        all.add(ffth8);
        all.add(ffth9);
        all.add(ffth10);
        all.add(ffth11);

        all.add(sxth6);
        all.add(sxth7);
        all.add(sxth8);
        all.add(sxth9);
        all.add(sxth10);
        all.add(sxth11);
        all.add(sxth12);

        all.add(add2);
        all.add(add3);
        all.add(add4);
        all.add(add5);
        all.add(add6);
        all.add(add7);
        all.add(add8);
        all.add(add9);
        all.add(add10);
        all.add(add11);

        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).length() == 0) {
                all.get(i).setVisibility(View.INVISIBLE);
            } else {

                all.get(i).setVisibility(View.VISIBLE);
            }

        }

        ArrayList<TextView> answer0 = new ArrayList<TextView>();

        answer0.add(add2);
        answer0.add(add3);
        answer0.add(add4);
        answer0.add(add5);
        answer0.add(add6);
        answer0.add(add7);
        answer0.add(add8);
        answer0.add(add9);
        answer0.add(add10);
        answer0.add(add11);

        for (int i = 0; i < answer0.size(); i++) {
            if (answer0.get(i).getText().equals("0")) {
                answer0.get(i).setVisibility(View.INVISIBLE);
            } else {

                answer0.get(i).setVisibility(View.VISIBLE);
            }

        }


    }

    public void moveStuffAround() {


        scnd1.setVisibility(View.INVISIBLE);

        trd1.setVisibility(View.INVISIBLE);
        trd2.setVisibility(View.INVISIBLE);

        frth1.setVisibility(View.INVISIBLE);
        frth2.setVisibility(View.INVISIBLE);
        frth3.setVisibility(View.INVISIBLE);

        ffth1.setVisibility(View.INVISIBLE);
        ffth2.setVisibility(View.INVISIBLE);
        ffth3.setVisibility(View.INVISIBLE);
        ffth4.setVisibility(View.INVISIBLE);

        sxth1.setVisibility(View.INVISIBLE);
        sxth2.setVisibility(View.INVISIBLE);
        sxth3.setVisibility(View.INVISIBLE);
        sxth4.setVisibility(View.INVISIBLE);
        sxth5.setVisibility(View.INVISIBLE);

        ans1.setVisibility(View.INVISIBLE);
        ans2.setVisibility(View.INVISIBLE);
        ans3.setVisibility(View.INVISIBLE);
        ans4.setVisibility(View.INVISIBLE);
        ans5.setVisibility(View.INVISIBLE);
        ans6.setVisibility(View.INVISIBLE);
        ans7.setVisibility(View.INVISIBLE);
        ans8.setVisibility(View.INVISIBLE);
        ans9.setVisibility(View.INVISIBLE);
        ans10.setVisibility(View.INVISIBLE);
        ans11.setVisibility(View.INVISIBLE);
        ans12.setVisibility(View.INVISIBLE);
        ans13.setVisibility(View.INVISIBLE);

        carln1.setVisibility(View.INVISIBLE);
        carln2.setVisibility(View.INVISIBLE);
        carln3.setVisibility(View.INVISIBLE);
        carln4.setVisibility(View.INVISIBLE);
        carln5.setVisibility(View.INVISIBLE);
        carln6.setVisibility(View.INVISIBLE);

        addhor.setVisibility(View.INVISIBLE);
        addver.setVisibility(View.INVISIBLE);


    }


    public void reset() {

        areYouSure.setVisibility(View.VISIBLE);
        areYouSure.setText("reset");
        if (!stepCount.getText().equals("done!")) {

        } else {
            equalsBut.setVisibility(View.INVISIBLE);
        }

        second.setVisibility(View.INVISIBLE);
        third.setVisibility(View.INVISIBLE);
        fourth.setVisibility(View.INVISIBLE);
        fifth.setVisibility(View.INVISIBLE);
        sixth.setVisibility(View.INVISIBLE);

        repeat.setText(("repeat?"));
        repeat.setVisibility(View.INVISIBLE);


        areYouSure.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Toast.makeText(getApplicationContext(), "Are you sure?", Toast.LENGTH_LONG).show();
                areYouSure.setText("Yes");
                if (!stepCount.getText().equals("done!")) {

                } else {
                    repeat();
                }
                if (areYouSure.getText() == "Yes") {
                    areYouSure.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {

                            magicHappens();
                            moveStuffAround();
                            moveBottlinefirst();

                            areYouSure.setVisibility(View.INVISIBLE);
                            areYouSure.setText("reset");
                            equalsBut.setVisibility(View.VISIBLE);
                            equalsBut.setText("equals");
                            stepCount.setText("Start");
                            second.setVisibility(View.INVISIBLE);
                            second.setText(("next"));
                            third.setVisibility(View.INVISIBLE);
                            third.setText(("next"));
                            fourth.setVisibility(View.INVISIBLE);
                            fourth.setText(("next"));
                            fifth.setVisibility(View.INVISIBLE);
                            fifth.setText(("next"));
                            sixth.setVisibility(View.INVISIBLE);
                            sixth.setText(("next"));
                            repeat.setVisibility(View.INVISIBLE);
                            repeat.setText(("repeat?"));
                            seventh.setVisibility(View.VISIBLE);

                            scnd1.setVisibility(View.INVISIBLE);

                            trd1.setVisibility(View.INVISIBLE);
                            trd2.setVisibility(View.INVISIBLE);

                            frth1.setVisibility(View.INVISIBLE);
                            frth2.setVisibility(View.INVISIBLE);
                            frth3.setVisibility(View.INVISIBLE);

                            ffth1.setVisibility(View.INVISIBLE);
                            ffth2.setVisibility(View.INVISIBLE);
                            ffth3.setVisibility(View.INVISIBLE);
                            ffth4.setVisibility(View.INVISIBLE);

                            sxth1.setVisibility(View.INVISIBLE);
                            sxth2.setVisibility(View.INVISIBLE);
                            sxth3.setVisibility(View.INVISIBLE);
                            sxth4.setVisibility(View.INVISIBLE);
                            sxth5.setVisibility(View.INVISIBLE);

                            ans1.setVisibility(View.INVISIBLE);
                            ans2.setVisibility(View.INVISIBLE);
                            ans3.setVisibility(View.INVISIBLE);
                            ans4.setVisibility(View.INVISIBLE);
                            ans5.setVisibility(View.INVISIBLE);
                            ans6.setVisibility(View.INVISIBLE);
                            ans7.setVisibility(View.INVISIBLE);
                            ans8.setVisibility(View.INVISIBLE);
                            ans9.setVisibility(View.INVISIBLE);
                            ans10.setVisibility(View.INVISIBLE);
                            ans11.setVisibility(View.INVISIBLE);
                            ans12.setVisibility(View.INVISIBLE);
                            ans13.setVisibility(View.INVISIBLE);

                            carln1.setVisibility(View.INVISIBLE);
                            carln2.setVisibility(View.INVISIBLE);
                            carln3.setVisibility(View.INVISIBLE);
                            carln4.setVisibility(View.INVISIBLE);
                            carln5.setVisibility(View.INVISIBLE);
                            carln6.setVisibility(View.INVISIBLE);


                            top.setText("");
                            top2.setText("");
                            top3.setText("");
                            top4.setText("");
                            top5.setText("");
                            top6.setText("");

                            bott.setText("");
                            bott2.setText("");
                            bott3.setText("");
                            bott4.setText("");
                            bott5.setText("");
                            bott6.setText("");

                            fst1.setText("");
                            fst2.setText("");
                            fst3.setText("");
                            fst4.setText("");
                            fst5.setText("");
                            fst6.setText("");
                            fst7.setText("");

                            scnd1.setText("");
                            scnd2.setText("");
                            scnd3.setText("");
                            scnd4.setText("");
                            scnd5.setText("");
                            scnd6.setText("");
                            scnd7.setText("");
                            scnd8.setText("");

                            trd1.setText("");
                            trd2.setText("");
                            trd3.setText("");
                            trd4.setText("");
                            trd5.setText("");
                            trd6.setText("");
                            trd7.setText("");
                            trd8.setText("");
                            trd9.setText("");

                            frth1.setText("");
                            frth2.setText("");
                            frth3.setText("");
                            frth4.setText("");
                            frth5.setText("");
                            frth6.setText("");
                            frth7.setText("");
                            frth8.setText("");
                            frth9.setText("");
                            frth10.setText("");

                            ffth1.setText("");
                            ffth2.setText("");
                            ffth3.setText("");
                            ffth4.setText("");
                            ffth5.setText("");
                            ffth6.setText("");
                            ffth7.setText("");
                            ffth8.setText("");
                            ffth9.setText("");
                            ffth10.setText("");
                            ffth11.setText("");

                            sxth1.setText("");
                            sxth2.setText("");
                            sxth3.setText("");
                            sxth4.setText("");
                            sxth5.setText("");
                            sxth6.setText("");
                            sxth7.setText("");
                            sxth8.setText("");
                            sxth9.setText("");
                            sxth10.setText("");
                            sxth11.setText("");
                            sxth12.setText("");

                            car11.setText("");
                            car12.setText("");
                            car13.setText("");
                            car14.setText("");
                            car15.setText("");

                            car21.setText("");
                            car22.setText("");
                            car23.setText("");
                            car24.setText("");
                            car25.setText("");

                            car31.setText("");
                            car32.setText("");
                            car33.setText("");
                            car34.setText("");
                            car35.setText("");

                            car41.setText("");
                            car42.setText("");
                            car43.setText("");
                            car44.setText("");
                            car45.setText("");

                            car51.setText("");
                            car52.setText("");
                            car53.setText("");
                            car54.setText("");
                            car55.setText("");

                            car61.setText("");
                            car62.setText("");
                            car63.setText("");
                            car64.setText("");
                            car65.setText("");

                            ans1.setText("");
                            ans2.setText("");
                            ans3.setText("");
                            ans4.setText("");
                            ans5.setText("");
                            ans6.setText("");
                            ans7.setText("");
                            ans8.setText("");
                            ans9.setText("");
                            ans10.setText("");
                            ans11.setText("");
                            ans12.setText("");
                            ans13.setText("");

                            ans1.setText("");
                            ans2.setText("");
                            ans3.setText("");
                            ans4.setText("");
                            ans5.setText("");
                            ans6.setText("");
                            ans7.setText("");
                            ans8.setText("");
                            ans9.setText("");
                            ans10.setText("");
                            ans11.setText("");
                            ans12.setText("");
                            ans13.setText("");

                            ans1.setVisibility(View.GONE);
                            ans2.setVisibility(View.GONE);
                            ans3.setVisibility(View.GONE);
                            ans4.setVisibility(View.GONE);
                            ans5.setVisibility(View.GONE);
                            ans6.setVisibility(View.GONE);
                            ans7.setVisibility(View.GONE);
                            ans8.setVisibility(View.GONE);
                            ans9.setVisibility(View.GONE);
                            ans10.setVisibility(View.GONE);
                            ans11.setVisibility(View.GONE);
                            ans12.setVisibility(View.GONE);
                            ans13.setVisibility(View.GONE);

                            add2.setText("");
                            add3.setText("");
                            add4.setText("");
                            add5.setText("");
                            add6.setText("");
                            add7.setText("");
                            add8.setText("");
                            add9.setText("");
                            add10.setText("");
                            add11.setText("");

                            res1A = 0;
                            res2A = 0;
                            res3A = 0;
                            res4A = 0;
                            res5A = 0;
                            res6A = 0;
                            res7A = 0;

                            res1C = 0;
                            res2C = 0;
                            res3C = 0;
                            res4C = 0;
                            res5C = 0;
                            res6C = 0;
                            res7C = 0;

                            res1D = 0;
                            res2D = 0;
                            res3D = 0;
                            res4D = 0;
                            res5D = 0;
                            res6D = 0;
                            res7D = 0;

                            res1E = 0;
                            res2E = 0;
                            res3E = 0;
                            res4E = 0;
                            res5E = 0;
                            res6E = 0;
                            res7E = 0;

                            res1F = 0;
                            res2F = 0;
                            res3F = 0;
                            res4F = 0;
                            res5F = 0;
                            res6F = 0;
                            res7F = 0;

                            res1G = 0;
                            res2G = 0;
                            res3G = 0;
                            res4G = 0;
                            res5G = 0;
                            res6G = 0;
                            res7G = 0;

                            step = 0;

                            first();
                            moveaddsigngone();
                            addhor.setVisibility(View.INVISIBLE);
                            addver.setVisibility(View.INVISIBLE);
                            moveaddallrestcar();
                            moveansreset();
                        }
                    });
                }
            }

        });
    }


    public void moveBottlinefirst() {

        // Load the animation like this
        bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bottslidefirst);

        //Start Animation
        bottline.startAnimation(bottlineMovement);

    }

    public void moveBottlinesec() {

        // Load the animation like this
        bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bottslidesec);

        //Start Animation
        bottline.startAnimation(bottlineMovement);
    }

    public void moveBottlinethird() {

        // Load the animation like this
        bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bottslidethird);

        //Start Animation
        bottline.startAnimation(bottlineMovement);
    }

    public void moveBottlinefourth() {

        // Load the animation like this
        bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bottslidefourth);

        //Start Animation
        bottline.startAnimation(bottlineMovement);
    }

    public void moveBottlinefifth() {

        // Load the animation like this
        bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bottslidefifth);

        //Start Animation
        bottline.startAnimation(bottlineMovement);
    }

    public void moveBottlinesixth() {

        // Load the animation like this
        bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bottslidesixth);

        //Start Animation
        bottline.startAnimation(bottlineMovement);
    }


    public void movearrowbodstart() {

        // Load the animation like this
        bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.movearrowbodfirststart);

        //Start Animation
        arrowbod.startAnimation(bottlineMovement);

    }

    public void movearrowbodfirstans() {
        if (car11.length() == 0 && car12.length() == 0 && car13.length() == 0 && car14.length() == 0 && car15.length() == 0) {

        } else {
            carln1.setVisibility(View.VISIBLE);

        }
        // Load the animation like this
        bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.movearrowbodfirstans);

        //Start Animation
        arrowbod.startAnimation(bottlineMovement);

    }

    public void movearrowbodsecans() {
        if (car21.length() == 0 && car22.length() == 0 && car23.length() == 0 && car24.length() == 0 && car25.length() == 0) {

        } else {

            carln2.setVisibility(View.VISIBLE);
        }

        // Load the animation like this
        bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.movearrowbodsecans);

        //Start Animation
        arrowbod.startAnimation(bottlineMovement);
    }

    public void movearrowbodthirdans() {
        if (car31.length() == 0 && car32.length() == 0 && car33.length() == 0 && car34.length() == 0 && car35.length() == 0) {

        } else {
            carln3.setVisibility(View.VISIBLE);

        }
        // Load the animation like this
        bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.movearrowbodthirdans);

        //Start Animation
        arrowbod.startAnimation(bottlineMovement);
    }

    public void movearrowbodfourthans() {
        if (car41.length() == 0 && car42.length() == 0 && car43.length() == 0 && car44.length() == 0 && car45.length() == 0) {

        } else {
            carln4.setVisibility(View.VISIBLE);
        }

        // Load the animation like this
        bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.movearrowbodfourthans);

        //Start Animation
        arrowbod.startAnimation(bottlineMovement);
    }

    public void movearrowbodfifthans() {
        if (car51.length() == 0 && car52.length() == 0 && car53.length() == 0 && car54.length() == 0 && car55.length() == 0) {

        } else {
            carln5.setVisibility(View.VISIBLE);

        }
        // Load the animation like this
        bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.movearrowbodfifthans);

        //Start Animation
        arrowbod.startAnimation(bottlineMovement);
    }

    public void movearrowbodsixthans() {
        if (car61.length() == 0 && car62.length() == 0 && car63.length() == 0 && car64.length() == 0 && car65.length() == 0) {

        } else {
            carln6.setVisibility(View.VISIBLE);

        }

// Load the animation like this
        bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.movearrowbodsixthans);

        //Start Animation
        arrowbod.startAnimation(bottlineMovement);
    }

    public void moveaddsignsec() {


        // Load the animation like this
        if (top5.length() != 0 || top6.length() != 0) {
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveaddsignsectwo);
        } else {
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveaddsignsec);
        }
        //Start Animation
        addhor.startAnimation(bottlineMovement);
        addver.startAnimation(bottlineMovement);

    }

    public void moveaddsignthird() {

        // Load the animation like this
        if (top5.length() != 0 || top6.length() != 0) {
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveaddsignthirdthree);
        } else {
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveaddsignthird);
        }

        //Start Animation
        addhor.startAnimation(bottlineMovement);
        addver.startAnimation(bottlineMovement);


    }

    public void moveaddsignfourth() {

        // Load the animation like this
        if (top5.length() != 0 || top6.length() != 0) {
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveaddsignfourthfour);
        } else {
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveaddsignfourth);
        }

        //Start Animation
        addhor.startAnimation(bottlineMovement);
        addver.startAnimation(bottlineMovement);


    }

    public void moveaddsignfifth() {

        // Load the animation like this
        if (top5.length() != 0 || top6.length() != 0) {
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveaddsignfifthfive);

        } else {
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveaddsignfifth);
        }

        //Start Animation
        addhor.startAnimation(bottlineMovement);
        addver.startAnimation(bottlineMovement);


    }

    public void moveaddsignsixth() {

        // Load the animation like this
        if (top5.length() != 0 || top6.length() != 0) {
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveaddsignsixthsix);
        } else {
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveaddsignsixth);
        }
        //Start Animation
        addhor.startAnimation(bottlineMovement);
        addver.startAnimation(bottlineMovement);


    }

    public void moveaddsigngone() {

        // Load the animation like this
        bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.moveaddsigngone);

        //Start Animation
        addhor.startAnimation(bottlineMovement);
        addver.startAnimation(bottlineMovement);

    }


    public void moveadd3first() {
        if (fst4.length() == 0 && top2.length() != 0 && top3.length() == 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd3first);

            //Start Animation
            add3.startAnimation(bottlineMovement);


            add8.setText("");
            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
        if (fst4.length() == 0 && top2.length() != 0 && top3.length() == 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd3first);

            //Start Animation
            add3.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add6.setText("");
            }
            if (bott4.length() == 0) {
                add5.setText("");
            }
            if (bott3.length() == 0) {
                add4.setText("");
            }
            if (bott2.length() == 0) {
                add3.setText("");
            }
            add7.setText("");
            add8.setText("");
            add9.setText("");
            add10.setText("");
            add11.setText("");
        }

    }

    public void moveadd4sec() {
        if (fst4.length() == 0 && top2.length() != 0 && top3.length() == 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd4sec);

            //Start Animation
            add4.startAnimation(bottlineMovement);


            add8.setText("");
            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
        if (fst4.length() == 0 && top2.length() != 0 && top3.length() == 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd4sec);

            //Start Animation
            add4.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add6.setText("");
            }
            if (bott4.length() == 0) {
                add5.setText("");
            }
            if (bott3.length() == 0) {
                add4.setText("");
            }
            if (bott2.length() == 0) {
                add3.setText("");
            }
            add7.setText("");
            add8.setText("");
            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
    }

    public void moveadd5third() {
        if (fst4.length() == 0 & top2.length() != 0 && top3.length() == 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd5third);

            //Start Animation
            add5.startAnimation(bottlineMovement);

            add8.setText("");
            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
        if (fst4.length() == 0 && top2.length() != 0 && top3.length() == 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd5third);

            //Start Animation
            add5.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add6.setText("");
            }
            if (bott4.length() == 0) {
                add5.setText("");
            }
            if (bott3.length() == 0) {
                add4.setText("");
            }
            if (bott2.length() == 0) {
                add3.setText("");
            }
            add7.setText("");
            add8.setText("");
            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
    }

    public void moveadd6fourth() {
        if (fst4.length() == 0 & top2.length() != 0 && top3.length() == 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd6fourth);

            //Start Animation
            add6.startAnimation(bottlineMovement);

            add8.setText("");
            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
        if (fst4.length() == 0 && top2.length() != 0 && top3.length() == 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd6fourth);

            //Start Animation
            add6.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add6.setText("");
            }
            if (bott4.length() == 0) {
                add5.setText("");
            }
            if (bott3.length() == 0) {
                add4.setText("");
            }
            if (bott2.length() == 0) {
                add3.setText("");
            }
            add7.setText("");
            add8.setText("");
            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
    }

    public void moveadd7fifth() {
        if (fst4.length() == 0 & top2.length() != 0 && top3.length() == 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd7fifth);

            //Start Animation
            add7.startAnimation(bottlineMovement);

            add8.setText("");
            add9.setText("");
            add10.setText("");
            add11.setText("");
        }

        if (fst4.length() == 0 && top2.length() != 0 && top3.length() == 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd7fifth);

            //Start Animation
            add7.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add6.setText("");
            }
            if (bott4.length() == 0) {
                add5.setText("");
            }
            if (bott3.length() == 0) {
                add4.setText("");
            }
            if (bott2.length() == 0) {
                add3.setText("");
            }
            add7.setText("");
            add8.setText("");
            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
    }

    public void moveadd4first2() {
        if (fst5.length() == 0 && top3.length() != 0 && top4.length() == 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd4first2);

            //Start Animation
            add4.startAnimation(bottlineMovement);


            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
        if (fst5.length() == 0 && top3.length() != 0 && top4.length() == 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd4first2);

            //Start Animation
            add4.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add7.setText("");
            }
            if (bott4.length() == 0) {
                add6.setText("");
            }
            if (bott3.length() == 0) {
                add5.setText("");
            }
            if (bott2.length() == 0) {
                add4.setText("");
            }

            add8.setText("");
            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
    }

    public void moveadd5sec2() {
        if (fst5.length() == 0 && top3.length() != 0 && top4.length() == 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd5sec2);

            //Start Animation
            add5.startAnimation(bottlineMovement);


            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
        if (fst5.length() == 0 && top3.length() != 0 && top4.length() == 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd5sec2);

            //Start Animation
            add5.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add7.setText("");
            }
            if (bott4.length() == 0) {
                add6.setText("");
            }
            if (bott3.length() == 0) {
                add5.setText("");
            }
            if (bott2.length() == 0) {
                add4.setText("");
            }

            add8.setText("");
            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
    }

    public void moveadd6third2() {
        if (fst5.length() == 0 && top3.length() != 0 && top4.length() == 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd6third2);

            //Start Animation
            add6.startAnimation(bottlineMovement);
            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
        if (fst5.length() == 0 && top3.length() != 0 && top4.length() == 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd6third2);

            //Start Animation
            add6.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add7.setText("");
            }
            if (bott4.length() == 0) {
                add6.setText("");
            }
            if (bott3.length() == 0) {
                add5.setText("");
            }
            if (bott2.length() == 0) {
                add4.setText("");
            }

            add8.setText("");
            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
    }

    public void moveadd7fourth2() {
        if (fst5.length() == 0 && top3.length() != 0 && top4.length() == 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd7fourth2);

            //Start Animation
            add7.startAnimation(bottlineMovement);
            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
        if (fst5.length() == 0 && top3.length() != 0 && top4.length() == 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd7fourth2);

            //Start Animation
            add7.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add7.setText("");
            }
            if (bott4.length() == 0) {
                add6.setText("");
            }
            if (bott3.length() == 0) {
                add5.setText("");
            }
            if (bott2.length() == 0) {
                add4.setText("");
            }

            add8.setText("");
            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
    }

    public void moveadd8fifth2() {
        if (fst5.length() == 0 && top3.length() != 0 && top4.length() == 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd8fifth2);

            //Start Animation
            add8.startAnimation(bottlineMovement);
            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
        if (fst5.length() == 0 && top3.length() != 0 && top4.length() == 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd8fifth2);

            //Start Animation
            add8.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add7.setText("");
            }
            if (bott4.length() == 0) {
                add6.setText("");
            }
            if (bott3.length() == 0) {
                add5.setText("");
            }
            if (bott2.length() == 0) {
                add4.setText("");
            }

            add8.setText("");
            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
    }

    public void moveadd5first3() {
        if (fst6.length() == 0 && top4.length() != 0 && top5.length() == 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd5first3);

            //Start Animation
            add5.startAnimation(bottlineMovement);

            add10.setText("");
            add11.setText("");
        }
        if (fst6.length() == 0 && top4.length() != 0 && top5.length() == 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd5first3);

            //Start Animation
            add5.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add8.setText("");
            }
            if (bott4.length() == 0) {
                add7.setText("");
            }
            if (bott3.length() == 0) {
                add6.setText("");
            }
            if (bott2.length() == 0) {
                add5.setText("");
            }

            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
    }

    public void moveadd6sec3() {
        if (fst6.length() == 0 && top4.length() != 0 && top5.length() == 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd6sec3);

            //Start Animation
            add6.startAnimation(bottlineMovement);

            add10.setText("");
            add11.setText("");
        }
        if (fst6.length() == 0 && top4.length() != 0 && top5.length() == 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd6sec3);

            //Start Animation
            add6.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add8.setText("");
            }
            if (bott4.length() == 0) {
                add7.setText("");
            }
            if (bott3.length() == 0) {
                add6.setText("");
            }
            if (bott2.length() == 0) {
                add5.setText("");
            }

            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
    }

    public void moveadd7third3() {
        if (fst6.length() == 0 && top4.length() != 0 && top5.length() == 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd7third3);

            //Start Animation
            add7.startAnimation(bottlineMovement);
            add10.setText("");
            add11.setText("");
        }
        if (fst6.length() == 0 && top4.length() != 0 && top5.length() == 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd7third3);

            //Start Animation
            add7.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add8.setText("");
            }
            if (bott4.length() == 0) {
                add7.setText("");
            }
            if (bott3.length() == 0) {
                add6.setText("");
            }
            if (bott2.length() == 0) {
                add5.setText("");
            }

            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
    }

    public void moveadd8fourth3() {
        if (fst6.length() == 0 && top4.length() != 0 && top5.length() == 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd8fourth3);

            //Start Animation
            add8.startAnimation(bottlineMovement);
            add10.setText("");
            add11.setText("");
        }
        if (fst6.length() == 0 && top4.length() != 0 && top5.length() == 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd8fourth3);

            //Start Animation
            add8.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add8.setText("");
            }
            if (bott4.length() == 0) {
                add7.setText("");
            }
            if (bott3.length() == 0) {
                add6.setText("");
            }
            if (bott2.length() == 0) {
                add5.setText("");
            }

            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
    }

    public void moveadd9fifth3() {
        if (fst6.length() == 0 && top4.length() != 0 && top5.length() == 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd9fifth3);

            //Start Animation
            add9.startAnimation(bottlineMovement);
            add10.setText("");
            add11.setText("");
        }
        if (fst6.length() == 0 && top4.length() != 0 && top5.length() == 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd9fifth3);

            //Start Animation
            add9.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add8.setText("");
            }
            if (bott4.length() == 0) {
                add7.setText("");
            }
            if (bott3.length() == 0) {
                add6.setText("");
            }
            if (bott2.length() == 0) {
                add5.setText("");
            }

            add9.setText("");
            add10.setText("");
            add11.setText("");
        }
    }


    public void moveadd6first4() {
        if (fst7.length() == 0 && top5.length() != 0 && top6.length() == 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd6first4);

            //Start Animation
            add6.startAnimation(bottlineMovement);
            add11.setText("");
        }
        if (fst7.length() == 0 && top5.length() != 0 && top6.length() == 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd6first4);

            //Start Animation
            add6.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add9.setText("");
            }
            if (bott4.length() == 0) {
                add8.setText("");
            }
            if (bott3.length() == 0) {
                add7.setText("");
            }
            if (bott2.length() == 0) {
                add6.setText("");
            }

            add10.setText("");
            add11.setText("");
        }
    }

    public void moveadd7sec4() {
        if (fst7.length() == 0 && top5.length() != 0 && top6.length() == 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd7sec4);

            //Start Animation
            add7.startAnimation(bottlineMovement);
            add11.setText("");
        }
        if (fst7.length() == 0 && top5.length() != 0 && top6.length() == 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd7sec4);

            //Start Animation
            add7.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add9.setText("");
            }
            if (bott4.length() == 0) {
                add8.setText("");
            }
            if (bott3.length() == 0) {
                add7.setText("");
            }
            if (bott2.length() == 0) {
                add6.setText("");
            }

            add10.setText("");
            add11.setText("");
        }
    }

    public void moveadd8third4() {
        if (fst7.length() == 0 && top5.length() != 0 && top6.length() == 0 && bott6.length() != 0) {
            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd8third4);

            //Start Animation
            add8.startAnimation(bottlineMovement);
            add11.setText("");
        }
        if (fst7.length() == 0 && top5.length() != 0 && top6.length() == 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd8third4);

            //Start Animation
            add8.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add9.setText("");
            }
            if (bott4.length() == 0) {
                add8.setText("");
            }
            if (bott3.length() == 0) {
                add7.setText("");
            }
            if (bott2.length() == 0) {
                add6.setText("");
            }

            add10.setText("");
            add11.setText("");
        }
    }

    public void moveadd9fourth4() {
        if (fst7.length() == 0 && top5.length() != 0 && top6.length() == 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd9fourth4);

            //Start Animation
            add9.startAnimation(bottlineMovement);
        }
        if (fst7.length() == 0 && top5.length() != 0 && top6.length() == 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd9fourth4);

            //Start Animation
            add9.startAnimation(bottlineMovement);
            add11.setText("");
            if (bott5.length() == 0) {
                add9.setText("");
            }
            if (bott4.length() == 0) {
                add8.setText("");
            }
            if (bott3.length() == 0) {
                add7.setText("");
            }
            if (bott2.length() == 0) {
                add6.setText("");
            }

            add10.setText("");
            add11.setText("");
        }
    }

    public void moveadd10fifth4() {
        if (fst7.length() == 0 && top5.length() != 0 && top6.length() == 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd10fifth4);

            //Start Animation
            add10.startAnimation(bottlineMovement);
            add11.setText("");

        }
        if (fst7.length() == 0 && top5.length() != 0 && top6.length() == 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd10fifth4);

            //Start Animation
            add10.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add9.setText("");
            }
            if (bott4.length() == 0) {
                add8.setText("");
            }
            if (bott3.length() == 0) {
                add7.setText("");
            }
            if (bott2.length() == 0) {
                add6.setText("");
            }

            add10.setText("");
            add11.setText("");
        }
    }

    public void moveadd7first5() {
        if (fst7.length() != 0 && top6.length() != 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd7first5);

            //Start Animation
            add7.startAnimation(bottlineMovement);
        }
        if (fst7.length() != 0 && top6.length() != 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd7first5);

            //Start Animation
            add7.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add10.setText("");
            }
            if (bott4.length() == 0) {
                add9.setText("");
            }
            if (bott3.length() == 0) {
                add8.setText("");
            }
            if (bott2.length() == 0) {
                add7.setText("");
            }

            add11.setText("");

        } else if (scnd2.length() == 0) {
            add11.setText("");
            add10.setText("");
            add9.setText("");
            add9.setText("");
            add8.setText("");
            add6.setText("");
            add5.setText("");
            add4.setText("");
            add3.setText("");
            add2.setText("");
        }

    }

    public void moveadd8sec5() {
        if (fst7.length() != 0 && top6.length() != 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd8sec5);

            //Start Animation
            add8.startAnimation(bottlineMovement);
        }
        if (fst7.length() != 0 && top6.length() != 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd8sec5);

            //Start Animation
            add8.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add10.setText("");
            }
            if (bott4.length() == 0) {
                add9.setText("");
            }
            if (bott3.length() == 0) {
                add8.setText("");
            }
            if (bott2.length() == 0) {
                add7.setText("");
            }
            add11.setText("");

        } else if (scnd2.length() == 0) {
            add11.setText("");
            add10.setText("");
            add9.setText("");
            add9.setText("");
            add8.setText("");
            add6.setText("");
            add5.setText("");
            add4.setText("");
            add3.setText("");
            add2.setText("");
        }
    }

    public void moveadd9third5() {
        if (fst7.length() != 0 && top6.length() != 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd9third5);

            //Start Animation
            add9.startAnimation(bottlineMovement);
        }
        if (fst7.length() != 0 && top6.length() != 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd9third5);

            //Start Animation
            add9.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add10.setText("");
            }
            if (bott4.length() == 0) {
                add9.setText("");
            }
            if (bott3.length() == 0) {
                add8.setText("");
            }
            if (bott2.length() == 0) {
                add7.setText("");
            }
            add11.setText("");
        } else if (scnd2.length() == 0) {
            add11.setText("");
            add10.setText("");
            add9.setText("");
            add9.setText("");
            add8.setText("");
            add6.setText("");
            add5.setText("");
            add4.setText("");
            add3.setText("");
            add2.setText("");
        }
    }

    public void moveadd10fourth5() {
        if (fst7.length() != 0 && top6.length() != 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd10fourth5);

            //Start Animation
            add10.startAnimation(bottlineMovement);
        }
        if (fst7.length() != 0 && top6.length() != 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd10fourth5);

            //Start Animation
            add10.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add10.setText("");
            }
            if (bott4.length() == 0) {
                add9.setText("");
            }
            if (bott3.length() == 0) {
                add8.setText("");
            }
            if (bott2.length() == 0) {
                add7.setText("");
            }
            add11.setText("");
        } else if (scnd2.length() == 0) {
            add11.setText("");
            add10.setText("");
            add9.setText("");
            add9.setText("");
            add8.setText("");
            add6.setText("");
            add5.setText("");
            add4.setText("");
            add3.setText("");
            add2.setText("");
        }
    }

    public void moveadd11fifth5() {
        if (fst7.length() != 0 && top6.length() != 0 && bott6.length() != 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd11fifth5);

            //Start Animation
            add11.startAnimation(bottlineMovement);
        }
        if (fst7.length() != 0 && top6.length() != 0 && bott6.length() == 0) {

            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.moveadd11fifth5);

            //Start Animation
            add11.startAnimation(bottlineMovement);
            if (bott5.length() == 0) {
                add10.setText("");
            }
            if (bott4.length() == 0) {
                add9.setText("");
            }
            if (bott3.length() == 0) {
                add8.setText("");
            }
            if (bott2.length() == 0) {
                add7.setText("");
            }
            add11.setText("");
        }

        if (scnd2.length() == 0) {
            add11.setText("");
            add10.setText("");
            add9.setText("");
            add9.setText("");
            add8.setText("");
            add6.setText("");
            add5.setText("");
            add4.setText("");
            add3.setText("");
            add2.setText("");
        }
    }

    public void moveaddallrestcar() {

        // Load the animation like this
        bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.moveaddallrestcar);

        //Start Animation


        add3.startAnimation(bottlineMovement);
        add4.startAnimation(bottlineMovement);
        add5.startAnimation(bottlineMovement);
        add6.startAnimation(bottlineMovement);
        add7.startAnimation(bottlineMovement);
        add8.startAnimation(bottlineMovement);
        add9.startAnimation(bottlineMovement);
        add10.startAnimation(bottlineMovement);
        add11.startAnimation(bottlineMovement);

        add2.setText("");
        add3.setText("");
        add4.setText("");
        add5.setText("");
        add6.setText("");
        add7.setText("");
        add8.setText("");
        add9.setText("");
        add10.setText("");
        add11.setText("");


    }

    public void movealladdcarries() {
        moveadd3first();
        moveadd4sec();
        moveadd5third();
        moveadd6fourth();
        moveadd7fifth();

        moveadd4first2();
        moveadd5sec2();
        moveadd6third2();
        moveadd7fourth2();
        moveadd8fifth2();

        moveadd5first3();
        moveadd6sec3();
        moveadd7third3();
        moveadd8fourth3();
        moveadd9fifth3();

        moveadd6first4();
        moveadd7sec4();
        moveadd8third4();
        moveadd9fourth4();
        moveadd10fifth4();
    }


    public void moveanssec() {

        if (scnd2.length() == 0 && scnd3.length() == 0 && bott2.length() == 0) {
            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.ans1slidesec);
            ans1.startAnimation(bottlineMovement);
            ans2.startAnimation(bottlineMovement);
            ans3.startAnimation(bottlineMovement);
            ans4.startAnimation(bottlineMovement);
            ans5.startAnimation(bottlineMovement);
            ans6.startAnimation(bottlineMovement);
            ans7.startAnimation(bottlineMovement);
            //Start Animation
            if (top6.length() == 0 && top5.length() != 0) {

                ans7.setText("");
                ans8.setText("");
                ans9.setText("");
                ans10.setText("");
                ans11.setText("");
                ans12.setText("");
                magicHappens();

            } else if (top5.length() == 0 && top4.length() != 0) {

                ans6.setText("");
                ans7.setText("");
                ans8.setText("");
                ans9.setText("");
                ans10.setText("");
                ans11.setText("");
                ans12.setText("");
                magicHappens();

            } else if (top4.length() == 0 && top3.length() != 0) {

                ans5.setText("");
                ans6.setText("");
                ans7.setText("");
                ans8.setText("");
                ans9.setText("");
                ans10.setText("");
                ans11.setText("");
                ans12.setText("");
                magicHappens();

            } else if (top3.length() == 0 && top2.length() != 0) {

                ans4.setText("");
                ans5.setText("");
                ans6.setText("");
                ans7.setText("");
                ans8.setText("");
                ans9.setText("");
                ans10.setText("");
                ans11.setText("");
                ans12.setText("");
                magicHappens();

            } else if (top2.length() == 0 && top.length() != 0) {

                ans3.setText("");
                ans4.setText("");
                ans5.setText("");
                ans6.setText("");
                ans7.setText("");
                ans8.setText("");
                ans9.setText("");
                ans10.setText("");
                ans11.setText("");
                ans12.setText("");
                magicHappens();
            }
            ans8.setText("");
            ans9.setText("");
            ans10.setText("");
            ans11.setText("");
            ans12.setText("");
            magicHappens();
        }

    }

    public void moveansthird() {

        if (trd3.length() == 0 && trd4.length() == 0 && bott3.length() == 0) {
            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.ans1slidethird);
            ans1.startAnimation(bottlineMovement);
            ans2.startAnimation(bottlineMovement);
            ans3.startAnimation(bottlineMovement);
            ans4.startAnimation(bottlineMovement);
            ans5.startAnimation(bottlineMovement);
            ans6.startAnimation(bottlineMovement);
            ans7.startAnimation(bottlineMovement);
            ans8.startAnimation(bottlineMovement);
            //Start Animation
            if (top6.length() == 0 && top5.length() != 0) {

                ans8.setText("");
                ans9.setText("");
                ans10.setText("");
                ans11.setText("");
                ans12.setText("");
                magicHappens();

            } else if (top5.length() == 0 && top4.length() != 0) {

                ans7.setText("");
                ans8.setText("");
                ans9.setText("");
                ans10.setText("");
                ans11.setText("");
                ans12.setText("");
                magicHappens();

            } else if (top4.length() == 0 && top3.length() != 0) {

                ans6.setText("");
                ans7.setText("");
                ans8.setText("");
                ans9.setText("");
                ans10.setText("");
                ans11.setText("");
                ans12.setText("");
                magicHappens();
            } else if (top3.length() == 0 && top2.length() != 0) {

                ans5.setText("");
                ans6.setText("");
                ans7.setText("");
                ans8.setText("");
                ans9.setText("");
                ans10.setText("");
                ans11.setText("");
                ans12.setText("");
                magicHappens();

            } else if (top2.length() == 0 && top.length() != 0) {

                ans4.setText("");
                ans5.setText("");
                ans6.setText("");
                ans7.setText("");
                ans8.setText("");
                ans9.setText("");
                ans10.setText("");
                ans11.setText("");
                ans12.setText("");
                magicHappens();
            }

            ans9.setText("");
            ans10.setText("");
            ans11.setText("");
            ans12.setText("");
            magicHappens();
        }
    }

    public void moveansfourth() {

        if (frth4.length() == 0 && frth5.length() == 0 && bott4.length() == 0) {
            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.ans1slidefourth);

            ans1.startAnimation(bottlineMovement);
            ans2.startAnimation(bottlineMovement);
            ans3.startAnimation(bottlineMovement);
            ans4.startAnimation(bottlineMovement);
            ans5.startAnimation(bottlineMovement);
            ans6.startAnimation(bottlineMovement);
            ans7.startAnimation(bottlineMovement);
            ans8.startAnimation(bottlineMovement);
            ans9.startAnimation(bottlineMovement);
            //Start Animation
            if (top6.length() == 0 && top5.length() != 0) {
                ans11.setText("");
                ans9.setText("");
                ans10.setText("");
                ans12.setText("");

                magicHappens();

            } else if (top5.length() == 0 && top4.length() != 0) {

                ans8.setText("");
                ans11.setText("");
                ans9.setText("");
                ans10.setText("");
                ans12.setText("");
                magicHappens();

            } else if (top4.length() == 0 && top3.length() != 0) {

                ans7.setText("");
                ans8.setText("");
                ans11.setText("");
                ans9.setText("");
                ans10.setText("");
                ans12.setText("");
                magicHappens();

            } else if (top3.length() == 0 && top2.length() != 0) {

                ans11.setText("");
                ans9.setText("");
                ans10.setText("");
                ans6.setText("");
                ans7.setText("");
                ans8.setText("");
                ans12.setText("");
                magicHappens();

            } else if (top2.length() == 0 && top.length() != 0) {

                ans11.setText("");
                ans9.setText("");
                ans10.setText("");
                ans5.setText("");
                ans6.setText("");
                ans7.setText("");
                ans8.setText("");
                ans12.setText("");
                magicHappens();
            }
            ans10.setText("");
            ans11.setText("");
            ans12.setText("");
            magicHappens();
        }
    }

    public void moveansfifth() {

        if (ffth5.length() == 0 && ffth6.length() == 0 && bott5.length() == 0) {
            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.ans1slidefifth);
            ans1.startAnimation(bottlineMovement);
            ans2.startAnimation(bottlineMovement);
            ans3.startAnimation(bottlineMovement);
            ans4.startAnimation(bottlineMovement);
            ans5.startAnimation(bottlineMovement);
            ans6.startAnimation(bottlineMovement);
            ans7.startAnimation(bottlineMovement);
            ans8.startAnimation(bottlineMovement);
            ans9.startAnimation(bottlineMovement);
            ans10.startAnimation(bottlineMovement);
            //Start Animation
            if (top6.length() == 0 && top5.length() != 0) {
                ans11.setText("");
                ans10.setText("");
                ans12.setText("");

                magicHappens();

            } else if (top5.length() == 0 && top4.length() != 0) {
                ans11.setText("");
                ans10.setText("");
                ans9.setText("");
                ans12.setText("");
                magicHappens();

            } else if (top4.length() == 0 && top3.length() != 0) {

                ans10.setText("");
                ans8.setText("");
                ans9.setText("");
                ans11.setText("");
                ans12.setText("");
                magicHappens();
            } else if (top3.length() == 0 && top2.length() != 0) {

                ans9.setText("");
                ans10.setText("");
                ans7.setText("");
                ans8.setText("");
                ans11.setText("");
                ans12.setText("");
                magicHappens();
            } else if (top2.length() == 0 && top.length() != 0) {
                ans11.setText("");
                ans9.setText("");
                ans10.setText("");
                ans6.setText("");
                ans7.setText("");
                ans8.setText("");
                ans12.setText("");
                magicHappens();
            }
            ans11.setText("");
            ans12.setText("");
            magicHappens();
        }
    }

    public void moveanssixth() {

        if (sxth7.length() == 0 && sxth8.length() == 0 && bott6.length() == 0) {
            // Load the animation like this
            bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.ans1slidesixth);

            ans1.startAnimation(bottlineMovement);
            ans2.startAnimation(bottlineMovement);
            ans3.startAnimation(bottlineMovement);
            ans4.startAnimation(bottlineMovement);
            ans5.startAnimation(bottlineMovement);
            ans6.startAnimation(bottlineMovement);
            ans7.startAnimation(bottlineMovement);
            ans8.startAnimation(bottlineMovement);
            ans9.startAnimation(bottlineMovement);
            ans10.startAnimation(bottlineMovement);
            ans11.startAnimation(bottlineMovement);
            //Start Animation
            if (top6.length() == 0 && top5.length() != 0) {
                ans12.setText("");
                ans11.setText("");
                magicHappens();

            } else if (top5.length() == 0 && top4.length() != 0) {
                ans12.setText("");
                ans10.setText("");
                ans11.setText("");
                magicHappens();

            } else if (top4.length() == 0 && top3.length() != 0) {
                ans12.setText("");
                ans10.setText("");
                ans11.setText("");
                ans9.setText("");
                magicHappens();
            } else if (top3.length() == 0 && top2.length() != 0) {
                ans12.setText("");
                ans9.setText("");
                ans10.setText("");
                ans11.setText("");
                ans8.setText("");
                magicHappens();

            } else if (top2.length() == 0 && top.length() != 0) {
                ans12.setText("");
                ans9.setText("");
                ans10.setText("");
                ans11.setText("");
                ans7.setText("");
                ans8.setText("");
                magicHappens();
            }
            ans12.setText("");
            magicHappens();
        }
    }

    public void moveansreset() {
        bottlineMovement = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.ansslidereset);

        ans1.startAnimation(bottlineMovement);
        ans2.startAnimation(bottlineMovement);
        ans3.startAnimation(bottlineMovement);
        ans4.startAnimation(bottlineMovement);
        ans5.startAnimation(bottlineMovement);
        ans6.startAnimation(bottlineMovement);
        ans7.startAnimation(bottlineMovement);
        ans8.startAnimation(bottlineMovement);
        ans9.startAnimation(bottlineMovement);
        ans10.startAnimation(bottlineMovement);
        ans11.startAnimation(bottlineMovement);
        ans12.startAnimation(bottlineMovement);


        ans1.setText("");
        ans2.setText("");
        ans3.setText("");
        ans4.setText("");
        ans5.setText("");
        ans6.setText("");
        ans7.setText("");
        ans8.setText("");
        ans9.setText("");
        ans10.setText("");
        ans11.setText("");
        ans12.setText("");
    }

    public void practice() {
        

        seventh.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                seventh.setVisibility(View.VISIBLE);

                second.setVisibility(View.INVISIBLE);
                third.setVisibility(View.INVISIBLE);
                fourth.setVisibility(View.INVISIBLE);
                fifth.setVisibility(View.INVISIBLE);
                sixth.setVisibility(View.INVISIBLE);
                topE.setVisibility(View.VISIBLE);
                bottE.setVisibility(View.VISIBLE);
                equalsBut.setVisibility(View.INVISIBLE);
                repeat.setVisibility(View.INVISIBLE);
                areYouSure.setVisibility(View.INVISIBLE);
                reset();

                seventh.setText("ENTER");
                Toast.makeText(getApplicationContext(), "Enter how many numbers on top and bottom, at least 1 each row", Toast.LENGTH_LONG).show();
                seventh.setOnClickListener(new View.OnClickListener() {
                   

                    @Override
                    public void onClick(View v) {
                        seventh.setVisibility(View.INVISIBLE);
                        topE.setVisibility(View.INVISIBLE);
                        bottE.setVisibility(View.INVISIBLE);
                        equalsBut.setVisibility(View.VISIBLE);
                        repeat.setVisibility(View.VISIBLE);


                        Toast.makeText(getApplicationContext(), "Generated", Toast.LENGTH_LONG).show();
                        Random generate = new Random();
                        
                        int topEran=0;
                        int topE2ran=0;
                        int topE3ran=0;
                        int topE4ran=0;
                        int topE5ran=0;
                        int topE6ran=0;

                      int  bottEran=0;
                        int  bottE2ran=0;
                        int  bottE3ran=0;
                        int  bottE4ran=0;
                        int  bottE5ran=0;
                        int  bottE6ran=0;
                        
                        if( topE.length()==0||bottE.length()==0) {


                       
                            Toast.makeText(getApplicationContext(), "Enter number from 1 up to 6 in top and bottom box under the 'Enter' button", Toast.LENGTH_LONG).show();
                            seventh.setVisibility(View.VISIBLE);

                            second.setVisibility(View.INVISIBLE);
                            third.setVisibility(View.INVISIBLE);
                            fourth.setVisibility(View.INVISIBLE);
                            fifth.setVisibility(View.INVISIBLE);
                            sixth.setVisibility(View.INVISIBLE);
                            topE.setVisibility(View.VISIBLE);
                            bottE.setVisibility(View.VISIBLE);
                            equalsBut.setVisibility(View.INVISIBLE);
                            repeat.setVisibility(View.INVISIBLE);
                            areYouSure.setVisibility(View.INVISIBLE);

                        }else {
                            int topR = generate.nextInt(10);
                            int top2R = generate.nextInt(10);
                            int top3R = generate.nextInt(10);
                            int top4R = generate.nextInt(10);
                            int top5R = generate.nextInt(10);
                            int top6R = generate.nextInt(10);

                            int bottR = generate.nextInt(10);
                            int bott2R = generate.nextInt(10);
                            int bott3R = generate.nextInt(10);
                            int bott4R = generate.nextInt(10);
                            int bott5R = generate.nextInt(10);
                            int bott6R = generate.nextInt(10);

                            topEran = Integer.parseInt(topE.getText().toString().trim());
                            topE2ran = Integer.parseInt(topE.getText().toString().trim());
                            topE3ran = Integer.parseInt(topE.getText().toString().trim());
                            topE4ran = Integer.parseInt(topE.getText().toString().trim());
                            topE5ran = Integer.parseInt(topE.getText().toString().trim());
                            topE6ran = Integer.parseInt(topE.getText().toString().trim());

                            bottEran = Integer.parseInt(bottE.getText().toString().trim());
                            bottE2ran = Integer.parseInt(bottE.getText().toString().trim());
                            bottE3ran = Integer.parseInt(bottE.getText().toString().trim());
                            bottE4ran = Integer.parseInt(bottE.getText().toString().trim());
                            bottE5ran = Integer.parseInt(bottE.getText().toString().trim());
                            bottE6ran = Integer.parseInt(bottE.getText().toString().trim());


                            if (topEran == 1) {

                                top.setText(String.valueOf(topR));
                            }
                            if (topE2ran == 2) {

                                top.setText(String.valueOf(topR));
                                top2.setText(String.valueOf(top2R));
                            }
                            if (topE3ran == 3) {

                                top.setText(String.valueOf(topR));
                                top2.setText(String.valueOf(top2R));
                                top3.setText(String.valueOf(top3R));

                            }
                            if (topE4ran == 4) {

                                top.setText(String.valueOf(topR));
                                top2.setText(String.valueOf(top2R));
                                top3.setText(String.valueOf(top3R));
                                top4.setText(String.valueOf(top4R));
                            }
                            if (topE5ran == 5) {

                                top.setText(String.valueOf(topR));
                                top2.setText(String.valueOf(top2R));
                                top3.setText(String.valueOf(top3R));
                                top4.setText(String.valueOf(top4R));
                                top5.setText(String.valueOf(top5R));
                            }
                            if (topE6ran >= 6) {

                                top.setText(String.valueOf(topR));
                                top2.setText(String.valueOf(top2R));
                                top3.setText(String.valueOf(top3R));
                                top4.setText(String.valueOf(top4R));
                                top5.setText(String.valueOf(top5R));
                                top6.setText(String.valueOf(top6R));
                            }

                            if (bottEran == 1) {

                                bott.setText(String.valueOf(bottR));
                            }
                            if (bottE2ran == 2) {

                                bott.setText(String.valueOf(bottR));
                                bott2.setText(String.valueOf(bott2R));
                            }
                            if (bottE3ran == 3) {

                                bott.setText(String.valueOf(bottR));
                                bott2.setText(String.valueOf(bott2R));
                                bott3.setText(String.valueOf(bott3R));

                            }
                            if (bottE4ran == 4) {

                                bott.setText(String.valueOf(bottR));
                                bott2.setText(String.valueOf(bott2R));
                                bott3.setText(String.valueOf(bott3R));
                                bott4.setText(String.valueOf(bott4R));
                            }
                            if (bottE5ran == 5) {

                                bott.setText(String.valueOf(bottR));
                                bott2.setText(String.valueOf(bott2R));
                                bott3.setText(String.valueOf(bott3R));
                                bott4.setText(String.valueOf(bott4R));
                                bott5.setText(String.valueOf(bott5R));
                            }
                            if (bottE6ran >= 6) {

                                bott.setText(String.valueOf(bottR));
                                bott2.setText(String.valueOf(bott2R));
                                bott3.setText(String.valueOf(bott3R));
                                bott4.setText(String.valueOf(bott4R));
                                bott5.setText(String.valueOf(bott5R));
                                bott6.setText(String.valueOf(bott6R));
                            }
                        }
                        
                        /*top.setText(String.valueOf(topR));
                        top2.setText(String.valueOf(top2R));
                        top3.setText(String.valueOf(top3R));
                        top4.setText(String.valueOf(top4R));
                        top5.setText(String.valueOf(top5R));
                        top6.setText(String.valueOf(top6R));

                        bott.setText(String.valueOf(bottR));
                        bott2.setText(String.valueOf(bott2R));
                        bott3.setText(String.valueOf(bott3R));
                        bott4.setText(String.valueOf(bott4R));
                        bott5.setText(String.valueOf(bott5R));
                        bott6.setText(String.valueOf(bott6R));*/

                        seventh.setText("Practice");

                    }

                });


            }
        });
    }

    @Override
    public void onPause() {
        if (mAdView != null) {
            mAdView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mAdView != null) {
            mAdView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (mAdView != null) {
            mAdView.destroy();
        }
        super.onDestroy();
    }



    /*public void arrowbod() {

        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        int height = displaymetrics.heightPixels;
        int width = displaymetrics.widthPixels;

        BitmapFactory.Options o = new BitmapFactory.Options();
        o.inTargetDensity = DisplayMetrics.DENSITY_DEFAULT;
        bmp1 = BitmapFactory.decodeResource(getResources(), R.drawable.pencil, o);
        int w = bmp1.getWidth();
        int h = bmp1.getHeight();

        arrowbod = new ImageView(this);

        RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.activity_main);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        // arrowbod.setScaleType(ImageView.ScaleType.MATRIX);
        arrowbod.setImageResource(R.drawable.pencil);
        arrowbod.setId(View.generateViewId());

        wid = 6;
        hei = 12;


        params.setMargins(topGap * 6, (height - h) / (topGap / 12), 0, 0);

        ((ViewGroup) mainLayout).addView(arrowbod, params);

        Display display = getWindowManager().getDefaultDisplay();

        float mReqPercentages = 5;
        float mCalculatedWidth = (mReqPercentages / 100) * height;

        arrowbod.getLayoutParams().height = (int) (mCalculatedWidth * 1.5);
        arrowbod.getLayoutParams().width = (int) mCalculatedWidth;

    }*/


}

    






