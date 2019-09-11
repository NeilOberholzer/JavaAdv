package com.example.bussiness;

import com.example.domain.*;

/**
 *
 * @author Neil
 */
public class NoEmployeeStockPlan {
    
    public int grantStock(NoEmployee employee) {
        if (employee instanceof NoDirector){
            return 1000;
        } else if (employee instanceof NoManager){
            return 100;
        } else {
            return 10;
        }
    }
}
