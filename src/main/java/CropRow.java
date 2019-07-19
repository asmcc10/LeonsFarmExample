import java.util.ArrayList;

public class CropRow {
    private ArrayList<Crop> crops;

    public CropRow(){
        crops = new ArrayList<Crop>();
    }

    public CropRow(ArrayList<Crop> crops){
        this.crops = crops;
    }

    public ArrayList<Crop> getCrops(){
        return crops;
    }
}
