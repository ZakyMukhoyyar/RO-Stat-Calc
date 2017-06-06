package com.zaky.statcalcapp;

import java.util.ArrayList;
import java.util.List;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.annotation.VariableResolver;

/**
 *
 * @author Zaky
 */
@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class StatCalcMainVM {

    private int basicStr;
    private int bonusStr;
    private int totalStr;

    private int basicAgi;
    private int bonusAgi;
    private int totalAgi;

    private int basicVit;
    private int bonusVit;
    private int totalVit;

    private int basicInt;
    private int bonusInt;
    private int totalInt;

    private int basicDex;
    private int bonusDex;
    private int totalDex;

    private int basicLuk;
    private int bonusLuk;
    private int totalLuk;

    private String name;
    private List<String> clas = new ArrayList();
    private List<Integer> baseLv = new ArrayList();
    private List<Integer> jobLv = new ArrayList();
    private List<Integer> stats = new ArrayList();

    @Init
    public void init(Component comp) throws Exception {
        name = "Name";
        
        clas.add("Novice");
        clas.add("Swordman");
        clas.add("asds");
        
        for(int i=1;i<100;i++){
            baseLv.add(i);
        }
        for(int i=1;i<51;i++){
            jobLv.add(i);
        }
        for(int i=1;i<100;i++){
            stats.add(i);
        }
        

    }
    
    /*Setter Getter*/

    public int getBasicStr() {
        return basicStr;
    }

    public void setBasicStr(int basicStr) {
        this.basicStr = basicStr;
    }

    public int getBonusStr() {
        return bonusStr;
    }

    public void setBonusStr(int bonusStr) {
        this.bonusStr = bonusStr;
    }

    public int getTotalStr() {
        return totalStr;
    }

    public void setTotalStr(int totalStr) {
        this.totalStr = totalStr;
    }

    public int getBasicAgi() {
        return basicAgi;
    }

    public void setBasicAgi(int basicAgi) {
        this.basicAgi = basicAgi;
    }

    public int getBonusAgi() {
        return bonusAgi;
    }

    public void setBonusAgi(int bonusAgi) {
        this.bonusAgi = bonusAgi;
    }

    public int getTotalAgi() {
        return totalAgi;
    }

    public void setTotalAgi(int totalAgi) {
        this.totalAgi = totalAgi;
    }

    public int getBasicVit() {
        return basicVit;
    }

    public void setBasicVit(int basicVit) {
        this.basicVit = basicVit;
    }

    public int getBonusVit() {
        return bonusVit;
    }

    public void setBonusVit(int bonusVit) {
        this.bonusVit = bonusVit;
    }

    public int getTotalVit() {
        return totalVit;
    }

    public void setTotalVit(int totalVit) {
        this.totalVit = totalVit;
    }

    public int getBasicInt() {
        return basicInt;
    }

    public void setBasicInt(int basicInt) {
        this.basicInt = basicInt;
    }

    public int getBonusInt() {
        return bonusInt;
    }

    public void setBonusInt(int bonusInt) {
        this.bonusInt = bonusInt;
    }

    public int getTotalInt() {
        return totalInt;
    }

    public void setTotalInt(int totalInt) {
        this.totalInt = totalInt;
    }

    public int getBasicDex() {
        return basicDex;
    }

    public void setBasicDex(int basicDex) {
        this.basicDex = basicDex;
    }

    public int getBonusDex() {
        return bonusDex;
    }

    public void setBonusDex(int bonusDex) {
        this.bonusDex = bonusDex;
    }

    public int getTotalDex() {
        return totalDex;
    }

    public void setTotalDex(int totalDex) {
        this.totalDex = totalDex;
    }

    public int getBasicLuk() {
        return basicLuk;
    }

    public void setBasicLuk(int basicLuk) {
        this.basicLuk = basicLuk;
    }

    public int getBonusLuk() {
        return bonusLuk;
    }

    public void setBonusLuk(int bonusLuk) {
        this.bonusLuk = bonusLuk;
    }

    public int getTotalLuk() {
        return totalLuk;
    }

    public void setTotalLuk(int totalLuk) {
        this.totalLuk = totalLuk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getClas() {
        return clas;
    }

    public void setClas(List<String> clas) {
        this.clas = clas;
    }

    public List<Integer> getBaseLv() {
        return baseLv;
    }

    public void setBaseLv(List<Integer> baseLv) {
        this.baseLv = baseLv;
    }

    public List<Integer> getJobLv() {
        return jobLv;
    }

    public void setJobLv(List<Integer> jobLv) {
        this.jobLv = jobLv;
    }

    public List<Integer> getStats() {
        return stats;
    }

    public void setStats(List<Integer> stats) {
        this.stats = stats;
    }
    
}
