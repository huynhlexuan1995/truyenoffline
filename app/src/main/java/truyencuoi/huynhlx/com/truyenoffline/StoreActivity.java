package truyencuoi.huynhlx.com.truyenoffline;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class StoreActivity extends AppCompatActivity {
    private ViewPager vpStore;
    private TabLayout tab;
    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        initView();
    }
    private void initView() {
        vpStore = (ViewPager)findViewById(R.id.vp_store);
        mainAdapter = new MainAdapter(getSupportFragmentManager());
        vpStore.setAdapter(mainAdapter);
        tab = (TabLayout)findViewById(R.id.tab);
        tab.setupWithViewPager(vpStore);
    }
}
