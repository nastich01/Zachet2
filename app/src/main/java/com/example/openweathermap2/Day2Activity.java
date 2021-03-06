package com.example.openweathermap2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.openweathermap2.entity.CitiesProvider;
import com.example.openweathermap2.entity.City;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Day2Activity extends AppCompatActivity {

    private LocationManager locationManager;
    private TextView country;

    private TextView date1;
    private TextView date2;
    private TextView date3;
    private TextView date4;
    private TextView date5;
    private TextView date6;
    private TextView date7;
    private TextView date8;
    private TextView date9;
    private TextView date10;
    private TextView date11;
    private TextView date12;
    private TextView date13;
    private TextView date14;
    private TextView date15;
    private TextView date16;
    private TextView date17;
    private TextView date18;
    private TextView date19;
    private TextView date20;
    private TextView date21;
    private TextView date22;
    private TextView date23;
    private TextView date24;

    private TextView p1;
    private TextView p2;
    private TextView p3;
    private TextView p4;
    private TextView p5;
    private TextView p6;
    private TextView p7;
    private TextView p8;
    private TextView p9;
    private TextView p10;
    private TextView p11;
    private TextView p12;
    private TextView p13;
    private TextView p14;
    private TextView p15;
    private TextView p16;
    private TextView p17;
    private TextView p18;
    private TextView p19;
    private TextView p20;
    private TextView p21;
    private TextView p22;
    private TextView p23;
    private TextView p24;


    private double latitude,longitude;

    private int cityId;

    @SuppressLint("MissingPermission")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day2);
        Button button2 = findViewById(R.id.button2);
        Button button = findViewById(R.id.button);

        country = findViewById(R.id.loc);
        date1 = findViewById(R.id.date1);
       /* date2 = findViewById(R.id.date2);
        date3 = findViewById(R.id.date3);
        date4 = findViewById(R.id.date4);*/
        date5 = findViewById(R.id.date5);
        /*date6 = findViewById(R.id.date6);
        date7 = findViewById(R.id.date7);
        date8 = findViewById(R.id.date8);*/
        date9 = findViewById(R.id.date9);
        /*date10 = findViewById(R.id.date10);
        date11 = findViewById(R.id.date11);
        date12 = findViewById(R.id.date12);*/
        date13 = findViewById(R.id.date13);
       /* date14 = findViewById(R.id.date14);
        date15 = findViewById(R.id.date15);
        date16 = findViewById(R.id.date16);*/
        date17 = findViewById(R.id.date17);
        /*date18 = findViewById(R.id.date18);
        date19 = findViewById(R.id.date19);
        date20 = findViewById(R.id.date20);*/
        date21 = findViewById(R.id.date21);
        /*date22 = findViewById(R.id.date22);
        date23 = findViewById(R.id.date23);
        date24 = findViewById(R.id.date24);*/

        p1 = findViewById(R.id.p1);
        /*p2 = findViewById(R.id.p2);
        p3 = findViewById(R.id.p3);
        p4 = findViewById(R.id.p4);*/
        p5 = findViewById(R.id.p5);
      /*  p6 = findViewById(R.id.p6);
        p7 = findViewById(R.id.p7);
        p8 = findViewById(R.id.p8);*/
        p9 = findViewById(R.id.p9);
        /*p10 = findViewById(R.id.p10);
        p11 = findViewById(R.id.p11);
        p12 = findViewById(R.id.p12);*/
        p13 = findViewById(R.id.p13);
       /* p14 = findViewById(R.id.p14);
        p15 = findViewById(R.id.p15);
        p16 = findViewById(R.id.p16);*/
        p17 = findViewById(R.id.p17);
        /*p18 = findViewById(R.id.p18);
        p19 = findViewById(R.id.p19);
        p20 = findViewById(R.id.p20);*/
        p21 = findViewById(R.id.p21);
       /* p22 = findViewById(R.id.p22);
        p23 = findViewById(R.id.p23);
        p24 = findViewById(R.id.p24);*/

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Day2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Day2Activity.this, Day3Activity.class);
                startActivity(intent);
            }
        });


        loadLocation();

        findViewById(R.id.mainPane).setOnTouchListener(new OnSwipeTouchListener(getApplicationContext()) {
            public void onSwipeTop() {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), CitiesActivity.class);
                startActivity(intent);
            }

           /* public void onSwipeRight() {
                System.out.println("RRRRR");
                cityId--;
                if (cityId < 0) cityId = CitiesProvider.getCities().size() - 1;
                City city = CitiesProvider.getCities().get(cityId);

                String url = "https://api.weatherapi.com/v1/current.json?key=dfc23ad6e1ec4a8bb8775215222505&q=" + city.getLatitude() + "," + city.getLongitude();

                //String url = "https://api.openweathermap.org/data/2.5/weather?lat=" + city.getLatitude() + "&lon=" + city.getLongitude() + "&appid=bb6eed77276b5bbdefc4747a596f8bd3&lang=ru&units=metric";
                System.out.println(url);
                new GetUrlData().execute(url);
            }*/

            /*public void onSwipeLeft() {
                System.out.println("LLLLLLL");
                cityId++;
                if (cityId > (CitiesProvider.getCities().size() - 1)) cityId = 0;
                City city = CitiesProvider.getCities().get(cityId);

                String url = "https://api.weatherapi.com/v1/current.json?key=dfc23ad6e1ec4a8bb8775215222505&q=" + city.getLatitude() + "," + city.getLongitude();

                //String url = "https://api.openweathermap.org/data/2.5/weather?lat=" + city.getLatitude() + "&lon=" + city.getLongitude() + "&appid=bb6eed77276b5bbdefc4747a596f8bd3&lang=ru&units=metric";
                System.out.println(url);
                new GetUrlData().execute(url);
            }*/

            public void onSwipeBottom() {
                //String url = "https://api.weatherapi.com/v1/current.json?key=dfc23ad6e1ec4a8bb8775215222505&q=" + locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER).getLatitude() + "," + locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER).getLongitude();
                String url = "https://pro.openweathermap.org/data/2.5/forecast/hourly?lat=" + locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER).getLatitude() + "&lon=" + locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER).getLongitude() + "&appid=ee318df497020f077901717e7b51cced";

                //String url = "https://api.openweathermap.org/data/2.5/weather?lat=" + locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER).getLatitude() + "&lon=" + locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER).getLongitude() + "&appid=bb6eed77276b5bbdefc4747a596f8bd3&lang=ru&units=metric";
                System.out.println(url);
                new GetUrlData().execute(url);
            }
        });
    }

    @SuppressLint("MissingPermission")
    private void loadLocation() {
        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000 * 10, 10, location -> {
        });

        latitude = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER).getLatitude();
        longitude = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER).getLongitude();
        System.out.println(latitude+"  "+longitude);

        //String url = "https://api.weatherapi.com/v1/current.json?key=dfc23ad6e1ec4a8bb8775215222505&q="+ latitude + "," + longitude;

        String url = "https://pro.openweathermap.org/data/2.5/forecast/hourly?lat=" + locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER).getLatitude() + "&lon=" + locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER).getLongitude() + "&appid=ee318df497020f077901717e7b51cced";
        CitiesProvider.addCity(new City("On location", longitude, latitude));
        cityId = 3;
        new GetUrlData().execute(url);
    }


    private class GetUrlData extends AsyncTask<String, String, String> {
        protected void onPreExecute() {
            super.onPreExecute();

        }

        @Override
        protected String doInBackground(String... strings) {

            HttpURLConnection connection = null;
            BufferedReader reader = null;

            try {
                URL url = new URL(strings[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                InputStream stream = connection.getInputStream();
                reader = new BufferedReader(new InputStreamReader(stream));

                StringBuffer buffer = new StringBuffer();
                String line;

                while ((line = reader.readLine()) != null) {
                    buffer.append(line).append("\n");
                }
                System.out.println(buffer);
                return buffer.toString();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (connection != null)
                    connection.disconnect();
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            return null;
        }
        @SuppressLint("SetTextI18n")
        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            try {
                JSONObject obj = new JSONObject(result);
                System.out.println(result);
                /*//String res = obj.toString();

                String iconName= obj.getJSONObject("current").getJSONObject("condition").getString("icon");
                System.out.println("iconName"+iconName);
                //System.out.println(iconName.length());
                //System.out.println((iconName.length()-7));
                //System.out.println(iconName.length()-2);
                iconName = "d"+iconName.substring(iconName.length()-7,iconName.length()-4);
                System.out.println("iconName"+iconName);
                Context context= imageView.getContext();
                imageView.setImageResource(getApplicationContext().getResources().getIdentifier(iconName,"drawable",context.getPackageName()));
                temperature.setText("??????????????????????:" + obj.getJSONObject("current").getDouble("temp_c"));
                String name=  obj.getJSONObject("location").getString("region");
                if (!name.equals(" ")) country.setText(obj.getJSONObject("location").getString("name"));
                else country.setText(CitiesProvider.getCities().get(cityId).getName());
                country2.setText(obj.getJSONObject("location").getString("region"));
                humidity.setText("??????????????????:" + obj.getJSONObject("current").getDouble("humidity")) ;
                pressure.setText("??????. ????????????????:" + obj.getJSONObject("current").getDouble("pressure_mb")) ;*/

                country.setText(obj.getJSONObject("city").getString("name"));
                p1.setText("temp: "+obj.getJSONArray("list").getJSONObject(24).getJSONObject("main").getString("temp")+" K");
                date1.setText(obj.getJSONArray("list").getJSONObject(24).getString("dt_txt").substring(5,16));

                /*p1.setText("temp: "+obj.getJSONArray("list").getJSONObject(25).getJSONObject("main").getString("temp"));
                date1.setText(obj.getJSONArray("list").getJSONObject(25).getString("dt_txt"));

                p2.setText("temp: "+obj.getJSONArray("list").getJSONObject(26).getJSONObject("main").getString("temp"));
                date2.setText(obj.getJSONArray("list").getJSONObject(26).getString("dt_txt"));

                p3.setText("temp: "+obj.getJSONArray("list").getJSONObject(27).getJSONObject("main").getString("temp"));
                date3.setText(obj.getJSONArray("list").getJSONObject(27).getString("dt_txt"));

                p4.setText("temp: "+obj.getJSONArray("list").getJSONObject(28).getJSONObject("main").getString("temp"));
                date4.setText(obj.getJSONArray("list").getJSONObject(28).getString("dt_txt"));

                */p5.setText("temp: "+obj.getJSONArray("list").getJSONObject(29).getJSONObject("main").getString("temp")+" K");
                date5.setText(obj.getJSONArray("list").getJSONObject(29).getString("dt_txt").substring(5,16));

                /*p6.setText("temp: "+obj.getJSONArray("list").getJSONObject(30).getJSONObject("main").getString("temp"));
                date6.setText(obj.getJSONArray("list").getJSONObject(30).getString("dt_txt"));

                p7.setText("temp: "+obj.getJSONArray("list").getJSONObject(31).getJSONObject("main").getString("temp"));
                date7.setText(obj.getJSONArray("list").getJSONObject(31).getString("dt_txt"));

                p8.setText("temp: "+obj.getJSONArray("list").getJSONObject(32).getJSONObject("main").getString("temp"));
                date8.setText(obj.getJSONArray("list").getJSONObject(32).getString("dt_txt"));
*/
                p9.setText("temp: "+obj.getJSONArray("list").getJSONObject(33).getJSONObject("main").getString("temp")+" K");
                date9.setText(obj.getJSONArray("list").getJSONObject(33).getString("dt_txt").substring(5,16));

                /*p10.setText("temp: "+obj.getJSONArray("list").getJSONObject(34).getJSONObject("main").getString("temp"));
                date10.setText(obj.getJSONArray("list").getJSONObject(34).getString("dt_txt"));

                p11.setText("temp: "+obj.getJSONArray("list").getJSONObject(35).getJSONObject("main").getString("temp"));
                date11.setText(obj.getJSONArray("list").getJSONObject(35).getString("dt_txt"));

                p12.setText("temp: "+obj.getJSONArray("list").getJSONObject(36).getJSONObject("main").getString("temp"));
                date12.setText(obj.getJSONArray("list").getJSONObject(36).getString("dt_txt"));

                */p13.setText("temp: "+obj.getJSONArray("list").getJSONObject(37).getJSONObject("main").getString("temp")+" K");
                date13.setText(obj.getJSONArray("list").getJSONObject(37).getString("dt_txt").substring(5,16));

                /*p14.setText("temp: "+obj.getJSONArray("list").getJSONObject(38).getJSONObject("main").getString("temp"));
                date14.setText(obj.getJSONArray("list").getJSONObject(38).getString("dt_txt"));

                p15.setText("temp: "+obj.getJSONArray("list").getJSONObject(39).getJSONObject("main").getString("temp"));
                date15.setText(obj.getJSONArray("list").getJSONObject(39).getString("dt_txt"));

                p16.setText("temp: "+obj.getJSONArray("list").getJSONObject(40).getJSONObject("main").getString("temp"));
                date16.setText(obj.getJSONArray("list").getJSONObject(40).getString("dt_txt"));

                */p17.setText("temp: "+obj.getJSONArray("list").getJSONObject(41).getJSONObject("main").getString("temp")+" K");
                date17.setText(obj.getJSONArray("list").getJSONObject(41).getString("dt_txt").substring(5,16));

               /* p18.setText("temp: "+obj.getJSONArray("list").getJSONObject(42).getJSONObject("main").getString("temp"));
                date18.setText(obj.getJSONArray("list").getJSONObject(42).getString("dt_txt"));

                p19.setText("temp: "+obj.getJSONArray("list").getJSONObject(43).getJSONObject("main").getString("temp"));
                date19.setText(obj.getJSONArray("list").getJSONObject(43).getString("dt_txt"));

                p20.setText("temp: "+obj.getJSONArray("list").getJSONObject(44).getJSONObject("main").getString("temp"));
                date20.setText(obj.getJSONArray("list").getJSONObject(44).getString("dt_txt"));

                */p21.setText("temp: "+obj.getJSONArray("list").getJSONObject(45).getJSONObject("main").getString("temp")+" K");
                date21.setText(obj.getJSONArray("list").getJSONObject(45).getString("dt_txt").substring(5,16));

                /*p22.setText("temp: "+obj.getJSONArray("list").getJSONObject(46).getJSONObject("main").getString("temp"));
                date22.setText(obj.getJSONArray("list").getJSONObject(46).getString("dt_txt"));

                p23.setText("temp: "+obj.getJSONArray("list").getJSONObject(47).getJSONObject("main").getString("temp"));
                date23.setText(obj.getJSONArray("list").getJSONObject(47).getString("dt_txt"));

                p24.setText("temp: "+obj.getJSONArray("list").getJSONObject(48).getJSONObject("main").getString("temp"));
                date24.setText(obj.getJSONArray("list").getJSONObject(48).getString("dt_txt"));
*/


                /*JSONObject obj = new JSONObject(result);
                System.out.println(result);
                String iconName= "a" + obj.getJSONArray("weather").getJSONObject(0).getString("icon");
                Context context= imageView.getContext();
                imageView.setImageResource(getApplicationContext().getResources().getIdentifier(iconName,"drawable",context.getPackageName()));
                temperature.setText("??????????????????????:" + obj.getJSONObject("main").getDouble("temp"));
                String name=  obj.getString("name");
                if (!name.equals(" ")) country.setText(obj.getString("name"));
                else country.setText(CitiesProvider.getCities().get(cityId).getName());
                humidity.setText("??????????????????:" + obj.getJSONObject("main").getDouble("humidity")) ;
                pressure.setText("??????. ????????????????:" + obj.getJSONObject("main").getDouble("pressure")) ;*/
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
    }
}