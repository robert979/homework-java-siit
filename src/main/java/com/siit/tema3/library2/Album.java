package com.siit.tema3.library2;





public class Album extends Books {
    private String paperQuality;

    public Album(){
        this ("Album Unknown", -1, "Unknown Quality");
    }

    public Album (String name, int pageNumbers, String paperQuality){
        super(name, pageNumbers);
        this.paperQuality=paperQuality;
    }


    public void setPaperQuality(String paperQuality){
        this.paperQuality=paperQuality;
        }
   public String getPaperQuality(){
        return paperQuality;
   }
}
