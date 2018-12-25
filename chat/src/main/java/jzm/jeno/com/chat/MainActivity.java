package jzm.jeno.com.chat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/chat/MainActivity")
public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_activity_main);
        ARouter.getInstance().inject(this);
        Toast.makeText(this, "收到传送过来的数据：", Toast.LENGTH_LONG).show();
    }
}
