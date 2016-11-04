/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artefactos;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.TextColor.RGB;
import gui.SymbolsMirk;
import gui.Map;

/**
 *
 * @author Trainerpl022
 */
public class Water2 extends MapObject {
    TextColor.RGB foreColor = new RGB(51, 102, 255);
    TextColor.RGB bkgColor = new RGB(17, 184, 255);
    public Water2(char Sym) {
        super();
        setForegroundColor(foreColor);
        setBackgroundColor(bkgColor);
        setWalkthrough(false);
        setSymbol(Sym);
    }
    
}
