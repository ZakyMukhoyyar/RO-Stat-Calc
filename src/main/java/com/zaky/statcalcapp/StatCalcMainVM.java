package com.zaky.statcalcapp;

import java.util.ArrayList;
import java.util.List;
import org.zkoss.zk.ui.select.annotation.VariableResolver;

/**
 *
 * @author Zaky
 */
@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class StatCalcMainVM {
    
    private String name;
    private String clas;
    private int baseLv;
    private int jobLv;
    
    private int baseStr;
    private int bonusStr;
    private int totalStr;
    
    private int baseAgi;
    private int bonusAgi;
    private int totalAgi;
    
    private int baseVit;
    private int bonusVit;
    private int totalVit;
    
    private int baseInt;
    private int bonusInt;
    private int totalInt;
        
    private int baseDex;
    private int bonusDex;
    private int totalDex;
    
    private int baseLuk;
    private int bonusLuk;
    private int totalLuk;
    
    private int test;
    
    
    private List<Integer> pRenew = new ArrayList<Integer>();
    
    
    
    
}
