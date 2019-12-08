package demo01;

import java.util.Date;

public class ChangEGoMoon {
    public static void main(String[] args) {
        //嫦娥
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

        System.out.println(goMoon);
    }
}
