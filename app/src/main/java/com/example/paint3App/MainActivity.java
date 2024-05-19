package com.example.paint3App;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import view.Paint3View;

public class MainActivity extends AppCompatActivity {


    private Paint3View paint3oView;
    private AlertDialog.Builder currentAlertDialog;
    private ImageView widthImageView;
    private AlertDialog dialogLineWidth;
    private AlertDialog colorDialog;
    private AlertDialog colorDialog1;


    private SeekBar alphaSeekBar;
    private SeekBar redSeekBar;
    private SeekBar greenSeekBar;
    private SeekBar blueSeekBar;
    private View colorView;


    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    private Button button19;
    private Button button20;
    private Button button21;
    private Button button22;
    private Button button23;
    private Button button24;
    private Button button25;
    private Button button26;
    private Button button27;
    private Button button28;
    private Button button29;
    private Button button30;
    private Button button31;
    private Button button32;
    private Button button33;
    private Button button34;
    private Button button35;
    private Button button36;
    private Button button37;
    private Button button38;
    private Button button39;
    private Button button40;
    private Button button41;
    private Button button42;
    private Button button43;
    private Button button44;
    private Button button45;
    private Button button46;
    private Button button47;
    private Button button48;
    private Button buttonGenerateColor;


    private LinearLayout mRoot;
    private Paint3View mPaint3View;
    private View mSideView;
    private Button mBtnRandomColor, mBtnUndo, mBtnRedo, mBtnClearAll;
    private SeekBar mThicknessBar, mAlphaBar;
    private TextView mTxtRedoCount, mTxtUndoCount;
    private ProgressBar mProgressBar;

    private ImageView mImgScreen;
    private Menu mMenu;





 







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.clearId:
                paint3oView.clear();
                break;

            case R.id.eraseId:
                paint3oView.setDrawingColor(Color.argb(255,255,255,255));
                break;
           case R.id.saveId:
                paint3oView.saveToInternalStorage();
                break;

            /*case R.id.loadImages:

                break;

             case R.id.zoomInId:
                break;

            case R.id.zoomOutId
                break;

             */

            case R.id.colorId:
                showColorDialog1();
                break;

