/**
 * パッケージ名：org.pgrserver.entity
 * ファイル名  ：GraphTable.java
 * 
 * @author mbasa
 * @since May 6, 2020
 */
package org.pgrserver.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 説明：
 *
 */
@Entity
@Table(name = "pgrserver")
public class PgrServer {

    @Id
    private int id;
    private int source;
    private int target;
    private double cost;
    
    /**
     * コンストラクタ
     *
     */
    public PgrServer() {
    }

    /**
     * @return id を取得する
     */
    public int getId() {
        return id;
    }

    /**
     * @param id id を設定する
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return source を取得する
     */
    public int getSource() {
        return source;
    }

    /**
     * @param source source を設定する
     */
    public void setSource(int source) {
        this.source = source;
    }

    /**
     * @return target を取得する
     */
    public int getTarget() {
        return target;
    }

    /**
     * @param target target を設定する
     */
    public void setTarget(int target) {
        this.target = target;
    }

    /**
     * @return cost を取得する
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost cost を設定する
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

}
