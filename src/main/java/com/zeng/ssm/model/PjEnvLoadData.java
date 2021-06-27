package com.zeng.ssm.model;

import com.zeng.ssm.common.AbstractModel;

public class PjEnvLoadData extends AbstractModel {
    private Integer id;
    private Integer sceneId;
    private Integer envLoadId;
    private String type;
    private String substanceCategory;
    private Float value;
    private Integer unitId;
    private String area;
    private Integer year;
    private String description;
    private PjBasicInformation scene;
    private EnvLoad envLoad;
    private PjUnit unit;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSceneId() {
        return sceneId;
    }

    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }

    public Integer getEnvLoadId() {
        return envLoadId;
    }

    public void setEnvLoadId(Integer envLoadId) {
        this.envLoadId = envLoadId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubstanceCategory() {
        return substanceCategory;
    }

    public void setSubstanceCategory(String substanceCategory) {
        this.substanceCategory = substanceCategory;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PjBasicInformation getScene() {
        return scene;
    }

    public void setScene(PjBasicInformation scene) {
        this.scene = scene;
    }

    public EnvLoad getEnvLoad() {
        return envLoad;
    }

    public void setEnvLoad(EnvLoad envLoad) {
        this.envLoad = envLoad;
    }

    public PjUnit getUnit() {
        return unit;
    }

    public void setUnit(PjUnit unit) {
        this.unit = unit;
    }
}
