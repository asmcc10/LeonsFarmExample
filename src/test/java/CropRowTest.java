import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CropRowTest {

    @Test
    public void contructWithNoCropsTest(){
        // Using default constructor
        CropRow cropRow = new CropRow();

        Integer expectedNoOfCrops = 0;
        Integer actualNoOfCrops = cropRow.getCrops().size();

        Assert.assertEquals(expectedNoOfCrops, actualNoOfCrops);
    }

    @Test
    public void constructWithCropsTest(){
        ArrayList<Crop> crops = new ArrayList<Crop>();
        Crop crop = new Crop();
        crops.add(crop);
        CropRow cropRow = new CropRow(crops);

        Integer expectedNoOfCrops = 1;
        Integer actualNoOfCrops = cropRow.getCrops().size();
        Assert.assertEquals(expectedNoOfCrops, actualNoOfCrops);

    }
}
