/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

/**
 *
 * @author user
 */
public class Bahan{
    private String textur;
    
    Bahan(){
        
    }
    Bahan(String textur){
        this.textur = textur;
    }

    public String getTextur() {
        return textur;
    }

    public void setTextur(String textur) {
        this.textur = textur;
    }
    public void info(){
        System.out.printf("Bahan = %s\n", textur);
    }
}
