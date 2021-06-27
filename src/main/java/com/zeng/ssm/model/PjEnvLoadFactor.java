package com.zeng.ssm.model;

import com.zeng.ssm.common.AbstractModel;

public class PjEnvLoadFactor extends AbstractModel {
    private Integer id;
    private Integer envLoadId;
    private EnvLoad envLoad;
    private Integer characterId;
    private PjCharacterization character;
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

    public EnvLoad getEnvLoad() {
        return envLoad;
    }

    public void setEnvLoad(EnvLoad envLoad) {
        this.envLoad = envLoad;
    }

    public PjCharacterization getCharacter() {
        return character;
    }

    public void setCharacter(PjCharacterization character) {
        this.character = character;
    }
}
