package com.zeng.ssm.model;

public class PjEnvLoadFactor {
    private Integer id;
    private Integer envLoadId;
    private Integer characterId;
    private Float value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEnvLoadId() {
        return envLoadId;
    }

    public void setEnvLoadId(Integer envLoadId) {
        this.envLoadId = envLoadId;
    }

    public Integer getCharacterId() {
        return characterId;
    }

    public void setCharacterId(Integer characterId) {
        this.characterId = characterId;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }
}
