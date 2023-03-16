package com.maktaba;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.AlertDialog;
import android.content.*;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;



public class MainActivity extends AppCompatActivity {
	
	public final int REQ_CD_FP = 101;
	
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private DrawerLayout _drawer;
	private String share = "";
	private HashMap<String, Object> appdat = new HashMap<>();
	private String update = "";
	private String applink = "";
	private String request = "";
	
	private LinearLayout linear1;
	private AdView adview5;
	private LinearLayout linear22;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear27;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private TextView textview1;
	private TextView textview13;
	private TextView textview2;
	private TextView textview14;
	private LinearLayout linear12;
	private LinearLayout linear11;
	private TextView textview3;
	private TextView textview15;
	private TextView textview4;
	private TextView textview16;
	private LinearLayout linear14;
	private LinearLayout linear13;
	private TextView textview5;
	private TextView textview17;
	private TextView textview6;
	private TextView textview18;
	private LinearLayout linear16;
	private LinearLayout linear15;
	private TextView textview7;
	private TextView textview19;
	private TextView textview8;
	private TextView textview20;
	private LinearLayout linear18;
	private LinearLayout linear17;
	private TextView textview9;
	private TextView textview21;
	private TextView textview10;
	private TextView textview22;
	private LinearLayout linear21;
	private LinearLayout linear20;
	private TextView textview11;
	private TextView textview23;
	private TextView textview24;
	private TextView textview12;
	private TextView textviewversion;
	private EditText edittext1;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private LinearLayout linear26;
	private ImageView imageview1;
	private TextView textview25;
	private ImageView imageview2;
	private TextView textview26;
	private ImageView imageview3;
	private TextView textview27;
	private ScrollView _drawer_vscroll1;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear2;
	private LinearLayout _drawer_linear3;
	private LinearLayout _drawer_linear4;
	private LinearLayout _drawer_linear5;
	private LinearLayout _drawer_linear6;
	private LinearLayout _drawer_linear7;
	private LinearLayout _drawer_linear9app;
	private LinearLayout _drawer_linear10app;
	private TextView _drawer_textview12;
	private TextView _drawer_textview11;
	private ImageView _drawer_imageview2;
	private TextView _drawer_textview1;
	private ImageView _drawer_imageview3;
	private TextView _drawer_textview2;
	private ImageView _drawer_imageview5;
	private TextView _drawer_textview3;
	private ImageView _drawer_imageview4;
	private TextView _drawer_textview4;
	private ImageView _drawer_imageview6;
	private TextView _drawer_textview5;
	private ImageView _drawer_imageview8;
	private TextView _drawer_textview6;
	private TextView _drawer_textview9;
	private ImageView _drawer_imageview9;
	private TextView _drawer_textview8;
	private TextView _drawer_textview10;
	
	private Intent i = new Intent();
	private Intent inte = new Intent();
	private FirebaseAuth fauth;
	private OnCompleteListener<AuthResult> _fauth_create_user_listener;
	private OnCompleteListener<AuthResult> _fauth_sign_in_listener;
	private OnCompleteListener<Void> _fauth_reset_password_listener;
	private OnCompleteListener<Void> fauth_updateEmailListener;
	private OnCompleteListener<Void> fauth_updatePasswordListener;
	private OnCompleteListener<Void> fauth_emailVerificationSentListener;
	private OnCompleteListener<Void> fauth_deleteUserListener;
	private OnCompleteListener<Void> fauth_updateProfileListener;
	private OnCompleteListener<AuthResult> fauth_phoneAuthListener;
	private OnCompleteListener<AuthResult> fauth_googleSignInListener;
	
