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

public class P10Activity extends AppCompatActivity {
	
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
	private LinearLayout h15;
	private LinearLayout h16;
	private LinearLayout h17;
	private LinearLayout h18;
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
	private LinearLayout linear14;
	private LinearLayout u1;
	private LinearLayout u2;
	private LinearLayout u3;
	private LinearLayout u4;
	private LinearLayout u5;
	private LinearLayout u6;
	private LinearLayout u7;
	private LinearLayout u0;
	private LinearLayout u8;
	private LinearLayout u9;
	private LinearLayout u10;
	private LinearLayout u11;
	private LinearLayout u12;
	private LinearLayout u13;
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
	private TextView textview77;
	private TextView textview4;
	private TextView textview5;
	private TextView textview6;
	private TextView textview7;
	private TextView textview20;
	private TextView textview23;
	private TextView textview41;
	private TextView textview24;
	private TextView textview52;
	private TextView textview53;
	private TextView textview54;
	private TextView textview55;
	private TextView textview57;
	private TextView textview56;
	private TextView textview70;
	private TextView textview71;
	private TextView textview72;
	private TextView textview73;
	private TextView textview74;
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
	private TextView textview13;
	private TextView textview12;
	private TextView textview14;
	private TextView textview15;
	private TextView textview27;
	private TextView textview28;
	private TextView textview29;
	private TextView textview44;
	private TextView textview79;
	private TextView textview43;
	private TextView textview45;
	private TextView textview67;
	private TextView textview68;
	private TextView textview78;
	private TextView textview30;
	
