package cn.edu.bzu.entity;

/**
 * Created by monster on 2015/4/19.
 */
public class Bean {
    public String title;
    public String desc;
    public String date;
    public String phone;

    public Bean(String title, String desc, String date, String phone) {
        super();
        this.title = title;
        this.desc = desc;
        this.date = date;
        this.phone = phone;
    }

    public Bean() {
        super();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
