package com.common.myapplication.flutter;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.common.myapplication.R;

import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends AppCompatActivity {

    String str = "good";
    String[] b = {"1", "2", "3"};
    String s1 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
//        Test test = Test.INSTANCE;
//        test.doSomeThing();
//        des d = new C1();
//        d = new B1(d);
//        d = new B2(d);
//        Log.d("hsd", d.desc() + "-----" + d.cost());
//
//        Map map = new HashMap();
//        map.put(null, null);
//
//        Set set = new HashSet();
//        set.add(null);
//        set.add(null);
//        Log.d("hsd", "onCreate: " + set);

//        Map map1 = new TreeMap();
//        map1.put(null, null);


//        Set set1 = new TreeSet();
//        set1.add(null);
//        Log.d("hsd", "onCreate: " + set1);

//        Hashtable hashtable=new Hashtable();
//        hashtable.put(null,"null");

//        Test2<String> test2 = new Test2<>("sssss");
//        Log.d("hsd", "onCreate: " + test2.getData());
//
//        Test2<Integer> test21 = new Test2<>(1);
//        Log.d("hsd", "onCreate: " + test21.getData());
//
//        Test2<Double> test22 = new Test2<>(2.8);
//        Log.d("hsd", "onCreate: " + test22.getData());
//
//        Test4 test4 = new Test4();
//        test4.getData("2222");
//
//        Test5 test5 = new Test5();
//        test5.printMsg("1", "2", "#", "5");
//
//
//        getData("222");

//        List<? extends fruit> list = new ArrayList<Apple>();
////        list.add(new Apple());
//        list.get(0);
//
//        List<? super Apple> list1 = new ArrayList<Apple>();
//        list1.add(new Apple());
//        list1.add(new Apple2());
//        Apple apple = list1.get(0);
//        "".toLowerCase();

        short s = 1;

        short s2 = 1;
        s2 += 1;

//        Intent intent = new Intent(MainActivity.this, MainActivity.class);
//        Test7 test7 = new Test7();
//        test7.main();

//        show();

//        ApIService apIService = new HelloApIService();
//
//        ApIService apIService1 = (ApIService) Proxy.newProxyInstance(apIService.getClass().getClassLoader(), apIService.getClass().getInterfaces(), (proxy, method, args) -> {
//            method.invoke(apIService, args);
//            return null;
//        });
//        apIService1.sayHello();
//
//    }
//        Class<Fater> faterClass = Fater.class;
//        boolean isHasFaterClassAnnotation = faterClass.isAnnotationPresent(TestAnnotation.class);
//        if (isHasFaterClassAnnotation) {
//            TestAnnotation annotation = faterClass.getAnnotation(TestAnnotation.class);
//            String name = annotation.name();
//            int age = annotation.age();
//            Log.d("hsd", "onCreate: " + name + "------" + age);
//        }
//        try {
//            Field name = faterClass.getDeclaredField("age");
////            boolean isHas=name.isAnnotationPresent(Name.class)
//
//            Method play = PlayGame.class.getDeclaredMethod("play");
//            Log.d("hsd", "onCreate: " + play);
//
//        } catch (NoSuchFieldException | NoSuchMethodException e) {
//            e.printStackTrace();
//        }
//        Intent intent = new Intent(this, MyService.class);
//        bindService(intent, serviceConnection, BIND_AUTO_CREATE);
//
//    }
//
//    private MyService.MyBinder myBinder;
//    ServiceConnection serviceConnection = new ServiceConnection() {
//        @Override
//        public void onServiceConnected(ComponentName name, IBinder service) {
//            myBinder = (MyService.MyBinder) service;
//        }
//
//        @Override
//        public void onServiceDisconnected(ComponentName name) {
//
//        }
//    };

//        test(str, b);
//        Log.d("hsd", "onCreate: " + str + b[0]);
//
//        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                for (int i = 0; i < 20; i++) {
//                    s1 += i;
//                }
//
//
//            }
//        });

//        Dog dog = new Dog();
//
//
//        Animal animal = (Animal) Proxy.newProxyInstance(dog.getClass().getClassLoader(), dog.getClass().getInterfaces(), new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return method.invoke(dog, args);
//            }
//        });
//        animal.eat();

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(FlutterActivity.withCachedEngine("my_engine_id").build(MainActivity.this));
            }
        });

    }

    private void test(String value, String[] a) {
        value = "100";
        a[0] = "4";
    }
}