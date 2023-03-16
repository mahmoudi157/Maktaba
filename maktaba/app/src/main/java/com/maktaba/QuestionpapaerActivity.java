package com.maktaba;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.FirebaseApp;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class QuestionpapaerActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private AdView adview1;
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout q20;
	private LinearLayout q19;
	private LinearLayout q18;
	private LinearLayout linear10;
	private LinearLayout qp20;
	private LinearLayout qp19;
	private TextView textview2;
	private LinearLayout linear34;
	private LinearLayout linear11;
	private TextView textview3;
	private ImageView imageview1;
	private ImageView imageview4;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private Button Hmath20;
	private Button Hphy20;
	private Button Hchem20;
	private Button Hbiolog20;
	private Button Henglish20;
	private Button Hmar20;
	private Button Hhindi20;
	private LinearLayout linear35;
	private LinearLayout linear20;
	private TextView textview4;
	private ImageView imageview2;
	private ImageView imageview5;
	private LinearLayout linear21;
	private Button Hmaths19;
	private Button Hphys19;
	private Button Hchem19;
	private Button Hbiol19;
	private LinearLayout linear36;
	private LinearLayout linear23;
	private TextView textview5;
	private ImageView imageview3;
	private ImageView imageview6;
	private LinearLayout linear24;
	private Button Hmaths18;
	private Button Hphy18;
	private Button Hchem18;
	private Button Hbio18;
	private TextView textview9;
	private LinearLayout linear37;
	private LinearLayout linear26;
	private TextView textview10;
	private ImageView imageview7;
	private ImageView imageview8;
	private LinearLayout linear27;
	private LinearLayout linear28;
	private LinearLayout linear29;
	private Button eng20;
	private Button hincomp20;
	private Button hindent20;
	private Button marat20;
	private Button maths20;
	private Button maths2n20;
	private Button sanscom20;
	private Button sankent20;
	private Button sci1n20;
	private Button sci2n20;
	private LinearLayout linear38;
	private LinearLayout linear30;
	private TextView textview11;
	private ImageView imageview9;
	private ImageView imageview10;
	private LinearLayout linear31;
	private LinearLayout linear32;
	private LinearLayout linear33;
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button7;
	private Button button8;
	private Button button9;
	private Button button10;
	private Button button11;
	private Button button12;
	
	private Intent drive = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.questionpapaer);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		MobileAds.initialize(this);
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		adview1 = findViewById(R.id.adview1);
		linear1 = findViewById(R.id.linear1);
		vscroll1 = findViewById(R.id.vscroll1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		q20 = findViewById(R.id.q20);
		q19 = findViewById(R.id.q19);
		q18 = findViewById(R.id.q18);
		linear10 = findViewById(R.id.linear10);
		qp20 = findViewById(R.id.qp20);
		qp19 = findViewById(R.id.qp19);
		textview2 = findViewById(R.id.textview2);
		linear34 = findViewById(R.id.linear34);
		linear11 = findViewById(R.id.linear11);
		textview3 = findViewById(R.id.textview3);
		imageview1 = findViewById(R.id.imageview1);
		imageview4 = findViewById(R.id.imageview4);
		linear18 = findViewById(R.id.linear18);
		linear19 = findViewById(R.id.linear19);
		Hmath20 = findViewById(R.id.Hmath20);
		Hphy20 = findViewById(R.id.Hphy20);
		Hchem20 = findViewById(R.id.Hchem20);
		Hbiolog20 = findViewById(R.id.Hbiolog20);
		Henglish20 = findViewById(R.id.Henglish20);
		Hmar20 = findViewById(R.id.Hmar20);
		Hhindi20 = findViewById(R.id.Hhindi20);
		linear35 = findViewById(R.id.linear35);
		linear20 = findViewById(R.id.linear20);
		textview4 = findViewById(R.id.textview4);
		imageview2 = findViewById(R.id.imageview2);
		imageview5 = findViewById(R.id.imageview5);
		linear21 = findViewById(R.id.linear21);
		Hmaths19 = findViewById(R.id.Hmaths19);
		Hphys19 = findViewById(R.id.Hphys19);
		Hchem19 = findViewById(R.id.Hchem19);
		Hbiol19 = findViewById(R.id.Hbiol19);
		linear36 = findViewById(R.id.linear36);
		linear23 = findViewById(R.id.linear23);
		textview5 = findViewById(R.id.textview5);
		imageview3 = findViewById(R.id.imageview3);
		imageview6 = findViewById(R.id.imageview6);
		linear24 = findViewById(R.id.linear24);
		Hmaths18 = findViewById(R.id.Hmaths18);
		Hphy18 = findViewById(R.id.Hphy18);
		Hchem18 = findViewById(R.id.Hchem18);
		Hbio18 = findViewById(R.id.Hbio18);
		textview9 = findViewById(R.id.textview9);
		linear37 = findViewById(R.id.linear37);
		linear26 = findViewById(R.id.linear26);
		textview10 = findViewById(R.id.textview10);
		imageview7 = findViewById(R.id.imageview7);
		imageview8 = findViewById(R.id.imageview8);
		linear27 = findViewById(R.id.linear27);
		linear28 = findViewById(R.id.linear28);
		linear29 = findViewById(R.id.linear29);
		eng20 = findViewById(R.id.eng20);
		hincomp20 = findViewById(R.id.hincomp20);
		hindent20 = findViewById(R.id.hindent20);
		marat20 = findViewById(R.id.marat20);
		maths20 = findViewById(R.id.maths20);
		maths2n20 = findViewById(R.id.maths2n20);
		sanscom20 = findViewById(R.id.sanscom20);
		sankent20 = findViewById(R.id.sankent20);
		sci1n20 = findViewById(R.id.sci1n20);
		sci2n20 = findViewById(R.id.sci2n20);
		linear38 = findViewById(R.id.linear38);
		linear30 = findViewById(R.id.linear30);
		textview11 = findViewById(R.id.textview11);
		imageview9 = findViewById(R.id.imageview9);
		imageview10 = findViewById(R.id.imageview10);
		linear31 = findViewById(R.id.linear31);
		linear32 = findViewById(R.id.linear32);
		linear33 = findViewById(R.id.linear33);
		button1 = findViewById(R.id.button1);
		button2 = findViewById(R.id.button2);
		button3 = findViewById(R.id.button3);
		button4 = findViewById(R.id.button4);
		button5 = findViewById(R.id.button5);
		button6 = findViewById(R.id.button6);
		button7 = findViewById(R.id.button7);
		button8 = findViewById(R.id.button8);
		button9 = findViewById(R.id.button9);
		button10 = findViewById(R.id.button10);
		button11 = findViewById(R.id.button11);
		button12 = findViewById(R.id.button12);
		
		q20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear11.setVisibility(View.VISIBLE);
				imageview1.setVisibility(View.GONE);
				imageview4.setVisibility(View.VISIBLE);
				_click_effect(q20, "#BDBDBD");
			}
		});
		
		q19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear20.setVisibility(View.VISIBLE);
				imageview2.setVisibility(View.GONE);
				imageview5.setVisibility(View.VISIBLE);
				_click_effect(q19, "#BDBDBD");
			}
		});
		
		q18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear23.setVisibility(View.VISIBLE);
				imageview3.setVisibility(View.GONE);
				imageview6.setVisibility(View.VISIBLE);
				_click_effect(q18, "#BDBDBD");
			}
		});
		
		qp20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear26.setVisibility(View.VISIBLE);
				imageview7.setVisibility(View.GONE);
				imageview8.setVisibility(View.VISIBLE);
				_click_effect(qp20, "#BDBDBD");
			}
		});
		
		qp19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear30.setVisibility(View.VISIBLE);
				imageview9.setVisibility(View.GONE);
				imageview10.setVisibility(View.VISIBLE);
				_click_effect(qp19, "#BDBDBD");
			}
		});
		
		imageview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear11.setVisibility(View.GONE);
				imageview4.setVisibility(View.GONE);
				imageview1.setVisibility(View.VISIBLE);
			}
		});
		
		Hmath20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1s4xslg759BPpoCJga9kNsFqI11t0DqE2/view"));
				startActivity(drive);
			}
		});
		
		Hphy20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1MOvf2nTzjPzPmhqOyGslGTyREgpQ6EZh/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		Hchem20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1eLQpy8vLZe8xZKNL_jgM_71Z9dWqz2PM/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		Hbiolog20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1XHQCyOcn2wRsb8Dy7AciySguG1DujsMH/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		Henglish20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1LSrm-nnNKonGgqQpsPdU8hljb00p_YAu/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		Hmar20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1insmU3HkYl9_E0ZXS9ByPIj_oYIzCt9E/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		Hhindi20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1jyDiUWObIRpkPK_QbcTHJ6pDCfE11Odg/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear20.setVisibility(View.GONE);
				imageview5.setVisibility(View.GONE);
				imageview2.setVisibility(View.VISIBLE);
			}
		});
		
		Hmaths19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1eFZvxqPv8UCExDmZ5KMYJI0Sl7pyI-4Z/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		Hphys19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/14jqMkuvS4aXqzW2tFnjnjwrny9-pH8lN/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		Hchem19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1tx3iA5nGzUeAs7EWf8Y7JeJGsh2Q5ElL/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		Hbiol19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1TJHW3CRy3eMQR86Uyigmn1aLe_LQduwC/view"));
				startActivity(drive);
			}
		});
		
		imageview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear23.setVisibility(View.GONE);
				imageview6.setVisibility(View.GONE);
				imageview3.setVisibility(View.VISIBLE);
			}
		});
		
		Hmaths18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1rY9Ee53ZKnxiM6rj0ePftB2mxXMuXnQi/view"));
				startActivity(drive);
			}
		});
		
		Hphy18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1IpESuETLa2fU836q-yXrUEYfMspByVoA/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		Hchem18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/19INoOr2L1wVBiuTsH1n_kEIBQPYQ7YYT/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		Hbio18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1OTYCvUK3hfyUdPhZQKK-3c2AU0zL2GxY/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		imageview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear26.setVisibility(View.GONE);
				imageview8.setVisibility(View.GONE);
				imageview7.setVisibility(View.VISIBLE);
			}
		});
		
		eng20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1l6g_Pbo2E3cE8vX-0ThUbk4G50UA2q-Y/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		hincomp20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1k0CsZrRtYYmmBkLuzZosR0EUQ0Pb3rVW/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		hindent20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1eAtYjA7paxGAfga5YHc0Pkp_n4V8bEoY/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		marat20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1CyilL_tLBg8EU2F64QKhx6Cw61gkTpGF/view"));
				startActivity(drive);
			}
		});
		
		maths20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1hly4PlmGZlaL-gGtqJLfMafB8IsJ6HXb/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		maths2n20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1L2YIY6ucVYEO3Q17Y0cL-qOtj28wSjMG/view"));
				startActivity(drive);
			}
		});
		
		sanscom20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1rWsWS-KXI0vZb56BtrifKT7PLbJCFMOH/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		sankent20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1pGx6VUe4JYhwtJMB83KivakyD9hO6WoR/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		sci1n20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1VG8XsxML0W1QwQgekLs2n7pB99gpQMmk/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		sci2n20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1gCxczrukQwK_ng2esJqc6gVubfCLX4uk/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		imageview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear30.setVisibility(View.GONE);
				imageview10.setVisibility(View.GONE);
				imageview9.setVisibility(View.VISIBLE);
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1R0oRBI1m3MgFEO90ONdsZ4kOV8z2vFuR/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1_DzePof2_JCH3tfra7Pb8aOV9NyYe-JY/view"));
				startActivity(drive);
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1ucbyR-MrpvhufXofkTrFB5YzTyEOz61y/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1ehLavx2zMBVkkkKX_7F4W9qfMh4O_cQZ/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1hBqWnj3sDQsQLeH2AOOIc3MXZqSU3PIt/view"));
				startActivity(drive);
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1smkztB2gHxWg0T66I0QrryyvB5AkYIea/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1sGlXWkIpcVW1KQYdB3OyRxMBn-tA2Gl1/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1_mbdbxLGed_QHsnkUuSoOiXRh-j5hodu/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1x341tg5usGGKyhamsYalieGxpk8f54Ng/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		button10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1SVVDwkoLpbjR_s_7yEmSUCADS9Uzn1Hh/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		button11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1iErkiND_-6VIfDzhTepP8MKXdhNjzoQg/view?usp=sharing"));
				startActivity(drive);
			}
		});
		
		button12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				drive.setAction(Intent.ACTION_VIEW);
				drive.setData(Uri.parse("https://drive.google.com/file/d/1-GcDTX95WG3uwW53v_jGfAuyIpIoBA5U/view?usp=sharing"));
				startActivity(drive);
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("Question Papers");
		_setcornerradius(linear11, 15, 20, "#FFFFFF");
		_setcornerradius(linear23, 15, 20, "#FFFFFF");
		_setcornerradius(linear20, 15, 20, "#FFFFFF");
		_setcornerradius(linear26, 15, 20, "#FFFFFF");
		_setcornerradius(linear30, 15, 20, "#FFFFFF");
		adview1.loadAd(new AdRequest.Builder().build());
		linear11.setVisibility(View.GONE);
		linear23.setVisibility(View.GONE);
		linear20.setVisibility(View.GONE);
		linear26.setVisibility(View.GONE);
		linear30.setVisibility(View.GONE);
		imageview4.setVisibility(View.GONE);
		imageview5.setVisibility(View.GONE);
		imageview6.setVisibility(View.GONE);
		imageview8.setVisibility(View.GONE);
		imageview10.setVisibility(View.GONE);
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		if (adview1 != null) {
			adview1.destroy();
		}
	}
	
	@Override
	public void onPause() {
		super.onPause();
		if (adview1 != null) {
			adview1.pause();
		}
	}
	
	@Override
	public void onResume() {
		super.onResume();
		if (adview1 != null) {
			adview1.resume();
		}
	}
	public void _click_effect(final View _view, final String _c) {
		//code created by ashishtechnozone
		_view.setBackground(Drawables.getSelectableDrawableFor(Color.parseColor(_c)));
		_view.setClickable(true);
		
	}
	
	public static class Drawables {
		    public static android.graphics.drawable.Drawable getSelectableDrawableFor(int color) {
			        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
				            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
				            stateListDrawable.addState(
				                new int[]{android.R.attr.state_pressed},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#ffffff"))
				            );
				            stateListDrawable.addState(
				                new int[]{android.R.attr.state_focused},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
				            );
				            stateListDrawable.addState(
				                new int[]{},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
				            );
				            return stateListDrawable;
				        } else {
				            android.content.res.ColorStateList pressedColor = android.content.res.ColorStateList.valueOf(color);
				            android.graphics.drawable.ColorDrawable defaultColor = new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"));
				            
				android.graphics.drawable.Drawable rippleColor = getRippleColor(color);
				            return new android.graphics.drawable.RippleDrawable(
				                pressedColor,
				                defaultColor,
				                rippleColor
				            );
				        }
			    }
		
		    private static android.graphics.drawable.Drawable getRippleColor(int color) {
			        float[] outerRadii = new float[8];
			        Arrays.fill(outerRadii, 0);
			        android.graphics.drawable.shapes.RoundRectShape r = new android.graphics.drawable.shapes.RoundRectShape(outerRadii, null, null);
			        
			android.graphics.drawable.ShapeDrawable shapeDrawable = new 
			android.graphics.drawable.ShapeDrawable(r);
			        shapeDrawable.getPaint().setColor(color);
			        return shapeDrawable;
			    }
		 
		    private static int lightenOrDarken(int color, double fraction) {
			        if (canLighten(color, fraction)) {
				            return lighten(color, fraction);
				        } else {
				            return darken(color, fraction);
				        }
			    }
		 
		    private static int lighten(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        red = lightenColor(red, fraction);
			        green = lightenColor(green, fraction);
			        blue = lightenColor(blue, fraction);
			        int alpha = Color.alpha(color);
			        return Color.argb(alpha, red, green, blue);
			    }
		 
		    private static int darken(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        red = darkenColor(red, fraction);
			        green = darkenColor(green, fraction);
			        blue = darkenColor(blue, fraction);
			        int alpha = Color.alpha(color);
			 
			        return Color.argb(alpha, red, green, blue);
			    }
		 
		    private static boolean canLighten(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        return canLightenComponent(red, fraction)
			            && canLightenComponent(green, fraction)
			            && canLightenComponent(blue, fraction);
			    }
		 
		    private static boolean canLightenComponent(int colorComponent, double fraction) {
			        int red = Color.red(colorComponent);
			        int green = Color.green(colorComponent);
			        int blue = Color.blue(colorComponent);
			        return red + (red * fraction) < 255
			            && green + (green * fraction) < 255
			            && blue + (blue * fraction) < 255;
			    }
		 
		    private static int darkenColor(int color, double fraction) {
			        return (int) Math.max(color - (color * fraction), 0);
			    }
		 
		    private static int lightenColor(int color, double fraction) {
			        return (int) Math.min(color + (color * fraction), 255);
			    }
	}
	public static class CircleDrawables {
		    public static android.graphics.drawable.Drawable getSelectableDrawableFor(int color) {
			        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
				            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
				            stateListDrawable.addState(
				                new int[]{android.R.attr.state_pressed},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#ffffff"))
				            );
				            stateListDrawable.addState(
				                new int[]{android.R.attr.state_focused},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
				            );
				            stateListDrawable.addState(
				                new int[]{},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
				            );
				            return stateListDrawable;
				        } else {
				            android.content.res.ColorStateList pressedColor = android.content.res.ColorStateList.valueOf(color);
				            android.graphics.drawable.ColorDrawable defaultColor = new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"));
				            
				android.graphics.drawable.Drawable rippleColor = getRippleColor(color);
				            return new android.graphics.drawable.RippleDrawable(
				                pressedColor,
				                defaultColor,
				                rippleColor
				            );
				        }
			    }
		
		    private static android.graphics.drawable.Drawable getRippleColor(int color) {
			        float[] outerRadii = new float[180];
			        Arrays.fill(outerRadii, 80);
			        android.graphics.drawable.shapes.RoundRectShape r = new android.graphics.drawable.shapes.RoundRectShape(outerRadii, null, null);
			        
			android.graphics.drawable.ShapeDrawable shapeDrawable = new 
			android.graphics.drawable.ShapeDrawable(r);
			        shapeDrawable.getPaint().setColor(color);
			        return shapeDrawable;
			    }
		 
		    private static int lightenOrDarken(int color, double fraction) {
			        if (canLighten(color, fraction)) {
				            return lighten(color, fraction);
				        } else {
				            return darken(color, fraction);
				        }
			    }
		 
		    private static int lighten(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        red = lightenColor(red, fraction);
			        green = lightenColor(green, fraction);
			        blue = lightenColor(blue, fraction);
			        int alpha = Color.alpha(color);
			        return Color.argb(alpha, red, green, blue);
			    }
		 
		    private static int darken(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        red = darkenColor(red, fraction);
			        green = darkenColor(green, fraction);
			        blue = darkenColor(blue, fraction);
			        int alpha = Color.alpha(color);
			 
			        return Color.argb(alpha, red, green, blue);
			    }
		 
		    private static boolean canLighten(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        return canLightenComponent(red, fraction)
			            && canLightenComponent(green, fraction)
			            && canLightenComponent(blue, fraction);
			    }
		 
		    private static boolean canLightenComponent(int colorComponent, double fraction) {
			        int red = Color.red(colorComponent);
			        int green = Color.green(colorComponent);
			        int blue = Color.blue(colorComponent);
			        return red + (red * fraction) < 255
			            && green + (green * fraction) < 255
			            && blue + (blue * fraction) < 255;
			    }
		 
		    private static int darkenColor(int color, double fraction) {
			        return (int) Math.max(color - (color * fraction), 0);
			    }
		 
		    private static int lightenColor(int color, double fraction) {
			        return (int) Math.min(color + (color * fraction), 255);
		}
	}
	
	public void drawableclass() {
		
		
	}
	
	
	public void _setcornerradius(final View _view, final double _radius, final double _shadow, final String _color) {
		android.graphics.drawable.GradientDrawable ab = new android.graphics.drawable.GradientDrawable();
		
		ab.setColor(Color.parseColor(_color));
		ab.setCornerRadius((float) _radius);
		_view.setElevation((float) _shadow);
		_view.setBackground(ab);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}