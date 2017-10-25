package vik.efthy.beeradv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private BeerExpert expert = new BeerExpert();


    public void onClickBeerFind(View view){
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner colors = (Spinner) findViewById(R.id.colors);
        String beerType = String.valueOf(colors.getSelectedItem());
        List<String> brandsList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList) {
            brandsFormatted.append(brand).append("\n");
        }
        brands.setText(brandsFormatted);
    }
}

