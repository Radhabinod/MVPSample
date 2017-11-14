package com.techindustan.mvpdemo.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.techindustan.mvpdemo.R;
import com.techindustan.mvpdemo.base.BaseActivity;
import com.techindustan.mvpdemo.ui.user.UserActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends BaseActivity implements LoginView {

    LoginPresenter presenter;
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.editText)
    EditText etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        presenter = new LoginPresenter(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.validateAndLogin(etEmail.getText().toString());
            }
        });

    }


    @Override
    public void goToNextScreen() {
        startActivity(new Intent(this, UserActivity.class));
    }

    @Override
    public void showMessage(String message) {
        showToast(message);
    }
}
