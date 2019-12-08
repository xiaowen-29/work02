package demo01;

public class Xingxing {
    private String name;
    private Integer id;
    private String age;
    private Integer size;
    private String weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Xingxing{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age='" + age + '\'' +
                ", size=" + size +
                ", weight='" + weight + '\'' +
                '}';
    }
}
