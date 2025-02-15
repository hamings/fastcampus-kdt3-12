package org.example.overview.members.dto;


import org.example.overview.members.entity.Survey;
import org.example.overview.members.vo.SurveyVO;
import org.example.overview.valid.GeneralValidationGroup;
import org.example.overview.valid.TestValidationGroup;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class SurveyDTO {

    @NotEmpty(groups = {GeneralValidationGroup.class, TestValidationGroup.class})
    private String uId = "";

    @NotEmpty(groups = {GeneralValidationGroup.class, TestValidationGroup.class})
    private String season = "";

    @NotEmpty(groups = {GeneralValidationGroup.class, TestValidationGroup.class})
    private String fruit = "";

    public SurveyDTO() {
    }

    public SurveyDTO(String season, String fruit) {
        this.season = season;
        this.fruit = fruit;
    }

    public SurveyDTO(String uId, String season, String fruit) {
        this.uId = uId;
        this.season = season;
        this.fruit = fruit;
    }

    public Survey toEntity() {
        return new Survey(uId, season, fruit);
    }

    public SurveyVO toVO() {
        return new SurveyVO(uId, season, fruit);
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return "SurveyDTO{" +
                "uId='" + uId + '\'' +
                ", season='" + season + '\'' +
                ", fruit='" + fruit + '\'' +
                '}';
    }
}
