/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author orion
 */
public class Keyboard {
    
    static class Keyrow {
        
        private Boolean[] row;
        
        public Keyrow(int length) {
            row = new Boolean[length];
        }
        
        public void setKeys(int... keys){
            for(int index: keys) {
                if (index < row.length & index >= 0) {
                    row[index] = true;
                }
            }
        }
        
        public Collection<Integer> getKeys() {
            ArrayList<Integer> list = new ArrayList(0);
            for(int i = 0; i < row.length; i++) {
                if(row[i]) {
                    list.add(i);
                }
            }
            return list;
        }
    }
    
    private Keyrow firstRow;
    private Keyrow secondRow;
    private Keyrow thirdRow;
    
    public Keyboard() {
        firstRow = new Keyrow(13);
        secondRow = new Keyrow(12);
        thirdRow = new Keyrow(10);
    }
    
    public Keyrow[] getKeyrows() {
        Keyrow[] rows = {firstRow, secondRow, thirdRow};
        return rows;
    }
    
}
