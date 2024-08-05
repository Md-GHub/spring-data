package com.mdghub.springdatajpa.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class Guardian {
    private String guardianName;
    private String guardianAddress;
    private String guardianPhone;

    public Guardian() {
    }

    public Guardian(String guardianName, String guardianAddress, String guardianPhone) {
        this.guardianName = guardianName;
        this.guardianAddress = guardianAddress;
        this.guardianPhone = guardianPhone;
    }


    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianAddress() {
        return guardianAddress;
    }

    public void setGuardianAddress(String guardianAddress) {
        this.guardianAddress = guardianAddress;
    }

    public String getGuardianPhone() {
        return guardianPhone;
    }

    public void setGuardianPhone(String guardianPhone) {
        this.guardianPhone = guardianPhone;
    }
}
