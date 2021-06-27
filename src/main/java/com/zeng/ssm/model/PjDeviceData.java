package com.zeng.ssm.model;

import com.zeng.ssm.common.AbstractModel;

public class PjDeviceData extends AbstractModel {
    private Integer id;
    private Integer sceneId;
    private Integer deviceId;
    private Float workTime;
    private PjBasicInformation scene;
    private Device device;

    public PjBasicInformation getScene() {
        return scene;
    }

    public void setScene(PjBasicInformation scene) {
        this.scene = scene;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
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

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Float getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Float workTime) {
        this.workTime = workTime;
    }
}
