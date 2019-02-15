package com.mht.springbootmybatis.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-02-15
 */
public class T_users extends Model<T_users> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    private String username;

    private String password;

    private String email;

    private String home_url;

    private String screen_name;

    private Integer created;

    private Integer activated;

    private Integer logged;

    private String group_name;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getHome_url() {
        return home_url;
    }

    public void setHome_url(String home_url) {
        this.home_url = home_url;
    }
    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }
    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }
    public Integer getActivated() {
        return activated;
    }

    public void setActivated(Integer activated) {
        this.activated = activated;
    }
    public Integer getLogged() {
        return logged;
    }

    public void setLogged(Integer logged) {
        this.logged = logged;
    }
    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

    @Override
    public String toString() {
        return "T_users{" +
        "uid=" + uid +
        ", username=" + username +
        ", password=" + password +
        ", email=" + email +
        ", home_url=" + home_url +
        ", screen_name=" + screen_name +
        ", created=" + created +
        ", activated=" + activated +
        ", logged=" + logged +
        ", group_name=" + group_name +
        "}";
    }
}
