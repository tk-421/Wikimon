//package com.wikimon;
//
//import android.os.AsyncTask;
//import android.util.Log;
//import android.view.View;
//import android.widget.EditText;
//import android.widget.ProgressBar;
//import android.widget.TextView;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import com.wikimon.MainActivity;
//
///**
// * Created by afogleman on 2/7/16.
// */
//public class WikimonDataGetter extends AsyncTask<Void, Void, String> {
//
//    private Exception exception;
//    private String API_URL = "http://pokeapi.co/api/v2/pokemon/";
//    ProgressBar progressBar;
//    private String response;
//    EditText pokemonName;
//    TextView responseView;
//
//    public String retrievePokemonName() {
//        String pokemon = pokemonName.getText().toString();
//        return pokemon;
//    }
//
//
//    protected void onPreExecute() {
//        //progressBar.setVisibility(View.VISIBLE);
//    }
//
//    @Override
//    protected String doInBackground(Void... urls){
//        try {
//            URL url = new URL(API_URL + retrievePokemonName());
//            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
//            try {
//                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//                StringBuilder stringBuilder = new StringBuilder();
//                String line;
//                while ((line = bufferedReader.readLine()) != null) {
//                    stringBuilder.append(line).append("\n");
//                }
//                bufferedReader.close();
//                return stringBuilder.toString();
//
//            }
//            finally {
//                urlConnection.disconnect();
//            }
//
//        }
//        catch (Exception e){
//            Log.e("ERROR", e.getMessage(), e);
//            return null;
//        }
//    }
//
//    protected void onPostExecute() {
//        if (response == null){
//            response = "THERE WAS AN ERROR CONNECTING";
//        }
//        progressBar.setVisibility(View.GONE);
//        Log.i("INFO", response);
//        responseView.setText(response);
//    }
//}
