/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operaciones.operacionesbasicas;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class OperacionesBasicas {
    private int num1;
    private int num2;

    public OperacionesBasicas(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int sum(){
        return getNum1() + getNum2();
    }
    public int res(){
        return getNum1() - getNum2();
    }
    public int mult(){
        return getNum1() * getNum2();
    }
    public int div(){
        return getNum1() / getNum2();
    }
    
    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }
}
