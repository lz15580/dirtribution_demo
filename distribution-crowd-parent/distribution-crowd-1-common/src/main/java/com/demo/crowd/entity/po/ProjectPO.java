package com.demo.crowd.entity.po;



public class ProjectPO {
    private Integer id;

    private String projectName;

    private String projectDescription;

    private Long money;

    private Integer day;

    private Byte status;

    private String deploydate;

    private Long supportmoney;

    private Integer supporter;

    private Integer completion;

    private Integer memberid;

    private String createdate;

    private Integer follower;

    private String headerPicturePath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription == null ? null : projectDescription.trim();
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getDeploydate() {
        return deploydate;
    }

    public void setDeploydate(String deploydate) {
        this.deploydate = deploydate == null ? null : deploydate.trim();
    }

    public Long getSupportmoney() {
        return supportmoney;
    }

    public void setSupportmoney(Long supportmoney) {
        this.supportmoney = supportmoney;
    }

    public Integer getSupporter() {
        return supporter;
    }

    public void setSupporter(Integer supporter) {
        this.supporter = supporter;
    }

    public Integer getCompletion() {
        return completion;
    }

    public void setCompletion(Integer completion) {
        this.completion = completion;
    }

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate == null ? null : createdate.trim();
    }

    public Integer getFollower() {
        return follower;
    }

    public void setFollower(Integer follower) {
        this.follower = follower;
    }

    public String getHeaderPicturePath() {
        return headerPicturePath;
    }

    public void setHeaderPicturePath(String headerPicturePath) {
        this.headerPicturePath = headerPicturePath == null ? null : headerPicturePath.trim();
    }

    public ProjectPO() {
    }

    public ProjectPO(Integer id, String projectName, String projectDescription, Long money, Integer day, Byte status, String deploydate, Long supportmoney, Integer supporter, Integer completion, Integer memberid, String createdate, Integer follower, String headerPicturePath) {
        this.id = id;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.money = money;
        this.day = day;
        this.status = status;
        this.deploydate = deploydate;
        this.supportmoney = supportmoney;
        this.supporter = supporter;
        this.completion = completion;
        this.memberid = memberid;
        this.createdate = createdate;
        this.follower = follower;
        this.headerPicturePath = headerPicturePath;
    }

    @Override
    public String toString() {
        return "ProjectPO{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                ", money=" + money +
                ", day=" + day +
                ", status=" + status +
                ", deploydate='" + deploydate + '\'' +
                ", supportmoney=" + supportmoney +
                ", supporter=" + supporter +
                ", completion=" + completion +
                ", memberid=" + memberid +
                ", createdate='" + createdate + '\'' +
                ", follower=" + follower +
                ", headerPicturePath='" + headerPicturePath + '\'' +
                '}';
    }
}