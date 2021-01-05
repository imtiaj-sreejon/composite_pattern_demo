/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sreej
 */
public class Composite_Component extends Village_Component
{
    String name;
    List<Village_Component> components = new ArrayList<>();
    
    public Composite_Component(String name)
    {
        this.name = name;
    }
    
    @Override
    public void add(Village_Component comp)
    {
        components.add(comp);
    }
    
    @Override
    public void remove(Village_Component comp)
    {
        components.remove(comp);
    }
    
    @Override
    public void showInfo()
    {
        // recursively iterate through composite components and print their names
        System.out.print(name + " contains ");
        for(Village_Component comp: components)
        {
            comp.showInfo();
            System.out.print(" ");
        }
    }
}