	private Intent i10 = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.p10);
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
		h15 = findViewById(R.id.h15);
		h16 = findViewById(R.id.h16);
		h17 = findViewById(R.id.h17);
		h18 = findViewById(R.id.h18);
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
		linear14 = findViewById(R.id.linear14);
		u1 = findViewById(R.id.u1);
		u2 = findViewById(R.id.u2);
		u3 = findViewById(R.id.u3);
		u4 = findViewById(R.id.u4);
		u5 = findViewById(R.id.u5);
		u6 = findViewById(R.id.u6);
		u7 = findViewById(R.id.u7);
		u0 = findViewById(R.id.u0);
		u8 = findViewById(R.id.u8);
		u9 = findViewById(R.id.u9);
		u10 = findViewById(R.id.u10);
		u11 = findViewById(R.id.u11);
		u12 = findViewById(R.id.u12);
		u13 = findViewById(R.id.u13);
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
		textview77 = findViewById(R.id.textview77);
		textview4 = findViewById(R.id.textview4);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		textview7 = findViewById(R.id.textview7);
		textview20 = findViewById(R.id.textview20);
		textview23 = findViewById(R.id.textview23);
		textview41 = findViewById(R.id.textview41);
		textview24 = findViewById(R.id.textview24);
		textview52 = findViewById(R.id.textview52);
		textview53 = findViewById(R.id.textview53);
		textview54 = findViewById(R.id.textview54);
		textview55 = findViewById(R.id.textview55);
		textview57 = findViewById(R.id.textview57);
		textview56 = findViewById(R.id.textview56);
		textview70 = findViewById(R.id.textview70);
		textview71 = findViewById(R.id.textview71);
		textview72 = findViewById(R.id.textview72);
		textview73 = findViewById(R.id.textview73);
		textview74 = findViewById(R.id.textview74);
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
		textview13 = findViewById(R.id.textview13);
		textview12 = findViewById(R.id.textview12);
		textview14 = findViewById(R.id.textview14);
		textview15 = findViewById(R.id.textview15);
		textview27 = findViewById(R.id.textview27);
		textview28 = findViewById(R.id.textview28);
		textview29 = findViewById(R.id.textview29);
		textview44 = findViewById(R.id.textview44);
		textview79 = findViewById(R.id.textview79);
		textview43 = findViewById(R.id.textview43);
		textview45 = findViewById(R.id.textview45);
		textview67 = findViewById(R.id.textview67);
		textview68 = findViewById(R.id.textview68);
		textview78 = findViewById(R.id.textview78);
		textview30 = findViewById(R.id.textview30);
		
		e1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1EX_X0nqBR7E8IY5hnuUFUnYjDmOO7fZm/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		e2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1EhbhxXrJGJ-sCa1uhKKTBSsGCb3FHNKe/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		e3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/10jVE0Pc8In2HjxaethAIW425leC1C91m/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		e4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/18UPmMZ5gHztSOuR0useQwZBqmgO_AXtm/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		e5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1WhSUhCalkkEZuzIDpo9AWr3VTfvnUZX3/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		e6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1mH7ZvTnGBuc4JjmE8grBb1oKEv91Nupl/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		e7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1q2pa37CJW7qdqSt4VxvcHIM4zp-22agS/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		e8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1NH7qXy4U0ik8NrxWnHd1ftR1F0PdnmFc/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		e9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1CPJ4NNsKXheiw4wLTWzEHBqxROheN3g2/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		e10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1wW5j9FkC0mu5j2ffkujltrWpvDUTsIVA/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		e11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1Ub_r7OsUk-c22UUOHVEPVzxTt2XoOwuL/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		e12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1igwnKApQkjY_E55K67HnsWU3KR5TQbHM/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		e13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1nNjpA3L2ATYe8DRW1Ko5iNLNMSReYTdx/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		e14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/18rjpYoFJ6F3CKtBg263fGgrjTegmpNxx/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		e15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1yZMfaGcf6dN6yLY9bg2VmOKUTMvlKEDD/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		e16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1TAfSyGKdIKxyBxMGWGblyyE-gtDCM5re/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		e17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1YgOAeFtQm55N1bnn0BR1ltf2Syzq6rMV/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		e18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1P9-dE6_pp11Qbo0eSDCmJtukZjwW_52g/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		e19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1Vv1jdCwg__ni7SuQdBCWvWOAD4oDW-kf/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		e20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/16ODE7k0SxwK07jmM_8xA-yOyOCTsX-qh/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		e21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1p37MJhCJQO5e33-NBb0CKkmbimW62dP5/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		h1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1zRqnyEDWFDK9fPx9j_G-PM4vW2AwlGsL/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		h2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1Oy8HMyc0KOuOFG8ph8hzx5Lhsuu8nn2f/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		h3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1SX0mqn2RoKC4mqKM6lALL4k3OG_7me0z/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		h4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1mNXvG7LjNfR4aIv0CFQcvr7NGCTdgTsL/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		h5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1Yqkz36cnYc0jSnXzugIAxNulb3uuwoQ2/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		h6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1hWp3d_ztyNrkm25uvh9JKA9oTiWHAti_/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		h7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/172-KKXfC2LvDXcQiktZpC6d2pwFdUXVj/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		h8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1WfnekONWfJ8hpRkp7o0fi1MVnKp8fCqT/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		h9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1kygt0yqukoXWNP5YcB4vqvFyNhTLGS4X/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		h10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1eW8lZK9EPEi16AKqoy-vz_QVzg17eFqF/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		h11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1seNFqOeQ0KJixC_5qf-7-fix18SMhI8a/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		h12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/12zsyOqasmFjBwVpuBbxj2qaxQws73h-d/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		h13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1xFsIwf3e3xfq-yo0MWinS4bQ9m0wvxbL/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		h14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1YXqxEvnjsux5FLYqUS8y-aLNTM_N9WbF/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		h15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1wUuxbMIT0zPBI5oLAJ4HtOLZ-ILvYQmK/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		h16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1qfgQRmN0dfYjoDK6C1OirJykqFTv6wuy/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		h17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/12NV0UWFyvmjewWjla7lOZqKD5EF7TZZE/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		h18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1sWeoXmd9Xxzc6K3PQSCPRhpe6CzMWRTX/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		m1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1td8HPe_Dg_ytmC0TGnJXyFeQIqyQa7vs/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		m2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1JflS5pVp928tLY0jpqSG_lzDyUOWFJ_u/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		m3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/19HaljZNHl2gvLBLeeVrv4X7aYQJ3i5Gf/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		m4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/13Xmsmhm9e6EKc1ISfG-0AdUVAL-kK0NO/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		m5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1F6UN-kuhk40vzYDJju360ZijbEXtweR2/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		m6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/12DI0emvfTaZxtg3HdRGN8yG8mBqAwNcd/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		m7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1AK4bxMTyXDvC8LaAprYHbZHSF0QCdAEI/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		m8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1fSR5peAudIahFffbf_RHw2f_WPCBqHun/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		m9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1L4PVngUgCfvHNHW2TU_x3ofgVrXC0z3s/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		m10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1X7dgTXWNmyk-lA4PiLrZofy2Eq5y6RQr/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		m11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1NeNid2zP5XL4SM5MTnEC_vtk2nZZ9YsT/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		m12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1KdomYvHCrOsZpMhLaJj7d2Z7uYm1FSFh/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		m13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1FkXcNAv1rc1bZUeDFgTDoCFMZk2aK-xQ/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		m14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1LvMOmhN3MMa4NTkvdVsR-MjZECkH8ML2/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		m15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/15SHq1BoGcjWDY-OFVsQlpGQviPf9zIbr/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		m16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1j21gadURt9kLehUZy_t99eZ_jwjuC9jy/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		m17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1OyZ2qy9kJsnhbq_CMt8w5LUPYLJoHg_Z/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		m18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/18_QGFqOWnj8CkuHC4DcPblEU21WpBUSk/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		u1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/13iVVDeWlVlKbigSNG91XWY9Zk8UGmkyn/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		u2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1FnysS5WvTKoYrXfDiDgkUVIt0lFouzQm/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		u3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1KP8-eB5FcgLbvZZfEEi7W7K2tay_7Dlw/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		u4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/19os7kcJbEOMjbN40yPSe6zSylmkmDed_/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		u5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/184VjWZysq2Cxws-MjDg2jNIMzUs8jeiP/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		u6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1xERlXiui8tW6OFdsJA92bCVEltiMqxji/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		u7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1T-9EZ8hXiqT2TgzOeLwZ1fucEqHQSp4T/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		u0.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1QUTnKjmb8MFzdLQYf-XPC6U_rZcAefi-/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		u8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/12dJubENRXCTE30tb3ePHjI4efnycwA2B/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		u9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1BXqcWhjMQqkuS4mYNhyJk1G__UwJ2M_C/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		u10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1VQlyqwDrd2uFp78iTFzcWQZEGw3Nd8_-/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		u11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1vxyDUfLdYs6c5QvmHIdoy6ccIlrqHDGP/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		u12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1-CVJw4q4kTh_I6ZPKGbK0fhperHHddD-/view?usp=sharing"));
				startActivity(i10);
			}
		});
		
		u13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i10.setAction(Intent.ACTION_VIEW);
				i10.setData(Uri.parse("https://drive.google.com/file/d/1ThK7MRrdLzWJMcpZZWERrWetQ67oQBPe/view?usp=sharing"));
				startActivity(i10);
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("Class 10");
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