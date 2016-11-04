/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artefactos;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.TextGUIGraphics;
import static gui.Map.BRANCHESCOUNT;
import static gui.Map.COLUMNS;
import static gui.Map.LINES;
import static gui.Map.TREECOUNT;
import static gui.Map.bkgColor;
import static gui.Map.waterpos;
import gui.SymbolsMirk;

/**
 *
 * @author Trainerpl022
 */
public class LayerWater2 extends MapLayer {

 
    public LayerWater2() {
        super();
        
        generateWater2();
       
    }
    
    // Gerar as arvores do Pedro
    	public void generateWater2() {
          int col = _rand.nextInt(COLUMNS);
		for (int i = 0; i < LINES; i++) {
			waterpos[i] = col + (_rand.nextInt(2) - 1);       
		}
                   for (int j = 0; j < waterpos.length; j++) {
                        this.objectos[waterpos[j] +2][j] = new Water2(SymbolsMirk.WATER[0]);
                        this.objectos[waterpos[j] -2][j] = new Water2(SymbolsMirk.WATER[0]);
                        this.objectos[waterpos[j] +1][j] = new Water2(SymbolsMirk.WATER[1]);
                        this.objectos[waterpos[j] -1][j] = new Water2(SymbolsMirk.WATER[1]);
                        this.objectos[waterpos[j]][j] = new Water2(SymbolsMirk.WATER[2]);
                        }
	}       
      
}
