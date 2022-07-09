package ca.ciccc.wmad.assignment6.question1;

public class Material  {

    private int materialCode;
    private String materialName;


    public Material(int materialCode, String materialName){
        this.materialCode=materialCode;
        this.materialName=materialName;
    }

    @Override
    public String toString() {
        return "ID:"+this.materialCode+"\n"+"Product Name: "+this.materialName+"\n";
    }


}
