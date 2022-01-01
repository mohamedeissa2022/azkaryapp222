package com.appy.mohamedissa.azkaryapp222.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.appy.mohamedissa.azkaryapp222.model.DataGet;
import com.appy.mohamedissa.azkaryapp222.MyListAdapter;
import com.appy.mohamedissa.azkaryapp222.R;
import com.appy.mohamedissa.azkaryapp222.model.setData.add_Azkar_Model;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class UI_Evening_prayers extends AppCompatActivity {
    ListView list;
    ArrayList<String> azkars = new ArrayList<>();
    ArrayList<String> azkar_rolse = new ArrayList<>();
    ArrayList<String> azkar_cunter = new ArrayList<>();
    ArrayList<Object> Azkary1 = new ArrayList<>();
    ArrayList<Object> azkar_rolse1 = new ArrayList<>();
    ArrayList<Object> azkar_cunter1 = new ArrayList<>();
    TextView tv_1_des_update, tv_2_app_ver;

    boolean rateisActive = false;
    boolean update = false;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    Button btn_update_app;
    boolean isActive = false;
    AlertDialog.Builder builder;
    Button btn_rate_app;
    DataGet<String> dataGet = new DataGet<>();
    ArrayList<String> Data = new ArrayList<>();
    String des_update_app, ver_app_update;
    int textSize222 = 22;
    ImageView img_textSize_zoom_in;
    ImageView img_textSize_zoom_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_evening_prayers);
        tv_1_des_update = findViewById(R.id.new_update_des);
        tv_2_app_ver = findViewById(R.id.tv_ver);


        builder = new AlertDialog.Builder(this);
        btn_rate_app = findViewById(R.id.rate_app_btn);
        btn_update_app = findViewById(R.id.up_date_app);

        img_textSize_zoom_in = findViewById(R.id.zoom_in);

        img_textSize_zoom_out = findViewById(R.id.zoom_out);


        img_textSize_zoom_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textSize222 = textSize222 + 8;
                list.invalidateViews();

                Alert_Delog_Rate_App(isRateisActive());


            }
        });

        img_textSize_zoom_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textSize222 = -textSize222;
                list.invalidateViews();
            }
        });
        boolean isNetwork = isNetworkAvailable();
