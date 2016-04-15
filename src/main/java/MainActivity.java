//package goes here; using default now
import android.app.AlertDialog;
import android.content.Context;
import android.ocntent.DialogInterface;
import android.content.Intent;
import android.net.Uri;
//import andorid.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  /**
  Creates the view using an saved instance available and
  sets the content to the xml file provided in layouts.
  **/
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main); // buttons listed here
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
  }
  
  /**
  Adds items to the menu via the menu xml.
  **/
  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    //Inflate the menu; this adds items to the action bar
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }
  
  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    //Handle action bar item clicks here. The action bar will
    //automatically handle clicks on the Home/Up button, so long
    //as you specify a parent activity in AndroidManifest.xml
    int id = item.getItemId();
    
    //no inspection simplifieable if statement
    if (id == R.id.action_settings) {
      return true;
    }
    return super.onOptionsItemsSelected(item);
  }
  
  public void openText(View view) {
    Intent intent = new Intent(this, TextActivity.class);
    startActivity(intent);
  }
}