package com.example.demo.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;


/**
 * Copyright (C), 2019-2019, XXX有限公司
 * FileName: article
 * Author:   longzhonghua
 * Date:     2019/4/27 16:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Entity
@Data
public class Article  implements Serializable {
    @Id
    /**
     * Description: 由数据库控制,auto是程序统一控制
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(nullable = false, unique = true, length = 500)
    @NotEmpty(message = "标题不能为空")
    private String title;
    /**
     * Description: 枚举类型
     */
    @Column(columnDefinition="enum('圖文','圖','文')")
    private String type;//类型
    /**
     * Description:  Boolean类型默认false
     */
    private Boolean available = Boolean.FALSE;
    @Size(min=0, max=20)
    private String keyword;
    @Size(max = 255)
    private String description;
    @Column(nullable = false)
    private String body;

}
