package cups.r00t.me.cups;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView left,middle,right;
    Button new_game;
    List<Integer> cards;
    TextView title,punti;
    int tot = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = (TextView) findViewById(R.id.title);
        punti = (TextView) findViewById(R.id.punti);

        left = (ImageView) findViewById(R.id.left);
        middle = (ImageView) findViewById(R.id.middle);
        right = (ImageView) findViewById(R.id.right);

        new_game = (Button) findViewById(R.id.new_game);

        cards=new ArrayList<>();
        cards.add(107); //asso
        cards.add(207); //7 di cuori
        cards.add(407); //2 di quadri
        //mischio le carte
        Collections.shuffle(cards);

        new_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mischio le carte
                Collections.shuffle(cards);

                title.setText("Trova l'asso di picche...");

                left.setImageResource(R.drawable.ic_cardback);
                middle.setImageResource(R.drawable.ic_cardback);
                right.setImageResource(R.drawable.ic_cardback);

                Animation anim_left = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.left);
                Animation anim_middle = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.middle);
                Animation anim_right = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.right);

                left.startAnimation(anim_left);
                middle.startAnimation(anim_middle);
                right.startAnimation(anim_right);

                for (int i=0;i<cards.size();i++) Log.d("CARDS",i+"="+cards.get(i));
            }
        });

        punti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tot=0;
                punti.setText("Punteggio:"+tot);
                Toast.makeText(MainActivity.this,"Puntezzio azzerato",Toast.LENGTH_SHORT).show();
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //left card
                if(cards.get(0)==107) {
                    left.setImageResource(R.drawable.ic_spades);
                    Toast.makeText(MainActivity.this,"Indovinato!", Toast.LENGTH_SHORT).show();
                    tot++;
                    punti.setText("Punteggio:"+tot);
                }
                else if (cards.get(0)==207) {
                    left.setImageResource(R.drawable.ic_hearts);
                    Toast.makeText(MainActivity.this,"Riprova...", Toast.LENGTH_SHORT).show();
                }
                else if (cards.get(0)==407) {
                    left.setImageResource(R.drawable.ic_diamonds);
                    Toast.makeText(MainActivity.this,"Riprova...", Toast.LENGTH_SHORT).show();
                }

                //middle card
                if(cards.get(1)==107) {
                    middle.setImageResource(R.drawable.ic_spades);
                }
                else if (cards.get(1)==207)
                    middle.setImageResource(R.drawable.ic_hearts);
                else if (cards.get(1)==407)
                    middle.setImageResource(R.drawable.ic_diamonds);

                //right card
                if(cards.get(2)==107) {
                    right.setImageResource(R.drawable.ic_spades);
                }
                else if (cards.get(2)==207)
                    right.setImageResource(R.drawable.ic_hearts);
                else if (cards.get(2)==407)
                    right.setImageResource(R.drawable.ic_diamonds);

            }
        });

        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //left card
                if (cards.get(1) == 107) {
                    middle.setImageResource(R.drawable.ic_spades);
                    Toast.makeText(MainActivity.this, "Indovinato!", Toast.LENGTH_SHORT).show();
                    tot++;
                    punti.setText("Punteggio:" + tot);
                } else if (cards.get(1) == 207) {
                    middle.setImageResource(R.drawable.ic_hearts);
                    Toast.makeText(MainActivity.this, "Riprova...", Toast.LENGTH_SHORT).show();
                }
                else if (cards.get(1) == 407){
                    middle.setImageResource(R.drawable.ic_diamonds);
                Toast.makeText(MainActivity.this, "Riprova...", Toast.LENGTH_SHORT).show();
                 }
                //middle card
                if(cards.get(0)==107) {
                    left.setImageResource(R.drawable.ic_spades);
                }
                else if (cards.get(0)==207)
                    left.setImageResource(R.drawable.ic_hearts);
                else if (cards.get(0)==407)
                    left.setImageResource(R.drawable.ic_diamonds);

                //right card
                if(cards.get(2)==107) {
                    right.setImageResource(R.drawable.ic_spades);
                }
                else if (cards.get(2)==207)
                    right.setImageResource(R.drawable.ic_hearts);
                else if (cards.get(2)==407)
                    right.setImageResource(R.drawable.ic_diamonds);
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //left card
                if(cards.get(2)==107) {
                    right.setImageResource(R.drawable.ic_spades);
                    Toast.makeText(MainActivity.this,"Indovinato!", Toast.LENGTH_SHORT).show();
                    tot++;
                    punti.setText("Punteggio:"+tot);
                }
                else if (cards.get(2)==207) {
                    right.setImageResource(R.drawable.ic_hearts);
                    Toast.makeText(MainActivity.this, "Riprova...", Toast.LENGTH_SHORT).show();
                }
                else if (cards.get(2)==407) {
                    right.setImageResource(R.drawable.ic_diamonds);
                    Toast.makeText(MainActivity.this, "Riprova...", Toast.LENGTH_SHORT).show();
                }
                //middle card
                if(cards.get(1)==107) {
                    middle.setImageResource(R.drawable.ic_spades);
                }
                else if (cards.get(1)==207)
                    middle.setImageResource(R.drawable.ic_hearts);
                else if (cards.get(1)==407)
                    middle.setImageResource(R.drawable.ic_diamonds);

                //right card
                if(cards.get(0)==107) {
                    left.setImageResource(R.drawable.ic_spades);
                }
                else if (cards.get(0)==207)
                    left.setImageResource(R.drawable.ic_hearts);
                else if (cards.get(0)==407)
                    left.setImageResource(R.drawable.ic_diamonds);
            }
        });
    }

}
