package com.vatsal.four_kyu;

public class User {

    public int rank = -8;
    public int progress = 0;

    public void incProgress(int activity) throws IllegalArgumentException {
        if(rank==8) return;

        if (activity == 0 || activity > 8 || activity < -8) {
            throw new IllegalArgumentException("Ranks are always between -8 and 8, and never 0");
        }

        int diff;
        diff = activity-rank;

        if(Math.signum(rank) != Math.signum(activity)) {
            diff = (int) ((Math.abs(diff) - 1) * Math.signum(diff));
        }

        if(diff == 0) progress+=3;

        if(diff == -1) progress ++;

        if(diff >= 1) progress += 10*diff*diff;

        while (progress >= 100) {
            rank++;
            if(rank == 0)rank++;
            progress-=100;
            if(rank==8) progress = 0;
        }
    }

}