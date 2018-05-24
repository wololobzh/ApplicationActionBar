package fr.acos.applicationactionbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        //Charge le menu décrit du fichier menu_etoile.xml
        getMenuInflater().inflate(R.menu.menu_etoile,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        //Actions liées au différentes options du menu.
        switch (item.getItemId())
        {
            case R.id.option_une :
                Intent intent = new Intent(this,BubbleActivity.class);
                startActivity(intent);
                break;
            case R.id.option_deux :
                Toast.makeText(this, "Mon icône s'affiche s'il y a assez de place", Toast.LENGTH_SHORT).show();
                break;
            case R.id.option_trois :
                Toast.makeText(this, "Mon icône s'affiche dans la partie des préférences en haut à gauche", Toast.LENGTH_SHORT).show();
                break;
            default:
                    break;
        }
        return true;
    }
}
