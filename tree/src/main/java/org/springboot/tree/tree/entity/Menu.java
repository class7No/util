package org.springboot.tree.tree.entity;

import javax.annotation.sql.DataSourceDefinition;
import java.io.Serializable;

/**
 * @program: Test
 * @description:
 * @author: HuaHua.L
 * @date: 2019-11-26 15:34
 **/
public class Menu implements Serializable {

    private Long id;

    private Integer parentId;

    private String treeName;

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", treeName='" + treeName + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }
}
