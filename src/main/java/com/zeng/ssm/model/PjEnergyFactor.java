package com.zeng.ssm.model;

import com.zeng.ssm.common.AbstractModel;

public class PjEnergyFactor extends AbstractModel {
    private Integer id;
    private Integer energyId;
    private Integer characterId;
    private Float value;
    private Energy energy;
    private PjCharacterization character;


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

    public Energy getEnergy() {
        return energy;
    }

    public void setEnergy(Energy energy) {
        this.energy = energy;
    }

    public PjCharacterization getCharacter() {
        return character;
    }

    public void setCharacter(PjCharacterization character) {
        this.character = character;
    }
}
