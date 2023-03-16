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

public class Elevan1Activity extends AppCompatActivity {
	
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
	private LinearLayout e19;
	private LinearLayout e20;
	private LinearLayout e21;
	private LinearLayout e22;
	private LinearLayout e23;
	private LinearLayout e24;
	private LinearLayout e25;
	private LinearLayout e26;
	private LinearLayout e27;
	private LinearLayout e28;
	private LinearLayout e29;
	private LinearLayout e30;
	private LinearLayout e31;
	private LinearLayout e32;
	private LinearLayout e33;
	private LinearLayout e34;
	private LinearLayout e35;
	private LinearLayout e36;
	private LinearLayout e37;
	private LinearLayout linear6;
	private LinearLayout h1;
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
	private LinearLayout m18;
	private LinearLayout m19;
	private LinearLayout m20;
	private LinearLayout m21;
	private LinearLayout m22;
	private LinearLayout m23;
	private LinearLayout m24;
	private LinearLayout linear14;
	private LinearLayout u1;
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
	private TextView textview75;
	private TextView textview76;
	private TextView textview79;
	private TextView textview80;
	private TextView textview81;
	private TextView textview82;
	private TextView textview77;
	private TextView textview83;
	private TextView textview84;
	private TextView textview85;
	private TextView textview87;
	private TextView textview86;
	private TextView textview88;
	private TextView textview89;
	private TextView textview90;
	private TextView textview91;
	private TextView textview92;
	private TextView textview93;
	private TextView textview94;
	private TextView textview4;
	private TextView textview73;
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
	private TextView textview69;
	private TextView textview95;
	private TextView textview96;
	private TextView textview97;
	private TextView textview98;
	private TextView textview99;
	private TextView textview100;
	private TextView textview13;
	private TextView textview30;
	