            case R.id.lineWidth:
                showLineWidthDialog();
                break;



        }



        return super.onOptionsItemSelected(item);
    }

    void showColorDialog(){
        currentAlertDialog= new AlertDialog.Builder(this);
        View view =getLayoutInflater().inflate(R.layout.color_dialog,null);
        alphaSeekBar=view.findViewById(R.id.alphaSeekBar);
        redSeekBar=view.findViewById(R.id.redSeekBar);
        greenSeekBar=view.findViewById(R.id.greenSeekBar);
        blueSeekBar=view.findViewById(R.id.blueaSeekBar);
        colorView=view.findViewById(R.id.colorView);


        alphaSeekBar.setOnSeekBarChangeListener(colorSeekBarChanged);
        redSeekBar.setOnSeekBarChangeListener(colorSeekBarChanged);
        greenSeekBar.setOnSeekBarChangeListener(colorSeekBarChanged);
        blueSeekBar.setOnSeekBarChangeListener(colorSeekBarChanged);

        int color=paint3oView.getDrawingColor();
        alphaSeekBar.setProgress(Color.alpha(color));
        redSeekBar.setProgress(Color.red(color));
        greenSeekBar.setProgress(Color.green(color));
        blueSeekBar.setProgress(Color.blue(color));

        Button setColorButton=view.findViewById(R.id.setColorButton);
        setColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(
                        alphaSeekBar.getProgress(),
                        redSeekBar.getProgress(),
                        greenSeekBar.getProgress(),
                        blueSeekBar.getProgress()
                ));
                colorDialog.dismiss();
                colorDialog1.dismiss();
            }
        });
        currentAlertDialog.setView(view);
        currentAlertDialog.setTitle("Generate Color");

        currentAlertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"You Clicked Cancel",Toast.LENGTH_SHORT).show();
            }
        });
        colorDialog= currentAlertDialog.create();
        colorDialog.show();

    }




    void showColorDialog1(){
        currentAlertDialog=new AlertDialog.Builder(this);
        View view =getLayoutInflater().inflate(R.layout.color_dialog1,null);

        button1=view.findViewById(R.id.button1);
        button2=view.findViewById(R.id.button2);
        button3=view.findViewById(R.id.button3);
        button4=view.findViewById(R.id.button4);
        button5=view.findViewById(R.id.button5);
        button6=view.findViewById(R.id.button6);
        button7=view.findViewById(R.id.button7);
        button8=view.findViewById(R.id.button8);
        button9=view.findViewById(R.id.button9);
        button10=view.findViewById(R.id.button10);
        button11=view.findViewById(R.id.button11);
        button12=view.findViewById(R.id.button12);
        button13=view.findViewById(R.id.button13);
        button14=view.findViewById(R.id.button14);
        button15=view.findViewById(R.id.button15);
        button16=view.findViewById(R.id.button16);
        button17=view.findViewById(R.id.button17);
        button18=view.findViewById(R.id.button18);
        button19=view.findViewById(R.id.button19);
        button20=view.findViewById(R.id.button20);
        button21=view.findViewById(R.id.button21);
        button22=view.findViewById(R.id.button22);
        button23=view.findViewById(R.id.button23);
        button24=view.findViewById(R.id.button24);
        button25=view.findViewById(R.id.button25);
        button26=view.findViewById(R.id.button26);
        button27=view.findViewById(R.id.button27);
        button28=view.findViewById(R.id.button28);
        button29=view.findViewById(R.id.button29);
        button30=view.findViewById(R.id.button30);
        button31=view.findViewById(R.id.button31);
        button32=view.findViewById(R.id.button32);
        button33=view.findViewById(R.id.button33);
        button34=view.findViewById(R.id.button34);
        button35=view.findViewById(R.id.button35);
        button36=view.findViewById(R.id.button36);
        button37=view.findViewById(R.id.button37);
        button38=view.findViewById(R.id.button38);
        button39=view.findViewById(R.id.button39);
        button40=view.findViewById(R.id.button40);
        button41=view.findViewById(R.id.button41);
        button42=view.findViewById(R.id.button42);
        button43=view.findViewById(R.id.button43);
        button44=view.findViewById(R.id.button44);
        button45=view.findViewById(R.id.button45);
        button46=view.findViewById(R.id.button46);
        button47=view.findViewById(R.id.button47);
        button48=view.findViewById(R.id.button48);
        buttonGenerateColor=view.findViewById(R.id.generateColorId);


        buttonGenerateColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showColorDialog();

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,0,0,0 ));
                colorDialog1.dismiss();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,33,33,33));
                colorDialog1.dismiss();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,66,66,66));
                colorDialog1.dismiss();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,94,94,94));
                colorDialog1.dismiss();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,121,121,121));
                colorDialog1.dismiss();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,145,145,145));
                colorDialog1.dismiss();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,147,147,147));
                colorDialog1.dismiss();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,169,169,169));
                colorDialog1.dismiss();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,192,192,192));
                colorDialog1.dismiss();
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,214,214,214));
                colorDialog1.dismiss();
            }
        });


        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,235,235,235));
                colorDialog1.dismiss();
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,255,255,255));
                colorDialog1.dismiss();
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,148,17,0));
                colorDialog1.dismiss();
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,148,82,0));
                colorDialog1.dismiss();
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,146,144,0));
                colorDialog1.dismiss();
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,79,143,0));
                colorDialog1.dismiss();
            }
        });


        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,0,143,0));
                colorDialog1.dismiss();
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,0,144,81));
                colorDialog1.dismiss();
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,0,145,147));
                colorDialog1.dismiss();
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255, 0,84,147));
                colorDialog1.dismiss();
            }
        });


        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,1,25,147 ));
                colorDialog1.dismiss();
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,83,27,147));
                colorDialog1.dismiss();
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,148,33,147));
                colorDialog1.dismiss();
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,148,23,81));
                colorDialog1.dismiss();
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,255,38,0));
                colorDialog1.dismiss();
            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,255,147,0));
                colorDialog1.dismiss();
            }
        });

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,255,251,0));
                colorDialog1.dismiss();
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,142,250,0));
                colorDialog1.dismiss();
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,0,249,0));
                colorDialog1.dismiss();
            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,0,250,146));
                colorDialog1.dismiss();
            }
        });

        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,0,253,255));
                colorDialog1.dismiss();
            }
        });




        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,0,150,255));
                colorDialog1.dismiss();
            }
        });

        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,4,51,255));
                colorDialog1.dismiss();
            }
        });

        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,148,55,255));
                colorDialog1.dismiss();
            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,255,64,255));
                colorDialog1.dismiss();
            }
        });

        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,255,47,146));
                colorDialog1.dismiss();
            }
        });


        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,255,126,121));
                colorDialog1.dismiss();
            }
        });


        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,255,212,121));
                colorDialog1.dismiss();
            }
        });


        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,255,252,121));
                colorDialog1.dismiss();
            }
        });

        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,212,251,121));
                colorDialog1.dismiss();
            }
        });


        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,115,250,121));
                colorDialog1.dismiss();
            }
        });

        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,115,252,214));
                colorDialog1.dismiss();
            }
        });

        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,115,253,255));
                colorDialog1.dismiss();
            }
        });

        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,118,214,255));
                colorDialog1.dismiss();
            }
        });
        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,122,129,255));
                colorDialog1.dismiss();
            }
        });

        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,215,131,255));
                colorDialog1.dismiss();
            }
        });


        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,255,133,255));
                colorDialog1.dismiss();
            }
        });

        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setDrawingColor(Color.argb(255,255,138,216));
                colorDialog1.dismiss();
            }
        });

        currentAlertDialog.setView(view);
        currentAlertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"You Clicked Cancel",Toast.LENGTH_SHORT).show();
            }
        });

        currentAlertDialog.setTitle("Choose Preset Color");
        colorDialog1= currentAlertDialog.create();
        colorDialog1.show();
    }





    void showLineWidthDialog(){
        currentAlertDialog=new AlertDialog.Builder(this);
        View view=getLayoutInflater().inflate(R.layout.width_dialog,null);
        final SeekBar widthSeekBar=view.findViewById(R.id.widthDSeekbar);
        Button setLineWidthButton= view.findViewById(R.id.widthDialogButton);
        widthImageView=view.findViewById(R.id.imageViewId);

        setLineWidthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paint3oView.setLineWidth(widthSeekBar.getProgress());
                dialogLineWidth.dismiss();
                currentAlertDialog=null;

            }
        });

        widthSeekBar.setOnSeekBarChangeListener(widthSeekBarChange);

        widthSeekBar.setProgress(paint3oView.getLineWidth());
        currentAlertDialog.setView(view);
        currentAlertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"You Clicked Cancel",Toast.LENGTH_SHORT).show();
            }
        });

        dialogLineWidth=currentAlertDialog.create();
        dialogLineWidth.setTitle("Set Line Width");

        dialogLineWidth.show();

    }

    private  SeekBar.OnSeekBarChangeListener colorSeekBarChanged=new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            paint3oView.setBackgroundColor(Color.argb(
                    alphaSeekBar.getProgress(),
                    redSeekBar.getProgress(),
                    greenSeekBar.getProgress(),
                    blueSeekBar.getProgress()


            ));


            colorView.setBackgroundColor(Color.argb(
                    alphaSeekBar.getProgress(),
                    redSeekBar.getProgress(),
                    greenSeekBar.getProgress(),
                    blueSeekBar.getProgress()
            ));
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    private SeekBar.OnSeekBarChangeListener widthSeekBarChange=new SeekBar.OnSeekBarChangeListener() {

        Bitmap bitmap=Bitmap.createBitmap(400,100,Bitmap.Config.ARGB_8888);
        Canvas canvas=new Canvas(bitmap);

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            Paint p= new Paint();
            p.setColor(paint3oView.getDrawingColor());
            p.setStrokeCap(Paint.Cap.ROUND);
            p.setStrokeWidth(progress);

            bitmap.eraseColor(Color.WHITE);
            canvas.drawLine(30,50,370,50,p);
            widthImageView.setImageBitmap(bitmap);

        }


        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

    }


}

