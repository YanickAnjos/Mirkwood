/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artefactos;

import com.googlecode.lanterna.TextColor;
import gui.Map;
import gui.SymbolsMirk;

/**
 *
 * @author Trainerpl022
 */
public class Tree2 extends MapObject {
    
    public Tree2() {
        super();
        int rverde = _rand.nextInt(150)+100;
        setSymbol(SymbolsMirk.TREES[_rand.nextInt(SymbolsMirk.TREES.length)]);
        setForegroundColor(new TextColor.RGB(0,rverde, 0));     
        setBackgroundColor(Map.bkgColor);
        setWalkthrough(true);
    }
    
}
