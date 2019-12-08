package demo02;

import java.util.HashMap;
import java.util.Map;

public class FindStudent {
    public static void main(String[] args) {
        Class class01 = new Class();
        class01.setSchool("陕西理工大学");
        class01.setClassName("Java培训班");
        class01.setClassId(01);
        class01.setGrade("三年级");
        class01.setNumber(12);

        Map<String,Students> students= new HashMap<>();

        //小明
        Students xiaoming =new Students();
        xiaoming.setName("小明");
        xiaoming.setId(1001);
        xiaoming.setAge(18);
        xiaoming.setSex('男');
        xiaoming.setHeight(175.5);

        students.put("小明",xiaoming);

        Students xiaohong =new Students();
        xiaohong.setName("小红");
        xiaohong.setId(1002);
        xiaohong.setAge(18);
        xiaohong.setSex('女');
        xiaohong.setHeight(170.0);

        students.put("小红",xiaohong);
        System.out.println(students.get("小红"));
        System.out.println(students.get("小明"));

    }
}
