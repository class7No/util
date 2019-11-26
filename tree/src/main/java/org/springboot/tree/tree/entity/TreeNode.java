package org.springboot.tree.tree.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @program: Test
 * @description:
 * @author: HuaHua.L
 * @date: 2019-11-26 16:05
 **/
public class TreeNode implements Serializable {

    /* 当前id */
    private Long id;

    /* 父id */
    private Long pid;

    private List<TreeNode> treeNodeList;

    public List<TreeNode> getTreeNodeList() {
        return treeNodeList;
    }

    public void setTreeNodeList(List<TreeNode> treeNodeList) {
        this.treeNodeList = treeNodeList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }
}
