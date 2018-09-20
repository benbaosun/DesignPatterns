package BuilderPattern;

/**
 * @author lkmc2
 * @date 2018/9/20
 * @description 人物
 */
public class Person {

    private int id;
    private String name;
    private int age;
    private String sex;
    private String phone;
    private String address;
    private String desc;

    private Person(int id, String name, int age, String sex, String phone, String address, String desc) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
        this.desc = desc;
    }

    public static class Builder {
        private int id;
        private String name;
        private int age;
        private String sex;
        private String phone;
        private String address;
        private String desc;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        public Person build() {
            return new Person(id, name, age, sex, phone, address, desc);
        }

    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
