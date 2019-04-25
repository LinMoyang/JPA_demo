package com.xiaolinzi.demodatajpa.entity;
//配置映射关系

import javax.persistence.*;
@Entity//告诉jpa这是一个实体类（和数据表映射的类）
@Table(name="user")//指定与那个数据表映射，如果省略则默认表名就是user
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;

    @Column(name="last_name",length = 50)//这是和数据表对应的一个列
    private String lastname;

    @Column//省略则默认列明就是属性名
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
