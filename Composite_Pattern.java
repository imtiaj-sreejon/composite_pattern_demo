/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite_pattern;

/**
 *
 * @author sreej
 */
public class Composite_Pattern
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // house components
        Village_Component roof = new Base_Component("roof");
        Village_Component frame = new Base_Component("frame");
        Village_Component foundation = new Base_Component("foundation");
        Village_Component windows = new Base_Component("windows");
        // add house components
        Village_Component house = new Composite_Component("House");
        house.add(roof);
        house.add(frame);
        house.add(foundation);
        house.add(windows);
        
        // tree components
        Village_Component leaves = new Base_Component("leaves");
        Village_Component root = new Base_Component("root");
        // add tree components
        Village_Component tree = new Composite_Component("Tree");
        tree.add(leaves);
        tree.add(root);
        
        // water source components = 
        Village_Component pump = new Base_Component("pump");
        Village_Component well = new Base_Component("well");
        // add water source components
        Village_Component water_source = new Composite_Component("Water Source");
        water_source.add(pump);
        water_source.add(well);
        
        
        // finally, build the village
        Village_Component village = new Composite_Component("Village");
        village.add(house);
        village.add(tree);
        village.add(water_source);
        
        
        root.showInfo();
        System.out.println("");
        
        house.showInfo();
        System.out.println("");
        
        tree.showInfo();
        System.out.println("");
        
        village.showInfo();
    }
    
}
