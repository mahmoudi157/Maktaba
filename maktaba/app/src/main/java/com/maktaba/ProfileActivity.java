package com.maktaba;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.widget.EditText;
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
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class ProfileActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private HashMap<String, Object> data = new HashMap<>();
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linearcontinue;
	private EditText edittextname;
	private EditText edittextemail;
	private EditText edittextpass;
	private Button signin;
	private Button signup;
	private TextView textview2;
	private TextView textview9;
	private TextView textview11;
	private TextView textview4;
	private TextView textview5;
	private TextView textview7;
	private TextView textview6;
	private TextView textview10;
	
	private Intent ihf = new Intent();
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
	
	private DatabaseReference fdb = _firebase.getReference("users");
	private ChildEventListener _fdb_child_listener;
	private TimerTask timer;
	private SharedPreferences sp;
	private RequestNetwork re;
	private RequestNetwork.RequestListener _re_request_listener;
	private AlertDialog.Builder net;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.profile);
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
		linear1 = findViewById(R.id.linear1);
		vscroll1 = findViewById(R.id.vscroll1);
		linear2 = findViewById(R.id.linear2);
		linear4 = findViewById(R.id.linear4);
		linear5 = findViewById(R.id.linear5);
		linear6 = findViewById(R.id.linear6);
		linearcontinue = findViewById(R.id.linearcontinue);
		edittextname = findViewById(R.id.edittextname);
		edittextemail = findViewById(R.id.edittextemail);
		edittextpass = findViewById(R.id.edittextpass);
		signin = findViewById(R.id.signin);
		signup = findViewById(R.id.signup);
		textview2 = findViewById(R.id.textview2);
		textview9 = findViewById(R.id.textview9);
		textview11 = findViewById(R.id.textview11);
		textview4 = findViewById(R.id.textview4);
		textview5 = findViewById(R.id.textview5);
		textview7 = findViewById(R.id.textview7);
		textview6 = findViewById(R.id.textview6);
		textview10 = findViewById(R.id.textview10);
		fauth = FirebaseAuth.getInstance();
		sp = getSharedPreferences("data", Activity.MODE_PRIVATE);
		re = new RequestNetwork(this);
		net = new AlertDialog.Builder(this);
		
		signin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittextname.getText().toString().equals("") || (edittextemail.getText().toString().equals("") || edittextpass.getText().toString().equals(""))) {
					if (edittextname.getText().toString().equals("")) {
						Funct.showMessage(getApplicationContext(), "Please enter name. ");
					}
					if (edittextemail.getText().toString().equals("")) {
						Funct.showMessage(getApplicationContext(), "Please enter  email. ");
					}
					if (edittextpass.getText().toString().equals("")) {
						Funct.showMessage(getApplicationContext(), "Please enter password. ");
					}
				}
				else {
					if (!edittextemail.getText().toString().contains("gmail.com")) {
						if (!edittextemail.getText().toString().contains("gmail.com")) {
							Funct.showMessage(getApplicationContext(), "Please enter valid  email. ");
						}
					}
					else {
						fauth.createUserWithEmailAndPassword(edittextemail.getText().toString(), edittextpass.getText().toString()).addOnCompleteListener(ProfileActivity.this, _fauth_create_user_listener);
						_Prog_Dialogue_show(true, "Please wait..... ", "Please wait..... ");
					}
				}
			}
		});
		
		signup.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittextemail.getText().toString().equals("") || edittextpass.getText().toString().equals("")) {
					if (edittextemail.getText().toString().equals("")) {
						Funct.showMessage(getApplicationContext(), "Please enter your emai. ");
					}
					if (edittextpass.getText().toString().equals("")) {
						Funct.showMessage(getApplicationContext(), "please enter your password. ");
					}
				}
				else {
					if (!edittextemail.getText().toString().contains("gmail.com")) {
						Funct.showMessage(getApplicationContext(), "Please enter valid email. ");
					}
					else {
						fauth.signInWithEmailAndPassword(edittextemail.getText().toString(), edittextpass.getText().toString()).addOnCompleteListener(ProfileActivity.this, _fauth_sign_in_listener);
						_Prog_Dialogue_show(true, "Please wait..... ", "Please Wait..... ");
					}
				}
			}
		});
		
		textview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				setTitle("sign up");
				linear5.setVisibility(View.GONE);
				linear6.setVisibility(View.VISIBLE);
				signup.setVisibility(View.VISIBLE);
				signin.setVisibility(View.GONE);
				edittextname.setVisibility(View.GONE);
				textview9.setVisibility(View.VISIBLE);
				textview2.setVisibility(View.GONE);
				linearcontinue.setVisibility(View.GONE);
			}
		});
		
		textview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				setTitle("Create an Account");
				linear5.setVisibility(View.VISIBLE);
				linear6.setVisibility(View.GONE);
				signup.setVisibility(View.GONE);
				signin.setVisibility(View.VISIBLE);
				edittextname.setVisibility(View.VISIBLE);
				textview9.setVisibility(View.GONE);
				textview2.setVisibility(View.VISIBLE);
				linearcontinue.setVisibility(View.GONE);
			}
		});
		
		_fdb_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
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
		fdb.addChildEventListener(_fdb_child_listener);
		
		_re_request_listener = new RequestNetwork.RequestListener() {
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
				if (_success) {
					data = new HashMap<>();
					data.put("name", edittextname.getText().toString());
					data.put("email", edittextemail.getText().toString());
					data.put("password", edittextpass.getText().toString());
					fdb.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).updateChildren(data);
					timer = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									linear5.setVisibility(View.GONE);
									linear6.setVisibility(View.VISIBLE);
									signup.setVisibility(View.VISIBLE);
									signin.setVisibility(View.GONE);
									edittextname.setVisibility(View.GONE);
									linearcontinue.setVisibility(View.VISIBLE);
									textview2.setVisibility(View.GONE);
									setTitle("Sign up");
									_Prog_Dialogue_show(false, "please wait... ", "");
								}
							});
						}
					};
					_timer.schedule(timer, (int)(3000));
				}
				else {
					_Prog_Dialogue_show(false, "please wait... ", "");
					Funct.showMessage(getApplicationContext(), _errorMessage);
					linear5.setVisibility(View.VISIBLE);
					linear6.setVisibility(View.GONE);
					signup.setVisibility(View.GONE);
					signin.setVisibility(View.VISIBLE);
					edittextname.setVisibility(View.VISIBLE);
					linearcontinue.setVisibility(View.GONE);
					textview2.setVisibility(View.VISIBLE);
				}
			}
		};
		
		_fauth_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				if (_success) {
					sp.edit().putString("email", edittextemail.getText().toString()).commit();
					sp.edit().putString("password", edittextpass.getText().toString()).commit();
					data.put("password", edittextpass.getText().toString());
					fdb.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).updateChildren(data);
					_Prog_Dialogue_show(false, "Please wait... ", "");
					Funct.showMessage(getApplicationContext(), "Sign up Successful! ");
					ihf.setClass(getApplicationContext(), Profile2Activity.class);
					startActivity(ihf);
					finish();
				}
				else {
					_Prog_Dialogue_show(false, "Please wait.. ", "");
					Funct.showMessage(getApplicationContext(), _errorMessage);
				}
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
		setTitle("Create an Account");
		_setcornerradius(textview11, 95, 0, "#FFFFFF");
		re.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "spacex", _re_request_listener);
		signup.setVisibility(View.GONE);
		linear6.setVisibility(View.GONE);
		textview9.setVisibility(View.GONE);
		linearcontinue.setVisibility(View.GONE);
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