//        if (isNetwork) {
//           // update_app(isUpdate());
//
//
//            //Toast.makeText(getApplicationContext(), "متصل", Toast.LENGTH_SHORT).show();
//            AlertDialog.Builder builder = new AlertDialog.Builder(this);
//            // Get the layout inflater
//            LayoutInflater inflater = (this).getLayoutInflater();
//            // Inflate and set the layout for the dialog
//            // Pass null as the parent view because its going in the
//            // dialog layout
//            builder.setTitle("الرجاء تقييم التطبيق فضلا وليس امرا");
//            builder.setCancelable(false);
//            builder.setIcon(R.drawable.btn4_ic);
//                    // Add action buttons
//                   builder.setPositiveButton(R.string.alert_yes, new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int id) {
//                            list.invalidateViews();
//                            try {
//                                startActivity(new Intent(Intent.ACTION_VIEW,
//                                        Uri.parse("market://details?id=" + getPackageName())));
//                            } catch (android.content.ActivityNotFoundException e) {
//                                startActivity(new Intent(Intent.ACTION_VIEW,
//                                        Uri.parse("http://play.google.com/store/apps/details?id=" +getPackageName())));
//                            }
//
//                        }
//
//        }).setNegativeButton(R.string.alert_no, new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialogInterface, int i) {
//                    Toast.makeText(getApplicationContext(), "لماذا لا تريد تقييم التطبيق?", Toast.LENGTH_SHORT).show();
//                }
//            });
//
//        builder.create();
//        builder.show();
//
//
//        } else {
//            Toast.makeText(getApplicationContext(), "غير متصل ", Toast.LENGTH_SHORT).show();
//        }
        azkars.add("اللّهُ لاَ إِلَـهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ لَّهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الأَرْضِ مَن ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ وَلاَ يُحِيطُونَ بِشَيْءٍ مِّنْ عِلْمِهِ إِلاَّ بِمَا شَاء وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالأَرْضَ وَلاَ يَؤُودُهُ حِفْظُهُمَا وَهُوَ الْعَلِيُّ الْعَظِيمُ. [آية الكرسى - البقرة 255].");
        azkar_rolse.add("من قالها حين يصبح أجير من الجن حتى يمسى ومن قالها حين يمسى أجير من الجن حتى يصبح. ");
        azkar_cunter.add("3");

        //1

        //2
        azkars.add("آمَنَ الرَّسُولُ بِمَا أُنْزِلَ إِلَيْهِ مِنْ رَبِّهِ وَالْمُؤْمِنُونَ ۚ كُلٌّ آمَنَ بِاللَّهِ وَمَلَائِكَتِهِ وَكُتُبِهِ وَرُسُلِهِ لَا نُفَرِّقُ بَيْنَ أَحَدٍ مِنْ رُسُلِهِ ۚ وَقَالُوا سَمِعْنَا وَأَطَعْنَا ۖ غُفْرَانَكَ رَبَّنَا وَإِلَيْكَ الْمَصِيرُ. لَا يُكَلِّفُ اللَّهُ نَفْسًا إِلَّا وُسْعَهَا لَهَا مَا كَسَبَتْ وَعَلَيْهَا مَا اكْتَسَبَتْ رَبَّنَا لَا تُؤَاخِذْنَا إِنْ نَّسِينَآ أَوْ أَخْطَأْنَا رَبَّنَا وَلَا تَحْمِلْ عَلَيْنَا إِصْرًا كَمَا حَمَلْتَهُ عَلَى الَّذِينَ مِنْ قَبْلِنَا رَبَّنَا وَلَا تُحَمِّلْنَا مَا لَا طَاقَةَ لَنَا بِهِ وَاعْفُ عَنَّا وَاغْفِرْ لَنَا وَارْحَمْنَا أَنْتَ مَوْلَانَا فَانْصُرْنَا عَلَى الْقَوْمِ الْكَافِرِينَ. [البقرة 285 - 286].");
        azkar_rolse.add("من قرأ آيتين من آخر سورة البقرة في ليلة كفتاه.");
        //2
        azkar_cunter.add("3");

        //3
        azkars.add("بِسْمِ اللهِ الرَّحْمنِ الرَّحِيم\n" +
                "قُلْ هُوَ ٱللَّهُ أَحَدٌ، ٱللَّهُ ٱلصَّمَدُ، لَمْ يَلِدْ وَلَمْ يُولَدْ، وَلَمْ يَكُن لَّهُۥ كُفُوًا أَحَدٌۢ. ");
        azkar_rolse.add("من قالها حين يصبح وحين يمسى كفته من كل شىء (الإخلاص والمعوذتين). ");
        //3
        azkar_cunter.add("3");

        //3
        azkars.add("اللّهـمَّ أَنْتَ رَبِّـي لا إلهَ إلاّ أَنْتَ ، خَلَقْتَنـي وَأَنا عَبْـدُك ، وَأَنا عَلـى عَهْـدِكَ وَوَعْـدِكَ ما اسْتَـطَعْـت ، أَعـوذُبِكَ مِنْ شَـرِّ ما صَنَـعْت ، أَبـوءُ لَـكَ بِنِعْـمَتِـكَ عَلَـيَّ وَأَبـوءُ بِذَنْـبي فَاغْفـِرْ لي فَإِنَّـهُ لا يَغْـفِرُ الذُّنـوبَ إِلاّ أَنْتَ . ");
        azkar_rolse.add("من قالها موقنا بها حين يمسى ومات من ليلته دخل الجنة وكذلك حين يصبح.");
        //3
        azkar_cunter.add("3");

        //4
        azkars.add("رَضيـتُ بِاللهِ رَبَّـاً وَبِالإسْلامِ ديـناً وَبِمُحَـمَّدٍ صلى الله عليه وسلم نَبِيّـاً. ");
        azkar_rolse.add("من قالها حين يصبح وحين يمسى كان حقا على الله أن يرضيه يوم القيامة.");
        //4
        azkar_cunter.add("3");

        //5
        azkars.add("اللّهُـمَّ إِنِّـي أَمسيتُ أُشْـهِدُك ، وَأُشْـهِدُ حَمَلَـةَ عَـرْشِـك ، وَمَلَائِكَتَكَ ، وَجَمـيعَ خَلْـقِك ، أَنَّـكَ أَنْـتَ اللهُ لا إلهَ إلاّ أَنْـتَ وَحْـدَكَ لا شَريكَ لَـك ، وَأَنَّ ُ مُحَمّـداً عَبْـدُكَ وَرَسـولُـك. ");
        azkar_rolse.add("من قالها أعتقه الله من النار.");
        //5
        azkar_cunter.add("3");


        //6
        azkars.add("اللّهُـمَّ ما أَمسى بي مِـنْ نِعْـمَةٍ أَو بِأَحَـدٍ مِـنْ خَلْـقِك ، فَمِـنْكَ وَحْـدَكَ لا شريكَ لَـك ، فَلَـكَ الْحَمْـدُ وَلَـكَ الشُّكْـر. ");
        azkar_rolse.add("من قالها حين يمسى أدى شكر يومه.");
        //6
        azkar_cunter.add("3");

        //7
        azkars.add("حَسْبِـيَ اللّهُ لا إلهَ إلاّ هُوَ عَلَـيهِ تَوَكَّـلتُ وَهُوَ رَبُّ العَرْشِ العَظـيم. ");
        azkar_rolse.add("من قالها كفاه الله ما أهمه من أمر الدنيا والأخرة.");
        //7
        azkar_cunter.add("3");

        //8
        azkars.add("بِسـمِ اللهِ الذي لا يَضُـرُّ مَعَ اسمِـهِ شَيءٌ في الأرْضِ وَلا في السّمـاءِ وَهـوَ السّمـيعُ العَلـيم. ");
        azkar_rolse.add("لم يضره من الله شيء.");
        //8
        azkar_cunter.add("3");

        //9
        azkars.add("اللَّهُمَّ صَلِّ وَسَلِّمْ وَبَارِكْ على نَبِيِّنَا مُحمَّد. ");
        azkar_rolse.add("من صلى على حين يصبح وحين يمسى ادركته شفاعتى يوم القيامة.");
        //9
        azkar_cunter.add("5");

        //10
        azkars.add("لَا إلَه إلّا اللهُ وَحْدَهُ لَا شَرِيكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءِ قَدِيرِ. ");
        azkar_rolse.add("كانت له عدل عشر رقاب، وكتبت له مئة حسنة، ومحيت عنه مئة سيئة، وكانت له حرزا من الشيطان. ");
        //10
        azkar_cunter.add("12");

        //11
        azkars.add("سُبْحـانَ اللهِ وَبِحَمْـدِهِ. ");
        azkar_rolse.add("حُطَّتْ خَطَايَاهُ وَإِنْ كَانَتْ مِثْلَ زَبَدِ الْبَحْرِ. لَمْ يَأْتِ أَحَدٌ يَوْمَ الْقِيَامَةِ بِأَفْضَلَ مِمَّا جَاءَ بِهِ إِلَّا أَحَدٌ قَالَ مِثْلَ مَا قَالَ أَوْ زَادَ عَلَيْهِ.");
        azkar_cunter.add("3");
        dataGet.setDataName(azkars);
        add_Azkar_Form_model().setAzkar(azkars);
        add_Azkar_Form_model().setAzkar_rolse(azkar_rolse);
        add_Azkar_Form_model().setAzkar_number(azkar_cunter);

        MyListAdapter myListAdapter = new MyListAdapter(this, add_Azkar_Form_model().getAzkar(), add_Azkar_Form_model().getAzkar_rolse(), add_Azkar_Form_model().getAzkar_number(), add_Azkar_Form_model().getText_Size());

        list = (ListView) findViewById(R.id.moon_list);
        list.setAdapter(myListAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // String data = azkar_rolse.get(i);
                //toastMassage(data);

            }
        });
        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                String data = azkar_cunter.get(i);
                int num = Integer.parseInt(data) - 1;
                azkar_cunter.remove(i);
                azkar_cunter.add(i, String.valueOf(num));
                list.invalidateViews();
                return false;
            }
        });


    }


    public add_Azkar_Model add_Azkar_Form_model(){
        return new add_Azkar_Model(azkars,azkar_rolse,azkar_cunter,textSize222);
    }
    void toastMassage(String data) {
        try {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.toast_msg, (ViewGroup) findViewById(R.id.toast_msg_layout));
            TextView tv = layout.findViewById(R.id.tv_msg);
            tv.setText(data);
            Toast toast = new Toast(getApplicationContext());
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 100, Gravity.CENTER_VERTICAL);
            toast.show();
        } catch (Exception ex) {
            ex.printStackTrace();
            Log.i("ToastError", ex.getLocalizedMessage());
        }
    }

    public void getDataFormFireBaseClued(String collection, String document) {
        DocumentReference documentReference = db.collection(collection).document(document);
        documentReference.get().addOnSuccessListener(documentSnapshot -> {
            if (documentSnapshot.exists()) {
                isActive = (Boolean) documentSnapshot.get("isActive");
                Log.d("isActiveData:-", "" + isActive);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
            }
        });

    }

    public void Alert_Delog_Rate_App(Boolean isActiveData) {

        if (isActiveData) {
            AlertDialog.Builder builder
                    = new AlertDialog.Builder(this);
            // set the custom layout
            final View customLayout = getLayoutInflater().inflate(R.layout.rate_app, null);
            builder.setView(customLayout);
            AlertDialog dialog = builder.create();
            dialog.show();
        }

    }


    public boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager)
                this.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null;
    }

    public void rateMe(View view) {
        if (view.getId() == R.id.rate_app_btn) {
            try {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=" + this.getPackageName())));
            } catch (android.content.ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://play.google.com/store/apps/details?id=" + this.getPackageName())));
            }
        }

    }
