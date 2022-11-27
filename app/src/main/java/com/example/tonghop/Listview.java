package com.example.tonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.content.Intent;

import java.util.ArrayList;

public class Listview extends AppCompatActivity {

    ListView lvbaihat;
    ArrayList<Baihat> arraybaihat;
    BaihatAdapter adapter;
    ImageView imgProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        Anhxa();

        adapter = new BaihatAdapter(this,R.layout.dong_bai_hat, arraybaihat);
        lvbaihat.setAdapter(adapter);


        lvbaihat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Listview.this, Detail.class);
                Baihat baihat = arraybaihat.get(i);
                intent.putExtra("ten", baihat.getTen());
                intent.putExtra("noidung", baihat.getNoidung());
                intent.putExtra("mota", baihat.getMota());
                intent.putExtra("nhacsi", baihat.getNhacsi());
                intent.putExtra("ngay", baihat.getNgay());
                intent.putExtra("hinh", baihat.getHinh());
                startActivity(intent);
            }
        });



    }
    private  void Anhxa(){
        lvbaihat = (ListView) findViewById(R.id.listviewBaihat);
        arraybaihat = new ArrayList<>();

        arraybaihat.add(new Baihat("Cộng","Cộng 2 chữ số","Vì Anh Thương Em","Đạt G"," 4 thg 4, 2018",R.drawable.ic_cong));
        arraybaihat.add(new Baihat(" Trừ","Trừ 2 chữ số","Đi Về Nhà","Đen","18 thg 12, 2020",R.drawable.ic_tru));
        arraybaihat.add(new Baihat("Nhân","Nhân 2 chữ số","Buồn Của Anh","Đạt G","15 thg 12, 2017 ",R.drawable.ic_nhan));
        arraybaihat.add(new Baihat("Chia","Chia 2 chữ số","Có Chắc Yêu Là Đây","Sơn Tùng M-TP","5 thg 7, 2020 ",R.drawable.ic_chia));
        arraybaihat.add(new Baihat("Logarit","logab","Vệ Tinh","HIEUTHUHAI x Hoàng Tôn","11 thg 8, 2022",R.drawable.ic_log1));
        arraybaihat.add(new Baihat("Lũy thừa","a^b","Ngôi Sao Cô Đơn ","JACK - J97","19 thg 7, 2022",R.drawable.ic_luythua));
        arraybaihat.add(new Baihat("Căn bậc 2","căn bậc 2 a","Ngôi Sao Cô Đơn ","JACK - J97","19 thg 7, 2022",R.drawable.ic_can));
    }


}