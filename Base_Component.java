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
public class Base_Component extends Village_Component
{
    String name;

    public Base_Component(String name)
    {
        this.name = name;
    }
    
    
    @Override
    public void showInfo()
    {
        // just prints the name of base component
        System.out.print(name);
    }
}
