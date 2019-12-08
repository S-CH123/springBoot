package com.itmuma.pojo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "user")
public class User {
    //设置主键
    @Id
    //主键回填
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private String name;
    private String age;
    private String sex;
}
