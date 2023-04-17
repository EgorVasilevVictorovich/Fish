package com.example.a223;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Animal("Карп", "Pод рыб семейства карповых.",
                R.drawable.carpy, "Численность средняя"));
        animals.add( new Animal("Корюшка", "Вид некрупных лучепёрых рыб семейства корюшковых",
                R.drawable.korushka, "Численность высокая"));
        animals.add( new Animal("Угорь", "Род рыб семейства угрёвых.",
                R.drawable.ygoru, "Численность средняя"));
        animals.add( new Animal("Акула", "Надотряд хрящевых рыб, относящийся к подклассу пластиножаберных и обладающий следующими отличительными особенностями: удлинённое тело более или менее торпедообразной формы, большой гетероцеркальный хвостовой плавник, обычно много острых зубов на каждой челюсти.",
                R.drawable.akul, "Численность низкая"));
        animals.add( new Animal("Скат", "Один из двух надотрядов пластиножаберных хрящевых рыб.",
                R.drawable.scaty, "Численность низкая"));
        animals.add( new Animal("Щука", "Рыба семейства щуковых.",
                R.drawable.resize, "Численность средняя"));
        animals.add( new Animal("Стерлядь", "Рыба семейства осетровых, обитающая в крупных реках Европы, впадающих в Чёрное, Азовское и Каспийское моря, а также Сибири вплоть до Енисея на востоке.",
                R.drawable.sterlyd, "Численность высокая"));
        animals.add( new Animal("Осётр", "Род пресноводных, полупроходных и проходных рыб из семейства осетровых.",
                R.drawable.osert, "Численность средняя"));
        animals.add( new Animal("Камбала", "Морская лучепёрая рыба семейства камбаловых (.",
                R.drawable.kamba, "Численность средняя"));
        animals.add( new Animal("Форель", "Общее название нескольких пресноводных видов и форм рыб, относящихся к семейству лососёвых ",
                R.drawable.forely, "Численность средняя"));
        animals.add( new Animal("Лосось", "Вид лососёвых рыб из рода лососей.",
                R.drawable.lolococ, "Численность средняя"));
        animals.add( new Animal("Речной окунь", "Dид лучепёрых рыб рода пресноводных окуней семейства окунёвых (Percidae)..",
                R.drawable.okyny, "Численность высокая"));
    }
}