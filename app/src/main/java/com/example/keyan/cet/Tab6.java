package com.example.keyan.cet;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import static android.content.Context.MODE_APPEND;
import static android.content.Context.MODE_PRIVATE;


/**
 * Created by Keyan on 26/05/2017.
 */

public class Tab6 extends Fragment {
    String feedbackstringR;
    String feedbackstringD;
    String feedbackstringE;
    String feedbackstringA;
    String feedbackstringH;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab6, container, false);

        TextView textBoxRain = (TextView) rootView.findViewById(R.id.textBoxRain);
        TextView textBoxDrop = (TextView) rootView.findViewById(R.id.textBoxDrop);
        TextView textBoxEarth = (TextView) rootView.findViewById(R.id.textBoxEarth);
        TextView textBoxAir = (TextView) rootView.findViewById(R.id.textBoxAir);
        TextView textBoxHum = (TextView) rootView.findViewById(R.id.textBoxHum);


        getfeedbackFromDatabaseR();
        textBoxRain.setText(feedbackstringR);

        getfeedbackFromDatabaseD();
        textBoxDrop.setText(feedbackstringD);

        getfeedbackFromDatabaseE();
        textBoxEarth.setText(feedbackstringE);


        getfeedbackFromDatabaseA();
        textBoxAir.setText(feedbackstringA);

        getfeedbackFromDatabaseH();
        textBoxHum.setText(feedbackstringH);


        return rootView;
    }

    public void getfeedbackFromDatabaseR(){

        String feedback_url = Config.DATA_URL+'R';

        StringRequest stringRequest = new StringRequest(feedback_url,
                new Response.Listener<String>() {
                    public void onResponse(String response) {
                        showJSONR(response);
                    }
                }
                , new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(getActivity().getApplicationContext(),"Error...",Toast.LENGTH_SHORT).show();
                error.printStackTrace();

            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());
        requestQueue.add(stringRequest);

    }

    private void showJSONR(String response){
        String feedbackR = "";
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray result = jsonObject.getJSONArray(Config.JSON_ARRAY);
            JSONObject climatEdgedata = result.getJSONObject(0);


            feedbackR = climatEdgedata.getString(Config.FEEDBACK);
            //Toast.makeText(MainActivity.this,feedback,Toast.LENGTH_SHORT).show();

        } catch (JSONException e) {
            e.printStackTrace();
        }
        //Toast.makeText(getActivity().getApplicationContext(),feedback,Toast.LENGTH_SHORT).show();
        feedbackstringR = feedbackR;

    }

    public void getfeedbackFromDatabaseD(){

        String feedback_url = Config.DATA_URL+'D';

        StringRequest stringRequest = new StringRequest(feedback_url,
                new Response.Listener<String>() {
                    public void onResponse(String response) {
                        showJSOND(response);
                    }
                }
                , new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(getActivity().getApplicationContext(),"Error...",Toast.LENGTH_SHORT).show();
                error.printStackTrace();

            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());
        requestQueue.add(stringRequest);

    }

    private void showJSOND(String response){
        String feedbackD = "";
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray result = jsonObject.getJSONArray(Config.JSON_ARRAY);
            JSONObject climatEdgedata = result.getJSONObject(0);


            feedbackD = climatEdgedata.getString(Config.FEEDBACK);
            //Toast.makeText(MainActivity.this,feedback,Toast.LENGTH_SHORT).show();

        } catch (JSONException e) {
            e.printStackTrace();
        }
        //Toast.makeText(getActivity().getApplicationContext(),feedback,Toast.LENGTH_SHORT).show();
        feedbackstringD = feedbackD;

    }

    public void getfeedbackFromDatabaseE(){

        String feedback_url = Config.DATA_URL+'E';

        StringRequest stringRequest = new StringRequest(feedback_url,
                new Response.Listener<String>() {
                    public void onResponse(String response) {
                        showJSONE(response);
                    }
                }
                , new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(getActivity().getApplicationContext(),"Error...",Toast.LENGTH_SHORT).show();
                error.printStackTrace();

            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());
        requestQueue.add(stringRequest);

    }

    private void showJSONE(String response){
        String feedbackE = "";
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray result = jsonObject.getJSONArray(Config.JSON_ARRAY);
            JSONObject climatEdgedata = result.getJSONObject(0);


            feedbackE = climatEdgedata.getString(Config.FEEDBACK);
            //Toast.makeText(MainActivity.this,feedback,Toast.LENGTH_SHORT).show();

        } catch (JSONException e) {
            e.printStackTrace();
        }
        //Toast.makeText(getActivity().getApplicationContext(),feedback,Toast.LENGTH_SHORT).show();
        feedbackstringE = feedbackE;

    }

    public void getfeedbackFromDatabaseA(){

        String feedback_url = Config.DATA_URL+'A';

        StringRequest stringRequest = new StringRequest(feedback_url,
                new Response.Listener<String>() {
                    public void onResponse(String response) {
                        showJSONA(response);
                    }
                }
                , new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(getActivity().getApplicationContext(),"Error...",Toast.LENGTH_SHORT).show();
                error.printStackTrace();

            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());
        requestQueue.add(stringRequest);

    }

    private void showJSONA(String response){
        String feedbackA = "";
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray result = jsonObject.getJSONArray(Config.JSON_ARRAY);
            JSONObject climatEdgedata = result.getJSONObject(0);


            feedbackA = climatEdgedata.getString(Config.FEEDBACK);
            //Toast.makeText(MainActivity.this,feedback,Toast.LENGTH_SHORT).show();

        } catch (JSONException e) {
            e.printStackTrace();
        }
        //Toast.makeText(getActivity().getApplicationContext(),feedback,Toast.LENGTH_SHORT).show();
        feedbackstringA = feedbackA;

    }

    public void getfeedbackFromDatabaseH(){

        String feedback_url = Config.DATA_URL+'H';

        StringRequest stringRequest = new StringRequest(feedback_url,
                new Response.Listener<String>() {
                    public void onResponse(String response) {
                        showJSONH(response);
                    }
                }
                , new Response.ErrorListener() {
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(getActivity().getApplicationContext(),"Error...",Toast.LENGTH_SHORT).show();
                error.printStackTrace();

            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(getActivity().getApplicationContext());
        requestQueue.add(stringRequest);

    }

    private void showJSONH(String response){
        String feedbackH = "";
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray result = jsonObject.getJSONArray(Config.JSON_ARRAY);
            JSONObject climatEdgedata = result.getJSONObject(0);


            feedbackH = climatEdgedata.getString(Config.FEEDBACK);
            //Toast.makeText(MainActivity.this,feedback,Toast.LENGTH_SHORT).show();

        } catch (JSONException e) {
            e.printStackTrace();
        }
        //Toast.makeText(getActivity().getApplicationContext(),feedback,Toast.LENGTH_SHORT).show();
        feedbackstringH = feedbackH;

    }

}

//hoping.