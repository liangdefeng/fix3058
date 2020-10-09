package com.company.fix3058.service;

import com.company.fix3058.entity.CountryGrowthEntity;
import java.util.List;

public interface CountryGrowthService {
    String NAME = "fix3058_CountryGrowthService";

    List<CountryGrowthEntity> getCountryGrowthList();
}