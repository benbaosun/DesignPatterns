package ProxyPattern.DynamicProxy.bean;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 人物实体实现类
 */
public class PersonBeanImpl implements PersonBean {
    private String name; // 名字
    private String gender; // 性别
    private String interests; // 兴趣
    private int rating; // 评价
    private int ratingCount; // 评价数


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public int getHorOrNotRating() {
        if (ratingCount == 0) {
            return 0;
        }
        return (rating / ratingCount);
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }


}
