package com.company.fix3058.service;

import com.company.fix3058.entity.CountryGrowthEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(CountryGrowthService.NAME)
public class CountryGrowthServiceBean implements CountryGrowthService {

    public List<CountryGrowthEntity> getCountryGrowthList() {

        List<CountryGrowthEntity> countryGrowthEntities = new ArrayList<>();
        CountryGrowthEntity countryGrowthEntity = new CountryGrowthEntity();
        countryGrowthEntity.setId(1);
        countryGrowthEntity.setYear2020(20d);
        countryGrowthEntities.add(countryGrowthEntity);
        return countryGrowthEntities;
    }
}