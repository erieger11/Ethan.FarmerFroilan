package com.zipcodewilmington.froilansfarm.TheInterfaces;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;

public interface Botanist_Interface {
    public void plant(CropRow<Crop> croprow);
    public void water(CropRow<Crop> croprow);
    public void nurture(CropRow<Crop> croprow);
    public void burn(CropRow<Crop> croprow);

}