	private DatabaseReference appdata = _firebase.getReference("appdata");
	private ChildEventListener _appdata_child_listener;
	private AlertDialog.Builder diloggg;
	private Intent upd = new Intent();
	private Intent in = new Intent();
	private Intent fp = new Intent(Intent.ACTION_GET_CONTENT);
	private RequestNetwork ret;
	private RequestNetwork.RequestListener _ret_request_listener;
	private Intent ii = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		MobileAds.initialize(this);
		
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
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
		_drawer = findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(MainActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = findViewById(R.id._nav_view);
		
		linear1 = findViewById(R.id.linear1);
		adview5 = findViewById(R.id.adview5);
		linear22 = findViewById(R.id.linear22);
		vscroll1 = findViewById(R.id.vscroll1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		linear5 = findViewById(R.id.linear5);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		linear27 = findViewById(R.id.linear27);
		linear9 = findViewById(R.id.linear9);
		linear10 = findViewById(R.id.linear10);
		textview1 = findViewById(R.id.textview1);
		textview13 = findViewById(R.id.textview13);
		textview2 = findViewById(R.id.textview2);
		textview14 = findViewById(R.id.textview14);
		linear12 = findViewById(R.id.linear12);
		linear11 = findViewById(R.id.linear11);
		textview3 = findViewById(R.id.textview3);
		textview15 = findViewById(R.id.textview15);
		textview4 = findViewById(R.id.textview4);
		textview16 = findViewById(R.id.textview16);
		linear14 = findViewById(R.id.linear14);
		linear13 = findViewById(R.id.linear13);
		textview5 = findViewById(R.id.textview5);
		textview17 = findViewById(R.id.textview17);
		textview6 = findViewById(R.id.textview6);
		textview18 = findViewById(R.id.textview18);
		linear16 = findViewById(R.id.linear16);
		linear15 = findViewById(R.id.linear15);
		textview7 = findViewById(R.id.textview7);
		textview19 = findViewById(R.id.textview19);
		textview8 = findViewById(R.id.textview8);
		textview20 = findViewById(R.id.textview20);
		linear18 = findViewById(R.id.linear18);
		linear17 = findViewById(R.id.linear17);
		textview9 = findViewById(R.id.textview9);
		textview21 = findViewById(R.id.textview21);
		textview10 = findViewById(R.id.textview10);
		textview22 = findViewById(R.id.textview22);
		linear21 = findViewById(R.id.linear21);
		linear20 = findViewById(R.id.linear20);
		textview11 = findViewById(R.id.textview11);
		textview23 = findViewById(R.id.textview23);
		textview24 = findViewById(R.id.textview24);
		textview12 = findViewById(R.id.textview12);
		textviewversion = findViewById(R.id.textviewversion);
		edittext1 = findViewById(R.id.edittext1);
		linear24 = findViewById(R.id.linear24);
		linear25 = findViewById(R.id.linear25);
		linear26 = findViewById(R.id.linear26);
		imageview1 = findViewById(R.id.imageview1);
		textview25 = findViewById(R.id.textview25);
		imageview2 = findViewById(R.id.imageview2);
		textview26 = findViewById(R.id.textview26);
		imageview3 = findViewById(R.id.imageview3);
		textview27 = findViewById(R.id.textview27);
		_drawer_vscroll1 = _nav_view.findViewById(R.id.vscroll1);
		_drawer_linear1 = _nav_view.findViewById(R.id.linear1);
		_drawer_linear2 = _nav_view.findViewById(R.id.linear2);
		_drawer_linear3 = _nav_view.findViewById(R.id.linear3);
		_drawer_linear4 = _nav_view.findViewById(R.id.linear4);
		_drawer_linear5 = _nav_view.findViewById(R.id.linear5);
		_drawer_linear6 = _nav_view.findViewById(R.id.linear6);
		_drawer_linear7 = _nav_view.findViewById(R.id.linear7);
		_drawer_linear9app = _nav_view.findViewById(R.id.linear9app);
		_drawer_linear10app = _nav_view.findViewById(R.id.linear10app);
		_drawer_textview12 = _nav_view.findViewById(R.id.textview12);
		_drawer_textview11 = _nav_view.findViewById(R.id.textview11);
		_drawer_imageview2 = _nav_view.findViewById(R.id.imageview2);
		_drawer_textview1 = _nav_view.findViewById(R.id.textview1);
		_drawer_imageview3 = _nav_view.findViewById(R.id.imageview3);
		_drawer_textview2 = _nav_view.findViewById(R.id.textview2);
		_drawer_imageview5 = _nav_view.findViewById(R.id.imageview5);
		_drawer_textview3 = _nav_view.findViewById(R.id.textview3);
		_drawer_imageview4 = _nav_view.findViewById(R.id.imageview4);
		_drawer_textview4 = _nav_view.findViewById(R.id.textview4);
		_drawer_imageview6 = _nav_view.findViewById(R.id.imageview6);
		_drawer_textview5 = _nav_view.findViewById(R.id.textview5);
		_drawer_imageview8 = _nav_view.findViewById(R.id.imageview8);
		_drawer_textview6 = _nav_view.findViewById(R.id.textview6);
		_drawer_textview9 = _nav_view.findViewById(R.id.textview9);
		_drawer_imageview9 = _nav_view.findViewById(R.id.imageview9);
		_drawer_textview8 = _nav_view.findViewById(R.id.textview8);
		_drawer_textview10 = _nav_view.findViewById(R.id.textview10);
		fauth = FirebaseAuth.getInstance();
		diloggg = new AlertDialog.Builder(this);
		fp.setType("*/*");
		fp.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
		ret = new RequestNetwork(this);
		
		linear9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), P12Activity.class);
				startActivity(i);
			}
		});
		
		linear10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), Elevan1Activity.class);
				startActivity(i);
			}
		});
		
		linear12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), P10Activity.class);
				startActivity(i);
			}
		});
		
		linear11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), P99Activity.class);
				startActivity(i);
			}
		});
		
		linear14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), P88Activity.class);
				startActivity(i);
			}
		});
		
		linear13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), P77Activity.class);
				startActivity(i);
			}
		});
		
		linear16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), P66Activity.class);
				startActivity(i);
			}
		});
		
		linear15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), P55Activity.class);
				startActivity(i);
			}
		});
		
		linear18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), P44Activity.class);
				startActivity(i);
			}
		});
		
		linear17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), P33Activity.class);
				startActivity(i);
			}
		});
		
		linear21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), P22Activity.class);
				startActivity(i);
			}
		});
		
		linear20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), P11Activity.class);
				startActivity(i);
			}
		});
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (textviewversion.getText().toString().equals(update)) {
					
				}
				else {
					diloggg.setTitle("Update Available. ");
					diloggg.setMessage("A newer version of this app is available, please update the app. ");
					diloggg.setCancelable(false);
					diloggg.setPositiveButton("Update", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							upd.setAction(Intent.ACTION_VIEW);
							upd.setData(Uri.parse(applink));
							startActivity(upd);
						}
					});
					diloggg.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					diloggg.create().show();
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		linear24.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_click_effect(linear24, "#FF5722");
			}
		});
		
		linear25.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((FirebaseAuth.getInstance().getCurrentUser() != null)) {
					_click_effect(linear25, "#FF5722");
					i.setClass(getApplicationContext(), BooksActivity.class);
					startActivity(i);
				}
				else {
					_click_effect(linear25, "#FF5722");
					ii.setClass(getApplicationContext(), ProfileActivity.class);
					startActivity(ii);
				}
			}
		});
		
		linear26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((FirebaseAuth.getInstance().getCurrentUser() != null)) {
					_click_effect(linear26, "#FF5722");
					i.setClass(getApplicationContext(), Profile2Activity.class);
					startActivity(i);
				}
				else {
					_click_effect(linear26, "#FF5722");
					i.setClass(getApplicationContext(), ProfileActivity.class);
					startActivity(i);
				}
			}
		});
		
		_appdata_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				update = _childValue.get("update").toString();
				applink = _childValue.get("applink").toString();
				edittext1.setText(_childValue.get("update").toString());
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		appdata.addChildEventListener(_appdata_child_listener);
		
		_ret_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_drawer_linear3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_click_effect(linear3, "#757575");
				inte.setAction(Intent.ACTION_VIEW);
				inte.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.mohitkrishna.textlibooks"));
				startActivity(inte);
			}
		});
		
		_drawer_linear4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_click_effect(linear4, "#757575");
				request = "upi://pay?pa=hritikyadav.fam@idfcbank&pn=Hritik yadav&tn=Support us by 1₹&am=1&cu=INR";
				in.setData(Uri.parse(request));
				in.setAction(Intent.ACTION_VIEW);
				Intent chooser = Intent.createChooser(in, "UPI");
				if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN){
					 startActivityForResult(chooser, 2, null);
				}
			}
		});
		
		_drawer_linear5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				inte.setAction(Intent.ACTION_VIEW);
				inte.setData(Uri.parse("mailto:textli@stayhome.li"));
				startActivity(inte);
			}
		});
		
		_drawer_linear6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_click_effect(linear6, "#757575");
				inte.setAction(Intent.ACTION_VIEW);
				inte.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.mohitkrishna.textlibooks"));
				startActivity(inte);
			}
		});
		
		_drawer_linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_click_effect(linear7, "#757575");
				share = "Hello Friend, Are you fed up of searching textbook online and not getting also, Try downloading👉👉 TEXTLI 👈👈 \nTextly is app where you can find Textbooks very Easily, It is very simple to use also . \n\nCLICK HERE : ".concat("https://play.google.com/store/apps/details?id=com.mohitkrishna.textlibooks");
				Intent i = new Intent(android.content.Intent.ACTION_SEND);i.setType("text/plain"); i.putExtra(android.content.Intent.EXTRA_TEXT, share); startActivity(Intent.createChooser(i,"Share using"));
				//modified by ashishtechnozone
				
				
			}
		});
		
		_drawer_linear9app.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				inte.setAction(Intent.ACTION_VIEW);
				inte.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.mohithkrishna.apkbackup"));
				startActivity(inte);
			}
		});
		
		_drawer_linear10app.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				inte.setAction(Intent.ACTION_VIEW);
				inte.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.ist.applicationkiller"));
				startActivity(inte);
			}
		});
		
		fauth_updateEmailListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		fauth_updatePasswordListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		fauth_emailVerificationSentListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		fauth_deleteUserListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		fauth_phoneAuthListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		fauth_updateProfileListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		fauth_googleSignInListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task) {
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		_fauth_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_fauth_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_fauth_reset_password_listener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				
			}
		};
	}
	
	private void initializeLogic() {
		ret.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "space x", _ret_request_listener);
		_setcornerradius(linear9, 10, 20, "#FFFFFF");
		_setcornerradius(linear10, 10, 20, "#FFFFFF");
		_setcornerradius(linear11, 10, 20, "#FFFFFF");
		_setcornerradius(linear12, 10, 20, "#FFFFFF");
		_setcornerradius(linear13, 10, 20, "#FFFFFF");
		_setcornerradius(linear14, 10, 20, "#FFFFFF");
		_setcornerradius(linear15, 10, 20, "#FFFFFF");
		_setcornerradius(linear16, 10, 20, "#FFFFFF");
		_setcornerradius(linear17, 10, 20, "#FFFFFF");
		_setcornerradius(linear18, 10, 20, "#FFFFFF");
		_setcornerradius(linear20, 10, 20, "#FFFFFF");
		_setcornerradius(linear21, 10, 20, "#FFFFFF");
		textviewversion.setVisibility(View.GONE);
		edittext1.setVisibility(View.GONE);
		adview5.loadAd(new AdRequest.Builder().build());
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			case REQ_CD_FP:
			if (_resultCode == Activity.RESULT_OK) {
				ArrayList<String> _filePath = new ArrayList<>();
				if (_data != null) {
					if (_data.getClipData() != null) {
						for (int _index = 0; _index < _data.getClipData().getItemCount(); _index++) {
							ClipData.Item _item = _data.getClipData().getItemAt(_index);
							_filePath.add(fill.convertUriToFilePath(getApplicationContext(), _item.getUri()));
						}
					}
					else {
						_filePath.add(fill.convertUriToFilePath(getApplicationContext(), _data.getData()));
					}
				}
				Funct.showMessage(getApplicationContext(), "catched");
				String res = _data.getStringExtra("response");
				if (res.contains("Status=SUCCESS")) {
					Funct.showMessage(getApplicationContext(), "Payment Successful");
				} else {
					Funct.showMessage(getApplicationContext(), "Payment Failed");
				}
			}
			else {
				
			}
			break;
			default:
			break;
		}
	}
	
	@Override
	public void onStart() {
		super.onStart();
		
	}
	
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		if (adview5 != null) {
			adview5.destroy();
		}
	}
	
	@Override
	public void onPause() {
		super.onPause();
		if (adview5 != null) {
			adview5.pause();
		}
	}
	
	@Override
	public void onResume() {
		super.onResume();
		if (adview5 != null) {
			adview5.resume();
		}
	}
	
	@Override
	public void onBackPressed() {
		if (_drawer.isDrawerOpen(GravityCompat.START)) {
			_drawer.closeDrawer(GravityCompat.START);
		} else {
			super.onBackPressed();
		}
	}
	public void _setcornerradius(final View _view, final double _radius, final double _shadow, final String _color) {
		android.graphics.drawable.GradientDrawable ab = new android.graphics.drawable.GradientDrawable();
		
		ab.setColor(Color.parseColor(_color));
		ab.setCornerRadius((float) _radius);
		_view.setElevation((float) _shadow);
		_view.setBackground(ab);
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
	
	
	public void _admin() {
		appdat = new HashMap<>();
		appdat.put("update", "1.0");
		appdat.put("applink", "not set");
		appdata.child("appdata").updateChildren(appdat);
	}
	
	
	public void _Prog_Dialogue_show(final boolean _ifShow, final String _title, final String _message) {
		if (_ifShow) {
			if (prog == null){
				prog = new ProgressDialog(this);
				prog.setMax(100);
				prog.setIndeterminate(true);
				prog.setCancelable(false);
				prog.setCanceledOnTouchOutside(false);
			}
			prog.setMessage(_message);
			prog.show();
		}
		else {
			if (prog != null){
				prog.dismiss();
			}
		}
	}
	private ProgressDialog prog;
	{
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
