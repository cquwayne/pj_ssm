package com.zeng.ssm.model;

public class PjEnergyFactor {
    private Integer id;
    private Integer energyId;
    private Integer characterId;
    private Float value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEnergyId() {
        return energyId;
    }

    public void setEnergyId(Integer energyId) {
        this.energyId = energyId;
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
