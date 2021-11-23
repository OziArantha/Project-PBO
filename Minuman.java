public class Minuman
{
    private int rasa; //1 = manis, 2 = asam, 3 = asin, 4 = pahit
    private int budgetMinuman;
    private int ukuran; //1 = kecil, 2 = sedang, 3 = besar
    private int suhu; //1 = dingin, 2 = panas
    private int jenisMinuman; //1 = kafein, 2 = non kafein
    private int asalMinuman; //1 = Indonesia, 2 = Jepang, 3 = China, 4 = Italia , 5 = tidak memilih
    
    public Minuman()
    {
        
    }
    
    public void setBudgetMinuman(int budget)
    {
        this.budgetMinuman=budget;
    }
    
    public void setRasa(int rasa)
    {
        this.rasa=rasa;
    }
    
    public void setUkuran(int ukuran)
    {
        this.ukuran=ukuran;
    }
    
    public void setSuhu(int suhu)
    {
        this.suhu=suhu;
    }
    
    public void setJenisMinuman(int jenis)
    {
        this.jenisMinuman=jenis;
    }
    
    public void setAsalMinuman(int asal)
    {
        this.asalMinuman=asal;
    }
     
         //americano, harga : (30.000, 27.00, 24.000) kafein, pahit, ukuran: (kecil, sedang, besar), panas,  italia
         //Smootie, harga : (30.000, 27.000, 24.000), non kafein, manis,ukuran : (kecil, sedang, besar), dingin, indo
         //soda asam, harga : (20.000,18.00, 16.000), non kafein, asam, ukuran : (kecil, sedang, besar), dingin,  china
         //Teh Tarik, harga : (9.000, 7.000, 5.000), non kafein, manis, ukuran :(kecil, sedang, besar), panas, dingin, indonesia
         //milk cocoa, harga : (17.000, 15.000,13.000), non kafein, manis, ukuran :(kecil, sedang, besar), panas,dingin, jepang
         //shogayu, harga : (25.000, 23.000, 21.000), non kafein, manis, ukuran :(kecil, sedang, besar), panas, jepang
         //ekspresso, harga : (14.000, 12.000, 10.000), kafein, pahit, ukuran : (kecil, sedang, besar), panas,  indonesia
    
    public String[] getMinuman()
    {
       String[] minuman = new String[7];
       if (30_000 <= budgetMinuman )
       {
           if(ukuran == 1)
           {
               if(jenisMinuman == 1)
               {   
                   if ( asalMinuman == 4)
                   {
                       if (rasa == 4 && suhu == 2)
                       {
                            minuman[0] = "Americano = Rp. 30.000";
                       }
                   }
                   
                   else if(asalMinuman == 1)
                   {
                       if (rasa == 4 && suhu == 2)
                       {
                           minuman[1] = "Expresso = Rp. 14.000";
                       }
                   }
                   
                   else if(asalMinuman == 5)
                   {
                       if(rasa == 4 && suhu == 2)
                       {
                            minuman[0] = "Americano = Rp. 30.000";
                            minuman[1] = "Expresso = Rp. 14.000";
                       }
                   }
                   
               }
               
               else if(jenisMinuman == 2)
               {   
                   if (asalMinuman == 1)
                   {
                       if(rasa == 1 && (suhu == 1 || suhu == 2))
                       {
                            minuman[4] = "Teh Tarik = Rp. 9.000";
                       }
                   }
                   
                   if (asalMinuman == 2)
                   {
                       if(rasa == 1 && suhu == 1)
                       {
                            minuman[5] = "Milk Cocoa = Rp. 17.000";
                       }
                   
                       else if(rasa == 1 && suhu == 2)
                       {
                            minuman[5] = "Milk Cocoa = Rp. 17.000";
                            minuman[6] = "shogayu = Rp. 25.000";
                            
                       }
                   }
                   
                   if (asalMinuman == 3)
                   {
                       if(rasa == 2 && suhu == 1)
                       {
                            minuman[3] = "Soda Asam = Rp. 20.000";
                       }
                   }
                   
                   if (asalMinuman == 5)
                   {
                       if(rasa == 1 && suhu == 1)
                       { 
                           minuman[2] = "Smootie = Rp. 30.000";
                           minuman[4] = "Teh Tarik = Rp. 9.000";
                           minuman[5] = "Milk Cocoa = Rp. 17.000";
                       }
                       
                       else if(rasa == 1 && suhu == 2)
                       {
                           minuman[4] = "Teh Tarik = Rp. 9.000";
                           minuman[5] = "Milk Cocoa = Rp. 17.000";
                           minuman[6] = "shogayu = Rp. 25.000";
                       }
                       
                       else if(rasa == 2 && suhu == 1)
                       {
                           minuman[3] = "Soda Asam = Rp. 20.000";
                       }
                   }
                   
               }
           }
           
           else if(ukuran == 2)
           {
               if(jenisMinuman == 1)
               {   
                   if ( asalMinuman == 4)
                   {
                       if (rasa == 4 && suhu == 2)
                       {
                            minuman[0] = "Americano = Rp. 27.000";
                       }
                   }
                   
                   else if(asalMinuman == 1)
                   {
                       if (rasa == 4 && suhu == 2)
                       {
                           minuman[1] = "Expresso = Rp. 12.000";
                       }
                   }
                   
                   else if(asalMinuman == 5)
                   {
                       if(rasa == 4 && suhu == 2)
                       {
                            minuman[0] = "Americano = Rp. 27.000";
                            minuman[1] = "Expresso = Rp. 12.000";
                       }
                   }
                   
               }
               
               else if(jenisMinuman == 2)
               {   
                   if (asalMinuman == 1)
                   {
                       if(rasa == 1 && (suhu == 1 || suhu == 2))
                       {
                            minuman[4] = "Teh Tarik = Rp. 7.000";
                       }
                   }
                   
                   if (asalMinuman == 2)
                   {
                       if(rasa == 1 && suhu == 1)
                       {
                            minuman[5] = "Milk Cocoa = Rp. 15.000";
                       }
                   
                       else if(rasa == 1 && suhu == 2)
                       {
                            minuman[5] = "Milk Cocoa = Rp. 15.000";
                            minuman[6] = "shogayu = Rp. 23.000";
                            
                       }
                   }
                   
                   if (asalMinuman == 3)
                   {
                       if(rasa == 2 && suhu == 1)
                       {
                            minuman[3] = "Soda Asam = Rp. 18.000";
                       }
                   }
                   
                   if (asalMinuman == 5)
                   {
                       if(rasa == 1 && suhu == 1)
                       { 
                           minuman[2] = "Smootie = Rp. 27.000";
                           minuman[4] = "Teh Tarik = Rp. 7.000";
                           minuman[5] = "Milk Cocoa = Rp. 15.000";
                       }
                       
                       else if(rasa == 1 && suhu == 2)
                       {
                           minuman[4] = "Teh Tarik = Rp. 7.000";
                           minuman[5] = "Milk Cocoa = Rp. 15.000";
                           minuman[6] = "shogayu = Rp. 23.000";
                       }
                       
                       else if(rasa == 2 && suhu == 1)
                       {
                           minuman[3] = "Soda Asam = Rp. 18.000";
                       }
                   }
                   
               }
           }
           
           else if (ukuran == 3)
           {   
               if(jenisMinuman == 1)
               {   
                   if ( asalMinuman == 4)
                   {
                       if (rasa == 4 && suhu == 2)
                       {
                            minuman[0] = "Americano = Rp. 24.000";
                       }
                   }
                   
                   else if(asalMinuman == 1)
                   {
                       if (rasa == 4 && suhu == 2)
                       {
                           minuman[1] = "Expresso = Rp. 10.000";
                       }
                   }
                   
                   else if(asalMinuman == 5)
                   {
                       if(rasa == 4 && suhu == 2)
                       {
                            minuman[0] = "Americano = Rp. 24.000";
                            minuman[1] = "Expresso = Rp. 10.000";
                       }
                   }
                   
               }
               
               else if(jenisMinuman == 2)
               {   
                   if (asalMinuman == 1)
                   {
                       if(rasa == 1 && (suhu == 1 || suhu == 2))
                       {
                            minuman[4] = "Teh Tarik = Rp. 5.000";
                       }
                   }
                   
                   if (asalMinuman == 2)
                   {
                       if(rasa == 1 && suhu == 1)
                       {
                            minuman[5] = "Milk Cocoa = Rp. 13.000";
                       }
                   
                       else if(rasa == 1 && suhu == 2)
                       {
                            minuman[5] = "Milk Cocoa = Rp. 13.000";
                            minuman[6] = "shogayu = Rp. 21.000";
                            
                       }
                   }
                   
                   if (asalMinuman == 3)
                   {
                       if(rasa == 2 && suhu == 1)
                       {
                            minuman[3] = "Soda Asam = Rp. 16.000";
                       }
                   }
                   
                   if (asalMinuman == 5)
                   {
                       if(rasa == 1 && suhu == 1)
                       { 
                           minuman[2] = "Smootie = Rp. 24.000";
                           minuman[4] = "Teh Tarik = Rp. 5.000";
                           minuman[5] = "Milk Cocoa = Rp. 13.000";
                       }
                       
                       else if(rasa == 1 && suhu == 2)
                       {
                           minuman[4] = "Teh Tarik = Rp. 5.000";
                           minuman[5] = "Milk Cocoa = Rp. 13.000";
                           minuman[6] = "shogayu = Rp. 21.000";
                       }
                       
                       else if(rasa == 2 && suhu == 1)
                       {
                           minuman[3] = "Soda Asam = Rp. 16.000";
                       }
                   }
                   
               }
           }
       }
       
       else if(20_000 <= budgetMinuman)
       {
           if(ukuran == 1)
           {   
               
               if(jenisMinuman == 1)
               {
                   if (asalMinuman == 1 || asalMinuman == 5)
                   {
                       if (rasa == 4 && suhu == 2)
                       {
                           minuman[1] = "Expresso = Rp. 14.000";
                       }
                   }
                   
               }
               
               else if(jenisMinuman == 2)
               {    
                   if (asalMinuman == 1)
                   {
                       if(rasa == 1 && (suhu == 1 || suhu == 2))
                       {
                            minuman[4] = "Teh Tarik = Rp. 9.000";
                       }
                   }
                   
                   else if(asalMinuman == 3)
                   {
                       if(rasa == 2 && suhu == 1)
                       {
                            minuman[3] = "Soda Asam = Rp. 20.000";
                       }
                   }
                   
                   else if(asalMinuman == 5)
                   {
                       if(rasa == 1 && (suhu == 1 || suhu == 2))
                       {
                            minuman[4] = "Teh Tarik = Rp. 9.000";
                       }
                       
                       else if(rasa == 2 && suhu == 1)
                       {
                            minuman[3] = "Soda Asam = Rp. 20.000";
                       }
                   }
               }
           }
           
           else if(ukuran == 2)
           {
               if(jenisMinuman == 1)
               {
                   if (asalMinuman == 1 || asalMinuman == 5)
                   {
                       if (rasa == 4 && suhu == 2)
                       {
                           minuman[1] = "Expresso = Rp. 12.000";
                       }
                   }
                   
               }
               
               else if(jenisMinuman == 2)
               {    
                   if (asalMinuman == 1)
                   {
                       if(rasa == 1 && (suhu == 1 || suhu == 2))
                       {
                            minuman[4] = "Teh Tarik = Rp. 7.000";
                       }
                   }
                   
                   else if(asalMinuman == 3)
                   {
                       if(rasa == 2 && suhu == 1)
                       {
                            minuman[3] = "Soda Asam = Rp. 18.000";
                       }
                   }
                   
                   else if(asalMinuman == 5)
                   {
                       if(rasa == 1 && (suhu == 1 || suhu == 2))
                       {
                            minuman[4] = "Teh Tarik = Rp. 7.000";
                       }
                       
                       else if(rasa == 2 && suhu == 1)
                       {
                            minuman[3] = "Soda Asam = Rp. 18.000";
                       }
                   }
               }
           }
           
           else if (ukuran == 3)
           {
               if(jenisMinuman == 1)
               {
                   if (asalMinuman == 1 || asalMinuman == 5)
                   {
                       if (rasa == 4 && suhu == 2)
                       {
                           minuman[1] = "Expresso = Rp. 10.000";
                       }
                   }
                   
               }
               
               else if(jenisMinuman == 2)
               {    
                   if (asalMinuman == 1)
                   {
                       if(rasa == 1 && (suhu == 1 || suhu == 2))
                       {
                            minuman[4] = "Teh Tarik = Rp. 5.000";
                       }
                   }
                   
                   else if(asalMinuman == 3)
                   {
                       if(rasa == 2 && suhu == 1)
                       {
                            minuman[3] = "Soda Asam = Rp. 16.000";
                       }
                   }
                   
                   else if(asalMinuman == 5)
                   {
                       if(rasa == 1 && (suhu == 1 || suhu == 2))
                       {
                            minuman[4] = "Teh Tarik = Rp. 5.000";
                       }
                       
                       else if(rasa == 2 && suhu == 1)
                       {
                            minuman[3] = "Soda Asam = Rp. 16.000";
                       }
                   }
               }
           }
       }
       
       else if(10_000 <= budgetMinuman)
       {
            if (ukuran == 3)
           {
               if (rasa == 4 && suhu == 2 && (asalMinuman == 1 || asalMinuman == 5))
               {
                       minuman[1] = "Expresso = Rp. 10.000";
               }
           }
       }
       
       else if(5_000 <= budgetMinuman)
       {
           if (ukuran == 3)
           {
               if(rasa == 1 && (suhu == 1 || suhu == 2) && (asalMinuman == 1 || asalMinuman == 5))
               {
                        minuman[4] = "Teh Tarik = Rp. 5.000";
               }
           }
       }
       return minuman;
    }
}



    
   
  

    
    

