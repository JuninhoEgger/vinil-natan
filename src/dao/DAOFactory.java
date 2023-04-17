/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Natan Fraga 
 * @since 14:51 - 09/07/2018
 * @version Vinil II
 */
public class DAOFactory {
    
    private static final VinilDAO vinilDAO = new VinilDAO();
    private static final MusicaDAO musicaDAO = new MusicaDAO();
    
    public static VinilDAO getVinilDAO(){
        return vinilDAO;
    }//fecha método VinilDAO
    
    public static MusicaDAO getMusicaDAO(){
        return musicaDAO;
    }//fecha método MusicaDAO
    
}//Fecha classe DAOFactory