	private Intent i11 = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.elevan1);
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
		e19 = findViewById(R.id.e19);
		e20 = findViewById(R.id.e20);
		e21 = findViewById(R.id.e21);
		e22 = findViewById(R.id.e22);
		e23 = findViewById(R.id.e23);
		e24 = findViewById(R.id.e24);
		e25 = findViewById(R.id.e25);
		e26 = findViewById(R.id.e26);
		e27 = findViewById(R.id.e27);
		e28 = findViewById(R.id.e28);
		e29 = findViewById(R.id.e29);
		e30 = findViewById(R.id.e30);
		e31 = findViewById(R.id.e31);
		e32 = findViewById(R.id.e32);
		e33 = findViewById(R.id.e33);
		e34 = findViewById(R.id.e34);
		e35 = findViewById(R.id.e35);
		e36 = findViewById(R.id.e36);
		e37 = findViewById(R.id.e37);
		linear6 = findViewById(R.id.linear6);
		h1 = findViewById(R.id.h1);
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
		m18 = findViewById(R.id.m18);
		m19 = findViewById(R.id.m19);
		m20 = findViewById(R.id.m20);
		m21 = findViewById(R.id.m21);
		m22 = findViewById(R.id.m22);
		m23 = findViewById(R.id.m23);
		m24 = findViewById(R.id.m24);
		linear14 = findViewById(R.id.linear14);
		u1 = findViewById(R.id.u1);
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
		textview75 = findViewById(R.id.textview75);
		textview76 = findViewById(R.id.textview76);
		textview79 = findViewById(R.id.textview79);
		textview80 = findViewById(R.id.textview80);
		textview81 = findViewById(R.id.textview81);
		textview82 = findViewById(R.id.textview82);
		textview77 = findViewById(R.id.textview77);
		textview83 = findViewById(R.id.textview83);
		textview84 = findViewById(R.id.textview84);
		textview85 = findViewById(R.id.textview85);
		textview87 = findViewById(R.id.textview87);
		textview86 = findViewById(R.id.textview86);
		textview88 = findViewById(R.id.textview88);
		textview89 = findViewById(R.id.textview89);
		textview90 = findViewById(R.id.textview90);
		textview91 = findViewById(R.id.textview91);
		textview92 = findViewById(R.id.textview92);
		textview93 = findViewById(R.id.textview93);
		textview94 = findViewById(R.id.textview94);
		textview4 = findViewById(R.id.textview4);
		textview73 = findViewById(R.id.textview73);
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
		textview69 = findViewById(R.id.textview69);
		textview95 = findViewById(R.id.textview95);
		textview96 = findViewById(R.id.textview96);
		textview97 = findViewById(R.id.textview97);
		textview98 = findViewById(R.id.textview98);
		textview99 = findViewById(R.id.textview99);
		textview100 = findViewById(R.id.textview100);
		textview13 = findViewById(R.id.textview13);
		textview30 = findViewById(R.id.textview30);
		
		e1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1MUe_u5IfNgdg7pAWyO9GPFydIss246FM/view"));
				startActivity(i11);
			}
		});
		
		e2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1ILMZM7S-44XJYMXxzbCG2A0Vp5YwiZ8e/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1NRnSkRwyi0hBQiO36K6B7jnBnAwgryko/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1NMghL6pDmSlhCcQ6bH6ZoNSm8pxMXpNy/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1jtY6MlYugahhMCxVrsNd0jeYKZsFkX59/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1-qkFEzh1wQFs3vDnTcrdH0-GwYr9Tf53/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1Hf4vR_uH3HDfs-8rZSDmQ-Zo94dVgvX7/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/15qslCBeseOspc1J4xd1RlwAUzoOE3L0G/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1np4M6VOVFjaSx930_GzhtfKHKgMCoVvs/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1XaSKlEGEwurqFeuISxtPujO48VmUejBF/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1qF9mOuE0Bn_9bkAlPN2Jp-IwpsO9lach/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1ByB53F5rjtUhVquPfPm7ExyTh8WMcvja/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1J4TytGYCI1fS11U66-YcRBT0ccvtHDM9/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1sAc5vyh_CknJz3F9VwQq6sZfyNljeta5/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1TCBcLYa7gDfLpxOrlE8rqZO72Vtnbi-K/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1F80zkx1km1isC20oXiX0nBvoEtwTmOyI/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1xuWrpTLfK_h_eOu2fDOUff3_X-lNBiN2/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1QIgUJqtu_QVhBInwbqvF2BKWxWiaczKI/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1ejXT7o5yzTjI2i4KgUeA_wlb66NmPTdS/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/14f2KzjX4oZs9KsFLZT24QYmjr_tdTYPm/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1mQ3wOukL7GzncCSgrtU2L43FU420VjwY/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1gQRuAUmnghzxipEO7ljckvwdas-5a98v/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1Mwdh3EiH4jFnDAodTUbsZXlnh0EQtCgB/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e24.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1qJPRMocMfD63OTIz73UK-PVZ_XuRyRMJ/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e25.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1q8lf5dk-rHQLllVIhZmKVOhjXUQGrtMW/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1YgHeQufVNoBL9t6sV77jO0tumNmscAzf/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1MVOf_d3QlevznItKpJEHGJNKO2P1fNEG/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1pM6TK3l1H9hghFWLSeiU4FR_nhQLlK3k/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1uhd1V6gVxNmFQsEgm1IjCCXEVmGiQWuW/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e30.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/14RxKjTc7-PTwst7yjMy9v4t-2J4GgiJs/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1m3Jh5qgYAg2Q9zdcDczZ-O2kLvEFad9K/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1afm819Nt6iTIjFEYOTdXSMp8W7bC_dKy/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1-_sA6zRp_W5sujhqVc91Tcv0_7FZ0USx/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1guauSDjN_mQULQb4_kxAiySN8YkygHUP/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e35.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1JQujUVxSZwD3mEwHzZjYwpwBrY2iUbQ_/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e36.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1wPDy_RmxXIwKJrCRL7_MiYICyiG6lVXr/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		e37.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1gyZYOX12XQ-aZqZGnh-zptlTyN9XTx-7/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		h1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1Q_vGex4-uEvg96BEnmVMgqXO47QOfqar/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1F5dweOhyA1N_P6gcHZlPP-OvCDfWXWBc/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1nRMb2bYXVihUC8Ny70jFCmUOqcELXaXf/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1Qse2Jj1oKsqoZYC6wqPXI32hg4DTwkR3/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1IFvtasNNSoEQKsNP_nayO8_UEBQY-9_S/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1ECqIS50hLy_u8MR2c3FO0iC-fGFo0vvL/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/17TXOhV3AiZWkYzEhcsrHhf4V24qFAmcp/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/17LNvobjMz59asMYnZDbQGcToiBl3dhV5/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1sImdLeEqh9ks7E60XIUIG9hnFnePWeld/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1NSWlSzkUsMSd0nKNUFwC19QvVynNdr0O/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/13r3zPmaIt3GGN2DPkVs4qhHJw-aQQGOf/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1ceJU6MgvhqWw_V1mHUrZVQ-UIFM4DNfm/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1Z6633CpNxJWQCCIC2imRvJTzFW6b5hrv/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/11mvsvZuO_2Zo1Igv7wFyKJLHOr3PEY1z/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/15FqedAO_AA0orwJa_Oo7akGEFXL4coEY/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1ujpJaOlNmX4HZRds8B5jjTLfjjrcs_rM/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1w6YFG3UkPGyRFsDcoHcs-Yf9OrQEp628/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1kk1BCIj6fe2ZhPb_ZhLVbmlY-5a21_GO/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1lAQueFVYOINtnw84E1PSL-ThruS-84C4/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1vggL9NoMXPYeDU10FohvCS4Ky-AfB2OV/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1rMvkD3OqCpg4LgHvH1Vk-Mx8PcjYsmnq/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/15aJqUBihTajbXz7OmPruwetrsjTpvYa6/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1ptpVmgoSruAGjojXImHsZZswvBEZ6Kl7/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1RJQr31OJbrg6xSdDM5n4GF3xuEfNqEND/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		m24.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/1yiP1BeksHxRWxCoLcekO-mBhplW60p0w/view?usp=sharing"));
				startActivity(i11);
			}
		});
		
		u1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i11.setAction(Intent.ACTION_VIEW);
				i11.setData(Uri.parse("https://drive.google.com/file/d/19tS60FlsnhGo5Ga9dot3wto9koF4cdNs/view?usp=sharing"));
				startActivity(i11);
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("Class 11");
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