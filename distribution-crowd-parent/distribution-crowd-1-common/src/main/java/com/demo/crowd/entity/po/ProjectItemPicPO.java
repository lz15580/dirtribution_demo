package com.demo.crowd.entity.po;



public class ProjectItemPicPO {
    private Integer id;

    private Integer projectid;

    private String itemPicPath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getItemPicPath() {
        return itemPicPath;
    }

    public void setItemPicPath(String itemPicPath) {
        this.itemPicPath = itemPicPath == null ? null : itemPicPath.trim();
    }

    public ProjectItemPicPO() {
    }

    public ProjectItemPicPO(Integer id, Integer projectid, String itemPicPath) {
        this.id = id;
        this.projectid = projectid;
        this.itemPicPath = itemPicPath;
    }

    @Override
    public String toString() {
        return "ProjectItemPicPO{" +
                "id=" + id +
                ", projectid=" + projectid +
                ", itemPicPath='" + itemPicPath + '\'' +
                '}';
    }
}