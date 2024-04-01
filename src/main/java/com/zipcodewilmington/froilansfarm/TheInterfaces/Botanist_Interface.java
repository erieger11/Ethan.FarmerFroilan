package com.zipcodewilmington.froilansfarm.TheInterfaces;

import com.zipcodewilmington.froilansfarm.Crop.CropRow;

public interface Botanist_Interface {
    public void plant(CropRow croprow);
    public void water(CropRow croprow);
    public void nurture(CropRow croprow);
    public void burn(CropRow croprow);

}
