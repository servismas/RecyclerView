package com.example.retrofitapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//import com.example.salo.prductview.ProductGridFragment;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements NavigationHost
//        implements NavigationHost
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, new LoginFragment())
                    .commit();
        }

//        final TextView textView = findViewById(R.id.txtEmail);
//
//        NetworkService.getInstance()
//                .getJSONApi()
//                .getPostWithID(1)
//                .enqueue(new Callback<Post>() {
//                    @Override
//                    public void onResponse(@NonNull Call<Post> call, @NonNull Response<Post> response) {
//                        Post post = response.body();
//
//                        textView.append(post.getId() + "\n");
//                        textView.append(post.getUserId() + "\n");
//                        textView.append(post.getTitle() + "\n");
//                        textView.append(post.getBody() + "\n");
//                    }
//
//                    @Override
//                    public void onFailure(@NonNull Call<Post> call, @NonNull Throwable t) {
//
//                        textView.append("Error occurred while getting request!");
//                        t.printStackTrace();
//                    }
//                });
    }

    @Override
    public void navigateTo(Fragment fragment, boolean addToBackstack) {
        FragmentTransaction transaction =
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, fragment);

        if (addToBackstack) {
            transaction.addToBackStack(null);
        }

        transaction.commit();
    }


//    public void onButtonClick(View view) {
//        Intent intent = new Intent(MainActivity.this, RegistrationActivity.class);
//        startActivity(intent);
//
//    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.example_menu, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch(item.getItemId()) {
//            case R.id.home:
//                this.navigateTo(new ProductGridFragment(), true);
//                return true;
//            case R.id.login:
//                this.navigateTo(new LoginFragment(), true);
//                return true;
//            case R.id.register:
//                this.navigateTo(new RegisterFragment(), true);
//                return true;
//            case R.id.item3:
//                Toast.makeText(this, "Item 3 selected", Toast.LENGTH_LONG).show();
//                return true;
//            case R.id.subitem1:
//                Toast.makeText(this, "Sub Item 1 selected", Toast.LENGTH_LONG).show();
//                return true;
//            case R.id.subitem2:
//                Toast.makeText(this, "Sub Item 2 selected", Toast.LENGTH_LONG);
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }

//    @Override
//    public void navigateTo(Fragment fragment, boolean addToBackstack) {
//        FragmentTransaction transaction =
//                getSupportFragmentManager()
//                        .beginTransaction()
//                        .replace(R.id.container, fragment);
//
//        if (addToBackstack) {
//            transaction.addToBackStack(null);
//        }
//
//        transaction.commit();
//    }
}

//Используем Retrofit 2 в Android-приложении
//https://devcolibri.com/getting-started-with-retrofit-in-android/

