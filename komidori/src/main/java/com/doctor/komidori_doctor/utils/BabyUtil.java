package com.doctor.komidori_doctor.utils;

import com.doctor.komidori_doctor.pojo.BabyGrowthChart;

public class BabyUtil {

    public static void setBabyGrowthMaxAndMin(BabyGrowthChart baby){
        float maxWeight;
        float minWeight;

        float maxBPD = baby.getBpd() + baby.getBpdRange();
        float maxAC = baby.getAc() + baby.getAcRange();
        float maxFL = baby.getFl() + baby.getFlRange();
        maxWeight = Calculation(maxBPD, maxAC, maxFL);
        baby.setMaxwight(maxWeight);

        float minBPD = baby.getBpd() - baby.getBpdRange();
        float minAC = baby.getAc() - baby.getAcRange();
        float minFL = baby.getFl() - baby.getFlRange();
        minWeight = Calculation(minBPD, minAC, minFL);
        baby.setMinweight(minWeight);

    }

    private static float Calculation(float BPD, float AC, float FL){
        return (1.07f*BPD*BPD*BPD+0.3f*AC*AC*FL);
    }
}
