package es.cursonoruego.model.util;

import es.cursonoruego.model.enums.PaymentPlan;

public class DailyWordsGoalCalculator {
    
    public static int getDailyWordsGoal(PaymentPlan paymentPlan) {
        if (paymentPlan == null) {
            return 7;
        }

        if (paymentPlan == PaymentPlan.MONTHLY_23) {
            // A1 in 5 months or more
            return 7;
        } else if (paymentPlan == PaymentPlan.MONTHLY_37) {
            // A1 in 3 months or more
            return 11;
        } else if (paymentPlan == PaymentPlan.MONTHLY_65) {
            // A1 in 2 months or more
            return 17;
        }
        
        return -1;
    }
}
