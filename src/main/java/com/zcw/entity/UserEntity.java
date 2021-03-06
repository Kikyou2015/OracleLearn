package com.zcw.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    private Long utId;

    private String utName;

    private String utEmail;

    private String utAddr;

    private short utGender;

    private String utOrgid;

    @Override
    public String toString() {
        return "UserEntity [utId=" + utId + ", utName=" + utName + ", utEmail=" + utEmail + ", utAddr=" + utAddr
                + ", utGender=" + utGender + ", utOrgid=" + utOrgid + "]";
    }

}
