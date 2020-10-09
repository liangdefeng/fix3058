package com.company.fix3058.entity;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;

import java.util.UUID;

@MetaClass(name = "fix3058_CountryGrowthEntity")
public class CountryGrowthEntity extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -5505225629021885741L;

    @MetaProperty
    protected Double year2020;

    protected UUID uuid;

    public Double getYear2020() {
        return year2020;
    }

    public void setYear2020(Double year2020) {
        this.year2020 = year2020;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}