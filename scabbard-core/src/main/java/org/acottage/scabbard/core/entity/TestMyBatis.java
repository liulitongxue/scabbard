package org.acottage.scabbard.core.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author liuli email:liulitongxue@126.com
 * @Date 2020/08/14 下午 12:43
 * @Version 1.0
 */
public class TestMyBatis implements Serializable {

    private Long id;
    private String name;
    private Boolean del;
    private Date updateTime;
    private Date createTime;

    public TestMyBatis() {
    }

    public TestMyBatis(Long id, String name, Date updateTime, Date insertTime, Boolean del) {
        this.id = id;
        this.name = name;
        this.updateTime = updateTime;
        this.createTime = insertTime;
        this.del = del;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getInsertTime() {
        return createTime;
    }

    public void setInsertTime(Date insertTime) {
        this.createTime = insertTime;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }
}
