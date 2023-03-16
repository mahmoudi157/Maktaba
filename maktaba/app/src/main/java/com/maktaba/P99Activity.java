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

public class P99Activity extends AppCompatActivity {
	
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
	private LinearLayout linear14;
	private LinearLayout u1;
	private LinearLayout u2;
	private LinearLayout u3;
	private LinearLayout u4;
	private LinearLayout u5;
	private LinearLayout u6;
	private LinearLayout u7;
	private LinearLayout u8;
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
	private TextView textview13;
	private TextView textview12;
	private TextView textview14;
	private TextView textview15;
	private TextView textview27;
	private TextView textview28;
	private TextView textview29;
	private TextView textview44;
	private TextView textview43;
	
	private Intent i9 = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.p99);
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
		linear14 = findViewById(R.id.linear14);
		u1 = findViewById(R.id.u1);
		u2 = findViewById(R.id.u2);
		u3 = findViewById(R.id.u3);
		u4 = findViewById(R.id.u4);
		u5 = findViewById(R.id.u5);
		u6 = findViewById(R.id.u6);
		u7 = findViewById(R.id.u7);
		u8 = findViewById(R.id.u8);
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
		textview13 = findViewById(R.id.textview13);
		textview12 = findViewById(R.id.textview12);
		textview14 = findViewById(R.id.textview14);
		textview15 = findViewById(R.id.textview15);
		textview27 = findViewById(R.id.textview27);
		textview28 = findViewById(R.id.textview28);
		textview29 = findViewById(R.id.textview29);
		textview44 = findViewById(R.id.textview44);
		textview43 = findViewById(R.id.textview43);
		
		e1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1X7tax2TEo_apAp10qVMVwqJCFodQN0M-/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		e2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1EVzoPKzVl9gT0DzceOWapD1-QLkb9H8_/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		e3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/15RZ22AlH3GBC0XwOGQbv4LhbcUN2sltK/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		e4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1VQv5axcyNWBkjza-F0Urd1BSU05YZlaE/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		e5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1qxz_N9caeGlH7CGviDQIwXYy1EmCrw99/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		e6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1xYbuanmhgmoV0sKVZqUxTVIo7ThbLMWW/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		e7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1xOT5bkLpmnB0REGKW9Z6FpR64jo0ZeGI/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		e8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1n_txKdvHaseBxSr3Vej-cgtVwoa12cSt/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		e9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1ZfA9iNiL6NTG7lAsTkNjdBLleyvty_rh/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		e10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1pdmMpbxWt4J181VzKlNabjem0dkilDL2/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		e11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1AIAaQtZ3-zFEQLz3aI9pu9iXVqmqbB8i/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		e12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1FRjGbCeLZ0zr-gzNcGytaoo4prm0-OBE/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		e13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1nzlQXcgZ-KOrdLKNznEKacH75guKmYLj/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		e14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1QW2NG_-0shhXaPUaH7nTnJ06t3NY5Nmu/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		e15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1UIu25tTl5hqucRWsbM5IW1fKwAkeHa3j/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		e16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1BuvTmPZwm-gdfXJUmIOmBB6ilJcD5nhf/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		e17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1M1D43HOdd8H9mA7d4x2ud6lIXkpnXLh_/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		e18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1TnILYkxL8NRx_uTap0X-oET0k__BdRk7/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		h1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/17JcE5i8kq4_3leHgMHjXhcryzowsZx0t/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		h2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/15UOq-Z4m_g-c53YXT6a8clqLoFyyh42H/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		h3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1HPNIK6hrUrPtwv936DBstOJj-v4vBWEY/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		h4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1gKUd3IW3Zza56PO6tLIjpZMBk0Jm7HSh/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		h5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1QD2fgLFmbT0dLpC7qv9Yc4kYPiYozamj/view"));
				startActivity(i9);
			}
		});
		
		h6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1GeQNOoJFp3lV7cEOZvxDAcOeYLYktly6/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		h7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/122zhH_8l7Mm2KSi1OJ3LRbrSBf8jIOPO/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		h8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1Lfiap0hqtY4o1azxDfXQCHrrt063E2JJ/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		h9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1ggP5NkYjyuVQPUe9uO7-vT-g0BxcBKbE/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		h10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1fu3T92N85Mpg9Vl74EpcczsY37NYgXdm/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		h11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1vmdDqJj-f0guZWdh0154C5pt2DflM43X/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		h12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1YvtOpFLZynSzQLGLF3isachE_QEIsiT6/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		m1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1qFnkjB5tKilHuG9DsuwfBMRGC3UiB2tP/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		m2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1Me8zlpmB1-B4OYPM1xxrNpgnhiCUhHa8/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		m3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1DfBm71f0Fchq5zr_nTPO1vKNbn3rXhqK/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		m4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1ek32XE8riaTSBXeJVqEDjGdLW2DbRRCh/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		m5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1PSZ3t2DuAx0V6kU4thdhvoXKWn-4cStw/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		m6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1YdQ7BAk81vtrHMavu1Hj1RhwmaCZrqLF/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		m7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1IIkbqSdqI7_wYcHD8icxkHZqUGOi5DR8/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		m8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1-erDJ0xi5qY7kRvna9zDvGlyRB_TNlW8/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		m9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/166ZRUIOgVHLgAKHk5l1Z5rYi2QfRNS4O/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		m10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1M2Y595yiF5KsrGZEOX191onatBHTCvOq/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		m11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1MGWJSXtoWIboJQmip-d0EeRLnYlh2tmq/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		m12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1jItmcxT1B953UbfujFICSwVQyE2w4wS6/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		m13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1phah4Jj0p3py-7mm-78wczmVX5Mb6RsS/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		m14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1WoJi4Q2ffY2Eg5OzQkVsgFTJCYmc_qqW/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		m15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/16Uja_r1P99snj-NNNrZyie1wLL72HvSU/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		u1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1ANIbhzPxvKU6GnZqLlxMCcWKzUR2gQlL/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		u2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1NMbu97wmKnh3twBmOgdbhtFbaktESxoS/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		u3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1cv977KCqhpotVDI77t1zzMg0XSMo3xf-/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		u4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1NfJs2jMjjGyF9Utj7brFuzetK9LTvJhz/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		u5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1txfpnbtg7Mz5f5-gCZ7LNbxBc7EONVjm/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		u6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1ZExSyXQ7xPDZ0cmYhiMnzfBXVYiwq_KC/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		u7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1mVZE7nsanQkBxKNqvgbMRWbwQAkGwZG4/view?usp=sharing"));
				startActivity(i9);
			}
		});
		
		u8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i9.setAction(Intent.ACTION_VIEW);
				i9.setData(Uri.parse("https://drive.google.com/file/d/1cvd1wTBWyTJAs4dJwo4XidMvfDNCFzYD/view?usp=sharing"));
				startActivity(i9);
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("Class 9");
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