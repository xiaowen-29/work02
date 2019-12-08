package demo01;

import java.util.Date;

public class KuaFuZhuSun {
    public static void main(String[] args) {
        //夸父
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
    }
}
