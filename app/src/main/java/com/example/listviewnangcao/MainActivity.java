package com.example.listviewnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvThucAn;
    ArrayList<ThucAn> arrayThucAn;
    ThucAnAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        
        adapter = new ThucAnAdapter(this, R.layout.dong_thuc_an, arrayThucAn);
        lvThucAn.setAdapter(adapter);
    }

    private void AnhXa() {
        lvThucAn = (ListView) findViewById(R.id.listviewThucAn);
        arrayThucAn = new ArrayList<>();

        arrayThucAn.add(new ThucAn("Mì Quảng", "Món ăn đặc trưng của Quảng Nam và Đà Nẵng", R.drawable.miquang));
        arrayThucAn.add(new ThucAn("Cháo", "Là một trong hai món ăn thường ngày nhất: cơm và cháo", R.drawable.chao));
        arrayThucAn.add(new ThucAn("Bánh Mì", "Một món ăn Ngon Bổ Rẻ được nhiều người yêu thích", R.drawable.banhmi));
        arrayThucAn.add(new ThucAn("Hủ Tiếu", "Là món ăn dùng chế phẩm gạo dạng sợi", R.drawable.hutieu));
        arrayThucAn.add(new ThucAn("Phở Bò", "Phở được dùng riêng như là một món ăn sáng, trưa hoặc tối.", R.drawable.phobo));

    }
}