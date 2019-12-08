package demo01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpeakStory {
    public static void main(String[] args) {
        List<Go> speakstory= new ArrayList<>();

        Person change = new Person();
        change.setName("嫦娥");
        change.setId(001);
        change.setSex("女");
        change.setAge(18);
        change.setHeight("165");
        change.setWeight("50");
        //月亮
        Xingxing moon=new Xingxing();
        moon.setName("月亮");
        moon.setId(123);
        moon.setAge("1555");
        moon.setWeight("589542kg");
        moon.setSize(1000000);
        //奔
        Go goMoon=new Go();
        goMoon.setPerson(change);
        goMoon.setGoTime(new Date());
        goMoon.setTarget(moon);
        goMoon.setEnd(true);

        Person kuafu = new Person();
        kuafu.setName("夸父");
        kuafu.setId(002);
        kuafu.setSex("男");
        kuafu.setAge(30);
        kuafu.setHeight("180");
        kuafu.setWeight("70");

        //太阳
        Xingxing sun=new Xingxing();
        sun.setName("太阳");
        sun.setId(456);
        sun.setAge("8845");
        sun.setWeight("584561542kg");
        sun.setSize(90000000);

        //追
        Go goSun=new Go();
        goSun.setPerson(kuafu);
        goSun.setGoTime(new Date());
        goSun.setTarget(sun);
        goSun.setEnd(false);
        System.out.println();

        speakstory.add(goMoon);
        speakstory.add(goSun);

        System.out.println(speakstory);

    }
}
