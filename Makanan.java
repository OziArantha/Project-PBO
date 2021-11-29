public class Makanan
{
    private int rasa; 
    //1 = manis,asam,pedas
    //2 = asin,asam,gurih
    //3 = manis, asam
    private int budgetMakanan;
    private int penyajian; 
    //1 = sehat, 2 = cepatsaji
    private int jenisMakanan; 
    //1 = vegetarian, 2 = non vegetarian
    private int asalMakanan; 
    //1 = Italia , 2 = Indonesia, 3 = China

    public Makanan()
    {
        
    }
    
    public void setBudgetMakanan(int budget)
    {
        this.budgetMakanan=budget;
    }
    
    public void setRasa(int rasa)
    {
        this.rasa=rasa;
    }
    
    public void setPenyajian(int penyajian)
    {
        this.penyajian=penyajian;
    }
    
    public void setJenisMakanan(int jenis)
    {
        this.jenisMakanan=jenis;
    }
    
    public void setAsalMakanan(int asal)
    {
        this.asalMakanan=asal;
    }
     
    //Spaghetti, harga : (10.000), non-vegetarian, manis,asam,pedas, sehat,  Italia
    //NasiGoreng, harga : (15.000), non-vegetarian, asin,asam,gurih, sehat, Indonesia
    //RotiDaging, harga : (5.000), non-vegetarian, manis,asam,, cepat saji, China
        
    
    public String[] getMakanan()
    {
       String[] makanan = new String[3];
       if (10_000 <= budgetMakanan )
       {
               if(jenisMakanan == 1)
               {   
                   makanan [0]= "Tidak tersedia";  
               }
               
               else if(jenisMakanan == 2)
               {   
                   if (asalMakanan == 1)
                   {
                       if(rasa == 1 && (penyajian == 1))
                       {
                            makanan[1] = "Spaghetti = Rp. 10.000";
                       }
                   }
               }
       }
       
       if (15_000 <= budgetMakanan )
       {
               if(jenisMakanan == 1)
               {   
                   makanan [0]= "Tidak tersedia";  
               }
               
               else if(jenisMakanan == 2)
               {   
                   if (asalMakanan == 2)
                   {
                       if(rasa == 2 && penyajian == 1)
                       {
                            makanan[2] = "NasiGoreng = Rp. 15.000";
                       }
                   }
               }
       }
       
       if (5_000 <= budgetMakanan )
       {
               if(jenisMakanan == 1)
               {   
                   makanan [0]= "Tidak tersedia";  
               }
               
               else if(jenisMakanan == 2)
               {   
                   if (asalMakanan == 3)
                   {
                       if(rasa == 3 && penyajian == 2)
                       {
                            makanan[3] = "RotiDaging = Rp. 5.000";
                       }
                   }
               }
       }
       
       for(int i = 0; i < makanan.length; i++) {
           if(makanan[i] == null){
               makanan[i] = "";
           }
       }            
       return makanan;
    }
}
