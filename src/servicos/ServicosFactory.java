/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 *
 * @author Natan Fraga 
 * @since 16:33 - 09/07/2018
 * @version Vinil II
 */
public class ServicosFactory {
    
    private static final VinilServicos vinilServicos = new VinilServicos();
    private static final MusicaServicos musicaServicos = new MusicaServicos();
    
    public static VinilServicos getVinilServicos(){
        return vinilServicos;
    }//fecha método VinilServicos
    
    public static MusicaServicos getMusicaServicos(){
        return musicaServicos;
    }//fecha método MusicaServicos
    
}//fecha classe ServicosFactory
