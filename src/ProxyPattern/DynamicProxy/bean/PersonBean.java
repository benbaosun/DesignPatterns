package ProxyPattern.DynamicProxy.bean;

/**
 * @author lkmc2
 * @date 2018/9/4
 * @description 人物实体
 */
public interface PersonBean {
    String getName();
    String getGender();
    String getInterests();
    int getHorOrNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}
