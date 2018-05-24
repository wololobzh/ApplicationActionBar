package fr.acos.applicationactionbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class BubbleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubble);

        //Permet d'afficher la flèche de retour
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        //Charge le menu décrit du fichier menu_bubble.xml
        getMenuInflater().inflate(R.menu.menu_bubble,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        //Actions liées au différentes options du menu.
        switch (item.getItemId())
        {
            case R.id.option_bubble_une :
                Intent intent = new Intent(this,BubbleActivity.class);
                startActivity(intent);
                break;
            case R.id.option_bubble_deux :
                Toast.makeText(this, "Mon icône s'affiche s'il y a assez de place", Toast.LENGTH_SHORT).show();
                break;
            case R.id.option_bubble_trois :
                Toast.makeText(this, "Mon icône s'affiche dans la partie des préférences en haut à gauche", Toast.LENGTH_SHORT).show();
                break;
            //Action réalisée lorsque l'on clique sur la flèche de retour.
            case android.R.id.home :
                Toast.makeText(this, "Fin de l'activité", Toast.LENGTH_SHORT).show();
                finish();
            default:
                break;
        }
        return true;
    }
}
