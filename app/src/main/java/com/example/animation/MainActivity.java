package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.animation.adapter.CategoryAdapter;
import com.example.animation.model.Category;
import com.example.animation.model.Course;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecycler;
    CategoryAdapter categoryAdapter;
    СourseAdapter courseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Игры"));
        categoryList.add(new Category(2, "Сайты"));
        categoryList.add(new Category(3, "Языки"));
        categoryList.add(new Category(4, "Прочее"));

        setCategoryRecycler(categoryList);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(new Course(1, "java", "Профессия Java\nразработчик", "1 января", "начальный", "#424345"));
        coursesList.add(new Course(2, "python", "Профессия Python\nразработчик", "10 января", "начальный", "#9FA52D"));

//        setCourseRecycler(coursesList);
    }

//    private void setCourseRecycler(List<Course> courseList) {
//
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
//
//        courseRecycler = findViewById(R.id.courseRecycler);
//        courseRecycler.setLayoutManager(layoutManager);
//
//        courseRecycler = new СourseAdapter(this,courseList);
//        courseRecycler.setAdapter(courseAdapter);
//
//    }

    private void setCategoryRecycler(List<Category> categoryList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);

        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this,categoryList);
        categoryRecycler.setAdapter(categoryAdapter);

    }


    private class СourseAdapter {

    }
}