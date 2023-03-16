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

public class P88Activity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private AdView adview1;
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout e1;
	private LinearLayout e2;
	private LinearLayout e3;
	private LinearLayout e4;
	private LinearLayout e5;
	private LinearLayout e6;
	private LinearLayout e7;
	private LinearLayout e8;
	private LinearLayout e9;
	private LinearLayout e10;
	private LinearLayout e11;
	private LinearLayout e12;
	private LinearLayout e13;
	private LinearLayout e14;
	private LinearLayout e15;
	private LinearLayout e16;
	private LinearLayout e17;
	private LinearLayout e18;
	private LinearLayout linear6;
	private LinearLayout h1;
	private LinearLayout h2;
	private LinearLayout h3;
	private LinearLayout h4;
	private LinearLayout h5;
	private LinearLayout h6;
	private LinearLayout h7;
	private LinearLayout h8;
	private LinearLayout h9;
	private LinearLayout h10;
	private LinearLayout h11;
	private LinearLayout h12;
	private LinearLayout h13;
	private LinearLayout h14;
	private LinearLayout linear10;
	private LinearLayout m1;
	private LinearLayout m2;
	private LinearLayout m3;
	private LinearLayout m4;
	private LinearLayout m5;
	private LinearLayout m6;
	private LinearLayout m7;
	private LinearLayout m8;
	private LinearLayout m9;
	private LinearLayout m10;
	private LinearLayout m11;
	private LinearLayout m12;
	private LinearLayout m13;
	private LinearLayout m14;
	private LinearLayout m15;
	private LinearLayout m16;
	private LinearLayout m17;
	private LinearLayout linear14;
	private LinearLayout u1;
	private LinearLayout u2;
	private LinearLayout u3;
	private LinearLayout u4;
	private LinearLayout u5;
	private LinearLayout u6;
	private LinearLayout u7;
	private LinearLayout u8;
	private LinearLayout u9;
	private LinearLayout u10;
	private LinearLayout u11;
	private LinearLayout u12;
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private TextView textview19;
	private TextView textview21;
	private TextView textview31;
	private TextView textview32;
	private TextView textview33;
	private TextView textview34;
	private TextView textview35;
	private TextView textview36;
	private TextView textview22;
	private TextView textview37;
	private TextView textview48;
	private TextView textview47;
	private TextView textview49;
	private TextView textview46;
	private TextView textview50;
	private TextView textview51;
	private TextView textview4;
	private TextView textview5;
	private TextView textview6;
	private TextView textview7;
	private TextView textview20;
	private TextView textview23;
	private TextView textview41;
	private TextView textview24;
	private TextView textview52;
	private TextView textview42;
	private TextView textview53;
	private TextView textview54;
	private TextView textview55;
	private TextView textview57;
	private TextView textview56;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	private TextView textview16;
	private TextView textview17;
	private TextView textview25;
	private TextView textview40;
	private TextView textview26;
	private TextView textview39;
	private TextView textview58;
	private TextView textview59;
	private TextView textview60;
	private TextView textview61;
	private TextView textview62;
	private TextView textview63;
	private TextView textview64;
	private TextView textview66;
	private TextView textview13;
	private TextView textview12;
	private TextView textview14;
	private TextView textview15;
	private TextView textview27;
	private TextView textview28;
	private TextView textview29;
	private TextView textview44;
	private TextView textview43;
	private TextView textview45;
	private TextView textview67;
	private TextView textview68;
	private TextView textview30;
	
	private Intent i8 = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.p88);
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
		e1 = findViewById(R.id.e1);
		e2 = findViewById(R.id.e2);
		e3 = findViewById(R.id.e3);
		e4 = findViewById(R.id.e4);
		e5 = findViewById(R.id.e5);
		e6 = findViewById(R.id.e6);
		e7 = findViewById(R.id.e7);
		e8 = findViewById(R.id.e8);
		e9 = findViewById(R.id.e9);
		e10 = findViewById(R.id.e10);
		e11 = findViewById(R.id.e11);
		e12 = findViewById(R.id.e12);
		e13 = findViewById(R.id.e13);
		e14 = findViewById(R.id.e14);
		e15 = findViewById(R.id.e15);
		e16 = findViewById(R.id.e16);
		e17 = findViewById(R.id.e17);
		e18 = findViewById(R.id.e18);
		linear6 = findViewById(R.id.linear6);
		h1 = findViewById(R.id.h1);
		h2 = findViewById(R.id.h2);
		h3 = findViewById(R.id.h3);
		h4 = findViewById(R.id.h4);
		h5 = findViewById(R.id.h5);
		h6 = findViewById(R.id.h6);
		h7 = findViewById(R.id.h7);
		h8 = findViewById(R.id.h8);
		h9 = findViewById(R.id.h9);
		h10 = findViewById(R.id.h10);
		h11 = findViewById(R.id.h11);
		h12 = findViewById(R.id.h12);
		h13 = findViewById(R.id.h13);
		h14 = findViewById(R.id.h14);
		linear10 = findViewById(R.id.linear10);
		m1 = findViewById(R.id.m1);
		m2 = findViewById(R.id.m2);
		m3 = findViewById(R.id.m3);
		m4 = findViewById(R.id.m4);
		m5 = findViewById(R.id.m5);
		m6 = findViewById(R.id.m6);
		m7 = findViewById(R.id.m7);
		m8 = findViewById(R.id.m8);
		m9 = findViewById(R.id.m9);
		m10 = findViewById(R.id.m10);
		m11 = findViewById(R.id.m11);
		m12 = findViewById(R.id.m12);
		m13 = findViewById(R.id.m13);
		m14 = findViewById(R.id.m14);
		m15 = findViewById(R.id.m15);
		m16 = findViewById(R.id.m16);
		m17 = findViewById(R.id.m17);
		linear14 = findViewById(R.id.linear14);
		u1 = findViewById(R.id.u1);
		u2 = findViewById(R.id.u2);
		u3 = findViewById(R.id.u3);
		u4 = findViewById(R.id.u4);
		u5 = findViewById(R.id.u5);
		u6 = findViewById(R.id.u6);
		u7 = findViewById(R.id.u7);
		u8 = findViewById(R.id.u8);
		u9 = findViewById(R.id.u9);
		u10 = findViewById(R.id.u10);
		u11 = findViewById(R.id.u11);
		u12 = findViewById(R.id.u12);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		textview19 = findViewById(R.id.textview19);
		textview21 = findViewById(R.id.textview21);
		textview31 = findViewById(R.id.textview31);
		textview32 = findViewById(R.id.textview32);
		textview33 = findViewById(R.id.textview33);
		textview34 = findViewById(R.id.textview34);
		textview35 = findViewById(R.id.textview35);
		textview36 = findViewById(R.id.textview36);
		textview22 = findViewById(R.id.textview22);
		textview37 = findViewById(R.id.textview37);
		textview48 = findViewById(R.id.textview48);
		textview47 = findViewById(R.id.textview47);
		textview49 = findViewById(R.id.textview49);
		textview46 = findViewById(R.id.textview46);
		textview50 = findViewById(R.id.textview50);
		textview51 = findViewById(R.id.textview51);
		textview4 = findViewById(R.id.textview4);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		textview7 = findViewById(R.id.textview7);
		textview20 = findViewById(R.id.textview20);
		textview23 = findViewById(R.id.textview23);
		textview41 = findViewById(R.id.textview41);
		textview24 = findViewById(R.id.textview24);
		textview52 = findViewById(R.id.textview52);
		textview42 = findViewById(R.id.textview42);
		textview53 = findViewById(R.id.textview53);
		textview54 = findViewById(R.id.textview54);
		textview55 = findViewById(R.id.textview55);
		textview57 = findViewById(R.id.textview57);
		textview56 = findViewById(R.id.textview56);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		textview16 = findViewById(R.id.textview16);
		textview17 = findViewById(R.id.textview17);
		textview25 = findViewById(R.id.textview25);
		textview40 = findViewById(R.id.textview40);
		textview26 = findViewById(R.id.textview26);
		textview39 = findViewById(R.id.textview39);
		textview58 = findViewById(R.id.textview58);
		textview59 = findViewById(R.id.textview59);
		textview60 = findViewById(R.id.textview60);
		textview61 = findViewById(R.id.textview61);
		textview62 = findViewById(R.id.textview62);
		textview63 = findViewById(R.id.textview63);
		textview64 = findViewById(R.id.textview64);
		textview66 = findViewById(R.id.textview66);
		textview13 = findViewById(R.id.textview13);
		textview12 = findViewById(R.id.textview12);
		textview14 = findViewById(R.id.textview14);
		textview15 = findViewById(R.id.textview15);
		textview27 = findViewById(R.id.textview27);
		textview28 = findViewById(R.id.textview28);
		textview29 = findViewById(R.id.textview29);
		textview44 = findViewById(R.id.textview44);
		textview43 = findViewById(R.id.textview43);
		textview45 = findViewById(R.id.textview45);
		textview67 = findViewById(R.id.textview67);
		textview68 = findViewById(R.id.textview68);
		textview30 = findViewById(R.id.textview30);
		
		e1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1A3tLqUmOjt_yaYtNwIieEO9Hz3M5Zo1R/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		e2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1A8g0swc_1sGkiSlJYamirWyruoUci3o3/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		e3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1Yre01duiSFvPHiUV6tE6YVJhTsUb1xMJ/view"));
				startActivity(i8);
			}
		});
		
		e4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1tYm_KKd7P6hk5eni7DKCrsZDXWZbYr7Q/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		e5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1_0ZINpZnZDNcPqhaCb8xtLVWFo7JRhkv/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		e6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1wIVOL_8NT6ueo7am43vCJ6c7RjRqNJ-J/view"));
				startActivity(i8);
			}
		});
		
		e7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1ry1ffWvNIu-We6JVma9m7TUndYJO2FgK/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		e8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1CEJxLZ2xrvGP4WDo0n3c_z3P0S2rq5g9/view"));
				startActivity(i8);
			}
		});
		
		e9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/11pbaJda_kmFmKi4JEi6s97ZNXpbnFCPL/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		e10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1JtZcwZobY7vjjHaCTizyD-yvUmylHKv8/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		e11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/17PU4cbfPyjjlgUhkUWZLcH15jivH3fDS/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		e12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1xYGgqw93OMyQSzL-2N_CT8tZFA3tWPRi/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		e13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1fnad_71EmGiqVh7bKfBL087TLdK9th8R/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		e14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1YaIEKg1BRXnXabcxnzJhWgbTwS5_jMLr/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		e15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1xTFMRdybwsi63Idl6Mp3KQMh645GmM65/view"));
				startActivity(i8);
			}
		});
		
		e16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1LXUPptkpTBifcuYV-RxL6CCdF7zLZFcA/view"));
				startActivity(i8);
			}
		});
		
		e17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1AW59Yme4TSTHADyWm71IXuNoo7QM9BFn/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		e18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1XpzyHKTEySkJzUGhlNPAgbQQBKg6b-Ig/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		h1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1KKmbJH2RUeZwPzCzWJ2pf4ggvVRAyZYA/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		h2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1ZK-OWBMiFOmCIlizypTZmIVFYPQeXSKX/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		h3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1R5egrYCO22v6oPM9z6i6-Z2h_ISLXN0Y/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		h4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1ZFjsmkrO-ohQsxS75YWUmitAvjQdxYfM/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		h5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1gA6e6Ise0fh3CaTk5U1B5UQ0AUfKpk8h/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		h6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1Wt9R1pU9OmPYQFfNhjkuHH0yPUlBWcEY/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		h7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1tpsygvAbJrcd3J4c5_ZGPk0fXqrrcb9U/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		h8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1Io3-d69uq6sOH0r3hvELGszKiQPbRxhI/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		h9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1sByuUq8ERGynr0eUJ868vWQG23Q_NIzq/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		h10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1cGYlRnkEEMFpTspze1ra7iZ2qWHYHOxK/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		h11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1dmuee6MW-u18M7iz5ZLwazTQig1sS15j/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		h12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/17aFTrbPrAJ5sUoSrfiLNxTNIt95zGR1R/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		h13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1zygvc_D5JaELWUfRL5iLlwiVWfxTohKG/view"));
				startActivity(i8);
			}
		});
		
		h14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/10ZBoUux4SuRIIJjN9cwfY5s5FrvTdtDR/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		m1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1npKXUgxojMKywzhMVNzeZ7j1h4SWAVrN/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		m2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1k2_SwfyRGk2dXBH8kIvXsBVfbhweyVHz/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		m3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1yK_pbmd2CM_HFEXZnYVD8AK-4blV0DH9/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		m4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1i7lTQomPxf7msdPRa5N4Y6tNMG636ThI/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		m5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1sJ9f61cx5uQ6aDjLH20wuOnTCt3X_JJ8/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		m6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1xC2ct9dIU3oftBBNChs5QAoHPITuTI-D/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		m7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1KvEwqHv6bZHboKgQg8qgvvWH8aqE33n-/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		m8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1ro-KQsP58BdP3tHd0s17US-SeJG2pNNR/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		m9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1nS9ADBbGHp14YCzL4c1yr4VS-_avdbc-/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		m10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/12DqORg6eBFECC80CwAN0qibRrYFx7F7p/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		m11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1Q2RkJ4xG_7xEyssuy00sUk7IqoEPzw9U/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		m12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/10LA58W9bsz2y82Dr3V-9wHc7JRMxr73n/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		m13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1X8cy9Ni4hiS8N25q_lOiO1Yfi03egsqt/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		m14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/16fL9mMjwh4U66V4aPvteVg-EmDLLsjHW/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		m15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1i2EPfHNgKF5E7vwbP6LDhniuN2mVUQ6K/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		m16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1uOA1ywR4UhwK_rh7oX2SgjTN2aqOP1dw/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		m17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1KJDxFAHTq2KSlYUmxu8BN3b0Y-heWEzG/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		u1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1cOqMZG5qDvrPkXKc-KXDqRB-zMuFNW8M/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		u2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/114JJkCXMmslLPKM5G0tuPdiZi1mE-VpC/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		u3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1a9ghR74YiY1uXSYlPlpWCZ4o-aXi4LLW/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		u4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1syDjCo7W1fCuIfoBxFL5fBL_KZsKkqIk/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		u5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1gvbHX6mG4XD8mTZ6ifLS8s5w_vANrF-x/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		u6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/12WIgelzt7Ypbm3N65rQOUl8XT9l8LQBe/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		u7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/176v00VqmICzb4ne_ifxi6NvOSvulbFdf/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		u8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1zlV1ffaYviLivnyQRMdbzh5eN8ifWjFI/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		u9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/10T08ta_THr1Ov-JPr7NHjL_HGIZu9lWp/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		u10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1bkmq1MYKO4vPMn1_pE690urRzlLQBpu0/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		u11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1QQE6i7CFKKjoqWRPLSnirnM8od9htHjv/view?usp=sharing"));
				startActivity(i8);
			}
		});
		
		u12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i8.setAction(Intent.ACTION_VIEW);
				i8.setData(Uri.parse("https://drive.google.com/file/d/1GrZ-Sy4VZMGabPB6r_iD6jXqtt_uHyhg/view?usp=sharing"));
				startActivity(i8);
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("Class 8");
		adview1.loadAd(new AdRequest.Builder().build());
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