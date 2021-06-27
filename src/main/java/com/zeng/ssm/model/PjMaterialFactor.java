package com.zeng.ssm.model;

import com.zeng.ssm.common.AbstractModel;

public class PjMaterialFactor extends AbstractModel {
    private Integer id;
    private Integer materialId;
    private Integer characterId;
    private Float value;
    private Material material;
    private PjCharacterization character;

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public PjCharacterization getCharacter() {
        return character;
    }

    public void setCharacter(PjCharacterization character) {
        this.character = character;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
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
