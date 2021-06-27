package com.zeng.ssm.model;

import com.zeng.ssm.common.AbstractModel;

public class PjCharacterization extends AbstractModel {
    private Integer id;
    private String title;
    private String category;
    private String subtype;
    private Integer unitId;
    private String description;
    private PjUnit unit;

    public PjUnit getUnit() {
        return unit;
    }

    public void setUnit(PjUnit unit) {
        this.unit = unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }
}
