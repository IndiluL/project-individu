/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aliframadhan
 */
public class UserID {
    private static String id;
    private static String nama;

    public static void setUserLogin(String idKaryawan) {
        id = idKaryawan;
    }

    public static String getUserLogin() {
        return id;
    }
    
    public static void setNamaKasir(String namaKasir) {
        nama = namaKasir;
    }

    public static String getNamaKasir() {
        return nama;
    }
}
