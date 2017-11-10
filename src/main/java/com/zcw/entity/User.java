package com.zcw.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private Long utId;

    private String utName;

    private String utEmail;

    private String utAddr;

    private short utGender;

    private String utOrgid;

    private Date utCreateTime;
}