/*
    public void update_app(boolean data_update) {
        if (data_update) {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            final View customLayout=getLayoutInflater().inflate(R.layout.activity_update_app, null);
            builder.setView(customLayout);
            AlertDialog dialog=builder.create();dialog.show();

        }

    }
 */

    public boolean isRateisActive() {

        DocumentReference documentReference = db.collection("Azkar").document("Rate_app");
        documentReference.get().addOnSuccessListener(documentSnapshot -> {
            if (documentSnapshot.exists()) {
                rateisActive = (Boolean) documentSnapshot.get("rate_is_active");
                Log.d("rateisActive:-", "" + rateisActive);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getApplicationContext(), "خطاء1", Toast.LENGTH_SHORT).show();
            }
        });

        return rateisActive;
    }

    public boolean isUpdate() {
        DocumentReference documentReference = db.collection("Azkar").document("updateApp");
        documentReference.get().addOnSuccessListener(documentSnapshot -> {
            if (documentSnapshot.exists()) {
                update = (Boolean) documentSnapshot.get("update");
                des_update_app = (String) documentSnapshot.get("new_in_up_date");
                ver_app_update = (String) documentSnapshot.get("updateVer");
                Log.d("update:-", "" + update);
                Log.d("des_update_app:-", "" + des_update_app);
                Log.d("ver_app_update:-", "" + ver_app_update);

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getApplicationContext(), "خطاء1", Toast.LENGTH_SHORT).show();
            }
        });
        return update;
    }


}