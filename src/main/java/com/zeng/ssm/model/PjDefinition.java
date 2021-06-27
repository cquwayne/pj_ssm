package com.zeng.ssm.model;

import com.zeng.ssm.common.AbstractModel;

public class PjDefinition extends AbstractModel {
    private Integer id;
    private Integer sceneId;
    private String category;
    private String functionUnit;
    private String baseStream;
    private String origin;
    private String baseYear;
    private String productionScale;
    private PjBasicInformation scene;

    public PjBasicInformation getScene() {
        return scene;
    }

    public void setScene(PjBasicInformation scene) {
        this.scene = scene;
    }

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFunctionUnit() {
        return functionUnit;
    }

    public void setFunctionUnit(String functionUnit) {
        this.functionUnit = functionUnit;
    }

    public String getBaseStream() {
        return baseStream;
    }

    public void setBaseStream(String baseStream) {
        this.baseStream = baseStream;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getBaseYear() {
        return baseYear;
    }

    public void setBaseYear(String baseYear) {
        this.baseYear = baseYear;
    }

    public String getProductionScale() {
        return productionScale;
    }

    public void setProductionScale(String productionScale) {
        this.productionScale = productionScale;
    }
}
