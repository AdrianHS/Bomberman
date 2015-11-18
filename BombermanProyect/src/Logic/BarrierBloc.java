/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;

/**
 *
 * @author _ADRIAN_
 */
public class BarrierBloc extends Element{
    int buff;
    public BarrierBloc() {
        super(3);
        this.buff=0;
    }

    public int getBuff() {
        return buff;
    }

    public void setBuff(int buff) {
        this.buff = buff;
    }
    
}
