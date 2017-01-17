package org.apache.commons.dbutils.test.pojo;


public class TestPojo {

    private String t_id;

    private Integer number;

    private String t_time;
    
    private int sum;

    public String getT_id() {
        return t_id;
    }

    public void setT_id(String t_id) {
        this.t_id = t_id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getT_time() {
        return t_time;
    }

    public void setT_time(String t_time) {
        this.t_time = t_time;
    }
    

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "TestPojo [t_id=" + t_id + ", number=" + number + ", t_time=" + t_time + ", sum=" + sum + "]";
    }
    

}
