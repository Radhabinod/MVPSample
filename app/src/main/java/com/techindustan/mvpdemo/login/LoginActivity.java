package com.techindustan.mvpdemo.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.techindustan.mvpdemo.R;
import com.techindustan.mvpdemo.base.BaseActivity;

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

    }

    @Override
    public void showMessage(String message) {
        showToast(message);
    }
}
