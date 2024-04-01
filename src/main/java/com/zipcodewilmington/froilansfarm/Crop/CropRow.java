package com.zipcodewilmington.froilansfarm.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropRow<T extends Crop> {
    List<T> cropRow;


    public CropRow(){
        this.cropRow = new ArrayList<>();
    }

    public CropRow( ArrayList<T> newRow){
        this.cropRow = newRow;
    }

    public void addCrop(T crop) {
        this.cropRow.add(crop);

    }

    public int getCropRowSize() {
        return this.cropRow.size();
    }

    public boolean isRowEmpty() {
        return cropRow.isEmpty();
    }

    public boolean hasBeenFertilized() {
        return hasRowFertilized;
    }

    public void fertilizeRow(CropRow cr) {
//        for(T crop: this.cropRow){
//            crop.fertilize();
        cr.hasRowFertilized = true;
//        }
        // isRowFertilized =true;
    }

    public boolean hasBeenHarvested() {
        return hasRowHarvested;
    }

    public void harvestRow(CropRow cr) {
//        for(T crop: this.cropRow){
//            crop.harvest();
        cr.hasRowHarvested = true;
//        }
//        isRowHarvested =true;
    }

    public boolean hasBeenWatered() {
        return hasRowWatered;
    }

    public void waterRow(CropRow cr) {
        cr.hasRowWatered = true;
    }

}
