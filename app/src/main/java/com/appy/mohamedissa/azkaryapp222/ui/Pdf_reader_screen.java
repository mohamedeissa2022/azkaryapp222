package com.appy.mohamedissa.azkaryapp222.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

import com.appy.mohamedissa.azkaryapp222.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnDrawListener;
import com.github.barteksc.pdfviewer.listener.OnErrorListener;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.listener.OnPageErrorListener;
import com.github.barteksc.pdfviewer.listener.OnPageScrollListener;
import com.github.barteksc.pdfviewer.listener.OnRenderListener;
import com.github.barteksc.pdfviewer.listener.OnTapListener;
import com.google.rpc.context.AttributeContext;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Pdf_reader_screen extends AppCompatActivity {
  public   PDFView pdfView;

    String pdfurl = "https://drive.google.com/file/d/1RBHZZSyQtHsE7vY4AEXFNOXwTszI-JXp/view?usp=sharing";

    public Pdf_reader_screen() throws IOException {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_reader_screen);
        pdfView = findViewById(R.id.pdfView);
        new RetrivePDFfromUrl().execute(pdfurl);






    }
    class RetrivePDFfromUrl extends AsyncTask<String, Void, InputStream> {
        @Override
        protected InputStream doInBackground(String... strings) {
            // we are using inputstream
            // for getting out PDF.
            InputStream inputStream = null;
            try {
                URL url = new URL(strings[0]);
                // below is the step where we are
                // creating our connection.
                HttpURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
                if (urlConnection.getResponseCode() == 200) {
                    // response is success.
                    // we are getting input stream from url
                    // and storing it in our variable.
                    inputStream = new BufferedInputStream(urlConnection.getInputStream());
                }

            } catch (IOException e) {
                // this is the method
                // to handle errors.
                e.printStackTrace();
                return null;
            }
            return inputStream;
        }

        @Override
        protected void onPostExecute(InputStream inputStream) {
            pdfView.fromStream(inputStream).load();
        }
    }

}
// create an async task class for loading pdf file from URL.


